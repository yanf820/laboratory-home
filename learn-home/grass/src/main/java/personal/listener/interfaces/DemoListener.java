package personal.listener.interfaces;

import personal.listener.process.DemoEvent;

import java.util.EventListener;

/**
 * Created by yf on 2016/10/12.
 */
public interface DemoListener extends EventListener{
    public void handleEvent(DemoEvent dm);
}
