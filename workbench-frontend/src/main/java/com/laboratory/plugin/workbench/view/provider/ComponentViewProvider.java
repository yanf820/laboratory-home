package com.laboratory.plugin.workbench.view.provider;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewProvider;

/**
 * @author yim
 * Created by yim on 2016/8/29.
 */
public class ComponentViewProvider implements ViewProvider{

    private String uiUuid;

    public ComponentViewProvider(String uiUuid){
        super();
        this.uiUuid=uiUuid;
    }

    public String getViewName(String viewAndParameters) {
        String viewName=null;
        int idx=viewAndParameters.indexOf("?");
        if (idx==-1){
            idx=viewAndParameters.indexOf("/");
        }
        if (idx==-1){
            viewName=viewAndParameters;
        }else{
            viewName=viewAndParameters.substring(0,idx);
        }
        return viewName;
    }

    public View getView(String viewName) {
        if (viewName==null||viewName.length()==0)
            viewName="test";

        return ComponentContainer.getContainer().getViewInstance(ComponentKeySelector.getRefrence(viewName));
    }
}
