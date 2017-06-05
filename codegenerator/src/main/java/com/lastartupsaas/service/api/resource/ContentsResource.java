
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
import com.lastartupsaas.service.api.model.Content;
import com.lastartupsaas.service.api.model.Contents;
import com.lastartupsaas.service.api.model.Error;
import com.lastartupsaas.service.api.resource.support.PATCH;


/**
 * 内容服务
 * 
 * 
 */
@Path("contents")
public interface ContentsResource {


    /**
     * 内容查询服务
     * 
     * 
     * @param contributeType
     *     
     * @param creationTime
     *     
     * @param contentKeywords
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
     * @param contributeId
     *     
     * @param sort
     *     
     * @param publishedTime
     *     
     * @param extensionAttr
     *      e.g. a:A,b:B,c:C
     * @param sortField
     *     
     * @param contentType
     *     
     * @param status
     *     
     */
    @GET
    @Path("{contentType}")
    @Produces({
        "application/json"
    })
    ContentsResource.GetContentsByContentTypeResponse getContentsByContentType(
        @PathParam("contentType")
        @NotNull
        ContentsResource.ContentType contentType,
        @HeaderParam("x-la-format")
        @NotNull
        ContentsResource.XLaFormat xLaFormat,
        @HeaderParam("x-la-sign-method")
        @NotNull
        ContentsResource.XLaSignMethod xLaSignMethod,
        @QueryParam("status")
        @DefaultValue("created")
        ContentsResource.Status status,
        @QueryParam("contributeType")
        String contributeType,
        @QueryParam("contributeId")
        String contributeId,
        @QueryParam("contentKeywords")
        String contentKeywords,
        @QueryParam("creationTime")
        String creationTime,
        @QueryParam("publishedTime")
        String publishedTime,
        @QueryParam("extensionAttr")
        String extensionAttr,
        @QueryParam("sortField")
        @DefaultValue("id")
        String sortField,
        @QueryParam("sort")
        @DefaultValue("asc")
        ContentsResource.Sort sort,
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
     * 内容创建服务
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
     * @param contentType
     *     
     * @param entity
     *     
     */
    @POST
    @Path("{contentType}")
    @Consumes("application/json")
    @Produces({
        "application/json"
    })
    ContentsResource.PostContentsByContentTypeResponse postContentsByContentType(
        @PathParam("contentType")
        @NotNull
        ContentsResource.ContentType contentType,
        @HeaderParam("x-la-format")
        @NotNull
        ContentsResource.XLaFormat xLaFormat,
        @HeaderParam("x-la-sign-method")
        @NotNull
        ContentsResource.XLaSignMethod xLaSignMethod,
        @QueryParam("sign")
        @NotNull
        String sign, Content entity)
        throws Exception
    ;

    /**
     * 内容搜索
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
     * @param contentType
     *     
     */
    @GET
    @Path("{contentType}/~{field_selectors}")
    @Produces({
        "application/json"
    })
    ContentsResource.GetContentsByContentTypeByFieldSelectorsResponse getContentsByContentTypeByFieldSelectors(
        @PathParam("field_selectors")
        String fieldSelectors,
        @PathParam("contentType")
        @NotNull
        ContentsResource.ContentType contentType,
        @HeaderParam("x-la-format")
        @NotNull
        ContentsResource.XLaFormat xLaFormat,
        @HeaderParam("x-la-sign-method")
        @NotNull
        ContentsResource.XLaSignMethod xLaSignMethod,
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
     * 内容详情查询服务
     * 
     * 
     * @param contentId
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
     * @param contentType
     *     
     */
    @GET
    @Path("{contentType}/{content_id}")
    @Produces({
        "application/json"
    })
    ContentsResource.GetContentsByContentTypeByContentIdResponse getContentsByContentTypeByContentId(
        @PathParam("content_id")
        @NotNull
        String contentId,
        @PathParam("contentType")
        @NotNull
        ContentsResource.ContentType contentType,
        @HeaderParam("x-la-format")
        @NotNull
        ContentsResource.XLaFormat xLaFormat,
        @HeaderParam("x-la-sign-method")
        @NotNull
        ContentsResource.XLaSignMethod xLaSignMethod,
        @QueryParam("sign")
        @NotNull
        String sign)
        throws Exception
    ;

    /**
     * 内容删除服务
     * 
     * 
     * @param contentId
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
     * @param contentType
     *     
     */
    @DELETE
    @Path("{contentType}/{content_id}")
    @Produces({
        "application/json"
    })
    ContentsResource.DeleteContentsByContentTypeByContentIdResponse deleteContentsByContentTypeByContentId(
        @PathParam("content_id")
        @NotNull
        String contentId,
        @PathParam("contentType")
        @NotNull
        ContentsResource.ContentType contentType,
        @HeaderParam("x-la-format")
        @NotNull
        ContentsResource.XLaFormat xLaFormat,
        @HeaderParam("x-la-sign-method")
        @NotNull
        ContentsResource.XLaSignMethod xLaSignMethod,
        @QueryParam("sign")
        @NotNull
        String sign)
        throws Exception
    ;

    /**
     * 
     * @param contentValue
     *     
     * @param contentId
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
     * @param contentTitle
     *     
     * @param contentType
     *     
     */
    @PATCH
    @Path("{contentType}/{content_id}/edit")
    @Produces({
        "application/json"
    })
    ContentsResource.PatchContentsByContentTypeByContentIdEditResponse patchContentsByContentTypeByContentIdEdit(
        @PathParam("content_id")
        @NotNull
        String contentId,
        @PathParam("contentType")
        @NotNull
        ContentsResource.ContentType contentType,
        @HeaderParam("x-la-format")
        @NotNull
        ContentsResource.XLaFormat xLaFormat,
        @HeaderParam("x-la-sign-method")
        @NotNull
        ContentsResource.XLaSignMethod xLaSignMethod,
        @QueryParam("contentTitle")
        String contentTitle,
        @QueryParam("contentValue")
        String contentValue,
        @QueryParam("sign")
        @NotNull
        String sign)
        throws Exception
    ;

    /**
     * 内容发布服务
     * 
     * 
     * @param contentId
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
     * @param contentType
     *     
     */
    @PATCH
    @Path("{contentType}/{content_id}/publish")
    @Produces({
        "application/json"
    })
    ContentsResource.PatchContentsByContentTypeByContentIdPublishResponse patchContentsByContentTypeByContentIdPublish(
        @PathParam("content_id")
        @NotNull
        String contentId,
        @PathParam("contentType")
        @NotNull
        ContentsResource.ContentType contentType,
        @HeaderParam("x-la-format")
        @NotNull
        ContentsResource.XLaFormat xLaFormat,
        @HeaderParam("x-la-sign-method")
        @NotNull
        ContentsResource.XLaSignMethod xLaSignMethod,
        @QueryParam("sign")
        @NotNull
        String sign)
        throws Exception
    ;

    public enum ContentType {

        all,
        comment,
        article,
        tweet,
        message;

    }

    public class DeleteContentsByContentTypeByContentIdResponse
        extends com.lastartupsaas.service.api.resource.support.ResponseWrapper
    {


        private DeleteContentsByContentTypeByContentIdResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         * 
         * 
         * @param entity
         *     
         */
        public static ContentsResource.DeleteContentsByContentTypeByContentIdResponse withJsonOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ContentsResource.DeleteContentsByContentTypeByContentIdResponse(responseBuilder.build());
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
        public static ContentsResource.DeleteContentsByContentTypeByContentIdResponse withJsonBadRequest(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ContentsResource.DeleteContentsByContentTypeByContentIdResponse(responseBuilder.build());
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
        public static ContentsResource.DeleteContentsByContentTypeByContentIdResponse withJsonForbidden(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ContentsResource.DeleteContentsByContentTypeByContentIdResponse(responseBuilder.build());
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
        public static ContentsResource.DeleteContentsByContentTypeByContentIdResponse withJsonNotFound(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ContentsResource.DeleteContentsByContentTypeByContentIdResponse(responseBuilder.build());
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
        public static ContentsResource.DeleteContentsByContentTypeByContentIdResponse withJsonInternalServerError(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ContentsResource.DeleteContentsByContentTypeByContentIdResponse(responseBuilder.build());
        }

    }

    public class GetContentsByContentTypeByContentIdResponse
        extends com.lastartupsaas.service.api.resource.support.ResponseWrapper
    {


        private GetContentsByContentTypeByContentIdResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         * 
         * 
         * @param entity
         *     
         */
        public static ContentsResource.GetContentsByContentTypeByContentIdResponse withJsonOK(Content entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ContentsResource.GetContentsByContentTypeByContentIdResponse(responseBuilder.build());
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
        public static ContentsResource.GetContentsByContentTypeByContentIdResponse withJsonBadRequest(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ContentsResource.GetContentsByContentTypeByContentIdResponse(responseBuilder.build());
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
        public static ContentsResource.GetContentsByContentTypeByContentIdResponse withJsonForbidden(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ContentsResource.GetContentsByContentTypeByContentIdResponse(responseBuilder.build());
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
        public static ContentsResource.GetContentsByContentTypeByContentIdResponse withJsonNotFound(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ContentsResource.GetContentsByContentTypeByContentIdResponse(responseBuilder.build());
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
        public static ContentsResource.GetContentsByContentTypeByContentIdResponse withJsonInternalServerError(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ContentsResource.GetContentsByContentTypeByContentIdResponse(responseBuilder.build());
        }

    }

    public class GetContentsByContentTypeByFieldSelectorsResponse
        extends com.lastartupsaas.service.api.resource.support.ResponseWrapper
    {


        private GetContentsByContentTypeByFieldSelectorsResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         * 
         * 
         * @param entity
         *     
         */
        public static ContentsResource.GetContentsByContentTypeByFieldSelectorsResponse withJsonOK(Contents entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ContentsResource.GetContentsByContentTypeByFieldSelectorsResponse(responseBuilder.build());
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
        public static ContentsResource.GetContentsByContentTypeByFieldSelectorsResponse withJsonBadRequest(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ContentsResource.GetContentsByContentTypeByFieldSelectorsResponse(responseBuilder.build());
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
        public static ContentsResource.GetContentsByContentTypeByFieldSelectorsResponse withJsonForbidden(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ContentsResource.GetContentsByContentTypeByFieldSelectorsResponse(responseBuilder.build());
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
        public static ContentsResource.GetContentsByContentTypeByFieldSelectorsResponse withJsonNotFound(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ContentsResource.GetContentsByContentTypeByFieldSelectorsResponse(responseBuilder.build());
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
        public static ContentsResource.GetContentsByContentTypeByFieldSelectorsResponse withJsonInternalServerError(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ContentsResource.GetContentsByContentTypeByFieldSelectorsResponse(responseBuilder.build());
        }

    }

    public class GetContentsByContentTypeResponse
        extends com.lastartupsaas.service.api.resource.support.ResponseWrapper
    {


        private GetContentsByContentTypeResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         * 
         * 
         * @param entity
         *     
         */
        public static ContentsResource.GetContentsByContentTypeResponse withJsonOK(Contents entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ContentsResource.GetContentsByContentTypeResponse(responseBuilder.build());
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
        public static ContentsResource.GetContentsByContentTypeResponse withJsonBadRequest(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ContentsResource.GetContentsByContentTypeResponse(responseBuilder.build());
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
        public static ContentsResource.GetContentsByContentTypeResponse withJsonForbidden(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ContentsResource.GetContentsByContentTypeResponse(responseBuilder.build());
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
        public static ContentsResource.GetContentsByContentTypeResponse withJsonNotFound(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ContentsResource.GetContentsByContentTypeResponse(responseBuilder.build());
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
        public static ContentsResource.GetContentsByContentTypeResponse withJsonInternalServerError(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ContentsResource.GetContentsByContentTypeResponse(responseBuilder.build());
        }

    }

    public class PatchContentsByContentTypeByContentIdEditResponse
        extends com.lastartupsaas.service.api.resource.support.ResponseWrapper
    {


        private PatchContentsByContentTypeByContentIdEditResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         * 
         * 
         * @param entity
         *     
         */
        public static ContentsResource.PatchContentsByContentTypeByContentIdEditResponse withJsonOK(Content entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ContentsResource.PatchContentsByContentTypeByContentIdEditResponse(responseBuilder.build());
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
        public static ContentsResource.PatchContentsByContentTypeByContentIdEditResponse withJsonBadRequest(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ContentsResource.PatchContentsByContentTypeByContentIdEditResponse(responseBuilder.build());
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
        public static ContentsResource.PatchContentsByContentTypeByContentIdEditResponse withJsonForbidden(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ContentsResource.PatchContentsByContentTypeByContentIdEditResponse(responseBuilder.build());
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
        public static ContentsResource.PatchContentsByContentTypeByContentIdEditResponse withJsonNotFound(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ContentsResource.PatchContentsByContentTypeByContentIdEditResponse(responseBuilder.build());
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
        public static ContentsResource.PatchContentsByContentTypeByContentIdEditResponse withJsonInternalServerError(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ContentsResource.PatchContentsByContentTypeByContentIdEditResponse(responseBuilder.build());
        }

    }

    public class PatchContentsByContentTypeByContentIdPublishResponse
        extends com.lastartupsaas.service.api.resource.support.ResponseWrapper
    {


        private PatchContentsByContentTypeByContentIdPublishResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         * 
         * 
         * @param entity
         *     
         */
        public static ContentsResource.PatchContentsByContentTypeByContentIdPublishResponse withJsonOK(Content entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ContentsResource.PatchContentsByContentTypeByContentIdPublishResponse(responseBuilder.build());
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
        public static ContentsResource.PatchContentsByContentTypeByContentIdPublishResponse withJsonBadRequest(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ContentsResource.PatchContentsByContentTypeByContentIdPublishResponse(responseBuilder.build());
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
        public static ContentsResource.PatchContentsByContentTypeByContentIdPublishResponse withJsonForbidden(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ContentsResource.PatchContentsByContentTypeByContentIdPublishResponse(responseBuilder.build());
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
        public static ContentsResource.PatchContentsByContentTypeByContentIdPublishResponse withJsonNotFound(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ContentsResource.PatchContentsByContentTypeByContentIdPublishResponse(responseBuilder.build());
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
        public static ContentsResource.PatchContentsByContentTypeByContentIdPublishResponse withJsonInternalServerError(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ContentsResource.PatchContentsByContentTypeByContentIdPublishResponse(responseBuilder.build());
        }

    }

    public class PostContentsByContentTypeResponse
        extends com.lastartupsaas.service.api.resource.support.ResponseWrapper
    {


        private PostContentsByContentTypeResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 请求成功
         * 
         * 
         * @param entity
         *     
         */
        public static ContentsResource.PostContentsByContentTypeResponse withJsonOK(Content entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ContentsResource.PostContentsByContentTypeResponse(responseBuilder.build());
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
        public static ContentsResource.PostContentsByContentTypeResponse withJsonBadRequest(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ContentsResource.PostContentsByContentTypeResponse(responseBuilder.build());
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
        public static ContentsResource.PostContentsByContentTypeResponse withJsonForbidden(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ContentsResource.PostContentsByContentTypeResponse(responseBuilder.build());
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
        public static ContentsResource.PostContentsByContentTypeResponse withJsonNotFound(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ContentsResource.PostContentsByContentTypeResponse(responseBuilder.build());
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
        public static ContentsResource.PostContentsByContentTypeResponse withJsonInternalServerError(Error entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new ContentsResource.PostContentsByContentTypeResponse(responseBuilder.build());
        }

    }

    public enum Sort {

        asc,
        desc;

    }

    public enum Status {

        created,
        published,
        archived,
        shielded,
        deleted;

    }

    public enum XLaFormat {

        json;

    }

    public enum XLaSignMethod {

        MD5;

    }

}
