
package com.linkedin.api.resource;

import com.linkedin.api.model.ErrorSchema;
import com.linkedin.api.model.Funs;
import com.linkedin.api.model.Topic;

import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;

@Path("topics")
public interface TopicsResource {


    /**
     * 
     * @param groupId
     *     The unique identifier for a LinkedIn group
     *     
     * @param entity
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
     *       `http://api.startupsass.com/v1/people/~:(id,first-name,last-name,industry)`
     *     
     *     Or the same set of information for their connections:
     *       `http://api.startupsass.com/v1/people/~/connections:(id,first-name,last-name,industry)`
     *     
     *     Fields selectors can also be nested to access individual fields from a larger collection. For example, to get just the
     *     job titles and not the rest of the information about positions:
     *       `http://api.startupsass.com/v1/people/~/connections:(id,first-name,last-name,positions:(title))`
     *     
     *     Field selectors with resource identifiers allow you to request information about multiple entities at once. Specify them
     *     similarly, but append a double colon - here's an example getting profile information about thee members: the first is the
     *     current member, indicated by a tilde; the next has an id of 12345; and the last has a public profile URL
     *     
     *       `http://api.startupsass.com/v1/people::(~, id=12345,url=http%3A%2F%2Fwww.startupsass.com%2Fin%2Fadamnash)`
     *      e.g. :(id,first-name,last-name,industry)
     */
    @POST
    @Path("~{fieldSelectors}{groupId}")
    @Consumes("application/json")
    PostTopicsByFieldSelectorsByGroupIdResponse postTopicsByFieldSelectorsByGroupId(
            @PathParam("groupId")
            @NotNull
                    String groupId,
            @PathParam("fieldSelectors")
            @NotNull
                    String fieldSelectors, Topic entity)
        throws Exception
    ;

    /**
     *
     * @param groupId
     *     The unique identifier for a LinkedIn group
     *
     * @param count
     *     Maximum e.g. 10
     * @param start
     *     The offset by which to start Network Update pagination e.g. 0
     * @param entity
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
     *       `http://api.startupsass.com/v1/people/~:(id,first-name,last-name,industry)`
     *
     *     Or the same set of information for their connections:
     *       `http://api.startupsass.com/v1/people/~/connections:(id,first-name,last-name,industry)`
     *
     *     Fields selectors can also be nested to access individual fields from a larger collection. For example, to get just the
     *     job titles and not the rest of the information about positions:
     *       `http://api.startupsass.com/v1/people/~/connections:(id,first-name,last-name,positions:(title))`
     *
     *     Field selectors with resource identifiers allow you to request information about multiple entities at once. Specify them
     *     similarly, but append a double colon - here's an example getting profile information about thee members: the first is the
     *     current member, indicated by a tilde; the next has an id of 12345; and the last has a public profile URL
     *
     *       `http://api.startupsass.com/v1/people::(~, id=12345,url=http%3A%2F%2Fwww.startupsass.com%2Fin%2Fadamnash)`
     *      e.g. :(id,first-name,last-name,industry)
     * @param membershipState
     *     The state of the callers membership to the specified group. Use the value member to retrieve the groups to which a
     *     user belongs.
     *
     */
    @GET
    @Path("~{fieldSelectors}{groupId}")
    @Consumes("application/json")
    @Produces({
        "application/json"
    })
    GetTopicsByFieldSelectorsByGroupIdResponse getTopicsByFieldSelectorsByGroupId(
            @PathParam("groupId")
            @NotNull
                    String groupId,
            @PathParam("fieldSelectors")
            @NotNull
                    String fieldSelectors,
            @QueryParam("count")
            @DefaultValue("10")
                    int count,
            @QueryParam("start")
                    Integer start,
            @QueryParam("membership-state")
                    String membershipState, Funs entity)
        throws Exception
    ;

    /**
     *
     * @param groupId
     *     The unique identifier for a LinkedIn group
     *
     * @param xLaFormat
     *     Type of data
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
     *       `http://api.startupsass.com/v1/people/~:(id,first-name,last-name,industry)`
     *
     *     Or the same set of information for their connections:
     *       `http://api.startupsass.com/v1/people/~/connections:(id,first-name,last-name,industry)`
     *
     *     Fields selectors can also be nested to access individual fields from a larger collection. For example, to get just the
     *     job titles and not the rest of the information about positions:
     *       `http://api.startupsass.com/v1/people/~/connections:(id,first-name,last-name,positions:(title))`
     *
     *     Field selectors with resource identifiers allow you to request information about multiple entities at once. Specify them
     *     similarly, but append a double colon - here's an example getting profile information about thee members: the first is the
     *     current member, indicated by a tilde; the next has an id of 12345; and the last has a public profile URL
     *
     *       `http://api.startupsass.com/v1/people::(~, id=12345,url=http%3A%2F%2Fwww.startupsass.com%2Fin%2Fadamnash)`
     *      e.g. :(id,first-name,last-name,industry)
     * @param topicId
     *     The unique identifier for a topic
     *
     */
    @GET
    @Path("~{fieldSelectors}{groupId}/{topicId}")
    @Produces({
        "application/json"
    })
    GetTopicsByFieldSelectorsByGroupIdByTopicIdResponse getTopicsByFieldSelectorsByGroupIdByTopicId(
            @PathParam("topicId")
            @NotNull
                    int topicId,
            @PathParam("groupId")
            @NotNull
                    String groupId,
            @PathParam("fieldSelectors")
            @NotNull
                    String fieldSelectors,
            @HeaderParam("x-la-format")
                    XLaFormat xLaFormat)
        throws Exception
    ;

    public class GetTopicsByFieldSelectorsByGroupIdByTopicIdResponse
        extends com.linkedin.api.resource.support.ResponseWrapper
    {


        private GetTopicsByFieldSelectorsByGroupIdByTopicIdResponse(Response delegate) {
            super(delegate);
        }

        /**
         * Request succeeded
         *
         *
         * @param entity
         *
         */
        public static GetTopicsByFieldSelectorsByGroupIdByTopicIdResponse withJsonOK(StreamingOutput entity) {
            ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetTopicsByFieldSelectorsByGroupIdByTopicIdResponse(responseBuilder.build());
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
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "requestId": "Y703T8HXBF",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static GetTopicsByFieldSelectorsByGroupIdByTopicIdResponse withJsonBadRequest(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetTopicsByFieldSelectorsByGroupIdByTopicIdResponse(responseBuilder.build());
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
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "requestId": "Y703T8HXBF",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static GetTopicsByFieldSelectorsByGroupIdByTopicIdResponse withJsonUnauthorized(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetTopicsByFieldSelectorsByGroupIdByTopicIdResponse(responseBuilder.build());
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
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "requestId": "Y703T8HXBF",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static GetTopicsByFieldSelectorsByGroupIdByTopicIdResponse withJsonForbidden(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetTopicsByFieldSelectorsByGroupIdByTopicIdResponse(responseBuilder.build());
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
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "requestId": "Y703T8HXBF",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static GetTopicsByFieldSelectorsByGroupIdByTopicIdResponse withJsonNotFound(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetTopicsByFieldSelectorsByGroupIdByTopicIdResponse(responseBuilder.build());
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
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "requestId": "Y703T8HXBF",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static GetTopicsByFieldSelectorsByGroupIdByTopicIdResponse withJsonMethodNotAllowed(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetTopicsByFieldSelectorsByGroupIdByTopicIdResponse(responseBuilder.build());
        }

        /**
         * There was an application error on the server.
         *  e.g. {

         *   "errorCode": 0,

         *   "message": "Invalid access token.",

         *   "requestId": "Y703T8HXBF",

         *   "status": 401,

         *   "timestamp": 1378122137646

         * }

         *
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "requestId": "Y703T8HXBF",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static GetTopicsByFieldSelectorsByGroupIdByTopicIdResponse withJsonInternalServerError(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetTopicsByFieldSelectorsByGroupIdByTopicIdResponse(responseBuilder.build());
        }

    }

    public class GetTopicsByFieldSelectorsByGroupIdResponse
        extends com.linkedin.api.resource.support.ResponseWrapper
    {


        private GetTopicsByFieldSelectorsByGroupIdResponse(Response delegate) {
            super(delegate);
        }

        /**
         *
         * @param entity
         *
         */
        public static GetTopicsByFieldSelectorsByGroupIdResponse withJsonOK(Topic entity) {
            ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetTopicsByFieldSelectorsByGroupIdResponse(responseBuilder.build());
        }

    }

    public class PostTopicsByFieldSelectorsByGroupIdResponse
        extends com.linkedin.api.resource.support.ResponseWrapper
    {


        private PostTopicsByFieldSelectorsByGroupIdResponse(Response delegate) {
            super(delegate);
        }

        /**
         * ok
         *
         */
        public static PostTopicsByFieldSelectorsByGroupIdResponse withOK() {
            ResponseBuilder responseBuilder = Response.status(200);
            return new PostTopicsByFieldSelectorsByGroupIdResponse(responseBuilder.build());
        }

    }

    public enum XLaFormat {

        json;

    }

}
