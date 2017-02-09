package com.laboratory.filters;

import com.laboratory.annotations.DoIt;
import org.springframework.stereotype.Component;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

/**
 * Created by yf on 2017/1/13.
 */
@Provider
@Component
@DoIt
//@Priority(Priorities.AUTHENTICATION)
public class BeepFilter implements ContainerRequestFilter,ContainerResponseFilter{

    public static final String AFTER_EXECUTE = "===== after execute ===== : ";

    public void filter(ContainerRequestContext requestContext) throws IOException {

//        requestContext.abortWith(Response.ok().entity("{\"das\":\"das\"}").build());//中止chain并返回Response，会执行ContainerResponseFilter
        System.out.println("===== before execute ===== : "+requestContext.getUriInfo().getPath()
        + " （可以在这里作认证校验）");
    }

    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {
//        responseContext.setEntity("{\"das\":\"das\"}");
        System.out.println(AFTER_EXECUTE+requestContext.getUriInfo().getPath()
        + "（可以对response作修改，可以做缓存）");
    }
}
