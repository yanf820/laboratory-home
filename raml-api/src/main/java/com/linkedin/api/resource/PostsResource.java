
package com.linkedin.api.resource;

import java.io.Reader;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;
import com.linkedin.api.model.ErrorSchema;

@Path("posts")
public interface PostsResource {


    /**
     * Deletes a Post
     * 
     * 
     * @param fieldSelectors
     *     Many of our resources allow you to specify what fields you want returned. We call this syntax field selectors.
     *     By indicating exactly the information you need, we can optimize the amount of time needed to return your results.
     *     It also reduces the amount of data passing across the wire. The two combine to make our APIs speedy and efficient,
     *     a critical factor in any web application, and more so for anyone relying on external APIs.
     *     
     *     Field selectors are specified after the resource identifiers and path components of a resource, prefixed by a colon,
     *     contained within parenthesis, and separated by commas. Fields will be returned in the order specified. When URL-encoding
     *     your resource URLs, ensure that the parenthesis used in selectors remain unescaped.
     *     
     *     Examples
     *     --------
     *     To get a member's ID, first name, last name, and industry:
     *       `http://api.linkedin.com/v1/people/~:(id,first-name,last-name,industry)`
     *     
     *     Or the same set of information for their connections:
     *       `http://api.linkedin.com/v1/people/~/connections:(id,first-name,last-name,industry)`
     *     
     *     Fields selectors can also be nested to access individual fields from a larger collection. For example, to get just the
     *     job titles and not the rest of the information about positions:
     *       `http://api.linkedin.com/v1/people/~/connections:(id,first-name,last-name,positions:(title))`
     *     
     *     Field selectors with resource identifiers allow you to request information about multiple entities at once. Specify them
     *     similarly, but append a double colon - here's an example getting profile information about thee members: the first is the
     *     current member, indicated by a tilde; the next has an id of 12345; and the last has a public profile URL
     *     
     *       `http://api.linkedin.com/v1/people::(~, id=12345,url=http%3A%2F%2Fwww.linkedin.com%2Fin%2Fadamnash)`
     *      e.g. :(id,first-name,last-name,industry)
     * @param postId
     *     The unique identifier for a post
     *     
     */
    @DELETE
    @Path("{postId}{fieldSelectors}")
    PostsResource.DeletePostsByPostIdByFieldSelectorsResponse deletePostsByPostIdByFieldSelectors(
        @PathParam("postId")
        @NotNull
        String postId,
        @PathParam("fieldSelectors")
        String fieldSelectors)
        throws Exception
    ;

    /**
     * Returns Discussion Post
     * 
     * 
     * @param fieldSelectors
     *     Many of our resources allow you to specify what fields you want returned. We call this syntax field selectors.
     *     By indicating exactly the information you need, we can optimize the amount of time needed to return your results.
     *     It also reduces the amount of data passing across the wire. The two combine to make our APIs speedy and efficient,
     *     a critical factor in any web application, and more so for anyone relying on external APIs.
     *     
     *     Field selectors are specified after the resource identifiers and path components of a resource, prefixed by a colon,
     *     contained within parenthesis, and separated by commas. Fields will be returned in the order specified. When URL-encoding
     *     your resource URLs, ensure that the parenthesis used in selectors remain unescaped.
     *     
     *     Examples
     *     --------
     *     To get a member's ID, first name, last name, and industry:
     *       `http://api.linkedin.com/v1/people/~:(id,first-name,last-name,industry)`
     *     
     *     Or the same set of information for their connections:
     *       `http://api.linkedin.com/v1/people/~/connections:(id,first-name,last-name,industry)`
     *     
     *     Fields selectors can also be nested to access individual fields from a larger collection. For example, to get just the
     *     job titles and not the rest of the information about positions:
     *       `http://api.linkedin.com/v1/people/~/connections:(id,first-name,last-name,positions:(title))`
     *     
     *     Field selectors with resource identifiers allow you to request information about multiple entities at once. Specify them
     *     similarly, but append a double colon - here's an example getting profile information about thee members: the first is the
     *     current member, indicated by a tilde; the next has an id of 12345; and the last has a public profile URL
     *     
     *       `http://api.linkedin.com/v1/people::(~, id=12345,url=http%3A%2F%2Fwww.linkedin.com%2Fin%2Fadamnash)`
     *      e.g. :(id,first-name,last-name,industry)
     * @param postId
     *     The unique identifier for a post
     *     
     */
    @GET
    @Path("{postId}{fieldSelectors}")
    @Produces({
        "application/xml",
        "application/json"
    })
    PostsResource.GetPostsByPostIdByFieldSelectorsResponse getPostsByPostIdByFieldSelectors(
        @PathParam("postId")
        @NotNull
        String postId,
        @PathParam("fieldSelectors")
        String fieldSelectors)
        throws Exception
    ;

    /**
     * Add a Comment to a Post
     * 
     * @param entity
     *     
     * @param xLiFormat
     *     Type of data
     *     
     * @param postId
     *     
     */
    @POST
    @Path("{postId}/comments")
    @Consumes("application/json")
    @Produces({
        "application/json",
        "text/xml"
    })
    PostsResource.PostJsonPostsByPostIdCommentsResponse postJsonPostsByPostIdComments(
        @PathParam("postId")
        @NotNull
        String postId,
        @HeaderParam("x-li-format")
        PostsResource.XLiFormat xLiFormat, Reader entity)
        throws Exception
    ;

    /**
     * Add a Comment to a Post
     * 
     * @param entity
     *      e.g. <comment>
     *     <text>Comment text</text>
     *     </comment>
     * @param xLiFormat
     *     Type of data
     *     
     * @param postId
     *     
     */
    @POST
    @Path("{postId}/comments")
    @Consumes("application/xml")
    @Produces({
        "application/json",
        "text/xml"
    })
    PostsResource.PostXmlPostsByPostIdCommentsResponse postXmlPostsByPostIdComments(
        @PathParam("postId")
        @NotNull
        String postId,
        @HeaderParam("x-li-format")
        PostsResource.XLiFormat xLiFormat, Reader entity)
        throws Exception
    ;

    /**
     * 
     * @param format
     *     Type of data
     *     
     * @param xLiFormat
     *     Type of data
     *     
     * @param postId
     *     
     */
    @GET
    @Path("{postId}/comments")
    @Produces({
        "application/xml",
        "application/json",
        "text/xml"
    })
    PostsResource.GetPostsByPostIdCommentsResponse getPostsByPostIdComments(
        @PathParam("postId")
        @NotNull
        String postId,
        @HeaderParam("x-li-format")
        PostsResource.XLiFormat xLiFormat,
        @QueryParam("format")
        PostsResource.Format format)
        throws Exception
    ;

    public class DeletePostsByPostIdByFieldSelectorsResponse
        extends com.linkedin.api.resource.support.ResponseWrapper
    {


        private DeletePostsByPostIdByFieldSelectorsResponse(Response delegate) {
            super(delegate);
        }

    }

    public enum Format {

        xml,
        json,
        jsonp;

    }

    public class GetPostsByPostIdByFieldSelectorsResponse
        extends com.linkedin.api.resource.support.ResponseWrapper
    {


        private GetPostsByPostIdByFieldSelectorsResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 
         * @param entity
         *     
         */
        public static PostsResource.GetPostsByPostIdByFieldSelectorsResponse withJsonOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostsResource.GetPostsByPostIdByFieldSelectorsResponse(responseBuilder.build());
        }

        /**
         * 
         * @param entity
         *     
         */
        public static PostsResource.GetPostsByPostIdByFieldSelectorsResponse withXmlOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/xml");
            responseBuilder.entity(entity);
            return new PostsResource.GetPostsByPostIdByFieldSelectorsResponse(responseBuilder.build());
        }

    }

    public class GetPostsByPostIdCommentsResponse
        extends com.linkedin.api.resource.support.ResponseWrapper
    {


        private GetPostsByPostIdCommentsResponse(Response delegate) {
            super(delegate);
        }

        /**
         * Request succeeded  
         * 
         * 
         * @param entity
         *     
         */
        public static PostsResource.GetPostsByPostIdCommentsResponse withXmlOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/xml");
            responseBuilder.entity(entity);
            return new PostsResource.GetPostsByPostIdCommentsResponse(responseBuilder.build());
        }

        /**
         * Request succeeded  
         * 
         * 
         * @param entity
         *     
         */
        public static PostsResource.GetPostsByPostIdCommentsResponse withXmlOK(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new PostsResource.GetPostsByPostIdCommentsResponse(responseBuilder.build());
        }

        /**
         * Request succeeded  
         * 
         * 
         * @param entity
         *     
         */
        public static PostsResource.GetPostsByPostIdCommentsResponse withJsonOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostsResource.GetPostsByPostIdCommentsResponse(responseBuilder.build());
        }

        /**
         * Your request was not formatted correctly
         *  e.g. <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         * <error>
         *   <status>401</status>
         *   <timestamp>1378122242574</timestamp>
         *   <request-id>8PQJRYO7JK</request-id>
         *   <error-code>0</error-code>
         *   <message>Invalid access token.</message>
         * </error>
         * 
         * @param entity
         *     <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         *     <error>
         *       <status>401</status>
         *       <timestamp>1378122242574</timestamp>
         *       <request-id>8PQJRYO7JK</request-id>
         *       <error-code>0</error-code>
         *       <message>Invalid access token.</message>
         *     </error>
         */
        public static PostsResource.GetPostsByPostIdCommentsResponse withXmlBadRequest(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new PostsResource.GetPostsByPostIdCommentsResponse(responseBuilder.build());
        }

        /**
         * Your request was not formatted correctly
         *  e.g. {
         *   "errorCode": 0,
         *   "message": "Invalid access token.",
         *   "requestId": "Y703T8HXBF",
         *   "status": 401,
         *   "timestamp": 1378122137646
         * }
         * 
         * @param entity
         *     {
         *       "errorCode": 0,
         *       "message": "Invalid access token.",
         *       "requestId": "Y703T8HXBF",
         *       "status": 401,
         *       "timestamp": 1378122137646
         *     }
         */
        public static PostsResource.GetPostsByPostIdCommentsResponse withJsonBadRequest(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostsResource.GetPostsByPostIdCommentsResponse(responseBuilder.build());
        }

        /**
         * The OAuth signature was bad
         *  e.g. <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         * <error>
         *   <status>401</status>
         *   <timestamp>1378122242574</timestamp>
         *   <request-id>8PQJRYO7JK</request-id>
         *   <error-code>0</error-code>
         *   <message>Invalid access token.</message>
         * </error>
         * 
         * @param entity
         *     <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         *     <error>
         *       <status>401</status>
         *       <timestamp>1378122242574</timestamp>
         *       <request-id>8PQJRYO7JK</request-id>
         *       <error-code>0</error-code>
         *       <message>Invalid access token.</message>
         *     </error>
         */
        public static PostsResource.GetPostsByPostIdCommentsResponse withXmlUnauthorized(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new PostsResource.GetPostsByPostIdCommentsResponse(responseBuilder.build());
        }

        /**
         * The OAuth signature was bad
         *  e.g. {
         *   "errorCode": 0,
         *   "message": "Invalid access token.",
         *   "requestId": "Y703T8HXBF",
         *   "status": 401,
         *   "timestamp": 1378122137646
         * }
         * 
         * @param entity
         *     {
         *       "errorCode": 0,
         *       "message": "Invalid access token.",
         *       "requestId": "Y703T8HXBF",
         *       "status": 401,
         *       "timestamp": 1378122137646
         *     }
         */
        public static PostsResource.GetPostsByPostIdCommentsResponse withJsonUnauthorized(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostsResource.GetPostsByPostIdCommentsResponse(responseBuilder.build());
        }

        /**
         * Access to the resource was denied. Usually this means you have reached a throttle limit. Can also mean you do not have permission to access this resource.
         *  e.g. <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         * <error>
         *   <status>401</status>
         *   <timestamp>1378122242574</timestamp>
         *   <request-id>8PQJRYO7JK</request-id>
         *   <error-code>0</error-code>
         *   <message>Invalid access token.</message>
         * </error>
         * 
         * @param entity
         *     <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         *     <error>
         *       <status>401</status>
         *       <timestamp>1378122242574</timestamp>
         *       <request-id>8PQJRYO7JK</request-id>
         *       <error-code>0</error-code>
         *       <message>Invalid access token.</message>
         *     </error>
         */
        public static PostsResource.GetPostsByPostIdCommentsResponse withXmlForbidden(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new PostsResource.GetPostsByPostIdCommentsResponse(responseBuilder.build());
        }

        /**
         * Access to the resource was denied. Usually this means you have reached a throttle limit. Can also mean you do not have permission to access this resource.
         *  e.g. {
         *   "errorCode": 0,
         *   "message": "Invalid access token.",
         *   "requestId": "Y703T8HXBF",
         *   "status": 401,
         *   "timestamp": 1378122137646
         * }
         * 
         * @param entity
         *     {
         *       "errorCode": 0,
         *       "message": "Invalid access token.",
         *       "requestId": "Y703T8HXBF",
         *       "status": 401,
         *       "timestamp": 1378122137646
         *     }
         */
        public static PostsResource.GetPostsByPostIdCommentsResponse withJsonForbidden(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostsResource.GetPostsByPostIdCommentsResponse(responseBuilder.build());
        }

        /**
         * The resource was not found (i.e. you asked for a non-existent user or URL)
         *  e.g. <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         * <error>
         *   <status>401</status>
         *   <timestamp>1378122242574</timestamp>
         *   <request-id>8PQJRYO7JK</request-id>
         *   <error-code>0</error-code>
         *   <message>Invalid access token.</message>
         * </error>
         * 
         * @param entity
         *     <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         *     <error>
         *       <status>401</status>
         *       <timestamp>1378122242574</timestamp>
         *       <request-id>8PQJRYO7JK</request-id>
         *       <error-code>0</error-code>
         *       <message>Invalid access token.</message>
         *     </error>
         */
        public static PostsResource.GetPostsByPostIdCommentsResponse withXmlNotFound(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new PostsResource.GetPostsByPostIdCommentsResponse(responseBuilder.build());
        }

        /**
         * The resource was not found (i.e. you asked for a non-existent user or URL)
         *  e.g. {
         *   "errorCode": 0,
         *   "message": "Invalid access token.",
         *   "requestId": "Y703T8HXBF",
         *   "status": 401,
         *   "timestamp": 1378122137646
         * }
         * 
         * @param entity
         *     {
         *       "errorCode": 0,
         *       "message": "Invalid access token.",
         *       "requestId": "Y703T8HXBF",
         *       "status": 401,
         *       "timestamp": 1378122137646
         *     }
         */
        public static PostsResource.GetPostsByPostIdCommentsResponse withJsonNotFound(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostsResource.GetPostsByPostIdCommentsResponse(responseBuilder.build());
        }

        /**
         * Usually this means you used the wrong HTTP method (GET when you should POST, etc) 
         *  e.g. <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         * <error>
         *   <status>401</status>
         *   <timestamp>1378122242574</timestamp>
         *   <request-id>8PQJRYO7JK</request-id>
         *   <error-code>0</error-code>
         *   <message>Invalid access token.</message>
         * </error>
         * 
         * @param entity
         *     <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         *     <error>
         *       <status>401</status>
         *       <timestamp>1378122242574</timestamp>
         *       <request-id>8PQJRYO7JK</request-id>
         *       <error-code>0</error-code>
         *       <message>Invalid access token.</message>
         *     </error>
         */
        public static PostsResource.GetPostsByPostIdCommentsResponse withXmlMethodNotAllowed(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new PostsResource.GetPostsByPostIdCommentsResponse(responseBuilder.build());
        }

        /**
         * Usually this means you used the wrong HTTP method (GET when you should POST, etc) 
         *  e.g. {
         *   "errorCode": 0,
         *   "message": "Invalid access token.",
         *   "requestId": "Y703T8HXBF",
         *   "status": 401,
         *   "timestamp": 1378122137646
         * }
         * 
         * @param entity
         *     {
         *       "errorCode": 0,
         *       "message": "Invalid access token.",
         *       "requestId": "Y703T8HXBF",
         *       "status": 401,
         *       "timestamp": 1378122137646
         *     }
         */
        public static PostsResource.GetPostsByPostIdCommentsResponse withJsonMethodNotAllowed(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostsResource.GetPostsByPostIdCommentsResponse(responseBuilder.build());
        }

        /**
         * There was an application error on the LinkedIn server.
         *  e.g. <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         * <error>
         *   <status>401</status>
         *   <timestamp>1378122242574</timestamp>
         *   <request-id>8PQJRYO7JK</request-id>
         *   <error-code>0</error-code>
         *   <message>Invalid access token.</message>
         * </error>
         * 
         * @param entity
         *     <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         *     <error>
         *       <status>401</status>
         *       <timestamp>1378122242574</timestamp>
         *       <request-id>8PQJRYO7JK</request-id>
         *       <error-code>0</error-code>
         *       <message>Invalid access token.</message>
         *     </error>
         */
        public static PostsResource.GetPostsByPostIdCommentsResponse withXmlInternalServerError(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new PostsResource.GetPostsByPostIdCommentsResponse(responseBuilder.build());
        }

        /**
         * There was an application error on the LinkedIn server.
         *  e.g. {
         *   "errorCode": 0,
         *   "message": "Invalid access token.",
         *   "requestId": "Y703T8HXBF",
         *   "status": 401,
         *   "timestamp": 1378122137646
         * }
         * 
         * @param entity
         *     {
         *       "errorCode": 0,
         *       "message": "Invalid access token.",
         *       "requestId": "Y703T8HXBF",
         *       "status": 401,
         *       "timestamp": 1378122137646
         *     }
         */
        public static PostsResource.GetPostsByPostIdCommentsResponse withJsonInternalServerError(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostsResource.GetPostsByPostIdCommentsResponse(responseBuilder.build());
        }

    }

    public class PostJsonPostsByPostIdCommentsResponse
        extends com.linkedin.api.resource.support.ResponseWrapper
    {


        private PostJsonPostsByPostIdCommentsResponse(Response delegate) {
            super(delegate);
        }

        /**
         * Request succeeded
         * 
         * 
         * @param entity
         *     
         */
        public static PostsResource.PostJsonPostsByPostIdCommentsResponse withXmlOK(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new PostsResource.PostJsonPostsByPostIdCommentsResponse(responseBuilder.build());
        }

        /**
         * Request succeeded
         * 
         * 
         * @param entity
         *     
         */
        public static PostsResource.PostJsonPostsByPostIdCommentsResponse withJsonOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostsResource.PostJsonPostsByPostIdCommentsResponse(responseBuilder.build());
        }

        /**
         * Your request to POST or PUT a record was successful. A Location HTTP header is often returned when we respond with a 201.
         * 
         * 
         * @param entity
         *     
         */
        public static PostsResource.PostJsonPostsByPostIdCommentsResponse withXmlCreated(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(201).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new PostsResource.PostJsonPostsByPostIdCommentsResponse(responseBuilder.build());
        }

        /**
         * Your request to POST or PUT a record was successful. A Location HTTP header is often returned when we respond with a 201.
         * 
         * 
         * @param entity
         *     
         */
        public static PostsResource.PostJsonPostsByPostIdCommentsResponse withJsonCreated(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(201).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostsResource.PostJsonPostsByPostIdCommentsResponse(responseBuilder.build());
        }

        /**
         * Your request was not formatted correctly
         *  e.g. <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         * <error>
         *   <status>401</status>
         *   <timestamp>1378122242574</timestamp>
         *   <request-id>8PQJRYO7JK</request-id>
         *   <error-code>0</error-code>
         *   <message>Invalid access token.</message>
         * </error>
         * 
         * @param entity
         *     <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         *     <error>
         *       <status>401</status>
         *       <timestamp>1378122242574</timestamp>
         *       <request-id>8PQJRYO7JK</request-id>
         *       <error-code>0</error-code>
         *       <message>Invalid access token.</message>
         *     </error>
         */
        public static PostsResource.PostJsonPostsByPostIdCommentsResponse withXmlBadRequest(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new PostsResource.PostJsonPostsByPostIdCommentsResponse(responseBuilder.build());
        }

        /**
         * Your request was not formatted correctly
         *  e.g. {
         *   "errorCode": 0,
         *   "message": "Invalid access token.",
         *   "requestId": "Y703T8HXBF",
         *   "status": 401,
         *   "timestamp": 1378122137646
         * }
         * 
         * @param entity
         *     {
         *       "errorCode": 0,
         *       "message": "Invalid access token.",
         *       "requestId": "Y703T8HXBF",
         *       "status": 401,
         *       "timestamp": 1378122137646
         *     }
         */
        public static PostsResource.PostJsonPostsByPostIdCommentsResponse withJsonBadRequest(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostsResource.PostJsonPostsByPostIdCommentsResponse(responseBuilder.build());
        }

        /**
         * The OAuth signature was bad
         *  e.g. <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         * <error>
         *   <status>401</status>
         *   <timestamp>1378122242574</timestamp>
         *   <request-id>8PQJRYO7JK</request-id>
         *   <error-code>0</error-code>
         *   <message>Invalid access token.</message>
         * </error>
         * 
         * @param entity
         *     <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         *     <error>
         *       <status>401</status>
         *       <timestamp>1378122242574</timestamp>
         *       <request-id>8PQJRYO7JK</request-id>
         *       <error-code>0</error-code>
         *       <message>Invalid access token.</message>
         *     </error>
         */
        public static PostsResource.PostJsonPostsByPostIdCommentsResponse withXmlUnauthorized(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new PostsResource.PostJsonPostsByPostIdCommentsResponse(responseBuilder.build());
        }

        /**
         * The OAuth signature was bad
         *  e.g. {
         *   "errorCode": 0,
         *   "message": "Invalid access token.",
         *   "requestId": "Y703T8HXBF",
         *   "status": 401,
         *   "timestamp": 1378122137646
         * }
         * 
         * @param entity
         *     {
         *       "errorCode": 0,
         *       "message": "Invalid access token.",
         *       "requestId": "Y703T8HXBF",
         *       "status": 401,
         *       "timestamp": 1378122137646
         *     }
         */
        public static PostsResource.PostJsonPostsByPostIdCommentsResponse withJsonUnauthorized(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostsResource.PostJsonPostsByPostIdCommentsResponse(responseBuilder.build());
        }

        /**
         * Access to the resource was denied. Usually this means you have reached a throttle limit. Can also mean you do not have permission to access this resource.
         *  e.g. <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         * <error>
         *   <status>401</status>
         *   <timestamp>1378122242574</timestamp>
         *   <request-id>8PQJRYO7JK</request-id>
         *   <error-code>0</error-code>
         *   <message>Invalid access token.</message>
         * </error>
         * 
         * @param entity
         *     <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         *     <error>
         *       <status>401</status>
         *       <timestamp>1378122242574</timestamp>
         *       <request-id>8PQJRYO7JK</request-id>
         *       <error-code>0</error-code>
         *       <message>Invalid access token.</message>
         *     </error>
         */
        public static PostsResource.PostJsonPostsByPostIdCommentsResponse withXmlForbidden(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new PostsResource.PostJsonPostsByPostIdCommentsResponse(responseBuilder.build());
        }

        /**
         * Access to the resource was denied. Usually this means you have reached a throttle limit. Can also mean you do not have permission to access this resource.
         *  e.g. {
         *   "errorCode": 0,
         *   "message": "Invalid access token.",
         *   "requestId": "Y703T8HXBF",
         *   "status": 401,
         *   "timestamp": 1378122137646
         * }
         * 
         * @param entity
         *     {
         *       "errorCode": 0,
         *       "message": "Invalid access token.",
         *       "requestId": "Y703T8HXBF",
         *       "status": 401,
         *       "timestamp": 1378122137646
         *     }
         */
        public static PostsResource.PostJsonPostsByPostIdCommentsResponse withJsonForbidden(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostsResource.PostJsonPostsByPostIdCommentsResponse(responseBuilder.build());
        }

        /**
         * The resource was not found (i.e. you asked for a non-existent user or URL)
         *  e.g. <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         * <error>
         *   <status>401</status>
         *   <timestamp>1378122242574</timestamp>
         *   <request-id>8PQJRYO7JK</request-id>
         *   <error-code>0</error-code>
         *   <message>Invalid access token.</message>
         * </error>
         * 
         * @param entity
         *     <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         *     <error>
         *       <status>401</status>
         *       <timestamp>1378122242574</timestamp>
         *       <request-id>8PQJRYO7JK</request-id>
         *       <error-code>0</error-code>
         *       <message>Invalid access token.</message>
         *     </error>
         */
        public static PostsResource.PostJsonPostsByPostIdCommentsResponse withXmlNotFound(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new PostsResource.PostJsonPostsByPostIdCommentsResponse(responseBuilder.build());
        }

        /**
         * The resource was not found (i.e. you asked for a non-existent user or URL)
         *  e.g. {
         *   "errorCode": 0,
         *   "message": "Invalid access token.",
         *   "requestId": "Y703T8HXBF",
         *   "status": 401,
         *   "timestamp": 1378122137646
         * }
         * 
         * @param entity
         *     {
         *       "errorCode": 0,
         *       "message": "Invalid access token.",
         *       "requestId": "Y703T8HXBF",
         *       "status": 401,
         *       "timestamp": 1378122137646
         *     }
         */
        public static PostsResource.PostJsonPostsByPostIdCommentsResponse withJsonNotFound(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostsResource.PostJsonPostsByPostIdCommentsResponse(responseBuilder.build());
        }

        /**
         * Usually this means you used the wrong HTTP method (GET when you should POST, etc) 
         *  e.g. <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         * <error>
         *   <status>401</status>
         *   <timestamp>1378122242574</timestamp>
         *   <request-id>8PQJRYO7JK</request-id>
         *   <error-code>0</error-code>
         *   <message>Invalid access token.</message>
         * </error>
         * 
         * @param entity
         *     <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         *     <error>
         *       <status>401</status>
         *       <timestamp>1378122242574</timestamp>
         *       <request-id>8PQJRYO7JK</request-id>
         *       <error-code>0</error-code>
         *       <message>Invalid access token.</message>
         *     </error>
         */
        public static PostsResource.PostJsonPostsByPostIdCommentsResponse withXmlMethodNotAllowed(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new PostsResource.PostJsonPostsByPostIdCommentsResponse(responseBuilder.build());
        }

        /**
         * Usually this means you used the wrong HTTP method (GET when you should POST, etc) 
         *  e.g. {
         *   "errorCode": 0,
         *   "message": "Invalid access token.",
         *   "requestId": "Y703T8HXBF",
         *   "status": 401,
         *   "timestamp": 1378122137646
         * }
         * 
         * @param entity
         *     {
         *       "errorCode": 0,
         *       "message": "Invalid access token.",
         *       "requestId": "Y703T8HXBF",
         *       "status": 401,
         *       "timestamp": 1378122137646
         *     }
         */
        public static PostsResource.PostJsonPostsByPostIdCommentsResponse withJsonMethodNotAllowed(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostsResource.PostJsonPostsByPostIdCommentsResponse(responseBuilder.build());
        }

        /**
         * There was an application error on the LinkedIn server.
         *  e.g. <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         * <error>
         *   <status>401</status>
         *   <timestamp>1378122242574</timestamp>
         *   <request-id>8PQJRYO7JK</request-id>
         *   <error-code>0</error-code>
         *   <message>Invalid access token.</message>
         * </error>
         * 
         * @param entity
         *     <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         *     <error>
         *       <status>401</status>
         *       <timestamp>1378122242574</timestamp>
         *       <request-id>8PQJRYO7JK</request-id>
         *       <error-code>0</error-code>
         *       <message>Invalid access token.</message>
         *     </error>
         */
        public static PostsResource.PostJsonPostsByPostIdCommentsResponse withXmlInternalServerError(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new PostsResource.PostJsonPostsByPostIdCommentsResponse(responseBuilder.build());
        }

        /**
         * There was an application error on the LinkedIn server.
         *  e.g. {
         *   "errorCode": 0,
         *   "message": "Invalid access token.",
         *   "requestId": "Y703T8HXBF",
         *   "status": 401,
         *   "timestamp": 1378122137646
         * }
         * 
         * @param entity
         *     {
         *       "errorCode": 0,
         *       "message": "Invalid access token.",
         *       "requestId": "Y703T8HXBF",
         *       "status": 401,
         *       "timestamp": 1378122137646
         *     }
         */
        public static PostsResource.PostJsonPostsByPostIdCommentsResponse withJsonInternalServerError(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostsResource.PostJsonPostsByPostIdCommentsResponse(responseBuilder.build());
        }

    }

    public class PostXmlPostsByPostIdCommentsResponse
        extends com.linkedin.api.resource.support.ResponseWrapper
    {


        private PostXmlPostsByPostIdCommentsResponse(Response delegate) {
            super(delegate);
        }

        /**
         * Request succeeded
         * 
         * 
         * @param entity
         *     
         */
        public static PostsResource.PostXmlPostsByPostIdCommentsResponse withXmlOK(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new PostsResource.PostXmlPostsByPostIdCommentsResponse(responseBuilder.build());
        }

        /**
         * Request succeeded
         * 
         * 
         * @param entity
         *     
         */
        public static PostsResource.PostXmlPostsByPostIdCommentsResponse withJsonOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostsResource.PostXmlPostsByPostIdCommentsResponse(responseBuilder.build());
        }

        /**
         * Your request to POST or PUT a record was successful. A Location HTTP header is often returned when we respond with a 201.
         * 
         * 
         * @param entity
         *     
         */
        public static PostsResource.PostXmlPostsByPostIdCommentsResponse withXmlCreated(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(201).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new PostsResource.PostXmlPostsByPostIdCommentsResponse(responseBuilder.build());
        }

        /**
         * Your request to POST or PUT a record was successful. A Location HTTP header is often returned when we respond with a 201.
         * 
         * 
         * @param entity
         *     
         */
        public static PostsResource.PostXmlPostsByPostIdCommentsResponse withJsonCreated(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(201).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostsResource.PostXmlPostsByPostIdCommentsResponse(responseBuilder.build());
        }

        /**
         * Your request was not formatted correctly
         *  e.g. <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         * <error>
         *   <status>401</status>
         *   <timestamp>1378122242574</timestamp>
         *   <request-id>8PQJRYO7JK</request-id>
         *   <error-code>0</error-code>
         *   <message>Invalid access token.</message>
         * </error>
         * 
         * @param entity
         *     <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         *     <error>
         *       <status>401</status>
         *       <timestamp>1378122242574</timestamp>
         *       <request-id>8PQJRYO7JK</request-id>
         *       <error-code>0</error-code>
         *       <message>Invalid access token.</message>
         *     </error>
         */
        public static PostsResource.PostXmlPostsByPostIdCommentsResponse withXmlBadRequest(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new PostsResource.PostXmlPostsByPostIdCommentsResponse(responseBuilder.build());
        }

        /**
         * Your request was not formatted correctly
         *  e.g. {
         *   "errorCode": 0,
         *   "message": "Invalid access token.",
         *   "requestId": "Y703T8HXBF",
         *   "status": 401,
         *   "timestamp": 1378122137646
         * }
         * 
         * @param entity
         *     {
         *       "errorCode": 0,
         *       "message": "Invalid access token.",
         *       "requestId": "Y703T8HXBF",
         *       "status": 401,
         *       "timestamp": 1378122137646
         *     }
         */
        public static PostsResource.PostXmlPostsByPostIdCommentsResponse withJsonBadRequest(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostsResource.PostXmlPostsByPostIdCommentsResponse(responseBuilder.build());
        }

        /**
         * The OAuth signature was bad
         *  e.g. <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         * <error>
         *   <status>401</status>
         *   <timestamp>1378122242574</timestamp>
         *   <request-id>8PQJRYO7JK</request-id>
         *   <error-code>0</error-code>
         *   <message>Invalid access token.</message>
         * </error>
         * 
         * @param entity
         *     <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         *     <error>
         *       <status>401</status>
         *       <timestamp>1378122242574</timestamp>
         *       <request-id>8PQJRYO7JK</request-id>
         *       <error-code>0</error-code>
         *       <message>Invalid access token.</message>
         *     </error>
         */
        public static PostsResource.PostXmlPostsByPostIdCommentsResponse withXmlUnauthorized(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new PostsResource.PostXmlPostsByPostIdCommentsResponse(responseBuilder.build());
        }

        /**
         * The OAuth signature was bad
         *  e.g. {
         *   "errorCode": 0,
         *   "message": "Invalid access token.",
         *   "requestId": "Y703T8HXBF",
         *   "status": 401,
         *   "timestamp": 1378122137646
         * }
         * 
         * @param entity
         *     {
         *       "errorCode": 0,
         *       "message": "Invalid access token.",
         *       "requestId": "Y703T8HXBF",
         *       "status": 401,
         *       "timestamp": 1378122137646
         *     }
         */
        public static PostsResource.PostXmlPostsByPostIdCommentsResponse withJsonUnauthorized(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostsResource.PostXmlPostsByPostIdCommentsResponse(responseBuilder.build());
        }

        /**
         * Access to the resource was denied. Usually this means you have reached a throttle limit. Can also mean you do not have permission to access this resource.
         *  e.g. <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         * <error>
         *   <status>401</status>
         *   <timestamp>1378122242574</timestamp>
         *   <request-id>8PQJRYO7JK</request-id>
         *   <error-code>0</error-code>
         *   <message>Invalid access token.</message>
         * </error>
         * 
         * @param entity
         *     <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         *     <error>
         *       <status>401</status>
         *       <timestamp>1378122242574</timestamp>
         *       <request-id>8PQJRYO7JK</request-id>
         *       <error-code>0</error-code>
         *       <message>Invalid access token.</message>
         *     </error>
         */
        public static PostsResource.PostXmlPostsByPostIdCommentsResponse withXmlForbidden(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new PostsResource.PostXmlPostsByPostIdCommentsResponse(responseBuilder.build());
        }

        /**
         * Access to the resource was denied. Usually this means you have reached a throttle limit. Can also mean you do not have permission to access this resource.
         *  e.g. {
         *   "errorCode": 0,
         *   "message": "Invalid access token.",
         *   "requestId": "Y703T8HXBF",
         *   "status": 401,
         *   "timestamp": 1378122137646
         * }
         * 
         * @param entity
         *     {
         *       "errorCode": 0,
         *       "message": "Invalid access token.",
         *       "requestId": "Y703T8HXBF",
         *       "status": 401,
         *       "timestamp": 1378122137646
         *     }
         */
        public static PostsResource.PostXmlPostsByPostIdCommentsResponse withJsonForbidden(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostsResource.PostXmlPostsByPostIdCommentsResponse(responseBuilder.build());
        }

        /**
         * The resource was not found (i.e. you asked for a non-existent user or URL)
         *  e.g. <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         * <error>
         *   <status>401</status>
         *   <timestamp>1378122242574</timestamp>
         *   <request-id>8PQJRYO7JK</request-id>
         *   <error-code>0</error-code>
         *   <message>Invalid access token.</message>
         * </error>
         * 
         * @param entity
         *     <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         *     <error>
         *       <status>401</status>
         *       <timestamp>1378122242574</timestamp>
         *       <request-id>8PQJRYO7JK</request-id>
         *       <error-code>0</error-code>
         *       <message>Invalid access token.</message>
         *     </error>
         */
        public static PostsResource.PostXmlPostsByPostIdCommentsResponse withXmlNotFound(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new PostsResource.PostXmlPostsByPostIdCommentsResponse(responseBuilder.build());
        }

        /**
         * The resource was not found (i.e. you asked for a non-existent user or URL)
         *  e.g. {
         *   "errorCode": 0,
         *   "message": "Invalid access token.",
         *   "requestId": "Y703T8HXBF",
         *   "status": 401,
         *   "timestamp": 1378122137646
         * }
         * 
         * @param entity
         *     {
         *       "errorCode": 0,
         *       "message": "Invalid access token.",
         *       "requestId": "Y703T8HXBF",
         *       "status": 401,
         *       "timestamp": 1378122137646
         *     }
         */
        public static PostsResource.PostXmlPostsByPostIdCommentsResponse withJsonNotFound(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostsResource.PostXmlPostsByPostIdCommentsResponse(responseBuilder.build());
        }

        /**
         * Usually this means you used the wrong HTTP method (GET when you should POST, etc) 
         *  e.g. <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         * <error>
         *   <status>401</status>
         *   <timestamp>1378122242574</timestamp>
         *   <request-id>8PQJRYO7JK</request-id>
         *   <error-code>0</error-code>
         *   <message>Invalid access token.</message>
         * </error>
         * 
         * @param entity
         *     <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         *     <error>
         *       <status>401</status>
         *       <timestamp>1378122242574</timestamp>
         *       <request-id>8PQJRYO7JK</request-id>
         *       <error-code>0</error-code>
         *       <message>Invalid access token.</message>
         *     </error>
         */
        public static PostsResource.PostXmlPostsByPostIdCommentsResponse withXmlMethodNotAllowed(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new PostsResource.PostXmlPostsByPostIdCommentsResponse(responseBuilder.build());
        }

        /**
         * Usually this means you used the wrong HTTP method (GET when you should POST, etc) 
         *  e.g. {
         *   "errorCode": 0,
         *   "message": "Invalid access token.",
         *   "requestId": "Y703T8HXBF",
         *   "status": 401,
         *   "timestamp": 1378122137646
         * }
         * 
         * @param entity
         *     {
         *       "errorCode": 0,
         *       "message": "Invalid access token.",
         *       "requestId": "Y703T8HXBF",
         *       "status": 401,
         *       "timestamp": 1378122137646
         *     }
         */
        public static PostsResource.PostXmlPostsByPostIdCommentsResponse withJsonMethodNotAllowed(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostsResource.PostXmlPostsByPostIdCommentsResponse(responseBuilder.build());
        }

        /**
         * There was an application error on the LinkedIn server.
         *  e.g. <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         * <error>
         *   <status>401</status>
         *   <timestamp>1378122242574</timestamp>
         *   <request-id>8PQJRYO7JK</request-id>
         *   <error-code>0</error-code>
         *   <message>Invalid access token.</message>
         * </error>
         * 
         * @param entity
         *     <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         *     <error>
         *       <status>401</status>
         *       <timestamp>1378122242574</timestamp>
         *       <request-id>8PQJRYO7JK</request-id>
         *       <error-code>0</error-code>
         *       <message>Invalid access token.</message>
         *     </error>
         */
        public static PostsResource.PostXmlPostsByPostIdCommentsResponse withXmlInternalServerError(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new PostsResource.PostXmlPostsByPostIdCommentsResponse(responseBuilder.build());
        }

        /**
         * There was an application error on the LinkedIn server.
         *  e.g. {
         *   "errorCode": 0,
         *   "message": "Invalid access token.",
         *   "requestId": "Y703T8HXBF",
         *   "status": 401,
         *   "timestamp": 1378122137646
         * }
         * 
         * @param entity
         *     {
         *       "errorCode": 0,
         *       "message": "Invalid access token.",
         *       "requestId": "Y703T8HXBF",
         *       "status": 401,
         *       "timestamp": 1378122137646
         *     }
         */
        public static PostsResource.PostXmlPostsByPostIdCommentsResponse withJsonInternalServerError(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostsResource.PostXmlPostsByPostIdCommentsResponse(responseBuilder.build());
        }

    }

    public enum XLiFormat {

        xml,
        json,
        jsonp;

    }

}
