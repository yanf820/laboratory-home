
package com.lastartupsaas.service.api.resource.impl;

import javax.validation.constraints.NotNull;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.QueryParam;
import com.lastartupsaas.service.api.model.Template;
import com.lastartupsaas.service.api.resource.TemplatesResource;

public class TemplatesResourceImpl
    implements TemplatesResource
{


    @Override
    public TemplatesResource.PatchTemplatesByTemplateTypeResponse patchTemplatesByTemplateType(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        TemplatesResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        TemplatesResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3, Template var4)
        throws Exception
    {
        System.out.println("HelloWorld!");
        TemplatesResource.PatchTemplatesByTemplateTypeResponse result;
        return PatchTemplatesByTemplateTypeResponse.withJsonOK(null);
    }

    @Override
    public TemplatesResource.GetTemplatesByTemplateTypeResponse getTemplatesByTemplateType(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        TemplatesResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        TemplatesResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        TemplatesResource.GetTemplatesByTemplateTypeResponse result;
        return GetTemplatesByTemplateTypeResponse.withJsonOK(null);
    }

    @Override
    public TemplatesResource.DeleteTemplatesByTemplateTypeResponse deleteTemplatesByTemplateType(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        TemplatesResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        TemplatesResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        TemplatesResource.DeleteTemplatesByTemplateTypeResponse result;
        return DeleteTemplatesByTemplateTypeResponse.withJsonOK(null);
    }

    @Override
    public TemplatesResource.PostTemplatesResponse postTemplates(
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        TemplatesResource.XLaFormat var0,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        TemplatesResource.XLaSignMethod var1,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var2, Template var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        TemplatesResource.PostTemplatesResponse result;
        return PostTemplatesResponse.withJsonOK(null);
    }

    @Override
    public TemplatesResource.GetTemplatesResponse getTemplates(
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        TemplatesResource.XLaFormat var0,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        TemplatesResource.XLaSignMethod var1,
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
        TemplatesResource.GetTemplatesResponse result;
        return GetTemplatesResponse.withJsonOK(null);
    }

}
