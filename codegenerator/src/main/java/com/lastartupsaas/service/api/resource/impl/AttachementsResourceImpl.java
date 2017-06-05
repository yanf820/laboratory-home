
package com.lastartupsaas.service.api.resource.impl;

import javax.validation.constraints.NotNull;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.QueryParam;
import com.lastartupsaas.service.api.model.Attachment;
import com.lastartupsaas.service.api.resource.AttachementsResource;

public class AttachementsResourceImpl
    implements AttachementsResource
{


    @Override
    public AttachementsResource.PostAttachementsResponse postAttachements(
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        AttachementsResource.XLaFormat var0,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        AttachementsResource.XLaSignMethod var1,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var2, Attachment var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        AttachementsResource.PostAttachementsResponse result;
        return PostAttachementsResponse.withJsonOK(null);
    }

    @Override
    public AttachementsResource.PatchAttachementsByAttachmentIdResponse patchAttachementsByAttachmentId(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        AttachementsResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        AttachementsResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3, Attachment var4)
        throws Exception
    {
        System.out.println("HelloWorld!");
        AttachementsResource.PatchAttachementsByAttachmentIdResponse result;
        return PatchAttachementsByAttachmentIdResponse.withJsonOK(null);
    }

    @Override
    public AttachementsResource.GetAttachementsByAttachmentIdResponse getAttachementsByAttachmentId(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        AttachementsResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        AttachementsResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        AttachementsResource.GetAttachementsByAttachmentIdResponse result;
        return GetAttachementsByAttachmentIdResponse.withJsonOK(null);
    }

    @Override
    public AttachementsResource.DeleteAttachementsByAttachmentIdResponse deleteAttachementsByAttachmentId(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        AttachementsResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        AttachementsResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        AttachementsResource.DeleteAttachementsByAttachmentIdResponse result;
        return DeleteAttachementsByAttachmentIdResponse.withJsonOK(null);
    }

}
