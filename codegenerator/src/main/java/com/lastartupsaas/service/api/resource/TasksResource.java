
package com.lastartupsaas.service.api.resource;

import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;
import com.lastartupsaas.service.api.model.Error;
import com.lastartupsaas.service.api.model.Task;
import com.lastartupsaas.service.api.resource.support.PATCH;


/**
 * 任务服务
 * 
 * 
 */
@Path("tasks")
public interface TasksResource {


    /**
     * 任务创建
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
    TasksResource.PostTasksResponse postTasks(
        @HeaderParam("x-la-format")
        @NotNull
        TasksResource.XLaFormat xLaFormat,
        @HeaderParam("x-la-sign-method")
        @NotNull
        TasksResource.XLaSignMethod xLaSignMethod,
        @QueryParam("sign")
        @NotNull
        String sign, Task entity)
        throws Exception
    ;

    /**
     * 获取任务信息
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
     * @param taskId
     *     
     */
    @GET
    @Path("{task_id}")
    @Produces({
        "application/json"
    })
    TasksResource.GetTasksByTaskIdResponse getTasksByTaskId(
        @PathParam("task_id")
        @NotNull
        String taskId,
        @HeaderParam("x-la-format")
        @NotNull
        TasksResource.XLaFormat xLaFormat,
        @HeaderParam("x-la-sign-method")
        @NotNull
        TasksResource.XLaSignMethod xLaSignMethod,
        @QueryParam("sign")
        @NotNull
        String sign)
        throws Exception
    ;

    /**
     * 获取任务详情
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
     * @param taskId
     *     
     */
    @GET
    @Path("{task_id}/info")
    @Produces({
        "application/json"
    })
    TasksResource.GetTasksByTaskIdInfoResponse getTasksByTaskIdInfo(
        @PathParam("task_id")
        @NotNull
        String taskId,
        @HeaderParam("x-la-format")
        @NotNull
        TasksResource.XLaFormat xLaFormat,
        @HeaderParam("x-la-sign-method")
        @NotNull
        TasksResource.XLaSignMethod xLaSignMethod,
        @QueryParam("sign")
        @NotNull
        String sign)
        throws Exception
    ;

    /**
     * 任务分配或委托
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
     * @param taskId
     *     
     */
    @PATCH
    @Path("{task_id}/delegate")
    @Produces({
        "application/json"
    })
    TasksResource.PatchTasksByTaskIdDelegateResponse patchTasksByTaskIdDelegate(
        @PathParam("task_id")
        @NotNull
        String taskId,
        @HeaderParam("x-la-format")
        @NotNull
        TasksResource.XLaFormat xLaFormat,
        @HeaderParam("x-la-sign-method")
        @NotNull
        TasksResource.XLaSignMethod xLaSignMethod,
        @QueryParam("sign")
        @NotNull
        String sign)
        throws Exception
    ;

    /**
     * 任务操作
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
     * @param taskId
     *     
     */
    @PATCH
    @Path("{task_id}/done")
    @Produces({
        "application/json"
    })
    TasksResource.PatchTasksByTaskIdDoneResponse patchTasksByTaskIdDone(
        @PathParam("task_id")
        @NotNull
        String taskId,
        @HeaderParam("x-la-format")
        @NotNull
        TasksResource.XLaFormat xLaFormat,
        @HeaderParam("x-la-sign-method")
        @NotNull
        TasksResource.XLaSignMethod xLaSignMethod,
        @QueryParam("sign")
        @NotNull
        String sign)
        throws Exception
    ;

    /**
     * 任务完成
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
     * @param taskId
     *     
     */
    @PATCH
    @Path("{task_id}/complete")
    @Produces({
        "application/json"
    })
    TasksResource.PatchTasksByTaskIdCompleteResponse patchTasksByTaskIdComplete(
        @PathParam("task_id")
        @NotNull
        String taskId,
        @HeaderParam("x-la-format")
        @NotNull
        TasksResource.XLaFormat xLaFormat,
        @HeaderParam("x-la-sign-method")
        @NotNull
        TasksResource.XLaSignMethod xLaSignMethod,
        @QueryParam("sign")
        @NotNull
        String sign)
        throws Exception
    ;

    /**
     * 任务挂起
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
     * @param taskId
     *     
     */
    @PATCH
    @Path("{task_id}/suspend")
    @Produces({
        "application/json"
    })
    TasksResource.PatchTasksByTaskIdSuspendResponse patchTasksByTaskIdSuspend(
        @PathParam("task_id")
        @NotNull
        String taskId,
        @HeaderParam("x-la-format")
        @NotNull
        TasksResource.XLaFormat xLaFormat,
        @HeaderParam("x-la-sign-method")
        @NotNull
        TasksResource.XLaSignMethod xLaSignMethod,
        @QueryParam("sign")
        @NotNull
        String sign)
        throws Exception
    ;

    public class GetTasksByTaskIdInfoResponse
        extends com.lastartupsaas.service.api.resource.support.ResponseWrapper
    {


        private GetTasksByTaskIdInfoResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         * 
         * 
         * @param entity
         *     
         */
        public static TasksResource.GetTasksByTaskIdInfoResponse withJsonOK(Task entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TasksResource.GetTasksByTaskIdInfoResponse(responseBuilder.build());
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
        public static TasksResource.GetTasksByTaskIdInfoResponse withJsonBadRequest(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TasksResource.GetTasksByTaskIdInfoResponse(responseBuilder.build());
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
        public static TasksResource.GetTasksByTaskIdInfoResponse withJsonForbidden(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TasksResource.GetTasksByTaskIdInfoResponse(responseBuilder.build());
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
        public static TasksResource.GetTasksByTaskIdInfoResponse withJsonNotFound(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TasksResource.GetTasksByTaskIdInfoResponse(responseBuilder.build());
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
        public static TasksResource.GetTasksByTaskIdInfoResponse withJsonInternalServerError(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TasksResource.GetTasksByTaskIdInfoResponse(responseBuilder.build());
        }

    }

    public class GetTasksByTaskIdResponse
        extends com.lastartupsaas.service.api.resource.support.ResponseWrapper
    {


        private GetTasksByTaskIdResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         * 
         * 
         * @param entity
         *     
         */
        public static TasksResource.GetTasksByTaskIdResponse withJsonOK(Task entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TasksResource.GetTasksByTaskIdResponse(responseBuilder.build());
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
        public static TasksResource.GetTasksByTaskIdResponse withJsonBadRequest(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TasksResource.GetTasksByTaskIdResponse(responseBuilder.build());
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
        public static TasksResource.GetTasksByTaskIdResponse withJsonForbidden(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TasksResource.GetTasksByTaskIdResponse(responseBuilder.build());
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
        public static TasksResource.GetTasksByTaskIdResponse withJsonNotFound(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TasksResource.GetTasksByTaskIdResponse(responseBuilder.build());
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
        public static TasksResource.GetTasksByTaskIdResponse withJsonInternalServerError(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TasksResource.GetTasksByTaskIdResponse(responseBuilder.build());
        }

    }

    public class PatchTasksByTaskIdCompleteResponse
        extends com.lastartupsaas.service.api.resource.support.ResponseWrapper
    {


        private PatchTasksByTaskIdCompleteResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         * 
         * 
         * @param entity
         *     
         */
        public static TasksResource.PatchTasksByTaskIdCompleteResponse withJsonOK(Task entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TasksResource.PatchTasksByTaskIdCompleteResponse(responseBuilder.build());
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
        public static TasksResource.PatchTasksByTaskIdCompleteResponse withJsonBadRequest(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TasksResource.PatchTasksByTaskIdCompleteResponse(responseBuilder.build());
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
        public static TasksResource.PatchTasksByTaskIdCompleteResponse withJsonForbidden(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TasksResource.PatchTasksByTaskIdCompleteResponse(responseBuilder.build());
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
        public static TasksResource.PatchTasksByTaskIdCompleteResponse withJsonNotFound(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TasksResource.PatchTasksByTaskIdCompleteResponse(responseBuilder.build());
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
        public static TasksResource.PatchTasksByTaskIdCompleteResponse withJsonInternalServerError(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TasksResource.PatchTasksByTaskIdCompleteResponse(responseBuilder.build());
        }

    }

    public class PatchTasksByTaskIdDelegateResponse
        extends com.lastartupsaas.service.api.resource.support.ResponseWrapper
    {


        private PatchTasksByTaskIdDelegateResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         * 
         * 
         * @param entity
         *     
         */
        public static TasksResource.PatchTasksByTaskIdDelegateResponse withJsonOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TasksResource.PatchTasksByTaskIdDelegateResponse(responseBuilder.build());
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
        public static TasksResource.PatchTasksByTaskIdDelegateResponse withJsonBadRequest(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TasksResource.PatchTasksByTaskIdDelegateResponse(responseBuilder.build());
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
        public static TasksResource.PatchTasksByTaskIdDelegateResponse withJsonForbidden(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TasksResource.PatchTasksByTaskIdDelegateResponse(responseBuilder.build());
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
        public static TasksResource.PatchTasksByTaskIdDelegateResponse withJsonNotFound(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TasksResource.PatchTasksByTaskIdDelegateResponse(responseBuilder.build());
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
        public static TasksResource.PatchTasksByTaskIdDelegateResponse withJsonInternalServerError(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TasksResource.PatchTasksByTaskIdDelegateResponse(responseBuilder.build());
        }

    }

    public class PatchTasksByTaskIdDoneResponse
        extends com.lastartupsaas.service.api.resource.support.ResponseWrapper
    {


        private PatchTasksByTaskIdDoneResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         * 
         * 
         * @param entity
         *     
         */
        public static TasksResource.PatchTasksByTaskIdDoneResponse withJsonOK(Task entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TasksResource.PatchTasksByTaskIdDoneResponse(responseBuilder.build());
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
        public static TasksResource.PatchTasksByTaskIdDoneResponse withJsonBadRequest(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TasksResource.PatchTasksByTaskIdDoneResponse(responseBuilder.build());
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
        public static TasksResource.PatchTasksByTaskIdDoneResponse withJsonForbidden(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TasksResource.PatchTasksByTaskIdDoneResponse(responseBuilder.build());
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
        public static TasksResource.PatchTasksByTaskIdDoneResponse withJsonNotFound(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TasksResource.PatchTasksByTaskIdDoneResponse(responseBuilder.build());
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
        public static TasksResource.PatchTasksByTaskIdDoneResponse withJsonInternalServerError(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TasksResource.PatchTasksByTaskIdDoneResponse(responseBuilder.build());
        }

    }

    public class PatchTasksByTaskIdSuspendResponse
        extends com.lastartupsaas.service.api.resource.support.ResponseWrapper
    {


        private PatchTasksByTaskIdSuspendResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         * 
         * 
         * @param entity
         *     
         */
        public static TasksResource.PatchTasksByTaskIdSuspendResponse withJsonOK(Task entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TasksResource.PatchTasksByTaskIdSuspendResponse(responseBuilder.build());
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
        public static TasksResource.PatchTasksByTaskIdSuspendResponse withJsonBadRequest(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TasksResource.PatchTasksByTaskIdSuspendResponse(responseBuilder.build());
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
        public static TasksResource.PatchTasksByTaskIdSuspendResponse withJsonForbidden(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TasksResource.PatchTasksByTaskIdSuspendResponse(responseBuilder.build());
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
        public static TasksResource.PatchTasksByTaskIdSuspendResponse withJsonNotFound(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TasksResource.PatchTasksByTaskIdSuspendResponse(responseBuilder.build());
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
        public static TasksResource.PatchTasksByTaskIdSuspendResponse withJsonInternalServerError(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TasksResource.PatchTasksByTaskIdSuspendResponse(responseBuilder.build());
        }

    }

    public class PostTasksResponse
        extends com.lastartupsaas.service.api.resource.support.ResponseWrapper
    {


        private PostTasksResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         * 
         * 
         * @param entity
         *     
         */
        public static TasksResource.PostTasksResponse withJsonOK(Task entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TasksResource.PostTasksResponse(responseBuilder.build());
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
        public static TasksResource.PostTasksResponse withJsonBadRequest(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TasksResource.PostTasksResponse(responseBuilder.build());
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
        public static TasksResource.PostTasksResponse withJsonForbidden(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TasksResource.PostTasksResponse(responseBuilder.build());
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
        public static TasksResource.PostTasksResponse withJsonNotFound(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TasksResource.PostTasksResponse(responseBuilder.build());
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
        public static TasksResource.PostTasksResponse withJsonInternalServerError(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TasksResource.PostTasksResponse(responseBuilder.build());
        }

    }

    public enum XLaFormat {

        json;

    }

    public enum XLaSignMethod {

        MD5;

    }

}
