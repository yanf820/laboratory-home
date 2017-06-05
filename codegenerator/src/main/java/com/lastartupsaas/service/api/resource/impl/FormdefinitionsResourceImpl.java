
package com.lastartupsaas.service.api.resource.impl;

import javax.validation.constraints.NotNull;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.QueryParam;
import com.lastartupsaas.service.api.model.FormDefinition;
import com.lastartupsaas.service.api.resource.FormdefinitionsResource;

public class FormdefinitionsResourceImpl
    implements FormdefinitionsResource
{


    @Override
    public FormdefinitionsResource.DeleteFormdefinitionsByFormTypeItemsResponse deleteFormdefinitionsByFormTypeItems(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        FormdefinitionsResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        FormdefinitionsResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        FormdefinitionsResource.DeleteFormdefinitionsByFormTypeItemsResponse result;
        return DeleteFormdefinitionsByFormTypeItemsResponse.withJsonOK(null);
    }

    @Override
    public FormdefinitionsResource.PatchFormdefinitionsByFormTypePublishResponse patchFormdefinitionsByFormTypePublish(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        FormdefinitionsResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        FormdefinitionsResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        FormdefinitionsResource.PatchFormdefinitionsByFormTypePublishResponse result;
        return PatchFormdefinitionsByFormTypePublishResponse.withJsonOK(null);
    }

    @Override
    public FormdefinitionsResource.GetFormdefinitionsByFormTypeItemsResponse getFormdefinitionsByFormTypeItems(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        FormdefinitionsResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        FormdefinitionsResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        FormdefinitionsResource.GetFormdefinitionsByFormTypeItemsResponse result;
        return GetFormdefinitionsByFormTypeItemsResponse.withJsonOK(null);
    }

    @Override
    public FormdefinitionsResource.GetFormdefinitionsByFieldSelectorsResponse getFormdefinitionsByFieldSelectors(String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        FormdefinitionsResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        FormdefinitionsResource.XLaSignMethod var2,
        @QueryParam("filter")
        String var3,
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
        FormdefinitionsResource.GetFormdefinitionsByFieldSelectorsResponse result;
        return GetFormdefinitionsByFieldSelectorsResponse.withJsonOK(null);
    }

    @Override
    public FormdefinitionsResource.PostFormdefinitionsByFormTypeItemsResponse postFormdefinitionsByFormTypeItems(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        FormdefinitionsResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        FormdefinitionsResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        FormdefinitionsResource.PostFormdefinitionsByFormTypeItemsResponse result;
        return PostFormdefinitionsByFormTypeItemsResponse.withJsonOK(null);
    }

    @Override
    public FormdefinitionsResource.GetFormdefinitionsResponse getFormdefinitions(
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        FormdefinitionsResource.XLaFormat var0,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        FormdefinitionsResource.XLaSignMethod var1,
        @QueryParam("count")
        @DefaultValue("10")
        int var2,
        @QueryParam("start")
        @DefaultValue("0")
        int var3,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var4)
        throws Exception
    {
        System.out.println("HelloWorld!");
        FormdefinitionsResource.GetFormdefinitionsResponse result;
        return GetFormdefinitionsResponse.withJsonOK(null);
    }

    @Override
    public FormdefinitionsResource.PostFormdefinitionsResponse postFormdefinitions(
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        FormdefinitionsResource.XLaFormat var0,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        FormdefinitionsResource.XLaSignMethod var1,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var2, FormDefinition var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        FormdefinitionsResource.PostFormdefinitionsResponse result;
        return PostFormdefinitionsResponse.withJsonOK(null);
    }

}
