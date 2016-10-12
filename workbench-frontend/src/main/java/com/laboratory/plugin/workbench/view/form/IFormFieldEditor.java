package com.laboratory.plugin.workbench.view.form;

import com.vaadin.ui.Component;

/**
 * Created by yf on 2016/8/31.
 */
public interface IFormFieldEditor {
    public void showValidateMessage(String msg);

    public void setValue(Object value);

    public Object getValue();

    public void resetValue();

    public String validate();

    public void setField(FormField field);

    public FormField getField();

    public void setFormAgent(FormAgent agent);

    public Component getEditorComponent();
}
