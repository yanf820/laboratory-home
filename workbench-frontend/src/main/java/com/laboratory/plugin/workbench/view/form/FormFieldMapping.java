package com.laboratory.plugin.workbench.view.form;

import com.vaadin.ui.Label;

/**
 * Created by yf on 2016/9/3.
 */
public class FormFieldMapping {
    private FormField field;
    private IFormFieldEditor fieldEditor;
    private Label fieldLabel;
    private FormGridRC fieldRC;

    public FormField getField() {
        return field;
    }

    public void setField(FormField field) {
        this.field = field;
    }

    public IFormFieldEditor getFieldEditor() {
        return fieldEditor;
    }

    public void setFieldEditor(IFormFieldEditor fieldEditor) {
        this.fieldEditor = fieldEditor;
    }

    public Label getFieldLabel() {
        return fieldLabel;
    }

    public void setFieldLabel(Label fieldLabel) {
        this.fieldLabel = fieldLabel;
    }

    public FormGridRC getFieldRC() {
        return fieldRC;
    }

    public void setFieldRC(FormGridRC fieldRC) {
        this.fieldRC = fieldRC;
    }
}
