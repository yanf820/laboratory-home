package com.laboratory.plugin.workbench.servlet;

import com.laboratory.plugin.workbench.util.SystemInitialization;
import com.laboratory.plugin.workbench.view.provider.ComponentKeySelector;
import com.vaadin.server.VaadinServlet;

import javax.servlet.ServletException;

/**
 * Created by yf on 2016/8/29.
 */
public class WorkbenchServlet extends VaadinServlet{
    @Override
    protected void servletInitialized()throws ServletException {

        super.servletInitialized();

        SystemInitialization.initAuthenticationData();

        ComponentKeySelector.loadViewData();

    }
}
