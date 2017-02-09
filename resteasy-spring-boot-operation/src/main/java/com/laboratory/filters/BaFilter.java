package com.laboratory.filters;

import com.laboratory.annotations.DoIt;
import org.springframework.stereotype.Component;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

/**
 * Created by admin on 2017/1/15.
 */
@Provider
@Component
@DoIt
//@Priority(9)
public class BaFilter implements ContainerRequestFilter {

    public static final String AFTER_EXECUTE = "===== define Priority (the lower the number the higher the priority)===== : ";

    public void filter(ContainerRequestContext requestContext) throws IOException {
        System.out.println(AFTER_EXECUTE+requestContext.getUriInfo().getPath());
    }
}
