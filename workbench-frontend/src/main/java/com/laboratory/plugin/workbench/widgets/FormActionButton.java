package com.laboratory.plugin.workbench.widgets;

import com.vaadin.ui.Button;

/**
 * @author shixin
 *
 */
public class FormActionButton extends Button {

    private static final long serialVersionUID = -7046926362723007231L;

    public FormActionButton() {
        super();
        setup();
    }

    public FormActionButton(String caption, ClickListener listener) {
        super(caption, listener);
        setup();
    }

    public FormActionButton(String caption) {
        super(caption);
        setup();
    }

    private void setup(){
        this.setStyleName("m-button-formaction");
    }
}
