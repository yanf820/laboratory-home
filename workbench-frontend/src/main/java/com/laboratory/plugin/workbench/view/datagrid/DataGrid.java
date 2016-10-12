package com.laboratory.plugin.workbench.view.datagrid;

import com.laboratory.plugin.workbench.widgets.FormButton;
import com.laboratory.plugin.workbench.widgets.LinkButton;
import com.laboratory.plugin.workbench.widgets.OrderByButton;
import com.vaadin.data.Item;
import com.vaadin.data.Property;
import com.vaadin.server.ExternalResource;
import com.vaadin.ui.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Author: alvin
 * Date: 2016-08-22
 * TODO:差分页模型
 */
public class DataGrid extends VerticalLayout implements Button.ClickListener {

    private Table table;

    /**
     * DataGrid模型数据
     */
    private DataGridModel model;


    private List<OrderByButton> orderButtons;

    public DataGrid(DataGridModel gridModel) {
        super();
        this.model = gridModel;
        this.orderButtons = new ArrayList<OrderByButton>();

        this.setSpacing(true);
        this.setSizeFull();

        this.createActionBar();
        this.createTable();
    }

    /**
     * 创建表头
     */
    private void createTable(){
        table = new Table();
        table.setBuffered(true);
        table.setCacheRate(2);
        table.setSizeFull();

        table.setColumnCollapsingAllowed(true);


        if(this.model.getListActionCommands().size()>0){
            table.addContainerProperty("__SELECT__", CheckBox.class, false, "选择", null, Table.Align.LEFT);
        }
        for(DataGridColumn column : this.model.getGridColumns()){
//            Resource res = column.getIconUrl()!=null?new ExternalResource(column.getIconUrl()): null;
            table.addContainerProperty(column.getId(), column.getType(), column.getDefaultValue(), column.getCaption(), null, Table.Align.LEFT);
        }
        if(this.model.getItemActionCommands().size()>0){
            table.addContainerProperty("__ACTION__", HorizontalLayout.class, false, "操作", null, Table.Align.CENTER);
        }


        this.addComponent(table);
        this.setExpandRatio(table, 1);
    }

    @Override
    public void buttonClick(Button.ClickEvent event) {
        this.reloadDatas();
    }

    /**
     * 创建行为动作Bar
     */
    private void createActionBar(){

        if(this.model.getListActionCommands().size()>0 || this.model.getCommonActionCommands().size()>0){

            HorizontalLayout hl2 = new HorizontalLayout();
            hl2.setWidth("100%");
            hl2.setSpacing(true);

            this.addComponent(hl2);

            if(this.model.getListActionCommands().size()>0){
                CheckBox selectAllBox = new CheckBox("全选 将选中的数据  : ");
                selectAllBox.addValueChangeListener(new Property.ValueChangeListener() {
                    @Override
                    public void valueChange(Property.ValueChangeEvent event) {
                        doSelectAllItems((Boolean) event.getProperty().getValue());
                    }

                });
                hl2.addComponent(selectAllBox);
                hl2.setComponentAlignment(selectAllBox, Alignment.MIDDLE_LEFT);



                List<String> categories = this.model.getListActionCategories();
                if(categories.size()>0){
                    MenuBar menuBar = new MenuBar();
                    hl2.addComponent(menuBar);
                    hl2.setComponentAlignment(menuBar, Alignment.MIDDLE_LEFT);
                    for(String category : categories) {
                        String iconUrl = this.model.getActionCategoryIcon(category);
                        ExternalResource cicon = iconUrl==null?null:new ExternalResource(iconUrl);
                        MenuBar.MenuItem categoryItem = menuBar.addItem(category, cicon, null);
                        List<ActionCommand> list = this.model.getActionsByCategory(category);
                        for(final ActionCommand act : list){
                            MenuBar.MenuItem menuItem = categoryItem.addItem(act.getCaption(), null, new MenuBar.Command() {
                                @Override
                                public void menuSelected(MenuBar.MenuItem selectedItem) {
                                    handleListActionMenuItemClicked(act);
                                }
                            });
                            if(act.getDescription()!=null){
                                menuItem.setDescription(act.getDescription());
                            }
                        }
                    }
                }
                //hl2.setExpandRatio(menuBar, 1);

                List<ActionCommand> nlist = this.model.getActionsByCategory(null);
                for(final ActionCommand act : nlist){
                    FormButton button = new FormButton(act.getCaption(), new Button.ClickListener() {
                        public void buttonClick(Button.ClickEvent event) {
                            handleListActionMenuItemClicked(act);
                        }
                    });
                    hl2.addComponent(button);
                    hl2.setComponentAlignment(button, Alignment.MIDDLE_LEFT);
                }

            }

            Label space = new Label();
            space.setWidth("100%");
            hl2.addComponent(space);
            hl2.setExpandRatio(space, 1);

            if(this.model.getCommonActionCommands().size()>0){
                for(final ActionCommand action : this.model.getCommonActionCommands()){
                    FormButton actBtn = new FormButton(action.getCaption(), new Button.ClickListener() {
                        public void buttonClick(Button.ClickEvent event) {
                            handleCommonActionMenuItemClicked(action);
                        }
                    });
                    hl2.addComponent(actBtn);
                    hl2.setComponentAlignment(actBtn, Alignment.MIDDLE_LEFT);
                }
            }


        }
    }

    protected void handleCommonActionMenuItemClicked(ActionCommand action) {
        if(this.model.getCommandHandler()!=null){
            this.model.getCommandHandler().performAction(action);
        }
    }

    protected void handleListActionMenuItemClicked(ActionCommand action) {
        if(this.model.getCommandHandler()!=null){
            List<Object> ls = new ArrayList<Object>();
            Collection<?> itemIds = this.table.getItemIds();
            if(itemIds!=null && !itemIds.isEmpty()){
                Iterator<?> iterator = itemIds.iterator();
                while(iterator.hasNext()){
                    Object itemId = iterator.next();
                    Item item = this.table.getItem(itemId);
                    Property property = item.getItemProperty("__SELECT__");
                    if(property!=null && property.getType() == CheckBox.class){
                        CheckBox cb = (CheckBox) property.getValue();
                        if(cb.getValue()){
                            ls.add(itemId);
                        }
                    }
                }
            }
            this.model.getCommandHandler().performAction(action, ls.toArray());
        }
    }

    protected void handleItemActionMenuItemClicked(ActionCommand action, Object item) {
        if(this.model.getCommandHandler()!=null){
            this.model.getCommandHandler().performAction(action, item);
        }
    }


    /**
     * 重新加载数据
     */
    public void reloadDatas(){
        this.loadDataPage(1);
    }

    /**
     * 加载数据页
     * @param pageIndex
     */
    public void loadDataPage(int pageIndex){

        DataListRequest request = new DataListRequest();
        String orderString = this.getOrderString();
        request.setOrderClause(orderString);
        request.setPageIndex(pageIndex);
        request.setPageSize(this.model.getPageSize());


        int count = this.model.getDataProvider().getDataCount();
        List<?> list = this.model.getDataProvider().getDataList(request);

        this.table.removeAllItems();
        for(Object itemObj : list){
            final Object item = itemObj;
            final DataGridRow row = this.model.getGridRowConverter().convertRowData(item);
            if(row!=null){
                List<Object> ls = new ArrayList<Object>();
                if(this.model.getListActionCommands().size()>0){
                    ls.add(new CheckBox());
                }
                for(Object obj : row.getDatas()){
                    ls.add(obj);
                }
                if(this.model.getItemActionCommands().size()>0){
                    HorizontalLayout h = new HorizontalLayout();
                    for(final ActionCommand action : this.model.getItemActionCommands()){
                        LinkButton lk = new LinkButton(action.getCaption(), new Button.ClickListener() {
                            public void buttonClick(Button.ClickEvent event) {
                                handleItemActionMenuItemClicked(action, row.getRowId());
                            }
                        });
                        String icon = action.getIcon();
                        if(icon!=null){
                            lk.setIcon(new ExternalResource(icon));
                        }
                        h.addComponent(lk);
                    }
                    ls.add(h);
                }
                table.addItem(ls.toArray(), row.getRowId());
            }
        }

//        navigatorModel = new PageNavigatorModel(count, this.model.getPageSize(), pageIndex);
//        if(this.model.isWithInfoSection()){
//            this.pagingNavigator.updateNavigator(navigatorModel);
//        }

    }

    protected void doSelectAllItems(Boolean selectAll) {
        Collection<?> itemIds = this.table.getItemIds();
        if(itemIds==null || itemIds.isEmpty()) return;
        Iterator<?> iterator = itemIds.iterator();
        while(iterator.hasNext()){
            Object itemId = iterator.next();
            Item item = this.table.getItem(itemId);
            Property property = item.getItemProperty("__SELECT__");
            if(property!=null && property.getType() == CheckBox.class){
                CheckBox cb = (CheckBox) property.getValue();
                cb.setValue(selectAll);
            }
        }
    }

    public void showAllRows(boolean showAll){
        if(showAll){
            this.table.setPageLength(0);
        }else{
            this.table.setPageLength(15);
        }
    }

    public String getOrderString() {
        for(OrderByButton b : this.orderButtons){
            if(b.getStatus()!=null){
                return b.getFieldName() + (b.getStatus()?"":" DESC");
            }
        }
        return null;
    }
}
