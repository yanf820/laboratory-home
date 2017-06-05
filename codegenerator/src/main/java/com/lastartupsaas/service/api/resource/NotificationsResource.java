
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
import com.lastartupsaas.service.api.model.Notification;
import com.lastartupsaas.service.api.model.Notifications;
import com.lastartupsaas.service.api.resource.support.PATCH;


/**
 * 通知服务
 * 
 * 
 */
@Path("notifications")
public interface NotificationsResource {


    /**
     * 通知查询服务
     * 
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
     */
    @GET
    @Produces({
        "application/json"
    })
    NotificationsResource.GetNotificationsResponse getNotifications(
        @HeaderParam("x-la-format")
        @NotNull
        NotificationsResource.XLaFormat xLaFormat,
        @HeaderParam("x-la-sign-method")
        @NotNull
        NotificationsResource.XLaSignMethod xLaSignMethod,
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
     * 通知创建服务
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
     * @param entity
     *     
     */
    @POST
    @Consumes("application/json")
    @Produces({
        "application/json"
    })
    NotificationsResource.PostNotificationsResponse postNotifications(
        @HeaderParam("x-la-format")
        @NotNull
        NotificationsResource.XLaFormat xLaFormat,
        @HeaderParam("x-la-sign-method")
        @NotNull
        NotificationsResource.XLaSignMethod xLaSignMethod,
        @QueryParam("sign")
        @NotNull
        String sign, Notification entity)
        throws Exception
    ;

    /**
     * 通知详情查询服务
     * 
     * 
     * @param sign
     *     对参数进行签名后的值，用来防止参数被篡改
     *     
     * @param xLaSignMethod
     *     系统参数签名方式
     *     
     * @param notificationId
     *     
     * @param xLaFormat
     *     系统响应的数据格式，目前只有JSON一种
     *     
     */
    @GET
    @Path("{notification_id}")
    @Produces({
        "application/json"
    })
    NotificationsResource.GetNotificationsByNotificationIdResponse getNotificationsByNotificationId(
        @PathParam("notification_id")
        @NotNull
        String notificationId,
        @HeaderParam("x-la-format")
        @NotNull
        NotificationsResource.XLaFormat xLaFormat,
        @HeaderParam("x-la-sign-method")
        @NotNull
        NotificationsResource.XLaSignMethod xLaSignMethod,
        @QueryParam("sign")
        @NotNull
        String sign)
        throws Exception
    ;

    /**
     * 通知发送服务
     * 
     * 
     * @param sign
     *     对参数进行签名后的值，用来防止参数被篡改
     *     
     * @param xLaSignMethod
     *     系统参数签名方式
     *     
     * @param notificationId
     *     
     * @param xLaFormat
     *     系统响应的数据格式，目前只有JSON一种
     *     
     */
    @PATCH
    @Path("{notification_id}/send")
    @Produces({
        "application/json"
    })
    NotificationsResource.PatchNotificationsByNotificationIdSendResponse patchNotificationsByNotificationIdSend(
        @PathParam("notification_id")
        @NotNull
        String notificationId,
        @HeaderParam("x-la-format")
        @NotNull
        NotificationsResource.XLaFormat xLaFormat,
        @HeaderParam("x-la-sign-method")
        @NotNull
        NotificationsResource.XLaSignMethod xLaSignMethod,
        @QueryParam("sign")
        @NotNull
        String sign)
        throws Exception
    ;

    public class GetNotificationsByNotificationIdResponse
        extends com.lastartupsaas.service.api.resource.support.ResponseWrapper
    {


        private GetNotificationsByNotificationIdResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         * 
         * 
         * @param entity
         *     
         */
        public static NotificationsResource.GetNotificationsByNotificationIdResponse withJsonOK(Notification entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new NotificationsResource.GetNotificationsByNotificationIdResponse(responseBuilder.build());
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
        public static NotificationsResource.GetNotificationsByNotificationIdResponse withJsonBadRequest(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new NotificationsResource.GetNotificationsByNotificationIdResponse(responseBuilder.build());
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
        public static NotificationsResource.GetNotificationsByNotificationIdResponse withJsonForbidden(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new NotificationsResource.GetNotificationsByNotificationIdResponse(responseBuilder.build());
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
        public static NotificationsResource.GetNotificationsByNotificationIdResponse withJsonNotFound(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new NotificationsResource.GetNotificationsByNotificationIdResponse(responseBuilder.build());
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
        public static NotificationsResource.GetNotificationsByNotificationIdResponse withJsonInternalServerError(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new NotificationsResource.GetNotificationsByNotificationIdResponse(responseBuilder.build());
        }

    }

    public class GetNotificationsResponse
        extends com.lastartupsaas.service.api.resource.support.ResponseWrapper
    {


        private GetNotificationsResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         * 
         * 
         * @param entity
         *     
         */
        public static NotificationsResource.GetNotificationsResponse withJsonOK(Notifications entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new NotificationsResource.GetNotificationsResponse(responseBuilder.build());
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
        public static NotificationsResource.GetNotificationsResponse withJsonBadRequest(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new NotificationsResource.GetNotificationsResponse(responseBuilder.build());
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
        public static NotificationsResource.GetNotificationsResponse withJsonForbidden(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new NotificationsResource.GetNotificationsResponse(responseBuilder.build());
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
        public static NotificationsResource.GetNotificationsResponse withJsonNotFound(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new NotificationsResource.GetNotificationsResponse(responseBuilder.build());
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
        public static NotificationsResource.GetNotificationsResponse withJsonInternalServerError(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new NotificationsResource.GetNotificationsResponse(responseBuilder.build());
        }

    }

    public class PatchNotificationsByNotificationIdSendResponse
        extends com.lastartupsaas.service.api.resource.support.ResponseWrapper
    {


        private PatchNotificationsByNotificationIdSendResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         * 
         * 
         * @param entity
         *     
         */
        public static NotificationsResource.PatchNotificationsByNotificationIdSendResponse withJsonOK(Notification entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new NotificationsResource.PatchNotificationsByNotificationIdSendResponse(responseBuilder.build());
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
        public static NotificationsResource.PatchNotificationsByNotificationIdSendResponse withJsonBadRequest(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new NotificationsResource.PatchNotificationsByNotificationIdSendResponse(responseBuilder.build());
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
        public static NotificationsResource.PatchNotificationsByNotificationIdSendResponse withJsonForbidden(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new NotificationsResource.PatchNotificationsByNotificationIdSendResponse(responseBuilder.build());
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
        public static NotificationsResource.PatchNotificationsByNotificationIdSendResponse withJsonNotFound(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new NotificationsResource.PatchNotificationsByNotificationIdSendResponse(responseBuilder.build());
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
        public static NotificationsResource.PatchNotificationsByNotificationIdSendResponse withJsonInternalServerError(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new NotificationsResource.PatchNotificationsByNotificationIdSendResponse(responseBuilder.build());
        }

    }

    public class PostNotificationsResponse
        extends com.lastartupsaas.service.api.resource.support.ResponseWrapper
    {


        private PostNotificationsResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         * 
         * 
         * @param entity
         *     
         */
        public static NotificationsResource.PostNotificationsResponse withJsonOK(Notification entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new NotificationsResource.PostNotificationsResponse(responseBuilder.build());
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
        public static NotificationsResource.PostNotificationsResponse withJsonBadRequest(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new NotificationsResource.PostNotificationsResponse(responseBuilder.build());
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
        public static NotificationsResource.PostNotificationsResponse withJsonForbidden(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new NotificationsResource.PostNotificationsResponse(responseBuilder.build());
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
        public static NotificationsResource.PostNotificationsResponse withJsonNotFound(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new NotificationsResource.PostNotificationsResponse(responseBuilder.build());
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
        public static NotificationsResource.PostNotificationsResponse withJsonInternalServerError(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new NotificationsResource.PostNotificationsResponse(responseBuilder.build());
        }

    }

    public enum XLaFormat {

        json;

    }

    public enum XLaSignMethod {

        MD5;

    }

}
