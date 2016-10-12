package com.laboratory.plugin.workbench.view;

import com.laboratory.plugin.workbench.annotations.EternityDeclare;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.VerticalLayout;

/**
 * @author yim
 *         Created by yf on 2016/8/31.
 */

@EternityDeclare("test")
public class DemoCustomeView extends BaseWorkbenchView {

    private int clickCounter = 0;
    private Label clickCounterLabel;

    @Override
    protected void initView() {

        this.setViewCaption("测试页面");
        VerticalLayout layout = new VerticalLayout();
        layout.setSpacing(true);
        layout.addComponent(new Label("Yim's Panel...."));
        layout.addComponent(new Label("Just a joke"));
        layout.addComponent(new Label("I have "
                + Runtime.getRuntime().availableProcessors()
                + " processors and "
                + (Runtime.getRuntime().totalMemory() / 1000000)
                + " MB total memory."));

        Button button1=new Button("click me");
        button1.setStyleName("v-button-primary");
        button1.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent event) {
                clickCounter++;
                clickCounterLabel.setValue("clicks: "+clickCounter);
                Notification.show("click me so shy");
            }
        });

        Button button2=new Button("show dailog");
        button2.setStyleName("v-button-primary");
        button2.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent event) {
                DemoPagesView demoPagesView=new DemoPagesView();
            }
        });
        layout.addComponent(button1);
        layout.addComponent(button2);
        layout.addComponent(new Label("test"));
        this.getViewRoot().addComponent(layout);
    }

    @Override
    protected void showView(ViewContext vc) {

    }
}
