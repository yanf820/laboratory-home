package com.linkedin.api.sdktest.impl;

import com.linkedin.api.sdktest.model.ApiContact;
import com.linkedin.api.sdktest.model.ApiCreatedEntity;
import com.linkedin.api.sdktest.resource.ContactsResource;

import javax.validation.constraints.NotNull;
import javax.ws.rs.FormParam;
import java.util.ArrayList;

/**
 * Created by yf on 2017/1/4.
 */
public class ContactsResourceImpl implements ContactsResource {
    public PostContactsResponse postContacts(@FormParam("name") @NotNull String name, @FormParam("email") String email) throws Exception {
        ApiCreatedEntity apiCreatedEntity=new ApiCreatedEntity();
        apiCreatedEntity.setId("UNISSSSD");
        return PostContactsResponse.withJsonOK(apiCreatedEntity);
    }

    public GetContactsByIdResponse getContactsById(@NotNull String id) throws Exception {
        ApiContact apiContact=new ApiContact();
        apiContact.setId(id);
        apiContact.setEmails(new ArrayList<Object>(){{
            add("xxx@gmail.com");
            add("ccc@yeah.com");
        }});
        apiContact.setName("name_"+id);
        return GetContactsByIdResponse.withJsonOK(apiContact);
    }
}
