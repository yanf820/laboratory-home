package com.laboratory.workbench.ui;

import com.laboratory.workbench.domain.Resource;
import com.laboratory.workbench.domain.Role;
import com.laboratory.workbench.domain.User;
import com.laboratory.workbench.util.SystemInitialization;
import com.laboratory.workbench.view.menu.MenuBars;
import com.laboratory.workbench.view.provider.ComponentViewProvider;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinSession;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yim
 * Created by Yim on 2016/8/29.
 */
public class MainFrameUI extends UI implements ViewChangeListener{

    private Navigator navigator;

    public boolean beforeViewChange(ViewChangeEvent event) {
        return false;
    }

    public void afterViewChange(ViewChangeEvent event) {

    }

    protected void init(VaadinRequest request) {


        VerticalLayout verticalLayout=new VerticalLayout();
        verticalLayout.setSizeFull();

        HorizontalLayout horizontalLayout=new HorizontalLayout();
        horizontalLayout.setSizeFull();

        VerticalLayout right=new VerticalLayout();
        right.setSizeFull();

        this.navigator=new Navigator(this,right);
        ComponentViewProvider componentViewProvider=new ComponentViewProvider(VaadinSession.getCurrent().getSession().getId());
        navigator.addProvider(componentViewProvider);

        HorizontalLayout headpart=this.createHead();

        verticalLayout.addComponent(headpart);
        verticalLayout.addComponent(horizontalLayout);
        verticalLayout.setExpandRatio(horizontalLayout,1);

        horizontalLayout.addComponent(right);
        horizontalLayout.setExpandRatio(right,1);

        this.setContent(verticalLayout);
        this.setNavigator(navigator);
        navigator.navigateTo("");

    }

    private HorizontalLayout createHead() {
        HorizontalLayout head=new HorizontalLayout();
        head.setPrimaryStyleName("head");
        head.setWidth("100%");
        head.setHeight("80px");
        MenuBar menuBar=getMenuBar();
        head.addComponent(menuBar);
        return head;
    }

    private MenuBar getMenuBar() {
        User user= SystemInitialization.getDatastore().createQuery(User.class).filter("id",1l).get();

        List<Resource> resources=new ArrayList<Resource>();
        for(Role r:user.getRoles()){
            resources.addAll(r.getResources());
        }

        MenuBars menuBars=new MenuBars(ValoTheme.MENUBAR_BORDERLESS,resources,getNavigator());

        return menuBars.getMenuBar();
    }
}
