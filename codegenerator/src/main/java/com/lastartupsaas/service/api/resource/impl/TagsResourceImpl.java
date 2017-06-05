
package com.lastartupsaas.service.api.resource.impl;

import javax.validation.constraints.NotNull;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.QueryParam;
import com.lastartupsaas.service.api.model.Tag;
import com.lastartupsaas.service.api.resource.TagsResource;

public class TagsResourceImpl
    implements TagsResource
{


    @Override
    public TagsResource.PatchTagsByTagIdResponse patchTagsByTagId(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        TagsResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        TagsResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3, Tag var4)
        throws Exception
    {
        System.out.println("HelloWorld!");
        TagsResource.PatchTagsByTagIdResponse result;
        return PatchTagsByTagIdResponse.withJsonOK(null);
    }

    @Override
    public TagsResource.PostTagsResponse postTags(
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        TagsResource.XLaFormat var0,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        TagsResource.XLaSignMethod var1,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var2, Tag var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        TagsResource.PostTagsResponse result;
        return PostTagsResponse.withJsonOK(null);
    }

    @Override
    public TagsResource.GetTagsMatchResponse getTagsMatch(
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        TagsResource.XLaFormat var0,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        TagsResource.XLaSignMethod var1,
        @QueryParam("tagType")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var2,
        @QueryParam("tagValue")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var4)
        throws Exception
    {
        System.out.println("HelloWorld!");
        TagsResource.GetTagsMatchResponse result;
        return GetTagsMatchResponse.withJsonOK(null);
    }

    @Override
    public TagsResource.GetTagsByTagIdResponse getTagsByTagId(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        TagsResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        TagsResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        TagsResource.GetTagsByTagIdResponse result;
        return GetTagsByTagIdResponse.withJsonOK(null);
    }

    @Override
    public TagsResource.DeleteTagsByTagIdResponse deleteTagsByTagId(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        TagsResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        TagsResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        TagsResource.DeleteTagsByTagIdResponse result;
        return DeleteTagsByTagIdResponse.withJsonOK(null);
    }

}
