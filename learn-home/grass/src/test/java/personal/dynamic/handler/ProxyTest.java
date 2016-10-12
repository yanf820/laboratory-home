package personal.dynamic.handler; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import personal.dynamic.impl.Audi;
import personal.dynamic.impl.Pigeon;
import personal.dynamic.interfaces.Bird;
import personal.dynamic.interfaces.Car;

import java.lang.reflect.Proxy;

/** 
* CarHandler Tester. 
* 
* @author <Authors name> 
* @since <pre>Ê®ÔÂ 11, 2016</pre> 
* @version 1.0 
*/ 
public class ProxyTest {

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

@Test
public void carProxyTest() throws Exception {

    Car audi= (Car) Proxy.newProxyInstance(Car.class.getClassLoader(),new Class<?>[]{Car.class},new CarHandler(new Audi()));
    audi.drive("yim","audi");
}

@Test
public void birdProxyTest(){
    Bird pigeon= (Bird) Proxy.newProxyInstance(Bird.class.getClassLoader(),new Class<?>[]{Bird.class},new BirdHandler(new Pigeon()));
    pigeon.fly();
}


} 
