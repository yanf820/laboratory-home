package com.laboratory.filters;

import com.laboratory.annotations.DoIt;
import org.springframework.stereotype.Component;

import javax.annotation.Priority;
import javax.ws.rs.container.*;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

/**
 * Created by yf on 2017/1/13.
 */
@Provider
@Component
@DoIt
@PreMatching
public class TickTockFilter implements ContainerRequestFilter{
    public void filter(ContainerRequestContext requestContext) throws IOException {
        System.out.println("===== before match ===== : "+requestContext.getUriInfo().getPath());
    }
}
