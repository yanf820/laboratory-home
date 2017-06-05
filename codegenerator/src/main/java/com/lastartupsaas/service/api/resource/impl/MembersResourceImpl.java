
package com.lastartupsaas.service.api.resource.impl;

import javax.validation.constraints.NotNull;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.QueryParam;
import com.lastartupsaas.service.api.model.Member;
import com.lastartupsaas.service.api.resource.MembersResource;

public class MembersResourceImpl
    implements MembersResource
{


    @Override
    public MembersResource.GetMembersByFieldSelectorsResponse getMembersByFieldSelectors(String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        MembersResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        MembersResource.XLaSignMethod var2,
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
        MembersResource.GetMembersByFieldSelectorsResponse result;
        return GetMembersByFieldSelectorsResponse.withJsonOK(null);
    }

    @Override
    public MembersResource.PostMembersRegisterResponse postMembersRegister(
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        MembersResource.XLaFormat var0,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        MembersResource.XLaSignMethod var1,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var2, Member var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        MembersResource.PostMembersRegisterResponse result;
        return PostMembersRegisterResponse.withJsonOK(null);
    }

    @Override
    public MembersResource.GetMembersAuthenticateResponse getMembersAuthenticate(
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        MembersResource.XLaFormat var0,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        MembersResource.XLaSignMethod var1,
        @QueryParam("authType")
        String var2,
        @QueryParam("authParam")
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
        MembersResource.GetMembersAuthenticateResponse result;
        return GetMembersAuthenticateResponse.withJsonOK(null);
    }

    @Override
    public MembersResource.PatchMembersByMemberIdResponse patchMembersByMemberId(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        MembersResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        MembersResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3, Member var4)
        throws Exception
    {
        System.out.println("HelloWorld!");
        MembersResource.PatchMembersByMemberIdResponse result;
        return PatchMembersByMemberIdResponse.withJsonOK(null);
    }

    @Override
    public MembersResource.GetMembersByMemberIdResponse getMembersByMemberId(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        MembersResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        MembersResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        MembersResource.GetMembersByMemberIdResponse result;
        return GetMembersByMemberIdResponse.withJsonOK(null);
    }

    @Override
    public MembersResource.PatchMembersByMemberIdUnregisterResponse patchMembersByMemberIdUnregister(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        MembersResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        MembersResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3, Member var4)
        throws Exception
    {
        System.out.println("HelloWorld!");
        MembersResource.PatchMembersByMemberIdUnregisterResponse result;
        return PatchMembersByMemberIdUnregisterResponse.withJsonOK(null);
    }

}
