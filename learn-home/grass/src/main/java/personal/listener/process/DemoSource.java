package personal.listener.process;

import personal.listener.interfaces.DemoListener;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 事件源对象
 * Created by yf on 2016/10/12.
 */

public class DemoSource {
    private Vector<DemoListener> listenerQueue=new Vector<DemoListener>();

    public DemoSource(){}

    public void addListener(DemoListener dl){
        listenerQueue.add(dl);
    }

    public void notifyDemoEvent(){
        Enumeration enumeration=listenerQueue.elements();
        while(enumeration.hasMoreElements()){
            DemoListener dl= (DemoListener) enumeration.nextElement();
            dl.handleEvent(new DemoEvent(this));
        }
    }
}
