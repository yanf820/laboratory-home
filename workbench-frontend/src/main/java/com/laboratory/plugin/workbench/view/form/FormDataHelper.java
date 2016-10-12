package com.laboratory.plugin.workbench.view.form;

import com.laboratory.plugin.workbench.util.DataHelper;

/**
 * Created by yf on 2016/9/5.
 */
public class FormDataHelper implements IFormDataHelper {
    @Override
    public void setProperty(Object bean, String propertyName, Object value){
        DataHelper.setProperty(bean, propertyName, value);
    }

    @Override
    public Object getProperty(Object bean, String propertyName) {
        return DataHelper.getProperty(bean, propertyName);
    }
}
