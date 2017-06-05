package com.self.code.core;

import java.util.List;

/**
 * Created by yf on 2017/5/9.
 */
public class JavaModel {

    private String content;
    private String prefixSign;
    private String suffixSign;
    private List<JavaModel> javaModels;

    public JavaModel(String content, String prefixSign, String suffixSign) {
        this.content = content;
        this.prefixSign = prefixSign;
        this.suffixSign = suffixSign;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPrefixSign() {
        return prefixSign;
    }

    public void setPrefixSign(String prefixSign) {
        this.prefixSign = prefixSign;
    }

    public String getSuffixSign() {
        return suffixSign;
    }

    public void setSuffixSign(String suffixSign) {
        this.suffixSign = suffixSign;
    }

    public List<JavaModel> getJavaModels() {
        return javaModels;
    }

    public void setJavaModels(List<JavaModel> javaModels) {
        this.javaModels = javaModels;
    }
}
