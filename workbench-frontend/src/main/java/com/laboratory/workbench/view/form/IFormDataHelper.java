package com.laboratory.workbench.view.form;

/**
 * Created by yf on 2016/9/4.
 */
public interface IFormDataHelper {

    public void setProperty(Object bean,String propertyName,Object value);

    public Object getProperty(Object bean,String propertyName);
}
