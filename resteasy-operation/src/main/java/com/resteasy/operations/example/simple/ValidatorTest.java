package com.resteasy.operations.example.simple;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

/**
 * Created by yf on 2016/12/16.
 */
public class ValidatorTest {

    public static void main(String[] args) {

        Car car=new Car(null, "DD-AB-123", 1);

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator=factory.getValidator();
        

        Set<ConstraintViolation<Car>> constraintViolations = validator.validate(car);

        for (ConstraintViolation<Car> cons: constraintViolations){
            System.out.println(cons.getInvalidValue());
        }

    }
}
