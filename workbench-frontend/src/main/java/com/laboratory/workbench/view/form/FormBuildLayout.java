package com.laboratory.workbench.view.form;

import com.vaadin.ui.Component;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;

/**
 * Created by yf on 2016/9/3.
 */
public class FormBuildLayout extends GridLayout{
    private HorizontalLayout h;
    private FormAgent formAgent;

    public FormBuildLayout(int cols,int rows,FormAgent formAgent){
        super(cols,rows+1);
        this.formAgent=formAgent;
        h=new HorizontalLayout();
        h.setSpacing(true);
        this.addComponent(h,1,rows,cols-1,rows);
    }

    public void addActionComponent(Component component){this.h.addComponent(component);}

    public FormAgent getFormAgent(){return formAgent;}
}
