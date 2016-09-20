package com.laboratory.workbench.view.provider;

import com.vaadin.navigator.View;

/**
 * @author Yim
 * Created by Yim on 2016/8/29.
 */
public class ComponentContainer {
    private static final ComponentContainer container = new ComponentContainer();

    private ComponentContainer(){}

    public static ComponentContainer getContainer(){
        return container;
    }

    public View getViewInstance(String clazz){
        try {
            return (View) Class.forName(clazz).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
