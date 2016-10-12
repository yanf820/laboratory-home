package com.laboratory.plugin.workbench.annotations;

import java.lang.annotation.Annotation;

/**
 * Created by yf on 2016/9/5.
 */
public class Ytest {

    public static void main(String[] args) throws ClassNotFoundException {
        Class clz=Class.forName("com.laboratory.workbench.view.DemoCustomeView");
        Annotation[] ans=clz.getAnnotations();
        System.out.println(ans.length);
    }
}
