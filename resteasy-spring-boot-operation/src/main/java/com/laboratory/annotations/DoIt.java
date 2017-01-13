package com.laboratory.annotations;

import javax.ws.rs.NameBinding;
import java.lang.annotation.*;

/**
 * Created by yf on 2017/1/13.
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@NameBinding
public @interface DoIt {
}
