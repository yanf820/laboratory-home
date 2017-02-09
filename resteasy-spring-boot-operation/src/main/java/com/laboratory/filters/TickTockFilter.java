package com.laboratory.filters;

import com.laboratory.annotations.DoIt;
import org.springframework.stereotype.Component;

<<<<<<< HEAD
import javax.annotation.Priority;
import javax.ws.rs.container.*;
=======
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.PreMatching;
>>>>>>> 7204130a7cf7c91c7004b6b8c4a8ee417e5266ba
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
//        requestContext.setMethod(HttpMethod.GET);
//        InputStream entityStream=requestContext.getEntityStream();
//        System.out.println(IOUtils.toString(entityStream,"UTF-8"));//entity在json body有输出
//        Collection c=requestContext.getPropertyNames();//property非传入参数
//        try {
//            requestContext.setRequestUri(new URI("http://localhost:8080/laboratory/contacts/13221"));
//        } catch (URISyntaxException e) {
//            e.printStackTrace();
//        }
//        System.out.println(requestContext.getUriInfo().getAbsolutePath().toString());
//        requestContext.getHeaders().putSingle("AAA","dsads");
//        Map m=requestContext.getHeaders();
        System.out.println("===== before match ===== : "+requestContext.getUriInfo().getPath()
        + "（可以改变method、uri来路由到其他resource method，添加http header properties）");
    }
}
