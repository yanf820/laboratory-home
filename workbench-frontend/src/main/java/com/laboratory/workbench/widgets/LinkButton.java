package com.laboratory.workbench.widgets;

import com.vaadin.ui.Button;

/**
 * @author shixin
 *
 */
public class LinkButton extends Button {

    private static final long serialVersionUID = -1782900856689034890L;

    public LinkButton() {
        super();
        setup();
    }

    public LinkButton(String caption, ClickListener listener) {
        super(caption, listener);
        setup();
    }

    public LinkButton(String caption) {
        super(caption);
        setup();
    }

    private void setup(){
        this.setStyleName("m-button-linkbutton");
    }


}
