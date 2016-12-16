package com.resteasy.operations.example.simple;

import javax.validation.Validation;
import javax.validation.ValidatorFactory;

/**
 * Created by yf on 2016/12/16.
 */
public class Validator {

    public static void main(String[] args) {

        Car car=new Car("Morris", "DD-AB-123", 2);

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        javax.validation.Validator



    }
}
