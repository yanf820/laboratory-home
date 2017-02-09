package com.laboratory.interceptors;

import com.laboratory.annotations.DoIt;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Component;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.ext.Provider;
import javax.ws.rs.ext.ReaderInterceptor;
import javax.ws.rs.ext.ReaderInterceptorContext;
import java.io.IOException;
import java.util.List;

/**
 * Created by yf on 2017/1/16.
 */
@DoIt
@Provider
@Component
public class SimpleInterceptor implements ReaderInterceptor {
    public Object aroundReadFrom(ReaderInterceptorContext context) throws IOException, WebApplicationException {
        List<String> lines=IOUtils.readLines(context.getInputStream());
        lines.forEach(line -> {
            System.out.println(line);
        });
        return null;
    }
}
