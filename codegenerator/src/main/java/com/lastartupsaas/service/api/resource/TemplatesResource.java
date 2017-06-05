
package com.lastartupsaas.service.api.resource;

import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
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
import com.lastartupsaas.service.api.model.Error;
import com.lastartupsaas.service.api.model.Template;
import com.lastartupsaas.service.api.model.Templates;
import com.lastartupsaas.service.api.resource.support.PATCH;


/**
 * 模板服务
 * 
 * 
 */
@Path("templates")
public interface TemplatesResource {


    /**
     * 模板查询服务
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
    TemplatesResource.GetTemplatesResponse getTemplates(
        @HeaderParam("x-la-format")
        @NotNull
        TemplatesResource.XLaFormat xLaFormat,
        @HeaderParam("x-la-sign-method")
        @NotNull
        TemplatesResource.XLaSignMethod xLaSignMethod,
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
     * 模板创建服务
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
    TemplatesResource.PostTemplatesResponse postTemplates(
        @HeaderParam("x-la-format")
        @NotNull
        TemplatesResource.XLaFormat xLaFormat,
        @HeaderParam("x-la-sign-method")
        @NotNull
        TemplatesResource.XLaSignMethod xLaSignMethod,
        @QueryParam("sign")
        @NotNull
        String sign, Template entity)
        throws Exception
    ;

    /**
     * 模板信息查询服务
     * 
     * 
     * @param templateType
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
     */
    @GET
    @Path("{template_type}")
    @Produces({
        "application/json"
    })
    TemplatesResource.GetTemplatesByTemplateTypeResponse getTemplatesByTemplateType(
        @PathParam("template_type")
        @NotNull
        String templateType,
        @HeaderParam("x-la-format")
        @NotNull
        TemplatesResource.XLaFormat xLaFormat,
        @HeaderParam("x-la-sign-method")
        @NotNull
        TemplatesResource.XLaSignMethod xLaSignMethod,
        @QueryParam("sign")
        @NotNull
        String sign)
        throws Exception
    ;

    /**
     * 模板修改信息服务
     * 
     * 
     * @param templateType
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
    @PATCH
    @Path("{template_type}")
    @Consumes("application/json")
    @Produces({
        "application/json"
    })
    TemplatesResource.PatchTemplatesByTemplateTypeResponse patchTemplatesByTemplateType(
        @PathParam("template_type")
        @NotNull
        String templateType,
        @HeaderParam("x-la-format")
        @NotNull
        TemplatesResource.XLaFormat xLaFormat,
        @HeaderParam("x-la-sign-method")
        @NotNull
        TemplatesResource.XLaSignMethod xLaSignMethod,
        @QueryParam("sign")
        @NotNull
        String sign, Template entity)
        throws Exception
    ;

    /**
     * 模板删除服务
     * 
     * 
     * @param templateType
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
     */
    @DELETE
    @Path("{template_type}")
    @Produces({
        "application/json"
    })
    TemplatesResource.DeleteTemplatesByTemplateTypeResponse deleteTemplatesByTemplateType(
        @PathParam("template_type")
        @NotNull
        String templateType,
        @HeaderParam("x-la-format")
        @NotNull
        TemplatesResource.XLaFormat xLaFormat,
        @HeaderParam("x-la-sign-method")
        @NotNull
        TemplatesResource.XLaSignMethod xLaSignMethod,
        @QueryParam("sign")
        @NotNull
        String sign)
        throws Exception
    ;

    public class DeleteTemplatesByTemplateTypeResponse
        extends com.lastartupsaas.service.api.resource.support.ResponseWrapper
    {


        private DeleteTemplatesByTemplateTypeResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         * 
         * 
         * @param entity
         *     
         */
        public static TemplatesResource.DeleteTemplatesByTemplateTypeResponse withJsonOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TemplatesResource.DeleteTemplatesByTemplateTypeResponse(responseBuilder.build());
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
        public static TemplatesResource.DeleteTemplatesByTemplateTypeResponse withJsonBadRequest(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TemplatesResource.DeleteTemplatesByTemplateTypeResponse(responseBuilder.build());
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
        public static TemplatesResource.DeleteTemplatesByTemplateTypeResponse withJsonForbidden(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TemplatesResource.DeleteTemplatesByTemplateTypeResponse(responseBuilder.build());
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
        public static TemplatesResource.DeleteTemplatesByTemplateTypeResponse withJsonNotFound(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TemplatesResource.DeleteTemplatesByTemplateTypeResponse(responseBuilder.build());
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
        public static TemplatesResource.DeleteTemplatesByTemplateTypeResponse withJsonInternalServerError(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TemplatesResource.DeleteTemplatesByTemplateTypeResponse(responseBuilder.build());
        }

    }

    public class GetTemplatesByTemplateTypeResponse
        extends com.lastartupsaas.service.api.resource.support.ResponseWrapper
    {


        private GetTemplatesByTemplateTypeResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         * 
         * 
         * @param entity
         *     
         */
        public static TemplatesResource.GetTemplatesByTemplateTypeResponse withJsonOK(Template entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TemplatesResource.GetTemplatesByTemplateTypeResponse(responseBuilder.build());
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
        public static TemplatesResource.GetTemplatesByTemplateTypeResponse withJsonBadRequest(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TemplatesResource.GetTemplatesByTemplateTypeResponse(responseBuilder.build());
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
        public static TemplatesResource.GetTemplatesByTemplateTypeResponse withJsonForbidden(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TemplatesResource.GetTemplatesByTemplateTypeResponse(responseBuilder.build());
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
        public static TemplatesResource.GetTemplatesByTemplateTypeResponse withJsonNotFound(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TemplatesResource.GetTemplatesByTemplateTypeResponse(responseBuilder.build());
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
        public static TemplatesResource.GetTemplatesByTemplateTypeResponse withJsonInternalServerError(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TemplatesResource.GetTemplatesByTemplateTypeResponse(responseBuilder.build());
        }

    }

    public class GetTemplatesResponse
        extends com.lastartupsaas.service.api.resource.support.ResponseWrapper
    {


        private GetTemplatesResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         * 
         * 
         * @param entity
         *     
         */
        public static TemplatesResource.GetTemplatesResponse withJsonOK(Templates entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TemplatesResource.GetTemplatesResponse(responseBuilder.build());
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
        public static TemplatesResource.GetTemplatesResponse withJsonBadRequest(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TemplatesResource.GetTemplatesResponse(responseBuilder.build());
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
        public static TemplatesResource.GetTemplatesResponse withJsonForbidden(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TemplatesResource.GetTemplatesResponse(responseBuilder.build());
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
        public static TemplatesResource.GetTemplatesResponse withJsonNotFound(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TemplatesResource.GetTemplatesResponse(responseBuilder.build());
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
        public static TemplatesResource.GetTemplatesResponse withJsonInternalServerError(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TemplatesResource.GetTemplatesResponse(responseBuilder.build());
        }

    }

    public class PatchTemplatesByTemplateTypeResponse
        extends com.lastartupsaas.service.api.resource.support.ResponseWrapper
    {


        private PatchTemplatesByTemplateTypeResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         * 
         * 
         * @param entity
         *     
         */
        public static TemplatesResource.PatchTemplatesByTemplateTypeResponse withJsonOK(Template entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TemplatesResource.PatchTemplatesByTemplateTypeResponse(responseBuilder.build());
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
        public static TemplatesResource.PatchTemplatesByTemplateTypeResponse withJsonBadRequest(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TemplatesResource.PatchTemplatesByTemplateTypeResponse(responseBuilder.build());
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
        public static TemplatesResource.PatchTemplatesByTemplateTypeResponse withJsonForbidden(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TemplatesResource.PatchTemplatesByTemplateTypeResponse(responseBuilder.build());
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
        public static TemplatesResource.PatchTemplatesByTemplateTypeResponse withJsonNotFound(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TemplatesResource.PatchTemplatesByTemplateTypeResponse(responseBuilder.build());
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
        public static TemplatesResource.PatchTemplatesByTemplateTypeResponse withJsonInternalServerError(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TemplatesResource.PatchTemplatesByTemplateTypeResponse(responseBuilder.build());
        }

    }

    public class PostTemplatesResponse
        extends com.lastartupsaas.service.api.resource.support.ResponseWrapper
    {


        private PostTemplatesResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         * 
         * 
         * @param entity
         *     
         */
        public static TemplatesResource.PostTemplatesResponse withJsonOK(Template entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TemplatesResource.PostTemplatesResponse(responseBuilder.build());
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
        public static TemplatesResource.PostTemplatesResponse withJsonBadRequest(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TemplatesResource.PostTemplatesResponse(responseBuilder.build());
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
        public static TemplatesResource.PostTemplatesResponse withJsonForbidden(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TemplatesResource.PostTemplatesResponse(responseBuilder.build());
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
        public static TemplatesResource.PostTemplatesResponse withJsonNotFound(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TemplatesResource.PostTemplatesResponse(responseBuilder.build());
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
        public static TemplatesResource.PostTemplatesResponse withJsonInternalServerError(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TemplatesResource.PostTemplatesResponse(responseBuilder.build());
        }

    }

    public enum XLaFormat {

        json;

    }

    public enum XLaSignMethod {

        MD5;

    }

}
