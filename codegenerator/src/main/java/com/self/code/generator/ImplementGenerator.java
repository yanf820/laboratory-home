package com.self.code.generator;

import com.sun.codemodel.*;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;

import javax.ws.rs.PathParam;
import java.io.File;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

/**
 * Created by yf on 2017/5/9.
 */
public class ImplementGenerator {

    public void generate(String classFullName,String packageName,String outputDir) throws Throwable {
        File output=new File(outputDir);
        if (!output.exists())
            output.mkdirs();
        JCodeModel cm = assembleCodeModel(classFullName,packageName);
        cm.build(new File(outputDir));
    }

    private JCodeModel assembleCodeModel(String classFullName,String packageName) throws Throwable {

        JCodeModel cm = new JCodeModel();
        Class<?> clazz = Thread.currentThread().getContextClassLoader().loadClass(classFullName);
        JClass interfaceClass=cm.ref(clazz);
        JDefinedClass implClass=cm._class(JMod.PUBLIC,packageName+"."+interfaceClass.name()+"Impl", ClassType.CLASS);
        implClass._implements(interfaceClass);

        Method[] methods = clazz.getMethods();
        JClass sys = cm.ref("java.lang.System");
        JType objType=cm.parseType("Object");
        for(Method method:methods){
            Class<?>[] exceptions = method.getExceptionTypes();
            Class<?> returnType = method.getReturnType();
            Class<?>[] parameterTypes = method.getParameterTypes();
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();// [parameter index][annotation]

            JMethod implMethod=implClass.method(JMod.PUBLIC,returnType,method.getName());
            implMethod.annotate(Override.class);

            for (Class<?> exception:exceptions){
                implMethod._throws((Class<? extends Throwable>) exception);
            }

            for (int i=0; i<parameterAnnotations.length ;i++){
                Class<?> parameterType=parameterTypes[i];
                Annotation[] annotations = parameterAnnotations[i];
                JVar implMethodParam = implMethod.param(parameterType,"var"+i);
                for (int j=0; j<annotations.length;j++){
                    Annotation goal=annotations[j];
                    if (goal instanceof PathParam)
                        continue;

                    Class<? extends Annotation> goalType = goal.annotationType();

                    JAnnotationUse implMethodParamAnno = implMethodParam.annotate(goalType);

                    for (Method annotationMethod: goalType.getDeclaredMethods()){
                        Object value = Proxy.getInvocationHandler(goal).invoke(goal,annotationMethod,null);
                        String name=annotationMethod.getName();
                        stickAnnotationParam(implMethodParamAnno,name,value); //适配value
                    }

                }
            }

            JBlock implMethodBody = implMethod.body();
            implMethodBody.invoke(sys.staticRef("out"),"println").arg("HelloWorld!");
            JClass jreturnType = cm.ref(returnType);

            JVar jreturnTypeRef = implMethodBody.decl(jreturnType,"result");
            implMethodBody.directStatement("return "+jreturnType.name()+".withJsonOK(null);");
        }

        return cm;
    }

    private void stickAnnotationParam(JAnnotationUse annotation,String name,Object value){
        if (value instanceof Integer)
            annotation.param(name, Integer.parseInt(String.valueOf(value)));
        else if (value instanceof String)
            annotation.param(name, String.valueOf(value));
        else if (value instanceof Boolean)
            annotation.param(name, Boolean.valueOf(String.valueOf(value)));
    }

    public static void main(String[] args) throws Throwable {
        ImplementGenerator generator=new ImplementGenerator();
        File[] files=new File("D:\\work\\Java\\idea-work\\codegenerator\\src\\main\\java\\com\\lastartupsaas\\service\\api\\resource").listFiles();

        String outputDir="D:\\work\\Java\\idea-work\\codegenerator\\src\\main\\java";
        for (File file:files) {
            if (file.isDirectory())
                continue;
            generator.generate(getClassFullName(file.getAbsolutePath()), "com.lastartupsaas.service.api.resource.impl",outputDir);
        }
        }


    private static String getClassFullName(String javaFilePath) throws Exception {
        File javaFile = new File(javaFilePath);
        List<String> lines= FileUtils.readLines(javaFile,"UTF-8");

        StringBuilder classFullNameBuilder=new StringBuilder("");
        for (String line:lines) {
            String clearLine= StringUtils.trim(line);
            if (clearLine.startsWith("package")) {
                classFullNameBuilder.append(StringUtils
                        .substring(clearLine, StringUtils.indexOf(clearLine, "package")).replace("package","")
                        .replace(";","")
                        .trim())
                        .append(".")
                        .append(javaFile.getName().replace(".java",""));
                break;
            }
        }

        if (classFullNameBuilder.equals(""))
            throw new Exception("has no package info");

        return classFullNameBuilder.toString();
    }
}
