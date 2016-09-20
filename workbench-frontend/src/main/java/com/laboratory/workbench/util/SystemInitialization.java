package com.laboratory.workbench.util;

import com.laboratory.workbench.domain.Group;
import com.laboratory.workbench.domain.Resource;
import com.laboratory.workbench.domain.Role;
import com.laboratory.workbench.domain.User;
import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

/**
 * @author yim
 * Created by yf on 2016/8/30.
 */
public class SystemInitialization {
    private static final Morphia morphia=new Morphia();
    private static final Datastore datastore=morphia.createDatastore(new MongoClient("localhost"),"workbench_menu");

    public static void initAuthenticationData(){
        morphia.mapPackage("com.laboratory.workbench.domain");
        datastore.ensureCaps();
        User user=new User(1l,"admin");
        datastore.save(user);

        Role role=new Role(1l,"管理员");
        datastore.save(role);

        Group group =new Group(1l,"管理组");
        datastore.save(group);

        Resource resource=new Resource(1000l,"系统管理",false,false,null,null,null);
        resource.appenMenuItem(new Resource(1001l,"用户管理",false,false,null,null,"user_list.view"));

        user.appendGroup(group);
        user.appendRole(role);
        role.appenMenuItem(resource);

        datastore.save(resource);
        datastore.save(role);
        datastore.save(user);

        User result=SystemInitialization.getDatastore().createQuery(User.class).filter("id",1L).get();
        System.out.println(result);
    }

    public static Datastore getDatastore() {
        return datastore;
    }
}
