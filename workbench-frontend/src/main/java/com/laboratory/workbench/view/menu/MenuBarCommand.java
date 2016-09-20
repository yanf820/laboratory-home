package com.laboratory.workbench.view.menu;

import com.vaadin.ui.MenuBar;
import com.vaadin.ui.UI;

/**
 * @author yim
 * Created by yf on 2016/8/30.
 */
public class MenuBarCommand implements MenuBar.Command{

    private String active;

    @Override
    public void menuSelected(MenuBar.MenuItem selectedItem) {

        UI.getCurrent().getNavigator().navigateTo(active);
    }

    public MenuBarCommand(String active){this.active=active;}
}
