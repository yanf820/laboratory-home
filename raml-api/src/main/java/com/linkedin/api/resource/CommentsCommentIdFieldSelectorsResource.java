
package com.linkedin.api.resource;

import javax.validation.constraints.NotNull;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;
import com.linkedin.api.model.ErrorSchema;


/**
 * Describes field selectors uri path parameter
 * 
 * 
 */
@Path("comments/{commentId}{fieldSelectors}")
public interface CommentsCommentIdFieldSelectorsResource {


    /**
     * Deletes a Comment
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
     * @param xLiFormat
     *     Type of data
     *     
     * @param commentId
     *     The unique identifier for a comment
     *     
     */
    @DELETE
    @Produces({
        "application/json",
        "text/xml"
    })
    CommentsCommentIdFieldSelectorsResource.DeleteCommentsByCommentIdByFieldSelectorsResponse deleteCommentsByCommentIdByFieldSelectors(
        @PathParam("commentId")
        @NotNull
        int commentId,
        @PathParam("fieldSelectors")
        String fieldSelectors,
        @HeaderParam("x-li-format")
        CommentsCommentIdFieldSelectorsResource.XLiFormat xLiFormat)
        throws Exception
    ;

    /**
     * Returns Comments
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
     * @param format
     *     Type of data
     *     
     * @param xLiFormat
     *     Type of data
     *     
     * @param commentId
     *     The unique identifier for a comment
     *     
     */
    @GET
    @Produces({
        "application/json",
        "text/xml"
    })
    CommentsCommentIdFieldSelectorsResource.GetCommentsByCommentIdByFieldSelectorsResponse getCommentsByCommentIdByFieldSelectors(
        @PathParam("commentId")
        @NotNull
        int commentId,
        @PathParam("fieldSelectors")
        String fieldSelectors,
        @HeaderParam("x-li-format")
        CommentsCommentIdFieldSelectorsResource.XLiFormat xLiFormat,
        @QueryParam("format")
        CommentsCommentIdFieldSelectorsResource.Format format)
        throws Exception
    ;

    public class DeleteCommentsByCommentIdByFieldSelectorsResponse
        extends com.linkedin.api.resource.support.ResponseWrapper
    {


        private DeleteCommentsByCommentIdByFieldSelectorsResponse(Response delegate) {
            super(delegate);
        }

        /**
         * Your request to DELETE a record was successful
         * 
         * 
         */
        public static CommentsCommentIdFieldSelectorsResource.DeleteCommentsByCommentIdByFieldSelectorsResponse withNoContent() {
            Response.ResponseBuilder responseBuilder = Response.status(204);
            return new CommentsCommentIdFieldSelectorsResource.DeleteCommentsByCommentIdByFieldSelectorsResponse(responseBuilder.build());
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
        public static CommentsCommentIdFieldSelectorsResource.DeleteCommentsByCommentIdByFieldSelectorsResponse withXmlBadRequest(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CommentsCommentIdFieldSelectorsResource.DeleteCommentsByCommentIdByFieldSelectorsResponse(responseBuilder.build());
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
        public static CommentsCommentIdFieldSelectorsResource.DeleteCommentsByCommentIdByFieldSelectorsResponse withJsonBadRequest(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CommentsCommentIdFieldSelectorsResource.DeleteCommentsByCommentIdByFieldSelectorsResponse(responseBuilder.build());
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
        public static CommentsCommentIdFieldSelectorsResource.DeleteCommentsByCommentIdByFieldSelectorsResponse withXmlUnauthorized(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CommentsCommentIdFieldSelectorsResource.DeleteCommentsByCommentIdByFieldSelectorsResponse(responseBuilder.build());
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
        public static CommentsCommentIdFieldSelectorsResource.DeleteCommentsByCommentIdByFieldSelectorsResponse withJsonUnauthorized(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CommentsCommentIdFieldSelectorsResource.DeleteCommentsByCommentIdByFieldSelectorsResponse(responseBuilder.build());
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
        public static CommentsCommentIdFieldSelectorsResource.DeleteCommentsByCommentIdByFieldSelectorsResponse withXmlForbidden(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CommentsCommentIdFieldSelectorsResource.DeleteCommentsByCommentIdByFieldSelectorsResponse(responseBuilder.build());
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
        public static CommentsCommentIdFieldSelectorsResource.DeleteCommentsByCommentIdByFieldSelectorsResponse withJsonForbidden(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CommentsCommentIdFieldSelectorsResource.DeleteCommentsByCommentIdByFieldSelectorsResponse(responseBuilder.build());
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
        public static CommentsCommentIdFieldSelectorsResource.DeleteCommentsByCommentIdByFieldSelectorsResponse withXmlNotFound(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CommentsCommentIdFieldSelectorsResource.DeleteCommentsByCommentIdByFieldSelectorsResponse(responseBuilder.build());
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
        public static CommentsCommentIdFieldSelectorsResource.DeleteCommentsByCommentIdByFieldSelectorsResponse withJsonNotFound(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CommentsCommentIdFieldSelectorsResource.DeleteCommentsByCommentIdByFieldSelectorsResponse(responseBuilder.build());
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
        public static CommentsCommentIdFieldSelectorsResource.DeleteCommentsByCommentIdByFieldSelectorsResponse withXmlMethodNotAllowed(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CommentsCommentIdFieldSelectorsResource.DeleteCommentsByCommentIdByFieldSelectorsResponse(responseBuilder.build());
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
        public static CommentsCommentIdFieldSelectorsResource.DeleteCommentsByCommentIdByFieldSelectorsResponse withJsonMethodNotAllowed(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CommentsCommentIdFieldSelectorsResource.DeleteCommentsByCommentIdByFieldSelectorsResponse(responseBuilder.build());
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
        public static CommentsCommentIdFieldSelectorsResource.DeleteCommentsByCommentIdByFieldSelectorsResponse withXmlInternalServerError(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CommentsCommentIdFieldSelectorsResource.DeleteCommentsByCommentIdByFieldSelectorsResponse(responseBuilder.build());
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
        public static CommentsCommentIdFieldSelectorsResource.DeleteCommentsByCommentIdByFieldSelectorsResponse withJsonInternalServerError(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CommentsCommentIdFieldSelectorsResource.DeleteCommentsByCommentIdByFieldSelectorsResponse(responseBuilder.build());
        }

    }

    public enum Format {

        xml,
        json,
        jsonp;

    }

    public class GetCommentsByCommentIdByFieldSelectorsResponse
        extends com.linkedin.api.resource.support.ResponseWrapper
    {


        private GetCommentsByCommentIdByFieldSelectorsResponse(Response delegate) {
            super(delegate);
        }

        /**
         * Request succeeded  
         * 
         * 
         * @param entity
         *     
         */
        public static CommentsCommentIdFieldSelectorsResource.GetCommentsByCommentIdByFieldSelectorsResponse withXmlOK(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CommentsCommentIdFieldSelectorsResource.GetCommentsByCommentIdByFieldSelectorsResponse(responseBuilder.build());
        }

        /**
         * Request succeeded  
         * 
         * 
         * @param entity
         *     
         */
        public static CommentsCommentIdFieldSelectorsResource.GetCommentsByCommentIdByFieldSelectorsResponse withJsonOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CommentsCommentIdFieldSelectorsResource.GetCommentsByCommentIdByFieldSelectorsResponse(responseBuilder.build());
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
        public static CommentsCommentIdFieldSelectorsResource.GetCommentsByCommentIdByFieldSelectorsResponse withXmlBadRequest(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CommentsCommentIdFieldSelectorsResource.GetCommentsByCommentIdByFieldSelectorsResponse(responseBuilder.build());
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
        public static CommentsCommentIdFieldSelectorsResource.GetCommentsByCommentIdByFieldSelectorsResponse withJsonBadRequest(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CommentsCommentIdFieldSelectorsResource.GetCommentsByCommentIdByFieldSelectorsResponse(responseBuilder.build());
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
        public static CommentsCommentIdFieldSelectorsResource.GetCommentsByCommentIdByFieldSelectorsResponse withXmlUnauthorized(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CommentsCommentIdFieldSelectorsResource.GetCommentsByCommentIdByFieldSelectorsResponse(responseBuilder.build());
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
        public static CommentsCommentIdFieldSelectorsResource.GetCommentsByCommentIdByFieldSelectorsResponse withJsonUnauthorized(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CommentsCommentIdFieldSelectorsResource.GetCommentsByCommentIdByFieldSelectorsResponse(responseBuilder.build());
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
        public static CommentsCommentIdFieldSelectorsResource.GetCommentsByCommentIdByFieldSelectorsResponse withXmlForbidden(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CommentsCommentIdFieldSelectorsResource.GetCommentsByCommentIdByFieldSelectorsResponse(responseBuilder.build());
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
        public static CommentsCommentIdFieldSelectorsResource.GetCommentsByCommentIdByFieldSelectorsResponse withJsonForbidden(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CommentsCommentIdFieldSelectorsResource.GetCommentsByCommentIdByFieldSelectorsResponse(responseBuilder.build());
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
        public static CommentsCommentIdFieldSelectorsResource.GetCommentsByCommentIdByFieldSelectorsResponse withXmlNotFound(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CommentsCommentIdFieldSelectorsResource.GetCommentsByCommentIdByFieldSelectorsResponse(responseBuilder.build());
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
        public static CommentsCommentIdFieldSelectorsResource.GetCommentsByCommentIdByFieldSelectorsResponse withJsonNotFound(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CommentsCommentIdFieldSelectorsResource.GetCommentsByCommentIdByFieldSelectorsResponse(responseBuilder.build());
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
        public static CommentsCommentIdFieldSelectorsResource.GetCommentsByCommentIdByFieldSelectorsResponse withXmlMethodNotAllowed(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CommentsCommentIdFieldSelectorsResource.GetCommentsByCommentIdByFieldSelectorsResponse(responseBuilder.build());
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
        public static CommentsCommentIdFieldSelectorsResource.GetCommentsByCommentIdByFieldSelectorsResponse withJsonMethodNotAllowed(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CommentsCommentIdFieldSelectorsResource.GetCommentsByCommentIdByFieldSelectorsResponse(responseBuilder.build());
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
        public static CommentsCommentIdFieldSelectorsResource.GetCommentsByCommentIdByFieldSelectorsResponse withXmlInternalServerError(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CommentsCommentIdFieldSelectorsResource.GetCommentsByCommentIdByFieldSelectorsResponse(responseBuilder.build());
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
        public static CommentsCommentIdFieldSelectorsResource.GetCommentsByCommentIdByFieldSelectorsResponse withJsonInternalServerError(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CommentsCommentIdFieldSelectorsResource.GetCommentsByCommentIdByFieldSelectorsResponse(responseBuilder.build());
        }

    }

    public enum XLiFormat {

        xml,
        json,
        jsonp;

    }

}
