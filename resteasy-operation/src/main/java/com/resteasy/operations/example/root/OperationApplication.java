package com.resteasy.operations.example.root;

import com.resteasy.operations.example.simple.Library;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by yf on 2016/9/19.
 */
@ApplicationPath("operations")
public class OperationApplication extends Application {

    private Set<Object> singletons=new HashSet<Object>();

    public OperationApplication(){
        singletons.add(new Library());
    }

    @Override
    public Set<Object> getSingletons(){
        return singletons;
    }
}
