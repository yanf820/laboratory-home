package personal.dynamic.handler;

import personal.dynamic.impl.Pigeon;
import personal.dynamic.interfaces.Bird;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by yf on 2016/10/12.
 */
public class BirdHandler implements InvocationHandler {

    Bird bird;

    public BirdHandler(Pigeon pigeon) {
       this.bird=bird;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        rush();
        method.invoke(proxy,args);
        descend();

        return null;
    }

    private void rush(){
        System.out.println("pigeon rush .....");
    }

    private void descend(){
        System.out.println("pigeon descend .....");
    }
}
