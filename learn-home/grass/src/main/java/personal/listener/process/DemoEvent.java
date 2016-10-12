package personal.listener.process;

import java.util.EventObject;

/**
 * Created by yf on 2016/10/12.
 */
public class DemoEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public DemoEvent(Object source) {
        super(source);
    }

    /**
     * Constructs a prototypical Event.
     *
     * @throws IllegalArgumentException if source is null.
     */

    public void say(){
        System.out.println("I am the DemoEvent`s method named say");
    }
}
