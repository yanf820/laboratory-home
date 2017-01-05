
package com.linkedin.api.sdktest.resource;


import com.linkedin.api.sdktest.model.ApiContact;
import com.linkedin.api.sdktest.model.ApiCreatedEntity;

import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("contacts")
public interface ContactsResource {


    /**
     * Creates a new contact
     * 
     * @param name
     *     The name of the contact
     * @param email
     *     The email of the contact
     */
    @POST
    @Consumes("application/x-www-form-urlencoded")
    @Produces({
        "application/json",
        "text/plain"
    })
    ContactsResource.PostContactsResponse postContacts(
            @FormParam("name")
            @NotNull
                    String name,
            @FormParam("email")
                    String email)
        throws Exception
    ;

    /**
     * Retrieves specific contact by id
     *
     * @param id
     *
     */
    @GET
    @Path("{id}")
    @Produces({
        "application/json"
    })
    ContactsResource.GetContactsByIdResponse getContactsById(
            @PathParam("id")
            @NotNull
                    String id)
        throws Exception
    ;

    public class GetContactsByIdResponse
        extends com.linkedin.api.resource.support.ResponseWrapper
    {


        private GetContactsByIdResponse(Response delegate) {
            super(delegate);
        }

        /**
         *
         * @param entity
         *
         */
        public static ContactsResource.GetContactsByIdResponse withJsonOK(ApiContact entity) {
            ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ContactsResource.GetContactsByIdResponse(responseBuilder.build());
        }

        /**
         * Bad Request
         *
         */
        public static ContactsResource.GetContactsByIdResponse withBadRequest() {
            ResponseBuilder responseBuilder = Response.status(400);
            return new ContactsResource.GetContactsByIdResponse(responseBuilder.build());
        }

        /**
         * Internal Server Error
         *
         */
        public static ContactsResource.GetContactsByIdResponse withInternalServerError() {
            ResponseBuilder responseBuilder = Response.status(500);
            return new ContactsResource.GetContactsByIdResponse(responseBuilder.build());
        }

    }

    public class PostContactsResponse
        extends com.linkedin.api.resource.support.ResponseWrapper
    {


        private PostContactsResponse(Response delegate) {
            super(delegate);
        }

        /**
         * The contact has been created
         *
         * @param entity
         *
         */
        public static ContactsResource.PostContactsResponse withJsonOK(ApiCreatedEntity entity) {
            ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ContactsResource.PostContactsResponse(responseBuilder.build());
        }

        /**
         * Bad Request
         *
         */
        public static ContactsResource.PostContactsResponse withBadRequest() {
            ResponseBuilder responseBuilder = Response.status(400);
            return new ContactsResource.PostContactsResponse(responseBuilder.build());
        }

        /**
         * Internal Server Error
         *
         * @param entity
         *
         */
        public static ContactsResource.PostContactsResponse withPlainInternalServerError(String entity) {
            ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "text/plain");
            responseBuilder.entity(entity);
            return new ContactsResource.PostContactsResponse(responseBuilder.build());
        }

    }

}
