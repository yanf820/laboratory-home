package personal.listener.process; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import personal.listener.impl.DemoListenerImpl;
import personal.listener.interfaces.DemoListener;

/** 
* DemoSource Tester. 
* 
* @author <Authors name> 
* @since <pre>Ê®ÔÂ 12, 2016</pre> 
* @version 1.0 
*/ 
public class DemoSourceTest {

    DemoSource ds;
    public DemoSourceTest(){

        try{
            ds=new DemoSource();
            DemoListener demoListener=new DemoListenerImpl();
            ds.addListener(demoListener);
            ds.addListener(new DemoListener(){

                public void handleEvent(DemoEvent dm) {
                    System.out.println("Method come from ssssss");
                }
            });
            ds.notifyDemoEvent();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: addListener(DemoListener dl) 
* 
*/ 
@Test
public void testListener() throws Exception {


} 



} 
