package com.laboratory.plugin.workbench.view.form.impl;

import com.laboratory.plugin.workbench.view.form.BaseFormFieldEditor;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;

/**
 * Created by yf on 2016/8/31.
 */
public class SectionLineFieldEditor extends BaseFormFieldEditor {
    @Override
    protected Component createComponent() {
        HorizontalLayout hl=new HorizontalLayout();
        hl.setWidth("100%");
        Label line=new Label();
        line.setValue("<b>["+this.field.getInputDescr()+"]</b>");
        line.setContentMode(ContentMode.HTML);
        line.setSizeUndefined();
        hl.addComponent(line);
        hl.setComponentAlignment(line, Alignment.MIDDLE_LEFT);
        return hl;
    }

    @Override
    public void setValue(Object value) {

    }

    @Override
    public Object getValue() {
        return null;
    }

    @Override
    public void resetValue() {

    }

}
