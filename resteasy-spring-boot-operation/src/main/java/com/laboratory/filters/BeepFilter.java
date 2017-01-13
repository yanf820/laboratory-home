package com.laboratory.filters;

import com.laboratory.annotations.DoIt;
import org.springframework.stereotype.Component;

import javax.ws.rs.container.*;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

/**
 * Created by yf on 2017/1/13.
 */
@Provider
@Component
@DoIt
public class BeepFilter implements ContainerRequestFilter,ContainerResponseFilter{

    public void filter(ContainerRequestContext requestContext) throws IOException {
        System.out.println("===== before execute ===== : "+requestContext.getUriInfo().getPath());
    }

    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {
        System.out.println("===== after execute ===== : "+requestContext.getUriInfo().getPath());
    }
}
