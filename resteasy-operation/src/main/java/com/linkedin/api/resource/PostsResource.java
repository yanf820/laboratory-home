
package com.linkedin.api.resource;

import com.linkedin.api.model.*;
import com.linkedin.api.resource.support.PATCH;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;

@Path("posts")
public interface PostsResource {


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
    GetPostsByFieldSelectorsResponse getPostsByFieldSelectors(
            @PathParam("field_selectors")
                    String fieldSelectors,
            @HeaderParam("x-la-authorization")
                    String xLaAuthorization,
            @HeaderParam("x-la-format")
                    XLaFormat xLaFormat,
            @HeaderParam("x-la-app-key")
                    String xLaAppKey,
            @HeaderParam("x-la-sign-method")
                    XLaSignMethod xLaSignMethod,
            @QueryParam("keywords")
                    String keywords,
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
    PostPostsByFieldSelectorsResponse postPostsByFieldSelectors(
            @PathParam("field_selectors")
                    String fieldSelectors,
            @HeaderParam("x-la-session")
                    String xLaSession,
            @HeaderParam("x-la-authorization")
                    String xLaAuthorization,
            @HeaderParam("x-la-format")
                    XLaFormat xLaFormat, Post entity)
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
     * @param xLaAppKey
     *     系统分配的app_key
     *
     * @param postId
     *
     */
    @GET
    @Path("{postId}")
    @Produces({
        "application/json"
    })
    GetPostsByPostIdResponse getPostsByPostId(
            @PathParam("postId")
            @NotNull
                    String postId,
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
     * @param xLaModifiedSince
     *     Value as a Unix time stamp of milliseconds since epoch.
     *      e.g. 1267401600000
     * @param postId
     *
     */
    @PUT
    @Path("{postId}")
    @Consumes("application/json")
    @Produces({
        "application/json"
    })
    PutPostsByPostIdResponse putPostsByPostId(
            @PathParam("postId")
            @NotNull
                    String postId,
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
                    XLaFormat xLaFormat, Post entity)
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
     * @param xLaModifiedSince
     *     Value as a Unix time stamp of milliseconds since epoch.
     *      e.g. 1267401600000
     * @param postId
     *
     */
    @PATCH
    @Path("{postId}")
    @Consumes("application/json")
    @Produces({
        "application/json"
    })
    PatchPostsByPostIdResponse patchPostsByPostId(
            @PathParam("postId")
            @NotNull
                    String postId,
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
                    XLaFormat xLaFormat, Post entity)
        throws Exception
    ;

    /**
     *
     * @param xLaFormat
     *     自定义header字段，标识响应结果的格式。 枚举类型：[json]
     *
     * @param entity
     *
     * @param postId
     *
     */
    @POST
    @Path("{postId}/~/like")
    @Consumes("application/json")
    @Produces({
        "application/json"
    })
    PostPostsByPostIdLikeResponse postPostsByPostIdLike(
            @PathParam("postId")
            @NotNull
                    String postId,
            @HeaderParam("x-la-format")
                    XLaFormat xLaFormat, LikeUpdate entity)
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
     * @param postId
     *
     */
    @POST
    @Path("{postId}/~/review")
    @Consumes("application/json")
    @Produces({
        "application/json"
    })
    PostPostsByPostIdReviewResponse postPostsByPostIdReview(
            @PathParam("postId")
            @NotNull
                    String postId,
            @HeaderParam("x-la-session")
                    String xLaSession,
            @HeaderParam("x-la-authorization")
                    String xLaAuthorization,
            @HeaderParam("x-la-format")
                    XLaFormat xLaFormat, Content entity)
        throws Exception
    ;

    public class GetPostsByFieldSelectorsResponse
        extends com.linkedin.api.resource.support.ResponseWrapper
    {


        private GetPostsByFieldSelectorsResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         *
         *
         * @param entity
         *
         */
        public static GetPostsByFieldSelectorsResponse withJsonOK(Posts entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetPostsByFieldSelectorsResponse(responseBuilder.build());
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
        public static GetPostsByFieldSelectorsResponse withJsonBadRequest(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetPostsByFieldSelectorsResponse(responseBuilder.build());
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
        public static GetPostsByFieldSelectorsResponse withJsonUnauthorized(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetPostsByFieldSelectorsResponse(responseBuilder.build());
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
        public static GetPostsByFieldSelectorsResponse withJsonForbidden(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetPostsByFieldSelectorsResponse(responseBuilder.build());
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
        public static GetPostsByFieldSelectorsResponse withJsonNotFound(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetPostsByFieldSelectorsResponse(responseBuilder.build());
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
        public static GetPostsByFieldSelectorsResponse withJsonMethodNotAllowed(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetPostsByFieldSelectorsResponse(responseBuilder.build());
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
        public static GetPostsByFieldSelectorsResponse withJsonInternalServerError(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetPostsByFieldSelectorsResponse(responseBuilder.build());
        }

    }

    public class GetPostsByPostIdResponse
        extends com.linkedin.api.resource.support.ResponseWrapper
    {


        private GetPostsByPostIdResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         *
         *
         * @param entity
         *
         */
        public static GetPostsByPostIdResponse withJsonOK(Post entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetPostsByPostIdResponse(responseBuilder.build());
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
        public static GetPostsByPostIdResponse withJsonBadRequest(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetPostsByPostIdResponse(responseBuilder.build());
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
        public static GetPostsByPostIdResponse withJsonUnauthorized(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetPostsByPostIdResponse(responseBuilder.build());
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
        public static GetPostsByPostIdResponse withJsonForbidden(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetPostsByPostIdResponse(responseBuilder.build());
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
        public static GetPostsByPostIdResponse withJsonNotFound(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetPostsByPostIdResponse(responseBuilder.build());
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
        public static GetPostsByPostIdResponse withJsonMethodNotAllowed(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetPostsByPostIdResponse(responseBuilder.build());
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
        public static GetPostsByPostIdResponse withJsonInternalServerError(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new GetPostsByPostIdResponse(responseBuilder.build());
        }

    }

    public class PatchPostsByPostIdResponse
        extends com.linkedin.api.resource.support.ResponseWrapper
    {


        private PatchPostsByPostIdResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         *
         *
         * @param entity
         *
         */
        public static PatchPostsByPostIdResponse withJsonOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PatchPostsByPostIdResponse(responseBuilder.build());
        }

        /**
         * 创建或替换一条记录的请求成功. 当返回201时，Location头字段通常跟随返回
         *
         *
         * @param entity
         *
         */
        public static PatchPostsByPostIdResponse withJsonCreated(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(201).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PatchPostsByPostIdResponse(responseBuilder.build());
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
        public static PatchPostsByPostIdResponse withJsonBadRequest(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PatchPostsByPostIdResponse(responseBuilder.build());
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
        public static PatchPostsByPostIdResponse withJsonUnauthorized(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PatchPostsByPostIdResponse(responseBuilder.build());
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
        public static PatchPostsByPostIdResponse withJsonForbidden(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PatchPostsByPostIdResponse(responseBuilder.build());
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
        public static PatchPostsByPostIdResponse withJsonNotFound(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PatchPostsByPostIdResponse(responseBuilder.build());
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
        public static PatchPostsByPostIdResponse withJsonMethodNotAllowed(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PatchPostsByPostIdResponse(responseBuilder.build());
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
        public static PatchPostsByPostIdResponse withJsonInternalServerError(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PatchPostsByPostIdResponse(responseBuilder.build());
        }

    }

    public class PostPostsByFieldSelectorsResponse
        extends com.linkedin.api.resource.support.ResponseWrapper
    {


        private PostPostsByFieldSelectorsResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         *
         *
         * @param entity
         *
         */
        public static PostPostsByFieldSelectorsResponse withJsonOK(Update entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostPostsByFieldSelectorsResponse(responseBuilder.build());
        }

        /**
         * 创建或替换一条记录的请求成功. 当返回201时，Location头字段通常跟随返回
         *
         *
         * @param entity
         *
         */
        public static PostPostsByFieldSelectorsResponse withJsonCreated(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(201).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostPostsByFieldSelectorsResponse(responseBuilder.build());
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
        public static PostPostsByFieldSelectorsResponse withJsonBadRequest(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostPostsByFieldSelectorsResponse(responseBuilder.build());
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
        public static PostPostsByFieldSelectorsResponse withJsonUnauthorized(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostPostsByFieldSelectorsResponse(responseBuilder.build());
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
        public static PostPostsByFieldSelectorsResponse withJsonForbidden(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostPostsByFieldSelectorsResponse(responseBuilder.build());
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
        public static PostPostsByFieldSelectorsResponse withJsonNotFound(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostPostsByFieldSelectorsResponse(responseBuilder.build());
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
        public static PostPostsByFieldSelectorsResponse withJsonMethodNotAllowed(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostPostsByFieldSelectorsResponse(responseBuilder.build());
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
        public static PostPostsByFieldSelectorsResponse withJsonInternalServerError(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostPostsByFieldSelectorsResponse(responseBuilder.build());
        }

    }

    public class PostPostsByPostIdLikeResponse
        extends com.linkedin.api.resource.support.ResponseWrapper
    {


        private PostPostsByPostIdLikeResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         *
         *
         * @param entity
         *
         */
        public static PostPostsByPostIdLikeResponse withJsonOK(Update entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostPostsByPostIdLikeResponse(responseBuilder.build());
        }

        /**
         * 创建或替换一条记录的请求成功. 当返回201时，Location头字段通常跟随返回
         *
         *
         * @param entity
         *
         */
        public static PostPostsByPostIdLikeResponse withJsonCreated(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(201).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostPostsByPostIdLikeResponse(responseBuilder.build());
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
        public static PostPostsByPostIdLikeResponse withJsonBadRequest(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostPostsByPostIdLikeResponse(responseBuilder.build());
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
        public static PostPostsByPostIdLikeResponse withJsonUnauthorized(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostPostsByPostIdLikeResponse(responseBuilder.build());
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
        public static PostPostsByPostIdLikeResponse withJsonForbidden(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostPostsByPostIdLikeResponse(responseBuilder.build());
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
        public static PostPostsByPostIdLikeResponse withJsonNotFound(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostPostsByPostIdLikeResponse(responseBuilder.build());
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
        public static PostPostsByPostIdLikeResponse withJsonMethodNotAllowed(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostPostsByPostIdLikeResponse(responseBuilder.build());
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
        public static PostPostsByPostIdLikeResponse withJsonInternalServerError(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostPostsByPostIdLikeResponse(responseBuilder.build());
        }

    }

    public class PostPostsByPostIdReviewResponse
        extends com.linkedin.api.resource.support.ResponseWrapper
    {


        private PostPostsByPostIdReviewResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         *
         *
         * @param entity
         *
         */
        public static PostPostsByPostIdReviewResponse withJsonOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostPostsByPostIdReviewResponse(responseBuilder.build());
        }

        /**
         * 创建或替换一条记录的请求成功. 当返回201时，Location头字段通常跟随返回
         *
         *
         * @param entity
         *
         */
        public static PostPostsByPostIdReviewResponse withJsonCreated(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(201).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostPostsByPostIdReviewResponse(responseBuilder.build());
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
        public static PostPostsByPostIdReviewResponse withJsonBadRequest(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostPostsByPostIdReviewResponse(responseBuilder.build());
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
        public static PostPostsByPostIdReviewResponse withJsonUnauthorized(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostPostsByPostIdReviewResponse(responseBuilder.build());
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
        public static PostPostsByPostIdReviewResponse withJsonForbidden(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostPostsByPostIdReviewResponse(responseBuilder.build());
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
        public static PostPostsByPostIdReviewResponse withJsonNotFound(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostPostsByPostIdReviewResponse(responseBuilder.build());
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
        public static PostPostsByPostIdReviewResponse withJsonMethodNotAllowed(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostPostsByPostIdReviewResponse(responseBuilder.build());
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
        public static PostPostsByPostIdReviewResponse withJsonInternalServerError(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PostPostsByPostIdReviewResponse(responseBuilder.build());
        }

    }

    public class PutPostsByPostIdResponse
        extends com.linkedin.api.resource.support.ResponseWrapper
    {


        private PutPostsByPostIdResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         *
         *
         * @param entity
         *
         */
        public static PutPostsByPostIdResponse withJsonOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PutPostsByPostIdResponse(responseBuilder.build());
        }

        /**
         * 创建或替换一条记录的请求成功. 当返回201时，Location头字段通常跟随返回
         *
         *
         * @param entity
         *
         */
        public static PutPostsByPostIdResponse withJsonCreated(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(201).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PutPostsByPostIdResponse(responseBuilder.build());
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
        public static PutPostsByPostIdResponse withJsonBadRequest(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PutPostsByPostIdResponse(responseBuilder.build());
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
        public static PutPostsByPostIdResponse withJsonUnauthorized(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PutPostsByPostIdResponse(responseBuilder.build());
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
        public static PutPostsByPostIdResponse withJsonForbidden(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PutPostsByPostIdResponse(responseBuilder.build());
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
        public static PutPostsByPostIdResponse withJsonNotFound(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PutPostsByPostIdResponse(responseBuilder.build());
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
        public static PutPostsByPostIdResponse withJsonMethodNotAllowed(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PutPostsByPostIdResponse(responseBuilder.build());
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
        public static PutPostsByPostIdResponse withJsonInternalServerError(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PutPostsByPostIdResponse(responseBuilder.build());
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
