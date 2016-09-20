package com.laboratory.workbench.annotations;

import java.lang.annotation.*;

/**
 * @author yim
 *         Created by yf on 2016/8/29.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EternityDeclare {

    String value() default "";

}
