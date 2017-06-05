package com.self.code.generator;

import com.self.code.core.JavaModel;
import com.self.code.core.JavaModelFactory;
import com.sun.codemodel.*;
import com.thoughtworks.qdox.JavaDocBuilder;
import com.thoughtworks.qdox.model.JavaSource;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;

import java.io.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yf on 2017/5/9.
 */
public class JavaGenerator {

    public void execute(String javaFilePath,String outputDir) throws Exception {

        JavaModel model=assembleJModel(javaFilePath);
        //TODO write model to java file
    }

    private JavaModel assembleJModel(String javaFilePath) throws Exception {
        String classFullName=getClassFullName(javaFilePath);
        Class<?> clazz = Thread.currentThread().getContextClassLoader().loadClass(classFullName);

        StringBuilder fileModelContent=new StringBuilder();
        fileModelContent.append("package "+clazz.getPackage().getName()).append(";").append("\n");// package
//        String[] imports = fetchImports(javaFilePath);
//        for (String importString:imports){
//            fileModelContent.append(importString).append(";").append("\n");// import
//        }

        JavaModel fileModel= JavaModelFactory.getNewJavaModel(fileModelContent.toString(), null, null);// fileModel (0)

        StringBuilder classModelContent=new StringBuilder();
        classModelContent.append("public class ")
                         .append(clazz.getName())
                         .append("Impl")
                         .append(" implements ")
                         .append(clazz.getCanonicalName());

        JavaModel classModel=JavaModelFactory.getNewJavaModel(classModelContent.toString(),"{","}"); // classModel(1)

        Method[] methods = clazz.getMethods();
        for(Method method:methods){

            Class<?>[] exceptions = method.getExceptionTypes();
            Class<?> returnType = method.getReturnType();
            Class<?>[] parameterTypes = method.getParameterTypes();
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();// [parameter index][annotation]

            StringBuilder methodModelContent=new StringBuilder();
            methodModelContent.append("@java.lang.Override").append("\n")
                              .append("public ").append(returnType.getCanonicalName()).append(method.getName()).append("("); // reach method left brackets

            for (int i=0; i<parameterAnnotations.length ;i++){
                Class<?> parameterType=parameterTypes[i];
                Annotation[] annotations = parameterAnnotations[i];
            }

        }

        List<JavaModel> fileModelChilds=new ArrayList<JavaModel>();
        fileModelChilds.add(classModel);
        fileModel.setJavaModels(fileModelChilds); // enrich fileModelChilds




        return fileModel;
    }

    private String[] fetchImports(String javaFilePath) throws IOException {
        JavaDocBuilder builder = new JavaDocBuilder();
        builder.addSource(new File(javaFilePath));
        JavaSource src = builder.getSources()[0];
        return src.getImports();
    }

    private String getClassFullName(String javaFilePath) throws Exception {
        File javaFile = new File(javaFilePath);
        List<String> lines=FileUtils.readLines(javaFile,"UTF-8");

        StringBuilder classFullNameBuilder=new StringBuilder("");
        for (String line:lines) {
            String clearLine=StringUtils.trim(line);
            if (clearLine.startsWith("package")) {
                classFullNameBuilder.append(StringUtils
                        .substring(clearLine, StringUtils.indexOf(clearLine, "package") + 1)
                        .replace(";","")
                        .trim())
                        .append(".")
                        .append(javaFile.getName());
                break;
            }
        }

        if (classFullNameBuilder.equals(""))
            throw new Exception("has no package info");

        return classFullNameBuilder.toString();
    }

    public static void main(String[] args) throws ClassNotFoundException, JClassAlreadyExistsException, IOException {

        JCodeModel cm = new JCodeModel();
        JClass contactsResource=cm.ref("com.lastartupsaas.api.gateway.resource.ContactsResource");
        JDefinedClass imlClass=cm._class(JMod.PUBLIC,"com.self.code.core.ContactsResourceImpl",ClassType.CLASS);
        imlClass._implements(contactsResource);

        imlClass.method(JMod.PUBLIC,cm.VOID,"test");
        cm.build(new File("D:\\work\\Java\\idea-work\\codegenerator\\src\\main\\java\\com\\self\\code\\core"));


//        Class<?> clazz=Thread.currentThread().getContextClassLoader().loadClass("com.lastartupsaas.api.gateway.resource.ContactsResource");
//
//        Method[] methods=clazz.getMethods();
//        for (Method method:methods){
//            Annotation[][] annotationss=method.getParameterAnnotations();
//            for (int i=0; i<annotationss.length ;i++) {
//                Annotation[] annotations=annotationss[i];
//                System.out.println(i+" : ");
//                for (int j=0;j<annotations.length;j++){
//                    System.out.println(annotations[j]);
//                }
//            }
//        }
        //        JavaCompiler javac= ToolProvider.getSystemJavaCompiler();
//        StandardJavaFileManager javafile=javac.getStandardFileManager(null, null, null);
    }
}
