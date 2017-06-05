package com.self.code.core;

/**
 * Created by yf on 2017/5/9.
 */
public class JavaModelFactory {
    public static JavaModel getNewJavaModel(String content,String prefix,String surffix){
        return new JavaModel(content,prefix,surffix);
    }
}
