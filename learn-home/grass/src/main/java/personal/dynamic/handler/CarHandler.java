package personal.dynamic.handler;

import personal.dynamic.interfaces.Car;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by yf on 2016/10/11.
 */
public class CarHandler implements InvocationHandler{

    private Car car;

    public CarHandler(Car car){
        this.car=car;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.err.println("before");
        method.invoke(car,args);
        System.err.println("after");
        return null;
    }
}
