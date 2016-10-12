package com.laboratory.plugin.workbench.view.datagrid;

/**
 * @author shixin
 *
 */
public interface IActionCommandHandler {

    public void performAction(ActionCommand command, Object... parameters);

}

