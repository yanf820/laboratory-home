
package com.linkedin.api.resource;

import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
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
import com.linkedin.api.model.Topic;

@Path("topics")
public interface TopicsResource {


    /**
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
     * @param groupId
     *     The unique identifier for a LinkedIn group
     *     
     * @param entity
     *     
     */
    @POST
    @Path("~{fieldSelectors}{groupId}")
    @Consumes("application/json")
    TopicsResource.PostTopicsByFieldSelectorsByGroupIdResponse postTopicsByFieldSelectorsByGroupId(
        @PathParam("groupId")
        @NotNull
        int groupId,
        @PathParam("fieldSelectors")
        @NotNull
        String fieldSelectors, Topic entity)
        throws Exception
    ;

    /**
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
     * @param groupId
     *     The unique identifier for a LinkedIn group
     *     
     * @param count
     *     Maximum e.g. 10
     * @param start
     *     The offset by which to start Network Update pagination e.g. 0
     * @param membershipState
     *     The state of the callers membership to the specified group. Use the value member to retrieve the groups to which a
     *     user belongs.
     *     
     */
    @GET
    @Path("~{fieldSelectors}{groupId}")
    @Produces({
        "application/json"
    })
    TopicsResource.GetTopicsByFieldSelectorsByGroupIdResponse getTopicsByFieldSelectorsByGroupId(
        @PathParam("groupId")
        @NotNull
        int groupId,
        @PathParam("fieldSelectors")
        @NotNull
        String fieldSelectors,
        @QueryParam("count")
        @DefaultValue("10")
        int count,
        @QueryParam("start")
        Integer start,
        @QueryParam("membership-state")
        String membershipState)
        throws Exception
    ;

    /**
     * 
     * @param topicId
     *     The unique identifier for a topic
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
     * @param groupId
     *     The unique identifier for a LinkedIn group
     *     
     * @param xLaFormat
     *     Type of data
     *     
     */
    @GET
    @Path("~{fieldSelectors}{groupId}/{topicId}")
    @Produces({
        "application/json"
    })
    TopicsResource.GetTopicsByFieldSelectorsByGroupIdByTopicIdResponse getTopicsByFieldSelectorsByGroupIdByTopicId(
        @PathParam("topicId")
        @NotNull
        int topicId,
        @PathParam("groupId")
        @NotNull
        int groupId,
        @PathParam("fieldSelectors")
        @NotNull
        String fieldSelectors,
        @HeaderParam("x-la-format")
        TopicsResource.XLaFormat xLaFormat)
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
        public static TopicsResource.GetTopicsByFieldSelectorsByGroupIdByTopicIdResponse withJsonOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TopicsResource.GetTopicsByFieldSelectorsByGroupIdByTopicIdResponse(responseBuilder.build());
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
        public static TopicsResource.GetTopicsByFieldSelectorsByGroupIdByTopicIdResponse withJsonBadRequest(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TopicsResource.GetTopicsByFieldSelectorsByGroupIdByTopicIdResponse(responseBuilder.build());
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
        public static TopicsResource.GetTopicsByFieldSelectorsByGroupIdByTopicIdResponse withJsonUnauthorized(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TopicsResource.GetTopicsByFieldSelectorsByGroupIdByTopicIdResponse(responseBuilder.build());
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
        public static TopicsResource.GetTopicsByFieldSelectorsByGroupIdByTopicIdResponse withJsonForbidden(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TopicsResource.GetTopicsByFieldSelectorsByGroupIdByTopicIdResponse(responseBuilder.build());
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
        public static TopicsResource.GetTopicsByFieldSelectorsByGroupIdByTopicIdResponse withJsonNotFound(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TopicsResource.GetTopicsByFieldSelectorsByGroupIdByTopicIdResponse(responseBuilder.build());
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
        public static TopicsResource.GetTopicsByFieldSelectorsByGroupIdByTopicIdResponse withJsonMethodNotAllowed(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TopicsResource.GetTopicsByFieldSelectorsByGroupIdByTopicIdResponse(responseBuilder.build());
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
        public static TopicsResource.GetTopicsByFieldSelectorsByGroupIdByTopicIdResponse withJsonInternalServerError(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TopicsResource.GetTopicsByFieldSelectorsByGroupIdByTopicIdResponse(responseBuilder.build());
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
        public static TopicsResource.GetTopicsByFieldSelectorsByGroupIdResponse withJsonOK(Topic entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TopicsResource.GetTopicsByFieldSelectorsByGroupIdResponse(responseBuilder.build());
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
        public static TopicsResource.PostTopicsByFieldSelectorsByGroupIdResponse withOK() {
            Response.ResponseBuilder responseBuilder = Response.status(200);
            return new TopicsResource.PostTopicsByFieldSelectorsByGroupIdResponse(responseBuilder.build());
        }

    }

    public enum XLaFormat {

        json;

    }

}
