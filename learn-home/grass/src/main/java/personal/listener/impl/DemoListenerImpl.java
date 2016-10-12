package personal.listener.impl;

import personal.listener.interfaces.DemoListener;
import personal.listener.process.DemoEvent;

/**
 * Created by yf on 2016/10/12.
 */
public class DemoListenerImpl implements DemoListener {
    public void handleEvent(DemoEvent dm) {
        System.out.println("inside DemoListenerImpl`s handleEvent method");
        dm.say();
    }
}
