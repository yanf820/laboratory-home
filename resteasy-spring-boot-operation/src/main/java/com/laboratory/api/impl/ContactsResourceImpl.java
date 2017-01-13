package com.laboratory.api.impl;

import com.laboratory.annotations.DoIt;
import com.laboratory.api.model.ApiCreatedEntity;
import com.laboratory.api.model.Tree;
import com.laboratory.api.resource.ContactsResource;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import javax.ws.rs.FormParam;

/**
 * Created by yf on 2017/1/13.
 */
@Component
public class ContactsResourceImpl implements ContactsResource {
    @DoIt
    public PostContactsResponse postContacts(@FormParam("name") @NotNull String name, @FormParam("email") String email) throws Exception {
        ApiCreatedEntity entity=new ApiCreatedEntity();
        entity.setId("ID-"+name);
        entity.setAdditionalProperty("email",email);
        return PostContactsResponse.withJsonOK(entity);
    }

    @DoIt
    public GetContactsByIdResponse getContactsById(@NotNull String id) throws Exception {
        Tree tree=new Tree();
        tree.setRoot("root-"+id);
        tree.setLeaf("leaf-"+id);
        return GetContactsByIdResponse.withJsonOK(tree);
    }
}
