package com.laboratory.plugin.workbench.view.provider;

import com.laboratory.plugin.workbench.annotations.EternityDeclare;
import com.laboratory.plugin.workbench.util.PackageScanner;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author yim
 * Created by yf on 2016/8/29.
 */
public class ComponentKeySelector {

    private static ConcurrentMap<String,String> classMap = new ConcurrentHashMap<String, String>();

    private final static String PACKAGE_NAME = "com.laboratory.workbench.view";

    public static String getRefrence(String key){return classMap.get(key);}

    private static void setKeyRefrence(String key, String clazz) {classMap.put(key, clazz);}

    private static void scanAnnotation(Class<?> clazz){

        Annotation[] annotations=clazz.getAnnotations();

        for(Annotation annotation: annotations){
            if(annotation instanceof EternityDeclare){
                EternityDeclare declare = (EternityDeclare) annotation;
                setKeyRefrence(declare.value(),clazz.getName());
            }
        }
    }

    public static void loadViewData(){
        List<String> classFilter = new ArrayList<String>();
        PackageScanner handler=new PackageScanner(false,true,classFilter);
        Set<Class<?>> classSet=handler.getPackageAllClasses(PACKAGE_NAME,false);
        for(Class<?> cla:classSet){
            scanAnnotation(cla);
        }

    }

}
