package personal.dynamic.impl;

import personal.dynamic.interfaces.Car;

/**
 * Created by yf on 2016/10/11.
 */
public class Audi implements Car {
    public void drive(String driverName, String carName) {
        System.out.println("Audi is driving..."+"driverName : "+driverName+", carName : "+carName);
    }
}
