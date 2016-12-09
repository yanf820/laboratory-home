package com.lashou.common.extend.extensions;

import com.sun.codemodel.*;
import org.raml.jaxrs.codegen.core.ext.GeneratorExtension;
import org.raml.model.Action;
import org.raml.model.MimeType;
import org.raml.model.Raml;
import org.raml.model.Resource;
import org.raml.model.parameter.AbstractParam;
import org.raml.model.parameter.UriParameter;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

/**
 * Created by yf on 2016/11/25.
 */
public class CustomExtension implements GeneratorExtension {

    /**
     * 对ResourceInterface进行接口级别生成控制，如加注解
     * @param resourceInterface
     * @param resource
     */
    @Override
    public void onCreateResourceInterface(JDefinedClass resourceInterface, Resource resource) {

    }

    /**
     * 对ResourceMethod进行方法级别生成控制
     * @param method
     * @param action
     * @param bodyMimeType
     * @param uniqueResponseMimeTypes
     */
    @Override
    public void onAddResourceMethod(JMethod method, Action action, MimeType bodyMimeType, Collection<MimeType> uniqueResponseMimeTypes) {
//        Resource resource=action.getResource();
//        String uri=resource.getRelativeUri();
//        String parenturi=resource.getParentUri();
//        System.out.println(parenturi);
//        System.out.println(uri);
        Collection<JAnnotationUse> list=method.annotations();

        Iterator<JAnnotationUse> it=list.iterator();

        StringBuffer stringBuffer=new StringBuffer("");

        while(it.hasNext()){
            JAnnotationUse jAnnotationUse=it.next();
            if("Path".equals(jAnnotationUse.getAnnotationClass().name())){
                Map<String, UriParameter> map=action.getResource().getUriParameters();
                Set<String> keyset=map.keySet();
                Iterator<String> uriKeysIt=keyset.iterator();

                while(uriKeysIt.hasNext()){

                    String key=uriKeysIt.next();

                    if(key.endsWith("Selectors")){
                        stringBuffer.append("{"+key+":"+"[a-zA-Z]*}");
                    }
                    else if(key.endsWith("Id")){
                        stringBuffer.append("{"+key+":"+"[0-9]*}");
                    }
                }

                jAnnotationUse.param("value",stringBuffer.toString());

            }
        }
//        method.annotate(Path.class).param("value","walter");

//        resource.setRelativeUri("/{walter_test}");
//        resource.setParentUri(parenturi+"/{walter_test}");
                ;
//        action.setResource(resource);
//
//        System.out.println("-----------------------");
//
//        System.out.println(action.getResource().getParentUri());
//        System.out.println(action.getResource().getUri());
//        System.out.println(action.getBaseUriParameters());
//        System.out.println("============================>>>>>>>>>>>>");
    }

    private String transformPathToRegex(JAnnotationUse jAnnotationUse) {

        String finalPath=null;

        return finalPath;
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
//        Class c=Class.forName("com.sun.codemodel.JAnnotationStringValue");
//        c.getDeclaredMethods();
//
//        Constructor[] constructors = c.getDeclaredConstructors();
//        Constructor constructors1=constructors[0];
//        constructors1.setAccessible(true);
//
//
//        Object a=constructors1.newInstance(JExpr.lit("walter"));
//
//
//        System.out.println(a.toString());
    }

    /**
     * 对参数进行过滤控制，默认false不做过滤
     * @param name
     * @param parameter
     * @param annotationClass
     * @param method
     * @return
     */
    @Override
    public boolean AddParameterFilter(String name, AbstractParam parameter, Class<? extends Annotation> annotationClass, JMethod method) {

        return true;
    }

    @Override
    public void setRaml(Raml raml) {

    }

    @Override
    public void setCodeModel(JCodeModel codeModel) {

    }
}
