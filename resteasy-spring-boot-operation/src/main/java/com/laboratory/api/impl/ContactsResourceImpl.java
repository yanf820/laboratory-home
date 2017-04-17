package com.laboratory.api.impl;

import com.laboratory.api.model.ApiCreatedEntity;
import com.laboratory.api.model.Tree;
import com.laboratory.api.resource.ContactsResource;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import javax.ws.rs.FormParam;
import java.io.File;

/**
 * Created by yf on 2017/1/13.
 */
@Component
public class ContactsResourceImpl implements ContactsResource {

//    @Autowired
//    TopicsResource topicsResource;
    public PostContactsResponse postContacts(@FormParam("name") @NotNull File name, @FormParam("email") String email) throws Exception {
//        Topics topics=topicsResource.getTopics("sadas").readEntity(Topics.class);
        ApiCreatedEntity entity=new ApiCreatedEntity();
        entity.setId("ID-"+name);
        entity.setAdditionalProperty("email",email);
        return PostContactsResponse.withJsonOK(entity);
    }

    @Override
    public PostContactsResponse postContacts(MultipartFormDataInput entity) throws Exception {
        System.out.println("");
        return null;
    }

    public GetContactsByIdResponse getContactsById(@NotNull String id) throws Exception {
        Tree tree=new Tree();
        tree.setRoot("root-"+id);
        tree.setLeaf("leaf-"+id);
        return GetContactsByIdResponse.withJsonOK(tree);
    }
}
