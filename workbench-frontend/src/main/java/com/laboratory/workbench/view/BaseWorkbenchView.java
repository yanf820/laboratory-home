package com.laboratory.workbench.view;

import com.laboratory.workbench.widgets.ConfirmYesNoDialog;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.*;

/**
 * @author yim
 * Created by yf on 2016/8/30.
 */
public abstract class BaseWorkbenchView extends VerticalLayout implements View {

    private Label viewCaptionLabel;
    private VerticalLayout viewRoot;
    private Panel viewRootHost;
    private boolean viewInitialized;
    private Navigator viewNavigator;

    public BaseWorkbenchView(){
        this.viewInitialized=false;
        this.setSizeFull();
        this.setMargin(true);

        HorizontalLayout viewHeader=new HorizontalLayout();
        viewHeader.setSizeFull();
        viewHeader.setWidth("100%");
        viewHeader.setHeight("28px");

        viewCaptionLabel=new Label("视图名称");
        viewCaptionLabel.setWidth("100%");

        viewHeader.addComponent(viewCaptionLabel);
        viewHeader.setExpandRatio(viewCaptionLabel,1);

        this.addComponent(viewHeader);
        viewRootHost=new Panel();
        viewRootHost.setSizeFull();

        viewRoot=new VerticalLayout();
        viewRoot.setSizeFull();
        viewRoot.setMargin(true);
        viewRoot.setSpacing(true);

        viewRootHost.setContent(viewRoot);

        this.addComponent(viewRootHost);
        this.setComponentAlignment(viewRootHost, Alignment.TOP_LEFT);
        this.setExpandRatio(viewRootHost,1);


    }
    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {

        if (!this.viewInitialized){
            this.initView();
            this.viewInitialized=true;
        }

    }
    /**
     * 初始化视图
     */
    protected abstract void initView();

    /**
     * 展示视图
     * @param vc
     */
    protected abstract void showView(ViewContext vc);

    /**
     * 获取Root视图
     * @return
     */
    protected VerticalLayout getViewRoot(){
        return this.viewRoot;
    }

    /**
     * 设置视图是否可以滚动
     * @param scrollable
     */
    protected void setViewCanScrollable(boolean scrollable) {
        if(scrollable) {
            this.viewRoot.setSizeUndefined();
            this.viewRoot.setWidth("100%");
        }else{
            this.viewRoot.setSizeFull();
        }
    }

    /**
     * 设置视图标题
     * @param caption
     */
    protected void setViewCaption(String caption){
        this.viewCaptionLabel.setValue(caption);
    }

    protected String getViewCaption(){
        return  this.viewCaptionLabel.getValue();
    }

    /**
     * 跳转视图
     * @param viewIdAndParameters
     */
    protected void navigateToView(String viewIdAndParameters) {
//		String base64String = DataHelper.encodeBase64String(viewIdAndParameters);
//		base64String = "xu-" + base64String;
        this.viewNavigator.navigateTo(viewIdAndParameters);
    }

    /**
     * 展示Confirm会话
     * @param caption
     * @param text
     * @param confirmListener
     */
    protected void showConfirmDialog(String caption, String text, ConfirmYesNoDialog.ConfirmListener confirmListener){
        ConfirmYesNoDialog dlg=new ConfirmYesNoDialog(caption,text);
        dlg.addConfirmListener(confirmListener);
        UI.getCurrent().addWindow(dlg);
    }

    /**
     * 展示通知
     * @param caption
     * @param text
     */
    protected void showNotification(String caption,String text){
        Notification.show(caption,text,Notification.Type.WARNING_MESSAGE);
    }

    protected void showTrayNotification(String caption,String text){
        Notification.show(caption,text,Notification.Type.TRAY_NOTIFICATION);
    }

}
