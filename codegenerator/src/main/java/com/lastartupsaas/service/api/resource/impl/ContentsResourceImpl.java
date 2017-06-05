
package com.lastartupsaas.service.api.resource.impl;

import javax.validation.constraints.NotNull;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.QueryParam;
import com.lastartupsaas.service.api.model.Content;
import com.lastartupsaas.service.api.resource.ContentsResource;

public class ContentsResourceImpl
    implements ContentsResource
{


    @Override
    public ContentsResource.GetContentsByContentTypeResponse getContentsByContentType(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        ContentsResource.ContentType var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        ContentsResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        ContentsResource.XLaSignMethod var2,
        @QueryParam("status")
        @DefaultValue("created")
        ContentsResource.Status var3,
        @QueryParam("contributeType")
        String var4,
        @QueryParam("contributeId")
        String var5,
        @QueryParam("contentKeywords")
        String var6,
        @QueryParam("creationTime")
        String var7,
        @QueryParam("publishedTime")
        String var8,
        @QueryParam("extensionAttr")
        String var9,
        @QueryParam("sortField")
        @DefaultValue("id")
        String var10,
        @QueryParam("sort")
        @DefaultValue("asc")
        ContentsResource.Sort var11,
        @QueryParam("count")
        @DefaultValue("10")
        int var12,
        @QueryParam("start")
        @DefaultValue("0")
        int var13,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var14)
        throws Exception
    {
        System.out.println("HelloWorld!");
        ContentsResource.GetContentsByContentTypeResponse result;
        return GetContentsByContentTypeResponse.withJsonOK(null);
    }

    @Override
    public ContentsResource.PostContentsByContentTypeResponse postContentsByContentType(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        ContentsResource.ContentType var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        ContentsResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        ContentsResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3, Content var4)
        throws Exception
    {
        System.out.println("HelloWorld!");
        ContentsResource.PostContentsByContentTypeResponse result;
        return PostContentsByContentTypeResponse.withJsonOK(null);
    }

    @Override
    public ContentsResource.GetContentsByContentTypeByContentIdResponse getContentsByContentTypeByContentId(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        ContentsResource.ContentType var1,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        ContentsResource.XLaFormat var2,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        ContentsResource.XLaSignMethod var3,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var4)
        throws Exception
    {
        System.out.println("HelloWorld!");
        ContentsResource.GetContentsByContentTypeByContentIdResponse result;
        return GetContentsByContentTypeByContentIdResponse.withJsonOK(null);
    }

    @Override
    public ContentsResource.DeleteContentsByContentTypeByContentIdResponse deleteContentsByContentTypeByContentId(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        ContentsResource.ContentType var1,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        ContentsResource.XLaFormat var2,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        ContentsResource.XLaSignMethod var3,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var4)
        throws Exception
    {
        System.out.println("HelloWorld!");
        ContentsResource.DeleteContentsByContentTypeByContentIdResponse result;
        return DeleteContentsByContentTypeByContentIdResponse.withJsonOK(null);
    }

    @Override
    public ContentsResource.GetContentsByContentTypeByFieldSelectorsResponse getContentsByContentTypeByFieldSelectors(String var0,
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        ContentsResource.ContentType var1,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        ContentsResource.XLaFormat var2,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        ContentsResource.XLaSignMethod var3,
        @QueryParam("count")
        @DefaultValue("10")
        int var4,
        @QueryParam("start")
        @DefaultValue("0")
        int var5,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var6)
        throws Exception
    {
        System.out.println("HelloWorld!");
        ContentsResource.GetContentsByContentTypeByFieldSelectorsResponse result;
        return GetContentsByContentTypeByFieldSelectorsResponse.withJsonOK(null);
    }

    @Override
    public ContentsResource.PatchContentsByContentTypeByContentIdEditResponse patchContentsByContentTypeByContentIdEdit(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        ContentsResource.ContentType var1,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        ContentsResource.XLaFormat var2,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        ContentsResource.XLaSignMethod var3,
        @QueryParam("contentTitle")
        String var4,
        @QueryParam("contentValue")
        String var5,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var6)
        throws Exception
    {
        System.out.println("HelloWorld!");
        ContentsResource.PatchContentsByContentTypeByContentIdEditResponse result;
        return PatchContentsByContentTypeByContentIdEditResponse.withJsonOK(null);
    }

    @Override
    public ContentsResource.PatchContentsByContentTypeByContentIdPublishResponse patchContentsByContentTypeByContentIdPublish(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        ContentsResource.ContentType var1,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        ContentsResource.XLaFormat var2,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        ContentsResource.XLaSignMethod var3,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var4)
        throws Exception
    {
        System.out.println("HelloWorld!");
        ContentsResource.PatchContentsByContentTypeByContentIdPublishResponse result;
        return PatchContentsByContentTypeByContentIdPublishResponse.withJsonOK(null);
    }

}
