
package com.lastartupsaas.service.api.resource.impl;

import javax.validation.constraints.NotNull;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.QueryParam;
import com.lastartupsaas.service.api.model.User;
import com.lastartupsaas.service.api.resource.UsersResource;

public class UsersResourceImpl
    implements UsersResource
{


    @Override
    public UsersResource.PatchUsersByUserTypeByUserIdUnregisterResponse patchUsersByUserTypeByUserIdUnregister(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        UsersResource.UserType var1,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        UsersResource.XLaFormat var2,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        UsersResource.XLaSignMethod var3,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var4)
        throws Exception
    {
        System.out.println("HelloWorld!");
        UsersResource.PatchUsersByUserTypeByUserIdUnregisterResponse result;
        return PatchUsersByUserTypeByUserIdUnregisterResponse.withJsonOK(null);
    }

    @Override
    public UsersResource.GetUsersByUserTypeByFieldSelectorsResponse getUsersByUserTypeByFieldSelectors(String var0,
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        UsersResource.UserType var1,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        UsersResource.XLaFormat var2,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        UsersResource.XLaSignMethod var3,
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
        UsersResource.GetUsersByUserTypeByFieldSelectorsResponse result;
        return GetUsersByUserTypeByFieldSelectorsResponse.withJsonOK(null);
    }

    @Override
    public UsersResource.GetUsersByUserTypeByUserIdResponse getUsersByUserTypeByUserId(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        UsersResource.UserType var1,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        UsersResource.XLaFormat var2,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        UsersResource.XLaSignMethod var3,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var4)
        throws Exception
    {
        System.out.println("HelloWorld!");
        UsersResource.GetUsersByUserTypeByUserIdResponse result;
        return GetUsersByUserTypeByUserIdResponse.withJsonOK(null);
    }

    @Override
    public UsersResource.GetUsersByUserTypeResponse getUsersByUserType(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        UsersResource.UserType var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        UsersResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        UsersResource.XLaSignMethod var2,
        @QueryParam("nickName")
        String var3,
        @QueryParam("email")
        String var4,
        @QueryParam("phone")
        String var5,
        @QueryParam("status")
        @DefaultValue("registered")
        UsersResource.Status var6,
        @QueryParam("creationTime")
        String var7,
        @QueryParam("extensionAttr")
        String var8,
        @QueryParam("sortField")
        @DefaultValue("id")
        String var9,
        @QueryParam("sort")
        @DefaultValue("asc")
        UsersResource.Sort var10,
        @QueryParam("count")
        @DefaultValue("10")
        int var11,
        @QueryParam("start")
        @DefaultValue("0")
        int var12,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var13)
        throws Exception
    {
        System.out.println("HelloWorld!");
        UsersResource.GetUsersByUserTypeResponse result;
        return GetUsersByUserTypeResponse.withJsonOK(null);
    }

    @Override
    public UsersResource.PostUsersByUserTypeRegisterResponse postUsersByUserTypeRegister(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        UsersResource.UserType var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        UsersResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        UsersResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3, User var4)
        throws Exception
    {
        System.out.println("HelloWorld!");
        UsersResource.PostUsersByUserTypeRegisterResponse result;
        return PostUsersByUserTypeRegisterResponse.withJsonOK(null);
    }

    @Override
    public UsersResource.PatchUsersByUserTypeByUserIdEditResponse patchUsersByUserTypeByUserIdEdit(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        UsersResource.UserType var1,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        UsersResource.XLaFormat var2,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        UsersResource.XLaSignMethod var3,
        @QueryParam("nickName")
        String var4,
        @QueryParam("headImg")
        String var5,
        @QueryParam("email")
        String var6,
        @QueryParam("phone")
        String var7,
        @QueryParam("extensionAttr")
        String var8,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var9)
        throws Exception
    {
        System.out.println("HelloWorld!");
        UsersResource.PatchUsersByUserTypeByUserIdEditResponse result;
        return PatchUsersByUserTypeByUserIdEditResponse.withJsonOK(null);
    }

}
