package com.laboratory.workbench.view;

import com.laboratory.workbench.util.DataHelper;
import com.laboratory.workbench.view.form.FormAgent;
import com.laboratory.workbench.view.form.FormBuildLayout;
import com.laboratory.workbench.view.form.FormDataHelper;
import com.laboratory.workbench.widgets.ConfirmYesNoDialog;
import com.laboratory.workbench.widgets.FormActionButton;
import com.laboratory.workbench.widgets.SubPanel;
import com.vaadin.ui.Button;

/**
 * Created by yf on 2016/8/31.
 */
public abstract class BaseWorkBenchEditorView extends BaseWorkbenchView {

    private SubPanel formPanel;
    private FormAgent formAgent;
    private Object editingData;

    @Override
    protected void initView() {

        formPanel=new SubPanel("编辑"+this.getObjectName(null));
        this.getViewRoot().addComponent(formPanel);
        formAgent=new FormAgent();
        formAgent.setFieldColumnCount(1);
        formAgent.setDataHelper(new FormDataHelper());
        this.declareFormAgent(formAgent);
        final FormBuildLayout buildLayout=formAgent.buildForm();
        buildLayout.setWidth("100%");
        buildLayout.setMargin(true);
        buildLayout.setSpacing(true);
        formPanel.setContent(buildLayout);

        FormActionButton saveButton=new FormActionButton("save", new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent event) {

                saveForm();
            }
        });

        buildLayout.addActionComponent(saveButton);

        FormActionButton clearButton=new FormActionButton("clear", new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent event) {
                showConfirmDialog("confirm", "the form won't be recover if you do this", new ConfirmYesNoDialog.ConfirmListener() {
                    @Override
                    public void confirmClick(ConfirmYesNoDialog.ConfirmEvent event) {

                        if (event.isConfirm()){
                            clearForm();
                        }
                    }
                });
            }
        });

        buildLayout.addActionComponent(clearButton);
    }
    protected abstract String getObjectName(Object obj);

    protected abstract void declareFormAgent(FormAgent formAgent);

    protected abstract  Object createVirginObject();

    protected abstract boolean saveObject(Object data);

    protected abstract boolean updateObject(Object editingData2);

    protected abstract Object loadeditingDataFromContext(ViewContext vc);

    protected abstract String getReturnViewUrl();

    protected void clearForm() {
        this.formAgent.resetFormData();
    }

    protected void saveForm() {
        if(!this.formAgent.validateForm()){
            this.showNotification("数据填写不完整", "请检查填写项目右侧的提示信息!");
            return;
        }

        String msg = this.validateForm();
        if(msg!=null){
            this.showNotification("数据填写不正确", msg);
            return;
        }

        Object data = this.createVirginObject();
        this.formAgent.loadFormDataToBean(data);
        if(this.editingData==null){
            boolean ret = this.saveObject(data);
            if(ret){
                this.showConfirmDialog("操作成功", "已成功添加["+this.getObjectName(data)+"], 是否继续添加 ?",  new ConfirmYesNoDialog.ConfirmListener() {
                    private static final long serialVersionUID = 4753664139107429400L;
                    @Override
                    public void confirmClick(ConfirmYesNoDialog.ConfirmEvent event) {
                        if(event.isConfirm()){
                            clearForm();
                        }else{
                            clearForm();
                            navigateToView(getReturnViewUrl());
                        }
                    }
                });
            }else{
                this.showNotification("操作失败", "保存"+this.getObjectName(null)+"失败, 请检查数据是否符合要求, 然后再试");
            }
        }else{
            this.fillFormDataToeditingData(this.editingData, data);

            if(this.updateObject(this.editingData)){
                this.clearForm();
                this.showTrayNotification("操作成功", this.getObjectName(null) + "编辑成功!");
                navigateToView(getReturnViewUrl());
            }else{
                this.showNotification("操作失败", "保存"+this.getObjectName(null)+"失败, 请检查数据是否符合要求, 然后再试");
            }
        }
    }

    protected String validateForm() {
        return null;
    }

    protected void fillFormDataToeditingData(Object oldData, Object formData) {
        DataHelper.copyProperties(formData, oldData, true);
    }
    @Override
    protected void showView(ViewContext vc) {
        this.editingData = this.loadeditingDataFromContext(vc);
        this.formAgent.resetFormData();
        if(editingData==null){
            this.formPanel.setPanelCaption("添加新"+this.getObjectName(null));
            this.setViewCaption("添加"+this.getObjectName(null));
        }else{
            this.formPanel.setPanelCaption("编辑"+this.getObjectName(null));
            this.setViewCaption("添加"+this.getObjectName(null));
            this.formAgent.fillFormDataFromBean(editingData);
        }
    }

    protected FormAgent getFormAgent() {
        return formAgent;
    }

    protected Object geteditingData() {
        return editingData;
    }
}
