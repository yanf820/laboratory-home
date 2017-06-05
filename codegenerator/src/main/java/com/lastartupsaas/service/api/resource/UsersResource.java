
package com.lastartupsaas.service.api.resource;

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
import com.lastartupsaas.service.api.model.Error;
import com.lastartupsaas.service.api.model.User;
import com.lastartupsaas.service.api.model.Users;
import com.lastartupsaas.service.api.resource.support.PATCH;


/**
 * 用户服务
 * 
 * 
 */
@Path("users")
public interface UsersResource {


    /**
     * 用户查询服务
     * 
     * 
     * @param creationTime
     *     
     * @param nickName
     *     
     * @param count
     *     搜索数据个数 e.g. 10
     * @param start
     *     游标开始位置 e.g. 0
     * @param sign
     *     对参数进行签名后的值，用来防止参数被篡改
     *     
     * @param xLaSignMethod
     *     系统参数签名方式
     *     
     * @param xLaFormat
     *     系统响应的数据格式，目前只有JSON一种
     *     
     * @param sort
     *     
     * @param phone
     *     
     * @param extensionAttr
     *      e.g. a:A,b:B,c:C
     * @param sortField
     *     
     * @param userType
     *     
     * @param email
     *     
     * @param status
     *     
     */
    @GET
    @Path("{userType}")
    @Produces({
        "application/json"
    })
    UsersResource.GetUsersByUserTypeResponse getUsersByUserType(
        @PathParam("userType")
        @NotNull
        UsersResource.UserType userType,
        @HeaderParam("x-la-format")
        @NotNull
        UsersResource.XLaFormat xLaFormat,
        @HeaderParam("x-la-sign-method")
        @NotNull
        UsersResource.XLaSignMethod xLaSignMethod,
        @QueryParam("nickName")
        String nickName,
        @QueryParam("email")
        String email,
        @QueryParam("phone")
        String phone,
        @QueryParam("status")
        @DefaultValue("registered")
        UsersResource.Status status,
        @QueryParam("creationTime")
        String creationTime,
        @QueryParam("extensionAttr")
        String extensionAttr,
        @QueryParam("sortField")
        @DefaultValue("id")
        String sortField,
        @QueryParam("sort")
        @DefaultValue("asc")
        UsersResource.Sort sort,
        @QueryParam("count")
        @DefaultValue("10")
        int count,
        @QueryParam("start")
        @DefaultValue("0")
        int start,
        @QueryParam("sign")
        @NotNull
        String sign)
        throws Exception
    ;

    /**
     * 用户注册服务
     * 
     * 
     * @param sign
     *     对参数进行签名后的值，用来防止参数被篡改
     *     
     * @param xLaSignMethod
     *     系统参数签名方式
     *     
     * @param xLaFormat
     *     系统响应的数据格式，目前只有JSON一种
     *     
     * @param userType
     *     
     * @param entity
     *     
     */
    @POST
    @Path("{userType}/register")
    @Consumes("application/json")
    @Produces({
        "application/json"
    })
    UsersResource.PostUsersByUserTypeRegisterResponse postUsersByUserTypeRegister(
        @PathParam("userType")
        @NotNull
        UsersResource.UserType userType,
        @HeaderParam("x-la-format")
        @NotNull
        UsersResource.XLaFormat xLaFormat,
        @HeaderParam("x-la-sign-method")
        @NotNull
        UsersResource.XLaSignMethod xLaSignMethod,
        @QueryParam("sign")
        @NotNull
        String sign, User entity)
        throws Exception
    ;

    /**
     * 用户搜索服务
     * 
     * 
     * @param fieldSelectors
     *     很多资源允许你指定想要返回的字段。我们称这种语法结构为字段选择器。通过准确的指出你需要的信息，我们可以优化返回结果花费的时间。
     *     这样也能减少传输的数据。这两点让我们的APIs快速且高效，这是任何一个web应用程序的关键点，对于其他任何依赖外部API的人来说更是如此。
     *     
     *     Field selectors are specified after the resource identifiers and path components of a resource, prefixed by a colon,
     *     contained within parenthesis, and separated by commas. Fields will be returned in the order specified. When URL-encoding
     *     your resource URLs, ensure that the parenthesis used in selectors remain unescaped.
     *     
     *     Examples
     *     --------
     *     To get a member's ID, first name, last name, and industry:
     *       `http://api.startupsaas.com/v1/people/~:(id,first-name,last-name,industry)`
     *     
     *     Or the same set of information for their connections:
     *       `http://api.startupsaas.com/v1/people/~/connections:(id,first-name,last-name,industry)`
     *     
     *     Fields selectors can also be nested to access individual fields from a larger collection. For example, to get just the
     *     job titles and not the rest of the information about positions:
     *       `http://api.startupsaas.com/v1/people/~/connections:(id,first-name,last-name,positions:(title))`
     *      e.g. :(id,first-name,last-name,industry)
     * @param count
     *     搜索数据个数 e.g. 10
     * @param start
     *     游标开始位置 e.g. 0
     * @param sign
     *     对参数进行签名后的值，用来防止参数被篡改
     *     
     * @param xLaSignMethod
     *     系统参数签名方式
     *     
     * @param xLaFormat
     *     系统响应的数据格式，目前只有JSON一种
     *     
     * @param userType
     *     
     */
    @GET
    @Path("{userType}/~{field_selectors}")
    @Produces({
        "application/json"
    })
    UsersResource.GetUsersByUserTypeByFieldSelectorsResponse getUsersByUserTypeByFieldSelectors(
        @PathParam("field_selectors")
        String fieldSelectors,
        @PathParam("userType")
        @NotNull
        UsersResource.UserType userType,
        @HeaderParam("x-la-format")
        @NotNull
        UsersResource.XLaFormat xLaFormat,
        @HeaderParam("x-la-sign-method")
        @NotNull
        UsersResource.XLaSignMethod xLaSignMethod,
        @QueryParam("count")
        @DefaultValue("10")
        int count,
        @QueryParam("start")
        @DefaultValue("0")
        int start,
        @QueryParam("sign")
        @NotNull
        String sign)
        throws Exception
    ;

    /**
     * 用户信息查询
     * 
     * 
     * @param sign
     *     对参数进行签名后的值，用来防止参数被篡改
     *     
     * @param xLaSignMethod
     *     系统参数签名方式
     *     
     * @param xLaFormat
     *     系统响应的数据格式，目前只有JSON一种
     *     
     * @param userType
     *     
     * @param userId
     *     
     */
    @GET
    @Path("{userType}/{user_id}")
    @Produces({
        "application/json"
    })
    UsersResource.GetUsersByUserTypeByUserIdResponse getUsersByUserTypeByUserId(
        @PathParam("user_id")
        @NotNull
        String userId,
        @PathParam("userType")
        @NotNull
        UsersResource.UserType userType,
        @HeaderParam("x-la-format")
        @NotNull
        UsersResource.XLaFormat xLaFormat,
        @HeaderParam("x-la-sign-method")
        @NotNull
        UsersResource.XLaSignMethod xLaSignMethod,
        @QueryParam("sign")
        @NotNull
        String sign)
        throws Exception
    ;

    /**
     * 用户信息修改
     * 
     * 
     * @param headImg
     *     
     * @param phone
     *     
     * @param nickName
     *     
     * @param extensionAttr
     *      e.g. a:A,b:B,c:C
     * @param sign
     *     对参数进行签名后的值，用来防止参数被篡改
     *     
     * @param xLaSignMethod
     *     系统参数签名方式
     *     
     * @param xLaFormat
     *     系统响应的数据格式，目前只有JSON一种
     *     
     * @param userType
     *     
     * @param userId
     *     
     * @param email
     *     
     */
    @PATCH
    @Path("{userType}/{user_id}/edit")
    @Produces({
        "application/json"
    })
    UsersResource.PatchUsersByUserTypeByUserIdEditResponse patchUsersByUserTypeByUserIdEdit(
        @PathParam("user_id")
        @NotNull
        String userId,
        @PathParam("userType")
        @NotNull
        UsersResource.UserType userType,
        @HeaderParam("x-la-format")
        @NotNull
        UsersResource.XLaFormat xLaFormat,
        @HeaderParam("x-la-sign-method")
        @NotNull
        UsersResource.XLaSignMethod xLaSignMethod,
        @QueryParam("nickName")
        String nickName,
        @QueryParam("headImg")
        String headImg,
        @QueryParam("email")
        String email,
        @QueryParam("phone")
        String phone,
        @QueryParam("extensionAttr")
        String extensionAttr,
        @QueryParam("sign")
        @NotNull
        String sign)
        throws Exception
    ;

    /**
     * 用户注销
     * 
     * 
     * @param sign
     *     对参数进行签名后的值，用来防止参数被篡改
     *     
     * @param xLaSignMethod
     *     系统参数签名方式
     *     
     * @param xLaFormat
     *     系统响应的数据格式，目前只有JSON一种
     *     
     * @param userType
     *     
     * @param userId
     *     
     */
    @PATCH
    @Path("{userType}/{user_id}/unregister")
    @Produces({
        "application/json"
    })
    UsersResource.PatchUsersByUserTypeByUserIdUnregisterResponse patchUsersByUserTypeByUserIdUnregister(
        @PathParam("user_id")
        @NotNull
        String userId,
        @PathParam("userType")
        @NotNull
        UsersResource.UserType userType,
        @HeaderParam("x-la-format")
        @NotNull
        UsersResource.XLaFormat xLaFormat,
        @HeaderParam("x-la-sign-method")
        @NotNull
        UsersResource.XLaSignMethod xLaSignMethod,
        @QueryParam("sign")
        @NotNull
        String sign)
        throws Exception
    ;

    public class GetUsersByUserTypeByFieldSelectorsResponse
        extends com.lastartupsaas.service.api.resource.support.ResponseWrapper
    {


        private GetUsersByUserTypeByFieldSelectorsResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         * 
         * 
         * @param entity
         *     
         */
        public static UsersResource.GetUsersByUserTypeByFieldSelectorsResponse withJsonOK(Users entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new UsersResource.GetUsersByUserTypeByFieldSelectorsResponse(responseBuilder.build());
        }

        /**
         * 参数格式不正确或参数个数不正确
         *  e.g. {
         *   "errorCode": "0",
         *   "message": "Invalid access token.",
         *   "status": 401,
         *   "timestamp": "1378122137646"
         * }
         * 
         * 
         * @param entity
         *     {
         *       "errorCode": "0",
         *       "message": "Invalid access token.",
         *       "status": 401,
         *       "timestamp": "1378122137646"
         *     }
         *     
         */
        public static UsersResource.GetUsersByUserTypeByFieldSelectorsResponse withJsonBadRequest(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new UsersResource.GetUsersByUserTypeByFieldSelectorsResponse(responseBuilder.build());
        }

        /**
         * 对资源的访问被拒绝。通常这意味着当前请求被限制。也可能是你没有访问此资源的权限
         *  e.g. {
         *   "errorCode": "0",
         *   "message": "Invalid access token.",
         *   "status": 401,
         *   "timestamp": "1378122137646"
         * }
         * 
         * 
         * @param entity
         *     {
         *       "errorCode": "0",
         *       "message": "Invalid access token.",
         *       "status": 401,
         *       "timestamp": "1378122137646"
         *     }
         *     
         */
        public static UsersResource.GetUsersByUserTypeByFieldSelectorsResponse withJsonForbidden(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new UsersResource.GetUsersByUserTypeByFieldSelectorsResponse(responseBuilder.build());
        }

        /**
         * 资源不存在或当前访问的资源对象不存在
         *  e.g. {
         *   "errorCode": "0",
         *   "message": "Invalid access token.",
         *   "status": 401,
         *   "timestamp": "1378122137646"
         * }
         * 
         * 
         * @param entity
         *     {
         *       "errorCode": "0",
         *       "message": "Invalid access token.",
         *       "status": 401,
         *       "timestamp": "1378122137646"
         *     }
         *     
         */
        public static UsersResource.GetUsersByUserTypeByFieldSelectorsResponse withJsonNotFound(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new UsersResource.GetUsersByUserTypeByFieldSelectorsResponse(responseBuilder.build());
        }

        /**
         * 服务端异常
         *  e.g. {
         *   "errorCode": "0",
         *   "message": "Invalid access token.",
         *   "status": 401,
         *   "timestamp": "1378122137646"
         * }
         * 
         * 
         * @param entity
         *     {
         *       "errorCode": "0",
         *       "message": "Invalid access token.",
         *       "status": 401,
         *       "timestamp": "1378122137646"
         *     }
         *     
         */
        public static UsersResource.GetUsersByUserTypeByFieldSelectorsResponse withJsonInternalServerError(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new UsersResource.GetUsersByUserTypeByFieldSelectorsResponse(responseBuilder.build());
        }

    }

    public class GetUsersByUserTypeByUserIdResponse
        extends com.lastartupsaas.service.api.resource.support.ResponseWrapper
    {


        private GetUsersByUserTypeByUserIdResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         * 
         * 
         * @param entity
         *     
         */
        public static UsersResource.GetUsersByUserTypeByUserIdResponse withJsonOK(User entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new UsersResource.GetUsersByUserTypeByUserIdResponse(responseBuilder.build());
        }

        /**
         * 参数格式不正确或参数个数不正确
         *  e.g. {
         *   "errorCode": "0",
         *   "message": "Invalid access token.",
         *   "status": 401,
         *   "timestamp": "1378122137646"
         * }
         * 
         * 
         * @param entity
         *     {
         *       "errorCode": "0",
         *       "message": "Invalid access token.",
         *       "status": 401,
         *       "timestamp": "1378122137646"
         *     }
         *     
         */
        public static UsersResource.GetUsersByUserTypeByUserIdResponse withJsonBadRequest(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new UsersResource.GetUsersByUserTypeByUserIdResponse(responseBuilder.build());
        }

        /**
         * 对资源的访问被拒绝。通常这意味着当前请求被限制。也可能是你没有访问此资源的权限
         *  e.g. {
         *   "errorCode": "0",
         *   "message": "Invalid access token.",
         *   "status": 401,
         *   "timestamp": "1378122137646"
         * }
         * 
         * 
         * @param entity
         *     {
         *       "errorCode": "0",
         *       "message": "Invalid access token.",
         *       "status": 401,
         *       "timestamp": "1378122137646"
         *     }
         *     
         */
        public static UsersResource.GetUsersByUserTypeByUserIdResponse withJsonForbidden(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new UsersResource.GetUsersByUserTypeByUserIdResponse(responseBuilder.build());
        }

        /**
         * 资源不存在或当前访问的资源对象不存在
         *  e.g. {
         *   "errorCode": "0",
         *   "message": "Invalid access token.",
         *   "status": 401,
         *   "timestamp": "1378122137646"
         * }
         * 
         * 
         * @param entity
         *     {
         *       "errorCode": "0",
         *       "message": "Invalid access token.",
         *       "status": 401,
         *       "timestamp": "1378122137646"
         *     }
         *     
         */
        public static UsersResource.GetUsersByUserTypeByUserIdResponse withJsonNotFound(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new UsersResource.GetUsersByUserTypeByUserIdResponse(responseBuilder.build());
        }

        /**
         * 服务端异常
         *  e.g. {
         *   "errorCode": "0",
         *   "message": "Invalid access token.",
         *   "status": 401,
         *   "timestamp": "1378122137646"
         * }
         * 
         * 
         * @param entity
         *     {
         *       "errorCode": "0",
         *       "message": "Invalid access token.",
         *       "status": 401,
         *       "timestamp": "1378122137646"
         *     }
         *     
         */
        public static UsersResource.GetUsersByUserTypeByUserIdResponse withJsonInternalServerError(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new UsersResource.GetUsersByUserTypeByUserIdResponse(responseBuilder.build());
        }

    }

    public class GetUsersByUserTypeResponse
        extends com.lastartupsaas.service.api.resource.support.ResponseWrapper
    {


        private GetUsersByUserTypeResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         * 
         * 
         * @param entity
         *     
         */
        public static UsersResource.GetUsersByUserTypeResponse withJsonOK(Users entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new UsersResource.GetUsersByUserTypeResponse(responseBuilder.build());
        }

        /**
         * 参数格式不正确或参数个数不正确
         *  e.g. {
         *   "errorCode": "0",
         *   "message": "Invalid access token.",
         *   "status": 401,
         *   "timestamp": "1378122137646"
         * }
         * 
         * 
         * @param entity
         *     {
         *       "errorCode": "0",
         *       "message": "Invalid access token.",
         *       "status": 401,
         *       "timestamp": "1378122137646"
         *     }
         *     
         */
        public static UsersResource.GetUsersByUserTypeResponse withJsonBadRequest(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new UsersResource.GetUsersByUserTypeResponse(responseBuilder.build());
        }

        /**
         * 对资源的访问被拒绝。通常这意味着当前请求被限制。也可能是你没有访问此资源的权限
         *  e.g. {
         *   "errorCode": "0",
         *   "message": "Invalid access token.",
         *   "status": 401,
         *   "timestamp": "1378122137646"
         * }
         * 
         * 
         * @param entity
         *     {
         *       "errorCode": "0",
         *       "message": "Invalid access token.",
         *       "status": 401,
         *       "timestamp": "1378122137646"
         *     }
         *     
         */
        public static UsersResource.GetUsersByUserTypeResponse withJsonForbidden(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new UsersResource.GetUsersByUserTypeResponse(responseBuilder.build());
        }

        /**
         * 资源不存在或当前访问的资源对象不存在
         *  e.g. {
         *   "errorCode": "0",
         *   "message": "Invalid access token.",
         *   "status": 401,
         *   "timestamp": "1378122137646"
         * }
         * 
         * 
         * @param entity
         *     {
         *       "errorCode": "0",
         *       "message": "Invalid access token.",
         *       "status": 401,
         *       "timestamp": "1378122137646"
         *     }
         *     
         */
        public static UsersResource.GetUsersByUserTypeResponse withJsonNotFound(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new UsersResource.GetUsersByUserTypeResponse(responseBuilder.build());
        }

        /**
         * 服务端异常
         *  e.g. {
         *   "errorCode": "0",
         *   "message": "Invalid access token.",
         *   "status": 401,
         *   "timestamp": "1378122137646"
         * }
         * 
         * 
         * @param entity
         *     {
         *       "errorCode": "0",
         *       "message": "Invalid access token.",
         *       "status": 401,
         *       "timestamp": "1378122137646"
         *     }
         *     
         */
        public static UsersResource.GetUsersByUserTypeResponse withJsonInternalServerError(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new UsersResource.GetUsersByUserTypeResponse(responseBuilder.build());
        }

    }

    public class PatchUsersByUserTypeByUserIdEditResponse
        extends com.lastartupsaas.service.api.resource.support.ResponseWrapper
    {


        private PatchUsersByUserTypeByUserIdEditResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         * 
         * 
         * @param entity
         *     
         */
        public static UsersResource.PatchUsersByUserTypeByUserIdEditResponse withJsonOK(User entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new UsersResource.PatchUsersByUserTypeByUserIdEditResponse(responseBuilder.build());
        }

        /**
         * 参数格式不正确或参数个数不正确
         *  e.g. {
         *   "errorCode": "0",
         *   "message": "Invalid access token.",
         *   "status": 401,
         *   "timestamp": "1378122137646"
         * }
         * 
         * 
         * @param entity
         *     {
         *       "errorCode": "0",
         *       "message": "Invalid access token.",
         *       "status": 401,
         *       "timestamp": "1378122137646"
         *     }
         *     
         */
        public static UsersResource.PatchUsersByUserTypeByUserIdEditResponse withJsonBadRequest(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new UsersResource.PatchUsersByUserTypeByUserIdEditResponse(responseBuilder.build());
        }

        /**
         * 对资源的访问被拒绝。通常这意味着当前请求被限制。也可能是你没有访问此资源的权限
         *  e.g. {
         *   "errorCode": "0",
         *   "message": "Invalid access token.",
         *   "status": 401,
         *   "timestamp": "1378122137646"
         * }
         * 
         * 
         * @param entity
         *     {
         *       "errorCode": "0",
         *       "message": "Invalid access token.",
         *       "status": 401,
         *       "timestamp": "1378122137646"
         *     }
         *     
         */
        public static UsersResource.PatchUsersByUserTypeByUserIdEditResponse withJsonForbidden(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new UsersResource.PatchUsersByUserTypeByUserIdEditResponse(responseBuilder.build());
        }

        /**
         * 资源不存在或当前访问的资源对象不存在
         *  e.g. {
         *   "errorCode": "0",
         *   "message": "Invalid access token.",
         *   "status": 401,
         *   "timestamp": "1378122137646"
         * }
         * 
         * 
         * @param entity
         *     {
         *       "errorCode": "0",
         *       "message": "Invalid access token.",
         *       "status": 401,
         *       "timestamp": "1378122137646"
         *     }
         *     
         */
        public static UsersResource.PatchUsersByUserTypeByUserIdEditResponse withJsonNotFound(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new UsersResource.PatchUsersByUserTypeByUserIdEditResponse(responseBuilder.build());
        }

        /**
         * 服务端异常
         *  e.g. {
         *   "errorCode": "0",
         *   "message": "Invalid access token.",
         *   "status": 401,
         *   "timestamp": "1378122137646"
         * }
         * 
         * 
         * @param entity
         *     {
         *       "errorCode": "0",
         *       "message": "Invalid access token.",
         *       "status": 401,
         *       "timestamp": "1378122137646"
         *     }
         *     
         */
        public static UsersResource.PatchUsersByUserTypeByUserIdEditResponse withJsonInternalServerError(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new UsersResource.PatchUsersByUserTypeByUserIdEditResponse(responseBuilder.build());
        }

    }

    public class PatchUsersByUserTypeByUserIdUnregisterResponse
        extends com.lastartupsaas.service.api.resource.support.ResponseWrapper
    {


        private PatchUsersByUserTypeByUserIdUnregisterResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         * 
         * 
         * @param entity
         *     
         */
        public static UsersResource.PatchUsersByUserTypeByUserIdUnregisterResponse withJsonOK(User entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new UsersResource.PatchUsersByUserTypeByUserIdUnregisterResponse(responseBuilder.build());
        }

        /**
         * 参数格式不正确或参数个数不正确
         *  e.g. {
         *   "errorCode": "0",
         *   "message": "Invalid access token.",
         *   "status": 401,
         *   "timestamp": "1378122137646"
         * }
         * 
         * 
         * @param entity
         *     {
         *       "errorCode": "0",
         *       "message": "Invalid access token.",
         *       "status": 401,
         *       "timestamp": "1378122137646"
         *     }
         *     
         */
        public static UsersResource.PatchUsersByUserTypeByUserIdUnregisterResponse withJsonBadRequest(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new UsersResource.PatchUsersByUserTypeByUserIdUnregisterResponse(responseBuilder.build());
        }

        /**
         * 对资源的访问被拒绝。通常这意味着当前请求被限制。也可能是你没有访问此资源的权限
         *  e.g. {
         *   "errorCode": "0",
         *   "message": "Invalid access token.",
         *   "status": 401,
         *   "timestamp": "1378122137646"
         * }
         * 
         * 
         * @param entity
         *     {
         *       "errorCode": "0",
         *       "message": "Invalid access token.",
         *       "status": 401,
         *       "timestamp": "1378122137646"
         *     }
         *     
         */
        public static UsersResource.PatchUsersByUserTypeByUserIdUnregisterResponse withJsonForbidden(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new UsersResource.PatchUsersByUserTypeByUserIdUnregisterResponse(responseBuilder.build());
        }

        /**
         * 资源不存在或当前访问的资源对象不存在
         *  e.g. {
         *   "errorCode": "0",
         *   "message": "Invalid access token.",
         *   "status": 401,
         *   "timestamp": "1378122137646"
         * }
         * 
         * 
         * @param entity
         *     {
         *       "errorCode": "0",
         *       "message": "Invalid access token.",
         *       "status": 401,
         *       "timestamp": "1378122137646"
         *     }
         *     
         */
        public static UsersResource.PatchUsersByUserTypeByUserIdUnregisterResponse withJsonNotFound(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new UsersResource.PatchUsersByUserTypeByUserIdUnregisterResponse(responseBuilder.build());
        }

        /**
         * 服务端异常
         *  e.g. {
         *   "errorCode": "0",
         *   "message": "Invalid access token.",
         *   "status": 401,
         *   "timestamp": "1378122137646"
         * }
         * 
         * 
         * @param entity
         *     {
         *       "errorCode": "0",
         *       "message": "Invalid access token.",
         *       "status": 401,
         *       "timestamp": "1378122137646"
         *     }
         *     
         */
        public static UsersResource.PatchUsersByUserTypeByUserIdUnregisterResponse withJsonInternalServerError(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new UsersResource.PatchUsersByUserTypeByUserIdUnregisterResponse(responseBuilder.build());
        }

    }

    public class PostUsersByUserTypeRegisterResponse
        extends com.lastartupsaas.service.api.resource.support.ResponseWrapper
    {


        private PostUsersByUserTypeRegisterResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         * 
         * 
         * @param entity
         *     
         */
        public static UsersResource.PostUsersByUserTypeRegisterResponse withJsonOK(User entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new UsersResource.PostUsersByUserTypeRegisterResponse(responseBuilder.build());
        }

        /**
         * 参数格式不正确或参数个数不正确
         *  e.g. {
         *   "errorCode": "0",
         *   "message": "Invalid access token.",
         *   "status": 401,
         *   "timestamp": "1378122137646"
         * }
         * 
         * 
         * @param entity
         *     {
         *       "errorCode": "0",
         *       "message": "Invalid access token.",
         *       "status": 401,
         *       "timestamp": "1378122137646"
         *     }
         *     
         */
        public static UsersResource.PostUsersByUserTypeRegisterResponse withJsonBadRequest(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new UsersResource.PostUsersByUserTypeRegisterResponse(responseBuilder.build());
        }

        /**
         * 对资源的访问被拒绝。通常这意味着当前请求被限制。也可能是你没有访问此资源的权限
         *  e.g. {
         *   "errorCode": "0",
         *   "message": "Invalid access token.",
         *   "status": 401,
         *   "timestamp": "1378122137646"
         * }
         * 
         * 
         * @param entity
         *     {
         *       "errorCode": "0",
         *       "message": "Invalid access token.",
         *       "status": 401,
         *       "timestamp": "1378122137646"
         *     }
         *     
         */
        public static UsersResource.PostUsersByUserTypeRegisterResponse withJsonForbidden(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new UsersResource.PostUsersByUserTypeRegisterResponse(responseBuilder.build());
        }

        /**
         * 资源不存在或当前访问的资源对象不存在
         *  e.g. {
         *   "errorCode": "0",
         *   "message": "Invalid access token.",
         *   "status": 401,
         *   "timestamp": "1378122137646"
         * }
         * 
         * 
         * @param entity
         *     {
         *       "errorCode": "0",
         *       "message": "Invalid access token.",
         *       "status": 401,
         *       "timestamp": "1378122137646"
         *     }
         *     
         */
        public static UsersResource.PostUsersByUserTypeRegisterResponse withJsonNotFound(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new UsersResource.PostUsersByUserTypeRegisterResponse(responseBuilder.build());
        }

        /**
         * 服务端异常
         *  e.g. {
         *   "errorCode": "0",
         *   "message": "Invalid access token.",
         *   "status": 401,
         *   "timestamp": "1378122137646"
         * }
         * 
         * 
         * @param entity
         *     {
         *       "errorCode": "0",
         *       "message": "Invalid access token.",
         *       "status": 401,
         *       "timestamp": "1378122137646"
         *     }
         *     
         */
        public static UsersResource.PostUsersByUserTypeRegisterResponse withJsonInternalServerError(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new UsersResource.PostUsersByUserTypeRegisterResponse(responseBuilder.build());
        }

    }

    public enum Sort {

        asc,
        desc;

    }

    public enum Status {

        free,
        registered,
        cancelled,
        authenticated;

    }

    public enum UserType {

        all,
        tourist,
        supplier,
        member,
        manager;

    }

    public enum XLaFormat {

        json;

    }

    public enum XLaSignMethod {

        MD5;

    }

}
