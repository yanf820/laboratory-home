
package com.linkedin.api.resource;

import com.linkedin.api.model.*;
import com.linkedin.api.resource.support.PATCH;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;

@Path("topics")
public interface TopicsResource {

    @Path("test")
    @GET
    @Produces({
            "application/json"
    })
    void getSomeThing(@NotNull @QueryParam("signs") String sign);

    /**
     * 
     * @param sign
     *     经过校验后生成值
     *     
     * @param keywords
     *     
     * @param count
     *     Maximum e.g. 10
     * @param xLaFormat
     *     自定义header字段，标识响应结果的格式。 枚举类型：[json]
     *     
     * @param start
     *     The offset by which to start Network Update pagination e.g. 0
     * @param xLaAuthorization
     *     使用 oauth2.0 的方式获取access_token
     *     
     * @param xLaSignMethod
     *     系统参数签名方式
     *     
     * @param fieldSelectors
     *     很多资源允许你指定想要返回的字段。我们称这种语法结构为字段选择器。通过准确的指出你需要的信息，我们可以优化返回结果花费的时间。
     *     这样也能减少传输的数据。这两点让我们的APIs快速且高效，这是任何一个web应用程序的关键点，对于其他任何依赖外部API的人来说更是如此。
     *     
     *     Example
     *     --------
     *     如果想要获得people先关的id,first-name,last-name,industry可以这样使用:
     *       `http://api.startupsass.com/v1/people/~:(id,first-name,last-name,industry)`
     *     
     *     或者:
     *       `http://api.startupsass.com/v1/people/~/connections:(id,first-name,last-name,industry)`
     *     
     *     字段选择器可以选择成员对象中的字段:
     *       `http://api.startupsass.com/v1/people/~/connections:(id,first-name,last-name,positions:(title))`
     *      e.g. :(id,first-name,last-name,industry)
     * @param xLaAppKey
     *     系统分配的app_key
     *     
     */
    @GET
    @Path("~{field_selectors}")
    @Produces({
        "application/json"
    })
    GetTopicsByFieldSelectorsResponse getTopicsByFieldSelectors(
            @PathParam("field_selectors")
                    String fieldSelectors,

            @NotNull(message="would be nice if we had one")
            @QueryParam("sign")
                    String sign)
        throws Exception
    ;

    /**
     *
     * @param xLaFormat
     *     自定义header字段，标识响应结果的格式。 枚举类型：[json]
     *
     * @param xLaAuthorization
     *     使用 oauth2.0 的方式获取access_token
     *
     * @param entity
     *
     * @param xLaSession
     *     当前用户的sessionId
     *
     * @param fieldSelectors
     *     很多资源允许你指定想要返回的字段。我们称这种语法结构为字段选择器。通过准确的指出你需要的信息，我们可以优化返回结果花费的时间。
     *     这样也能减少传输的数据。这两点让我们的APIs快速且高效，这是任何一个web应用程序的关键点，对于其他任何依赖外部API的人来说更是如此。
     *
     *     Example
     *     --------
     *     如果想要获得people先关的id,first-name,last-name,industry可以这样使用:
     *       `http://api.startupsass.com/v1/people/~:(id,first-name,last-name,industry)`
     *
     *     或者:
     *       `http://api.startupsass.com/v1/people/~/connections:(id,first-name,last-name,industry)`
     *
     *     字段选择器可以选择成员对象中的字段:
     *       `http://api.startupsass.com/v1/people/~/connections:(id,first-name,last-name,positions:(title))`
     *      e.g. :(id,first-name,last-name,industry)
     */
    @POST
    @Path("~{field_selectors}")
    @Consumes("application/json")
    @Produces({
        "application/json"
    })
    TopicsResource.PostTopicsByFieldSelectorsResponse postTopicsByFieldSelectors(
            @PathParam("field_selectors")
                    String fieldSelectors,
            Topic entity)
            throws Exception
    ;

    /**
     *
     * @param sign
     *     经过校验后生成值
     *
     * @param xLaFormat
     *     自定义header字段，标识响应结果的格式。 枚举类型：[json]
     *
     * @param xLaAuthorization
     *     使用 oauth2.0 的方式获取access_token
     *
     * @param xLaSignMethod
     *     系统参数签名方式
     *
     * @param topicId
     *
     * @param xLaAppKey
     *     系统分配的app_key
     *
     */
    @GET
    @Path("{topic_id}")
    @Produces({
        "application/json"
    })
    GetTopicsByTopicIdResponse getTopicsByTopicId(
            @PathParam("topic_id")
            @NotNull
                    String topicId,
            @HeaderParam("x-la-authorization")
                    String xLaAuthorization,
            @HeaderParam("x-la-format")
                    XLaFormat xLaFormat,
            @HeaderParam("x-la-app-key")
                    String xLaAppKey,
            @HeaderParam("x-la-sign-method")
                    XLaSignMethod xLaSignMethod,
            @QueryParam("sign")
                    String sign)
        throws Exception
    ;

    /**
     *
     * @param xLaModified
     *     Values are updated or new.
     *
     * @param xLaFormat
     *     自定义header字段，标识响应结果的格式。 枚举类型：[json]
     *
     * @param xLaAuthorization
     *     使用 oauth2.0 的方式获取access_token
     *
     * @param entity
     *
     * @param xLaSession
     *     当前用户的sessionId
     *
     * @param topicId
     *
     * @param xLaModifiedSince
     *     Value as a Unix time stamp of milliseconds since epoch.
     *      e.g. 1267401600000
     */
    @PUT
    @Path("{topic_id}")
    @Consumes("application/json")
    @Produces({
        "application/json"
    })
    PutTopicsByTopicIdResponse putTopicsByTopicId(
            @PathParam("topic_id")
            @NotNull
                    String topicId,
            @HeaderParam("x-la-session")
                    String xLaSession,
            @HeaderParam("x-la-authorization")
                    String xLaAuthorization,
            @HeaderParam("x-la-modified-since")
            @Min(0L)
                    Integer xLaModifiedSince,
            @HeaderParam("x-la-modified")
                    XLaModified xLaModified,
            @HeaderParam("x-la-format")
                    XLaFormat xLaFormat, Topic entity)
        throws Exception
    ;

    /**
     *
     * @param xLaModified
     *     Values are updated or new.
     *
     * @param xLaFormat
     *     自定义header字段，标识响应结果的格式。 枚举类型：[json]
     *
     * @param xLaAuthorization
     *     使用 oauth2.0 的方式获取access_token
     *
     * @param entity
     *
     * @param xLaSession
     *     当前用户的sessionId
     *
     * @param topicId
     *
     * @param xLaModifiedSince
     *     Value as a Unix time stamp of milliseconds since epoch.
     *      e.g. 1267401600000
     */
    @PATCH
    @Path("{topic_id}")
    @Consumes("application/json")
    @Produces({
        "application/json"
    })
    PatchTopicsByTopicIdResponse patchTopicsByTopicId(
            @PathParam("topic_id")
            @NotNull
                    String topicId,
            @HeaderParam("x-la-session")
                    String xLaSession,
            @HeaderParam("x-la-authorization")
                    String xLaAuthorization,
            @HeaderParam("x-la-modified-since")
            @Min(0L)
                    Integer xLaModifiedSince,
            @HeaderParam("x-la-modified")
                    XLaModified xLaModified,
            @HeaderParam("x-la-format")
                    XLaFormat xLaFormat, Topic entity)
        throws Exception
    ;

    /**
     *
     * @param sign
     *     经过校验后生成值
     *
     * @param count
     *     Maximum e.g. 10
     * @param xLaFormat
     *     自定义header字段，标识响应结果的格式。 枚举类型：[json]
     *
     * @param start
     *     The offset by which to start Network Update pagination e.g. 0
     * @param xLaAuthorization
     *     使用 oauth2.0 的方式获取access_token
     *
     * @param xLaSignMethod
     *     系统参数签名方式
     *
     * @param fieldSelectors
     *     很多资源允许你指定想要返回的字段。我们称这种语法结构为字段选择器。通过准确的指出你需要的信息，我们可以优化返回结果花费的时间。
     *     这样也能减少传输的数据。这两点让我们的APIs快速且高效，这是任何一个web应用程序的关键点，对于其他任何依赖外部API的人来说更是如此。
     *
     *     Example
     *     --------
     *     如果想要获得people先关的id,first-name,last-name,industry可以这样使用:
     *       `http://api.startupsass.com/v1/people/~:(id,first-name,last-name,industry)`
     *
     *     或者:
     *       `http://api.startupsass.com/v1/people/~/connections:(id,first-name,last-name,industry)`
     *
     *     字段选择器可以选择成员对象中的字段:
     *       `http://api.startupsass.com/v1/people/~/connections:(id,first-name,last-name,positions:(title))`
     *      e.g. :(id,first-name,last-name,industry)
     * @param topicId
     *
     * @param xLaAppKey
     *     系统分配的app_key
     *
     */
    @GET
    @Path("{topic_id}/~/posts{field_selectors}")
    @Produces({
        "application/json"
    })
    GetTopicsByTopicIdPostsByFieldSelectorsResponse getTopicsByTopicIdPostsByFieldSelectors(
            @PathParam("field_selectors")
                    String fieldSelectors,
            @PathParam("topic_id")
            @NotNull
                    String topicId,
            @HeaderParam("x-la-authorization")
                    String xLaAuthorization,
            @HeaderParam("x-la-format")
                    XLaFormat xLaFormat,
            @HeaderParam("x-la-app-key")
                    String xLaAppKey,
            @HeaderParam("x-la-sign-method")
                    XLaSignMethod xLaSignMethod,
            @QueryParam("count")
            @DefaultValue("10")
                    int count,
            @QueryParam("start")
            @DefaultValue("0")
                    int start,
            @QueryParam("sign")
                    String sign)
        throws Exception
    ;

    /**
     *
     * @param xLaFormat
     *     自定义header字段，标识响应结果的格式。 枚举类型：[json]
     *
     * @param xLaAuthorization
     *     使用 oauth2.0 的方式获取access_token
     *
     * @param entity
     *
     * @param xLaSession
     *     当前用户的sessionId
     *
     * @param topicId
     *
     */
    @POST
    @Path("{topic_id}/~/follow")
    @Consumes("application/json")
    @Produces({
        "application/json"
    })
    PostTopicsByTopicIdFollowResponse postTopicsByTopicIdFollow(
            @PathParam("topic_id")
            @NotNull
                    String topicId,
            @HeaderParam("x-la-session")
                    String xLaSession,
            @HeaderParam("x-la-authorization")
                    String xLaAuthorization,
            @HeaderParam("x-la-format")
                    XLaFormat xLaFormat, Follow entity)
        throws Exception
    ;

    public class GetTopicsByFieldSelectorsResponse
        extends com.linkedin.api.resource.support.ResponseWrapper
    {


        private GetTopicsByFieldSelectorsResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         *
         *
         * @param entity
         *
         */
        public static GetTopicsByFieldSelectorsResponse withJsonOK(Topics entity) {
            ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetTopicsByFieldSelectorsResponse(responseBuilder.build());
        }

        /**
         * 请求格式不正确
         *  e.g. {

         *   "errorCode": 0,

         *   "message": "Invalid access token.",

         *   "status": 401,

         *   "timestamp": 1378122137646

         * }

         *
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static GetTopicsByFieldSelectorsResponse withJsonBadRequest(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetTopicsByFieldSelectorsResponse(responseBuilder.build());
        }

        /**
         * OAuth签名不正确
         *  e.g. {

         *   "errorCode": 0,

         *   "message": "Invalid access token.",

         *   "status": 401,

         *   "timestamp": 1378122137646

         * }

         *
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static GetTopicsByFieldSelectorsResponse withJsonUnauthorized(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetTopicsByFieldSelectorsResponse(responseBuilder.build());
        }

        /**
         * 对资源的访问被拒绝。通常这意味着当前请求被限制。也可能是你没有访问此资源的权限
         *  e.g. {

         *   "errorCode": 0,

         *   "message": "Invalid access token.",

         *   "status": 401,

         *   "timestamp": 1378122137646

         * }

         *
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static GetTopicsByFieldSelectorsResponse withJsonForbidden(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetTopicsByFieldSelectorsResponse(responseBuilder.build());
        }

        /**
         * 资源未发现(例如：请求一个不存在的用户或URL)
         *  e.g. {

         *   "errorCode": 0,

         *   "message": "Invalid access token.",

         *   "status": 401,

         *   "timestamp": 1378122137646

         * }

         *
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static GetTopicsByFieldSelectorsResponse withJsonNotFound(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetTopicsByFieldSelectorsResponse(responseBuilder.build());
        }

        /**
         * 通常意味着你用了错误的http方法 (例如，Post接口却发送Get请求)
         *  e.g. {

         *   "errorCode": 0,

         *   "message": "Invalid access token.",

         *   "status": 401,

         *   "timestamp": 1378122137646

         * }

         *
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static GetTopicsByFieldSelectorsResponse withJsonMethodNotAllowed(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetTopicsByFieldSelectorsResponse(responseBuilder.build());
        }

        /**
         * 在服务端有应用错误
         *  e.g. {

         *   "errorCode": 0,

         *   "message": "Invalid access token.",

         *   "status": 401,

         *   "timestamp": 1378122137646

         * }

         *
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static GetTopicsByFieldSelectorsResponse withJsonInternalServerError(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetTopicsByFieldSelectorsResponse(responseBuilder.build());
        }

    }

    public class GetTopicsByTopicIdPostsByFieldSelectorsResponse
        extends com.linkedin.api.resource.support.ResponseWrapper
    {


        private GetTopicsByTopicIdPostsByFieldSelectorsResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         *
         *
         * @param entity
         *
         */
        public static GetTopicsByTopicIdPostsByFieldSelectorsResponse withJsonOK(Posts entity) {
            ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetTopicsByTopicIdPostsByFieldSelectorsResponse(responseBuilder.build());
        }

        /**
         * 请求格式不正确
         *  e.g. {

         *   "errorCode": 0,

         *   "message": "Invalid access token.",

         *   "status": 401,

         *   "timestamp": 1378122137646

         * }

         *
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static GetTopicsByTopicIdPostsByFieldSelectorsResponse withJsonBadRequest(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetTopicsByTopicIdPostsByFieldSelectorsResponse(responseBuilder.build());
        }

        /**
         * OAuth签名不正确
         *  e.g. {

         *   "errorCode": 0,

         *   "message": "Invalid access token.",

         *   "status": 401,

         *   "timestamp": 1378122137646

         * }

         *
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static GetTopicsByTopicIdPostsByFieldSelectorsResponse withJsonUnauthorized(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetTopicsByTopicIdPostsByFieldSelectorsResponse(responseBuilder.build());
        }

        /**
         * 对资源的访问被拒绝。通常这意味着当前请求被限制。也可能是你没有访问此资源的权限
         *  e.g. {

         *   "errorCode": 0,

         *   "message": "Invalid access token.",

         *   "status": 401,

         *   "timestamp": 1378122137646

         * }

         *
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static GetTopicsByTopicIdPostsByFieldSelectorsResponse withJsonForbidden(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetTopicsByTopicIdPostsByFieldSelectorsResponse(responseBuilder.build());
        }

        /**
         * 资源未发现(例如：请求一个不存在的用户或URL)
         *  e.g. {

         *   "errorCode": 0,

         *   "message": "Invalid access token.",

         *   "status": 401,

         *   "timestamp": 1378122137646

         * }

         *
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static GetTopicsByTopicIdPostsByFieldSelectorsResponse withJsonNotFound(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetTopicsByTopicIdPostsByFieldSelectorsResponse(responseBuilder.build());
        }

        /**
         * 通常意味着你用了错误的http方法 (例如，Post接口却发送Get请求)
         *  e.g. {

         *   "errorCode": 0,

         *   "message": "Invalid access token.",

         *   "status": 401,

         *   "timestamp": 1378122137646

         * }

         *
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static GetTopicsByTopicIdPostsByFieldSelectorsResponse withJsonMethodNotAllowed(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetTopicsByTopicIdPostsByFieldSelectorsResponse(responseBuilder.build());
        }

        /**
         * 在服务端有应用错误
         *  e.g. {

         *   "errorCode": 0,

         *   "message": "Invalid access token.",

         *   "status": 401,

         *   "timestamp": 1378122137646

         * }

         *
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static GetTopicsByTopicIdPostsByFieldSelectorsResponse withJsonInternalServerError(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetTopicsByTopicIdPostsByFieldSelectorsResponse(responseBuilder.build());
        }

    }

    public class GetTopicsByTopicIdResponse
        extends com.linkedin.api.resource.support.ResponseWrapper
    {


        private GetTopicsByTopicIdResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         *
         *
         * @param entity
         *
         */
        public static GetTopicsByTopicIdResponse withJsonOK(Topic entity) {
            ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetTopicsByTopicIdResponse(responseBuilder.build());
        }

        /**
         * 请求格式不正确
         *  e.g. {

         *   "errorCode": 0,

         *   "message": "Invalid access token.",

         *   "status": 401,

         *   "timestamp": 1378122137646

         * }

         *
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static GetTopicsByTopicIdResponse withJsonBadRequest(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetTopicsByTopicIdResponse(responseBuilder.build());
        }

        /**
         * OAuth签名不正确
         *  e.g. {

         *   "errorCode": 0,

         *   "message": "Invalid access token.",

         *   "status": 401,

         *   "timestamp": 1378122137646

         * }

         *
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static GetTopicsByTopicIdResponse withJsonUnauthorized(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetTopicsByTopicIdResponse(responseBuilder.build());
        }

        /**
         * 对资源的访问被拒绝。通常这意味着当前请求被限制。也可能是你没有访问此资源的权限
         *  e.g. {

         *   "errorCode": 0,

         *   "message": "Invalid access token.",

         *   "status": 401,

         *   "timestamp": 1378122137646

         * }

         *
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static GetTopicsByTopicIdResponse withJsonForbidden(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetTopicsByTopicIdResponse(responseBuilder.build());
        }

        /**
         * 资源未发现(例如：请求一个不存在的用户或URL)
         *  e.g. {

         *   "errorCode": 0,

         *   "message": "Invalid access token.",

         *   "status": 401,

         *   "timestamp": 1378122137646

         * }

         *
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static GetTopicsByTopicIdResponse withJsonNotFound(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetTopicsByTopicIdResponse(responseBuilder.build());
        }

        /**
         * 通常意味着你用了错误的http方法 (例如，Post接口却发送Get请求)
         *  e.g. {

         *   "errorCode": 0,

         *   "message": "Invalid access token.",

         *   "status": 401,

         *   "timestamp": 1378122137646

         * }

         *
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static GetTopicsByTopicIdResponse withJsonMethodNotAllowed(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetTopicsByTopicIdResponse(responseBuilder.build());
        }

        /**
         * 在服务端有应用错误
         *  e.g. {

         *   "errorCode": 0,

         *   "message": "Invalid access token.",

         *   "status": 401,

         *   "timestamp": 1378122137646

         * }

         *
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static GetTopicsByTopicIdResponse withJsonInternalServerError(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetTopicsByTopicIdResponse(responseBuilder.build());
        }

    }

    public class PatchTopicsByTopicIdResponse
        extends com.linkedin.api.resource.support.ResponseWrapper
    {


        private PatchTopicsByTopicIdResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         *
         *
         * @param entity
         *
         */
        public static PatchTopicsByTopicIdResponse withJsonOK(StreamingOutput entity) {
            ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PatchTopicsByTopicIdResponse(responseBuilder.build());
        }

        /**
         * 创建或替换一条记录的请求成功. 当返回201时，Location头字段通常跟随返回
         *
         *
         * @param entity
         *
         */
        public static PatchTopicsByTopicIdResponse withJsonCreated(StreamingOutput entity) {
            ResponseBuilder responseBuilder = Response.status(201).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PatchTopicsByTopicIdResponse(responseBuilder.build());
        }

        /**
         * 请求格式不正确
         *  e.g. {

         *   "errorCode": 0,

         *   "message": "Invalid access token.",

         *   "status": 401,

         *   "timestamp": 1378122137646

         * }

         *
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static PatchTopicsByTopicIdResponse withJsonBadRequest(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PatchTopicsByTopicIdResponse(responseBuilder.build());
        }

        /**
         * OAuth签名不正确
         *  e.g. {

         *   "errorCode": 0,

         *   "message": "Invalid access token.",

         *   "status": 401,

         *   "timestamp": 1378122137646

         * }

         *
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static PatchTopicsByTopicIdResponse withJsonUnauthorized(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PatchTopicsByTopicIdResponse(responseBuilder.build());
        }

        /**
         * 对资源的访问被拒绝。通常这意味着当前请求被限制。也可能是你没有访问此资源的权限
         *  e.g. {

         *   "errorCode": 0,

         *   "message": "Invalid access token.",

         *   "status": 401,

         *   "timestamp": 1378122137646

         * }

         *
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static PatchTopicsByTopicIdResponse withJsonForbidden(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PatchTopicsByTopicIdResponse(responseBuilder.build());
        }

        /**
         * 资源未发现(例如：请求一个不存在的用户或URL)
         *  e.g. {

         *   "errorCode": 0,

         *   "message": "Invalid access token.",

         *   "status": 401,

         *   "timestamp": 1378122137646

         * }

         *
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static PatchTopicsByTopicIdResponse withJsonNotFound(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PatchTopicsByTopicIdResponse(responseBuilder.build());
        }

        /**
         * 通常意味着你用了错误的http方法 (例如，Post接口却发送Get请求)
         *  e.g. {

         *   "errorCode": 0,

         *   "message": "Invalid access token.",

         *   "status": 401,

         *   "timestamp": 1378122137646

         * }

         *
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static PatchTopicsByTopicIdResponse withJsonMethodNotAllowed(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PatchTopicsByTopicIdResponse(responseBuilder.build());
        }

        /**
         * 在服务端有应用错误
         *  e.g. {

         *   "errorCode": 0,

         *   "message": "Invalid access token.",

         *   "status": 401,

         *   "timestamp": 1378122137646

         * }

         *
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static PatchTopicsByTopicIdResponse withJsonInternalServerError(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PatchTopicsByTopicIdResponse(responseBuilder.build());
        }

    }

    public class PostTopicsByFieldSelectorsResponse
        extends com.linkedin.api.resource.support.ResponseWrapper
    {


        private PostTopicsByFieldSelectorsResponse(Response delegate) {
            super(delegate);
        }

        /**
         * ok
         *
         * @param entity
         *
         */
        public static PostTopicsByFieldSelectorsResponse withJsonOK(Update entity) {
            ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostTopicsByFieldSelectorsResponse(responseBuilder.build());
        }

        /**
         * 创建或替换一条记录的请求成功. 当返回201时，Location头字段通常跟随返回
         *
         *
         * @param entity
         *
         */
        public static PostTopicsByFieldSelectorsResponse withJsonCreated(StreamingOutput entity) {
            ResponseBuilder responseBuilder = Response.status(201).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostTopicsByFieldSelectorsResponse(responseBuilder.build());
        }

        /**
         * 请求格式不正确
         *  e.g. {

         *   "errorCode": 0,

         *   "message": "Invalid access token.",

         *   "status": 401,

         *   "timestamp": 1378122137646

         * }

         *
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static PostTopicsByFieldSelectorsResponse withJsonBadRequest(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostTopicsByFieldSelectorsResponse(responseBuilder.build());
        }

        /**
         * OAuth签名不正确
         *  e.g. {

         *   "errorCode": 0,

         *   "message": "Invalid access token.",

         *   "status": 401,

         *   "timestamp": 1378122137646

         * }

         *
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static PostTopicsByFieldSelectorsResponse withJsonUnauthorized(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostTopicsByFieldSelectorsResponse(responseBuilder.build());
        }

        /**
         * 对资源的访问被拒绝。通常这意味着当前请求被限制。也可能是你没有访问此资源的权限
         *  e.g. {

         *   "errorCode": 0,

         *   "message": "Invalid access token.",

         *   "status": 401,

         *   "timestamp": 1378122137646

         * }

         *
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static PostTopicsByFieldSelectorsResponse withJsonForbidden(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostTopicsByFieldSelectorsResponse(responseBuilder.build());
        }

        /**
         * 资源未发现(例如：请求一个不存在的用户或URL)
         *  e.g. {

         *   "errorCode": 0,

         *   "message": "Invalid access token.",

         *   "status": 401,

         *   "timestamp": 1378122137646

         * }

         *
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static PostTopicsByFieldSelectorsResponse withJsonNotFound(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostTopicsByFieldSelectorsResponse(responseBuilder.build());
        }

        /**
         * 通常意味着你用了错误的http方法 (例如，Post接口却发送Get请求)
         *  e.g. {

         *   "errorCode": 0,

         *   "message": "Invalid access token.",

         *   "status": 401,

         *   "timestamp": 1378122137646

         * }

         *
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static PostTopicsByFieldSelectorsResponse withJsonMethodNotAllowed(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostTopicsByFieldSelectorsResponse(responseBuilder.build());
        }

        /**
         * 在服务端有应用错误
         *  e.g. {

         *   "errorCode": 0,

         *   "message": "Invalid access token.",

         *   "status": 401,

         *   "timestamp": 1378122137646

         * }

         *
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static PostTopicsByFieldSelectorsResponse withJsonInternalServerError(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostTopicsByFieldSelectorsResponse(responseBuilder.build());
        }

    }

    public class PostTopicsByTopicIdFollowResponse
        extends com.linkedin.api.resource.support.ResponseWrapper
    {


        private PostTopicsByTopicIdFollowResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         *
         *
         * @param entity
         *
         */
        public static PostTopicsByTopicIdFollowResponse withJsonOK(Update entity) {
            ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostTopicsByTopicIdFollowResponse(responseBuilder.build());
        }

        /**
         * 创建或替换一条记录的请求成功. 当返回201时，Location头字段通常跟随返回
         *
         *
         * @param entity
         *
         */
        public static PostTopicsByTopicIdFollowResponse withJsonCreated(StreamingOutput entity) {
            ResponseBuilder responseBuilder = Response.status(201).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostTopicsByTopicIdFollowResponse(responseBuilder.build());
        }

        /**
         * 请求格式不正确
         *  e.g. {

         *   "errorCode": 0,

         *   "message": "Invalid access token.",

         *   "status": 401,

         *   "timestamp": 1378122137646

         * }

         *
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static PostTopicsByTopicIdFollowResponse withJsonBadRequest(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostTopicsByTopicIdFollowResponse(responseBuilder.build());
        }

        /**
         * OAuth签名不正确
         *  e.g. {

         *   "errorCode": 0,

         *   "message": "Invalid access token.",

         *   "status": 401,

         *   "timestamp": 1378122137646

         * }

         *
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static PostTopicsByTopicIdFollowResponse withJsonUnauthorized(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostTopicsByTopicIdFollowResponse(responseBuilder.build());
        }

        /**
         * 对资源的访问被拒绝。通常这意味着当前请求被限制。也可能是你没有访问此资源的权限
         *  e.g. {

         *   "errorCode": 0,

         *   "message": "Invalid access token.",

         *   "status": 401,

         *   "timestamp": 1378122137646

         * }

         *
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static PostTopicsByTopicIdFollowResponse withJsonForbidden(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostTopicsByTopicIdFollowResponse(responseBuilder.build());
        }

        /**
         * 资源未发现(例如：请求一个不存在的用户或URL)
         *  e.g. {

         *   "errorCode": 0,

         *   "message": "Invalid access token.",

         *   "status": 401,

         *   "timestamp": 1378122137646

         * }

         *
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static PostTopicsByTopicIdFollowResponse withJsonNotFound(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostTopicsByTopicIdFollowResponse(responseBuilder.build());
        }

        /**
         * 通常意味着你用了错误的http方法 (例如，Post接口却发送Get请求)
         *  e.g. {

         *   "errorCode": 0,

         *   "message": "Invalid access token.",

         *   "status": 401,

         *   "timestamp": 1378122137646

         * }

         *
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static PostTopicsByTopicIdFollowResponse withJsonMethodNotAllowed(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostTopicsByTopicIdFollowResponse(responseBuilder.build());
        }

        /**
         * 在服务端有应用错误
         *  e.g. {

         *   "errorCode": 0,

         *   "message": "Invalid access token.",

         *   "status": 401,

         *   "timestamp": 1378122137646

         * }

         *
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static PostTopicsByTopicIdFollowResponse withJsonInternalServerError(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostTopicsByTopicIdFollowResponse(responseBuilder.build());
        }

    }

    public class PutTopicsByTopicIdResponse
        extends com.linkedin.api.resource.support.ResponseWrapper
    {


        private PutTopicsByTopicIdResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         *
         *
         * @param entity
         *
         */
        public static PutTopicsByTopicIdResponse withJsonOK(StreamingOutput entity) {
            ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PutTopicsByTopicIdResponse(responseBuilder.build());
        }

        /**
         * 创建或替换一条记录的请求成功. 当返回201时，Location头字段通常跟随返回
         *
         *
         * @param entity
         *
         */
        public static PutTopicsByTopicIdResponse withJsonCreated(StreamingOutput entity) {
            ResponseBuilder responseBuilder = Response.status(201).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PutTopicsByTopicIdResponse(responseBuilder.build());
        }

        /**
         * 请求格式不正确
         *  e.g. {

         *   "errorCode": 0,

         *   "message": "Invalid access token.",

         *   "status": 401,

         *   "timestamp": 1378122137646

         * }

         *
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static PutTopicsByTopicIdResponse withJsonBadRequest(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PutTopicsByTopicIdResponse(responseBuilder.build());
        }

        /**
         * OAuth签名不正确
         *  e.g. {

         *   "errorCode": 0,

         *   "message": "Invalid access token.",

         *   "status": 401,

         *   "timestamp": 1378122137646

         * }

         *
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static PutTopicsByTopicIdResponse withJsonUnauthorized(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PutTopicsByTopicIdResponse(responseBuilder.build());
        }

        /**
         * 对资源的访问被拒绝。通常这意味着当前请求被限制。也可能是你没有访问此资源的权限
         *  e.g. {

         *   "errorCode": 0,

         *   "message": "Invalid access token.",

         *   "status": 401,

         *   "timestamp": 1378122137646

         * }

         *
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static PutTopicsByTopicIdResponse withJsonForbidden(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PutTopicsByTopicIdResponse(responseBuilder.build());
        }

        /**
         * 资源未发现(例如：请求一个不存在的用户或URL)
         *  e.g. {

         *   "errorCode": 0,

         *   "message": "Invalid access token.",

         *   "status": 401,

         *   "timestamp": 1378122137646

         * }

         *
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static PutTopicsByTopicIdResponse withJsonNotFound(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PutTopicsByTopicIdResponse(responseBuilder.build());
        }

        /**
         * 通常意味着你用了错误的http方法 (例如，Post接口却发送Get请求)
         *  e.g. {

         *   "errorCode": 0,

         *   "message": "Invalid access token.",

         *   "status": 401,

         *   "timestamp": 1378122137646

         * }

         *
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static PutTopicsByTopicIdResponse withJsonMethodNotAllowed(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PutTopicsByTopicIdResponse(responseBuilder.build());
        }

        /**
         * 在服务端有应用错误
         *  e.g. {

         *   "errorCode": 0,

         *   "message": "Invalid access token.",

         *   "status": 401,

         *   "timestamp": 1378122137646

         * }

         *
         *
         * @param entity
         *     {

         *       "errorCode": 0,

         *       "message": "Invalid access token.",

         *       "status": 401,

         *       "timestamp": 1378122137646

         *     }

         *
         */
        public static PutTopicsByTopicIdResponse withJsonInternalServerError(ErrorSchema entity) {
            ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PutTopicsByTopicIdResponse(responseBuilder.build());
        }

    }

    public enum XLaFormat {

        json;

    }

    public enum XLaModified {

        updated,
        create;

    }

    public enum XLaSignMethod {

        MD5;

    }

}
