
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
import com.lastartupsaas.service.api.model.Supplier;
import com.lastartupsaas.service.api.model.Suppliers;
import com.lastartupsaas.service.api.resource.support.PATCH;


/**
 * 供应商服务
 * 
 * 
 */
@Path("suppliers")
public interface SuppliersResource {


    /**
     * 供应商查询服务
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
    SuppliersResource.GetSuppliersResponse getSuppliers(
        @HeaderParam("x-la-format")
        @NotNull
        SuppliersResource.XLaFormat xLaFormat,
        @HeaderParam("x-la-sign-method")
        @NotNull
        SuppliersResource.XLaSignMethod xLaSignMethod,
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
     * 供应商搜索服务
     * 
     * 
     * @param filter
     *     字段过滤属性 e.g. posterId:123456,status:published
     * @param fieldSelectors
     *     很多资源允许你指定想要返回的字段。我们称这种语法结构为字段选择器。通过准确的指出你需要的信息，我们可以优化返回结果花费的时间。
     *     这样也能减少传输的数据。这两点让我们的APIs快速且高效，这是任何一个web应用程序的关键点，对于其他任何依赖外部API的人来说更是如此。
     *     Example
     *     --------
     *     如果想要获得people先关的id,first-name,last-name,industry可以这样使用:
     *       `http://api.startupsaas.com/v1/people/~:(id,first-name,last-name,industry)`
     *     或者:
     *       `http://api.startupsaas.com/v1/people/~/connections:(id,first-name,last-name,industry)`
     *     字段选择器可以选择成员对象中的字段:
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
     */
    @GET
    @Path("~{field_selectors}")
    @Produces({
        "application/json"
    })
    SuppliersResource.GetSuppliersByFieldSelectorsResponse getSuppliersByFieldSelectors(
        @PathParam("field_selectors")
        String fieldSelectors,
        @HeaderParam("x-la-format")
        @NotNull
        SuppliersResource.XLaFormat xLaFormat,
        @HeaderParam("x-la-sign-method")
        @NotNull
        SuppliersResource.XLaSignMethod xLaSignMethod,
        @QueryParam("filter")
        String filter,
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
     * 供应商入驻服务
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
    @Path("register")
    @Consumes("application/json")
    @Produces({
        "application/json"
    })
    SuppliersResource.PostSuppliersRegisterResponse postSuppliersRegister(
        @HeaderParam("x-la-format")
        @NotNull
        SuppliersResource.XLaFormat xLaFormat,
        @HeaderParam("x-la-sign-method")
        @NotNull
        SuppliersResource.XLaSignMethod xLaSignMethod,
        @QueryParam("sign")
        @NotNull
        String sign, Supplier entity)
        throws Exception
    ;

    /**
     * 供应商信息查询服务
     * 
     * 
     * @param supplierId
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
    @Path("{supplier_id}")
    @Produces({
        "application/json"
    })
    SuppliersResource.GetSuppliersBySupplierIdResponse getSuppliersBySupplierId(
        @PathParam("supplier_id")
        @NotNull
        String supplierId,
        @HeaderParam("x-la-format")
        @NotNull
        SuppliersResource.XLaFormat xLaFormat,
        @HeaderParam("x-la-sign-method")
        @NotNull
        SuppliersResource.XLaSignMethod xLaSignMethod,
        @QueryParam("sign")
        @NotNull
        String sign)
        throws Exception
    ;

    /**
     * 供应商信息修改
     * 
     * 
     * @param supplierId
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
    @Path("{supplier_id}")
    @Consumes("application/json")
    @Produces({
        "application/json"
    })
    SuppliersResource.PatchSuppliersBySupplierIdResponse patchSuppliersBySupplierId(
        @PathParam("supplier_id")
        @NotNull
        String supplierId,
        @HeaderParam("x-la-format")
        @NotNull
        SuppliersResource.XLaFormat xLaFormat,
        @HeaderParam("x-la-sign-method")
        @NotNull
        SuppliersResource.XLaSignMethod xLaSignMethod,
        @QueryParam("sign")
        @NotNull
        String sign, Supplier entity)
        throws Exception
    ;

    /**
     * 供应商注销服务
     * 
     * 
     * @param supplierId
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
    @Path("{supplier_id}/unregister")
    @Consumes("application/json")
    @Produces({
        "application/json"
    })
    SuppliersResource.PatchSuppliersBySupplierIdUnregisterResponse patchSuppliersBySupplierIdUnregister(
        @PathParam("supplier_id")
        @NotNull
        String supplierId,
        @HeaderParam("x-la-format")
        @NotNull
        SuppliersResource.XLaFormat xLaFormat,
        @HeaderParam("x-la-sign-method")
        @NotNull
        SuppliersResource.XLaSignMethod xLaSignMethod,
        @QueryParam("sign")
        @NotNull
        String sign, Supplier entity)
        throws Exception
    ;

    /**
     * 供应商合同查询服务
     * 
     * 
     * @param supplierId
     *     
     */
    @GET
    @Path("{supplier_id}/contracts")
    SuppliersResource.GetSuppliersBySupplierIdContractsResponse getSuppliersBySupplierIdContracts(
        @PathParam("supplier_id")
        @NotNull
        String supplierId)
        throws Exception
    ;

    /**
     * 供应商合同信息查询服务
     * 
     * 
     * @param supplierId
     *     
     * @param contractType
     *     
     */
    @GET
    @Path("{supplier_id}/contracts/{contract_type}")
    SuppliersResource.GetSuppliersBySupplierIdContractsByContractTypeResponse getSuppliersBySupplierIdContractsByContractType(
        @PathParam("contract_type")
        @NotNull
        String contractType,
        @PathParam("supplier_id")
        @NotNull
        String supplierId)
        throws Exception
    ;

    public class GetSuppliersByFieldSelectorsResponse
        extends com.lastartupsaas.service.api.resource.support.ResponseWrapper
    {


        private GetSuppliersByFieldSelectorsResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         * 
         * 
         * @param entity
         *     
         */
        public static SuppliersResource.GetSuppliersByFieldSelectorsResponse withJsonOK(Suppliers entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new SuppliersResource.GetSuppliersByFieldSelectorsResponse(responseBuilder.build());
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
        public static SuppliersResource.GetSuppliersByFieldSelectorsResponse withJsonBadRequest(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new SuppliersResource.GetSuppliersByFieldSelectorsResponse(responseBuilder.build());
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
        public static SuppliersResource.GetSuppliersByFieldSelectorsResponse withJsonForbidden(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new SuppliersResource.GetSuppliersByFieldSelectorsResponse(responseBuilder.build());
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
        public static SuppliersResource.GetSuppliersByFieldSelectorsResponse withJsonNotFound(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new SuppliersResource.GetSuppliersByFieldSelectorsResponse(responseBuilder.build());
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
        public static SuppliersResource.GetSuppliersByFieldSelectorsResponse withJsonInternalServerError(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new SuppliersResource.GetSuppliersByFieldSelectorsResponse(responseBuilder.build());
        }

    }

    public class GetSuppliersBySupplierIdContractsByContractTypeResponse
        extends com.lastartupsaas.service.api.resource.support.ResponseWrapper
    {


        private GetSuppliersBySupplierIdContractsByContractTypeResponse(Response delegate) {
            super(delegate);
        }

    }

    public class GetSuppliersBySupplierIdContractsResponse
        extends com.lastartupsaas.service.api.resource.support.ResponseWrapper
    {


        private GetSuppliersBySupplierIdContractsResponse(Response delegate) {
            super(delegate);
        }

    }

    public class GetSuppliersBySupplierIdResponse
        extends com.lastartupsaas.service.api.resource.support.ResponseWrapper
    {


        private GetSuppliersBySupplierIdResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         * 
         * 
         * @param entity
         *     
         */
        public static SuppliersResource.GetSuppliersBySupplierIdResponse withJsonOK(Supplier entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new SuppliersResource.GetSuppliersBySupplierIdResponse(responseBuilder.build());
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
        public static SuppliersResource.GetSuppliersBySupplierIdResponse withJsonBadRequest(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new SuppliersResource.GetSuppliersBySupplierIdResponse(responseBuilder.build());
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
        public static SuppliersResource.GetSuppliersBySupplierIdResponse withJsonForbidden(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new SuppliersResource.GetSuppliersBySupplierIdResponse(responseBuilder.build());
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
        public static SuppliersResource.GetSuppliersBySupplierIdResponse withJsonNotFound(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new SuppliersResource.GetSuppliersBySupplierIdResponse(responseBuilder.build());
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
        public static SuppliersResource.GetSuppliersBySupplierIdResponse withJsonInternalServerError(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new SuppliersResource.GetSuppliersBySupplierIdResponse(responseBuilder.build());
        }

    }

    public class GetSuppliersResponse
        extends com.lastartupsaas.service.api.resource.support.ResponseWrapper
    {


        private GetSuppliersResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         * 
         * 
         * @param entity
         *     
         */
        public static SuppliersResource.GetSuppliersResponse withJsonOK(Suppliers entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new SuppliersResource.GetSuppliersResponse(responseBuilder.build());
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
        public static SuppliersResource.GetSuppliersResponse withJsonBadRequest(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new SuppliersResource.GetSuppliersResponse(responseBuilder.build());
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
        public static SuppliersResource.GetSuppliersResponse withJsonForbidden(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new SuppliersResource.GetSuppliersResponse(responseBuilder.build());
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
        public static SuppliersResource.GetSuppliersResponse withJsonNotFound(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new SuppliersResource.GetSuppliersResponse(responseBuilder.build());
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
        public static SuppliersResource.GetSuppliersResponse withJsonInternalServerError(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new SuppliersResource.GetSuppliersResponse(responseBuilder.build());
        }

    }

    public class PatchSuppliersBySupplierIdResponse
        extends com.lastartupsaas.service.api.resource.support.ResponseWrapper
    {


        private PatchSuppliersBySupplierIdResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         * 
         * 
         * @param entity
         *     
         */
        public static SuppliersResource.PatchSuppliersBySupplierIdResponse withJsonOK(Supplier entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new SuppliersResource.PatchSuppliersBySupplierIdResponse(responseBuilder.build());
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
        public static SuppliersResource.PatchSuppliersBySupplierIdResponse withJsonBadRequest(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new SuppliersResource.PatchSuppliersBySupplierIdResponse(responseBuilder.build());
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
        public static SuppliersResource.PatchSuppliersBySupplierIdResponse withJsonForbidden(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new SuppliersResource.PatchSuppliersBySupplierIdResponse(responseBuilder.build());
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
        public static SuppliersResource.PatchSuppliersBySupplierIdResponse withJsonNotFound(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new SuppliersResource.PatchSuppliersBySupplierIdResponse(responseBuilder.build());
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
        public static SuppliersResource.PatchSuppliersBySupplierIdResponse withJsonInternalServerError(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new SuppliersResource.PatchSuppliersBySupplierIdResponse(responseBuilder.build());
        }

    }

    public class PatchSuppliersBySupplierIdUnregisterResponse
        extends com.lastartupsaas.service.api.resource.support.ResponseWrapper
    {


        private PatchSuppliersBySupplierIdUnregisterResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         * 
         * 
         * @param entity
         *     
         */
        public static SuppliersResource.PatchSuppliersBySupplierIdUnregisterResponse withJsonOK(Supplier entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new SuppliersResource.PatchSuppliersBySupplierIdUnregisterResponse(responseBuilder.build());
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
        public static SuppliersResource.PatchSuppliersBySupplierIdUnregisterResponse withJsonBadRequest(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new SuppliersResource.PatchSuppliersBySupplierIdUnregisterResponse(responseBuilder.build());
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
        public static SuppliersResource.PatchSuppliersBySupplierIdUnregisterResponse withJsonForbidden(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new SuppliersResource.PatchSuppliersBySupplierIdUnregisterResponse(responseBuilder.build());
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
        public static SuppliersResource.PatchSuppliersBySupplierIdUnregisterResponse withJsonNotFound(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new SuppliersResource.PatchSuppliersBySupplierIdUnregisterResponse(responseBuilder.build());
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
        public static SuppliersResource.PatchSuppliersBySupplierIdUnregisterResponse withJsonInternalServerError(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new SuppliersResource.PatchSuppliersBySupplierIdUnregisterResponse(responseBuilder.build());
        }

    }

    public class PostSuppliersRegisterResponse
        extends com.lastartupsaas.service.api.resource.support.ResponseWrapper
    {


        private PostSuppliersRegisterResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         * 
         * 
         * @param entity
         *     
         */
        public static SuppliersResource.PostSuppliersRegisterResponse withJsonOK(Supplier entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new SuppliersResource.PostSuppliersRegisterResponse(responseBuilder.build());
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
        public static SuppliersResource.PostSuppliersRegisterResponse withJsonBadRequest(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new SuppliersResource.PostSuppliersRegisterResponse(responseBuilder.build());
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
        public static SuppliersResource.PostSuppliersRegisterResponse withJsonForbidden(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new SuppliersResource.PostSuppliersRegisterResponse(responseBuilder.build());
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
        public static SuppliersResource.PostSuppliersRegisterResponse withJsonNotFound(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new SuppliersResource.PostSuppliersRegisterResponse(responseBuilder.build());
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
        public static SuppliersResource.PostSuppliersRegisterResponse withJsonInternalServerError(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new SuppliersResource.PostSuppliersRegisterResponse(responseBuilder.build());
        }

    }

    public enum XLaFormat {

        json;

    }

    public enum XLaSignMethod {

        MD5;

    }

}
