package com.laboratory.plugin.workbench.view;

import com.laboratory.plugin.workbench.annotations.EternityDeclare;
import com.laboratory.plugin.workbench.view.form.FormAgent;

/**
 * Created by yf on 2016/8/31.
 */
@EternityDeclare("editor")
public class DemoEditorView extends BaseWorkBenchEditorView{
    @Override
    protected String getObjectName(Object obj) {
        return "系列";
    }

    @Override
    protected void declareFormAgent(FormAgent formAgent) {


    }

    @Override
    protected Object createVirginObject() {
        return null;
    }

    @Override
    protected boolean saveObject(Object data) {
        return false;
    }

    @Override
    protected boolean updateObject(Object editingData2) {
        return false;
    }

    @Override
    protected Object loadeditingDataFromContext(ViewContext vc) {
        return null;
    }

    @Override
    protected String getReturnViewUrl() {
        return null;
    }
}
