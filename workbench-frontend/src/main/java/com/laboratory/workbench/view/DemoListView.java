package com.laboratory.workbench.view;

import com.laboratory.workbench.annotations.EternityDeclare;
import com.laboratory.workbench.view.datagrid.*;
import com.laboratory.workbench.view.form.FormAgent;
import com.laboratory.workbench.view.form.FormBuildLayout;
import com.laboratory.workbench.view.form.FormDataHelper;
import com.laboratory.workbench.view.form.FormField;
import com.laboratory.workbench.view.form.impl.InputFieldEditor;
import com.laboratory.workbench.view.form.impl.SelectFieldEditor;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: alvin
 * Date: 2016-08-18
 */
@EternityDeclare(value = "demo")
public class DemoListView extends BaseWorkbenchListView {


    private static final long serialVersionUID = -7637004366693901785L;
    private FormAgent searchAgent;

    private String searchName;

    private Integer searchStatus;

    public DemoListView(){
        this.withFilterSection = true;
    }

    @Override
    public void performAction(ActionCommand command, Object... parameters) {
        if(command.isActionId("create")){
            System.out.println("create");
        }
        if(command.isActionId("edit")){
            System.out.println("edit");
        }
        if(command.isActionId("del")){
            System.out.println("del");
        }
    }

    @Override
    protected void createFilterForm(HorizontalLayout layout) {
        searchAgent = new FormAgent();
        searchAgent.setDataHelper(new FormDataHelper());
        searchAgent.setSearchMode(true);
        searchAgent.setFieldColumnCount(2);
        searchAgent.setCaptionAlignment(Alignment.MIDDLE_LEFT);
        searchAgent.addField(new FormField("名称", "name", InputFieldEditor.class, false, null, false).setInputDescr("输入要搜索的名称"));
        List<DemoStatus> demoStatuses = new ArrayList<DemoStatus>(){{add(new DemoStatus(1,"是"));add(new DemoStatus(2,"否"));}};

        searchAgent.addField(new FormField("状态", "status", new SelectFieldEditor(demoStatuses,"value","title"), false, null, false));

        FormBuildLayout form = searchAgent.buildForm();
        form.setWidth("100%");
        form.setSpacing(true);

        layout.addComponent(form);
        layout.setExpandRatio(form, 1);
    }

    @Override
    public DataGridRow convertRowData(Object item) {
        return null;
    }

    @Override
    public int getDataCount() {
        return 0;
    }

    @Override
    protected void doSearchCancelAction() {
        this.searchAgent.resetFormData();
        this.doSearchAction();
    }

    @Override
    protected void doSearchAction() {
        this.searchName = (String)this.searchAgent.getFieldValue("name");
        this.searchStatus = (Integer)this.searchAgent.getFieldValue("status");
        System.out.println();
        this.dataGrid.reloadDatas();
    }

    @Override
    public List<?> getDataList(DataListRequest request) {
        return null;
    }

    @Override
    protected void setupGridModel(DataGridModel gridModel) {
        gridModel.addColumn(new DataGridColumn("ID", String.class));
        gridModel.addColumn(new DataGridColumn("名称", String.class));


        gridModel.addCommonAction(new ActionCommand("create", "创建系列"));
        gridModel.addItemAction(new ActionCommand("del", "删除"));
        gridModel.addItemAction(new ActionCommand("edit", "编辑"));

        gridModel.addOrderField(new DataOrderField("按照创建时间排序", "create_time", false));
    }


    class DemoStatus{
        private Integer value;
        private String title;

        public DemoStatus(Integer value, String title) {
            this.value = value;
            this.title = title;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
