package com.lashou.common.extend.extensions;

import com.sun.codemodel.*;
import org.raml.jaxrs.codegen.core.ext.GeneratorExtension;
import org.raml.model.Action;
import org.raml.model.MimeType;
import org.raml.model.Raml;
import org.raml.model.Resource;
import org.raml.model.parameter.AbstractParam;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.List;

/**
 * Created by yf on 2017/2/28.
 */
public class MultipartExtension implements GeneratorExtension {

    private JCodeModel codeModel=new JCodeModel();

    @Override
    public void onCreateResourceInterface(JDefinedClass resourceInterface, Resource resource) {

    }

    @Override
    public void onAddResourceMethod(JMethod method, Action action, MimeType bodyMimeType, Collection<MimeType> uniqueResponseMimeTypes) {
        List<JVar> params = method.params();
        if(params!=null&&!params.isEmpty()){
            for(JVar param : params){
                JType paramType = param.type();
                if(paramType!=null&&paramType.fullName().equals("javax.mail.internet.MimeMultipart")){
                    JClass clazz = codeModel.ref("org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput");
                    param.type(clazz);
                }
            }
        }
    }

    @Override
    public boolean AddParameterFilter(String name, AbstractParam parameter, Class<? extends Annotation> annotationClass, JMethod method) {
        return false;
    }

    @Override
    public void setRaml(Raml raml) {

    }

    @Override
    public void setCodeModel(JCodeModel codeModel) {

    }
}
