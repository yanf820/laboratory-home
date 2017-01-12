
package com.laboratory.api.resource;

import com.laboratory.api.model.ApiCreatedEntity;
import com.laboratory.api.model.Tree;

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
    PostContactsResponse postContacts(
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
    GetContactsByIdResponse getContactsById(
            @PathParam("id")
            @NotNull
                    String id)
        throws Exception
    ;

    public class GetContactsByIdResponse
        extends com.laboratory.api.resource.support.ResponseWrapper
    {


        private GetContactsByIdResponse(Response delegate) {
            super(delegate);
        }

        /**
         *
         * @param entity
         *
         */
        public static GetContactsByIdResponse withJsonOK(Tree entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetContactsByIdResponse(responseBuilder.build());
        }

        /**
         * Bad Request
         *
         */
        public static GetContactsByIdResponse withBadRequest() {
            Response.ResponseBuilder responseBuilder = Response.status(400);
            return new GetContactsByIdResponse(responseBuilder.build());
        }

        /**
         * Internal Server Error
         *
         */
        public static GetContactsByIdResponse withInternalServerError() {
            Response.ResponseBuilder responseBuilder = Response.status(500);
            return new GetContactsByIdResponse(responseBuilder.build());
        }

    }

    public class PostContactsResponse
        extends com.laboratory.api.resource.support.ResponseWrapper
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
        public static PostContactsResponse withJsonOK(ApiCreatedEntity entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostContactsResponse(responseBuilder.build());
        }

        /**
         * Bad Request
         *
         */
        public static PostContactsResponse withBadRequest() {
            Response.ResponseBuilder responseBuilder = Response.status(400);
            return new PostContactsResponse(responseBuilder.build());
        }

        /**
         * Internal Server Error
         *
         * @param entity
         *
         */
        public static PostContactsResponse withPlainInternalServerError(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "text/plain");
            responseBuilder.entity(entity);
            return new PostContactsResponse(responseBuilder.build());
        }

    }

}
