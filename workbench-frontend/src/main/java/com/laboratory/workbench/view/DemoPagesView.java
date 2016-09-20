package com.laboratory.workbench.view;

import com.laboratory.workbench.widgets.MultiPages;

/**
 * @author yim
 * Created by yf on 2016/8/31.
 */
public class DemoPagesView extends BaseWorkbenchView {
    @Override
    protected void initView() {

        MultiPages multiPages=new MultiPages();
        multiPages.setSizeFull();
        DemoCustomeView demoCustomeView=new DemoCustomeView();
        demoCustomeView.initView();
        multiPages.addPage(demoCustomeView,demoCustomeView.getViewCaption());

        DemoEditorView demoEditorView=new DemoEditorView();
        demoCustomeView.initView();
        multiPages.addPage(demoEditorView,demoEditorView.getViewCaption());

        DemoListView demoListView = new DemoListView();
        demoListView.initView();
        multiPages.addPage(demoListView, demoListView.getViewCaption());
        this.getViewRoot().addComponent(multiPages);
        this.getViewRoot().setExpandRatio(multiPages, 1);

    }

    @Override
    protected void showView(ViewContext vc) {

    }
}
