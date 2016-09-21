
package com.linkedin.api.resource;

import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import com.ricston.blog.contactsapp.rest.api.model.ApiContact;
import com.ricston.blog.contactsapp.rest.api.model.ApiContacts;
import com.ricston.blog.contactsapp.rest.api.model.ApiCreatedEntity;

@Path("contacts")
public interface ContactsResource {


    /**
     * Retrieves an array of contacts
     * 
     */
    @GET
    @Produces({
        "application/json"
    })
    ContactsResource.GetContactsResponse getContacts()
        throws Exception
    ;

    /**
     * Creates a new contact
     * 
     * @param email
     *     The email of the contact
     * @param name
     *     The name of the contact
     */
    @POST
    @Consumes("application/x-www-form-urlencoded")
    @Produces({
        "text/plain",
        "application/json"
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
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ContactsResource.GetContactsByIdResponse(responseBuilder.build());
        }

        /**
         * Bad Request
         * 
         */
        public static ContactsResource.GetContactsByIdResponse withBadRequest() {
            Response.ResponseBuilder responseBuilder = Response.status(400);
            return new ContactsResource.GetContactsByIdResponse(responseBuilder.build());
        }

        /**
         * Internal Server Error
         * 
         */
        public static ContactsResource.GetContactsByIdResponse withInternalServerError() {
            Response.ResponseBuilder responseBuilder = Response.status(500);
            return new ContactsResource.GetContactsByIdResponse(responseBuilder.build());
        }

    }

    public class GetContactsResponse
        extends com.linkedin.api.resource.support.ResponseWrapper
    {


        private GetContactsResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 
         * @param entity
         *     
         */
        public static ContactsResource.GetContactsResponse withJsonOK(ApiContacts entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ContactsResource.GetContactsResponse(responseBuilder.build());
        }

        /**
         * Bad Request
         * 
         */
        public static ContactsResource.GetContactsResponse withBadRequest() {
            Response.ResponseBuilder responseBuilder = Response.status(400);
            return new ContactsResource.GetContactsResponse(responseBuilder.build());
        }

        /**
         * Internal Server Error
         * 
         */
        public static ContactsResource.GetContactsResponse withInternalServerError() {
            Response.ResponseBuilder responseBuilder = Response.status(500);
            return new ContactsResource.GetContactsResponse(responseBuilder.build());
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
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ContactsResource.PostContactsResponse(responseBuilder.build());
        }

        /**
         * Bad Request
         * 
         */
        public static ContactsResource.PostContactsResponse withBadRequest() {
            Response.ResponseBuilder responseBuilder = Response.status(400);
            return new ContactsResource.PostContactsResponse(responseBuilder.build());
        }

        /**
         * Internal Server Error
         * 
         * @param entity
         *     
         */
        public static ContactsResource.PostContactsResponse withPlainInternalServerError(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "text/plain");
            responseBuilder.entity(entity);
            return new ContactsResource.PostContactsResponse(responseBuilder.build());
        }

    }

}
