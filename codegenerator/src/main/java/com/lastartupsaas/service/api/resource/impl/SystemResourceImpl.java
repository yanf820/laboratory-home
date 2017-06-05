
package com.lastartupsaas.service.api.resource.impl;

import javax.validation.constraints.NotNull;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.QueryParam;
import com.lastartupsaas.service.api.model.SysGroup;
import com.lastartupsaas.service.api.model.SysResource;
import com.lastartupsaas.service.api.model.SysRole;
import com.lastartupsaas.service.api.resource.SystemResource;

public class SystemResourceImpl
    implements SystemResource
{


    @Override
    public SystemResource.GetSystemAclResourcesByFieldSelectorsResponse getSystemAclResourcesByFieldSelectors(String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        SystemResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        SystemResource.XLaSignMethod var2,
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
        SystemResource.GetSystemAclResourcesByFieldSelectorsResponse result;
        return GetSystemAclResourcesByFieldSelectorsResponse.withJsonOK(null);
    }

    @Override
    public SystemResource.GetSystemAclResourcesByResourceIdResponse getSystemAclResourcesByResourceId(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        SystemResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        SystemResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        SystemResource.GetSystemAclResourcesByResourceIdResponse result;
        return GetSystemAclResourcesByResourceIdResponse.withJsonOK(null);
    }

    @Override
    public SystemResource.PatchSystemAclResourcesByResourceIdResponse patchSystemAclResourcesByResourceId(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        SystemResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        SystemResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3, SysResource var4)
        throws Exception
    {
        System.out.println("HelloWorld!");
        SystemResource.PatchSystemAclResourcesByResourceIdResponse result;
        return PatchSystemAclResourcesByResourceIdResponse.withJsonOK(null);
    }

    @Override
    public SystemResource.PostSystemAclResourcesResponse postSystemAclResources(
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        SystemResource.XLaFormat var0,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        SystemResource.XLaSignMethod var1,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var2, SysResource var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        SystemResource.PostSystemAclResourcesResponse result;
        return PostSystemAclResourcesResponse.withJsonOK(null);
    }

    @Override
    public SystemResource.GetSystemAclResourcesResponse getSystemAclResources(
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        SystemResource.XLaFormat var0,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        SystemResource.XLaSignMethod var1,
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
        SystemResource.GetSystemAclResourcesResponse result;
        return GetSystemAclResourcesResponse.withJsonOK(null);
    }

    @Override
    public SystemResource.GetSystemAclRolesByRoleIdResponse getSystemAclRolesByRoleId(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        SystemResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        SystemResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        SystemResource.GetSystemAclRolesByRoleIdResponse result;
        return GetSystemAclRolesByRoleIdResponse.withJsonOK(null);
    }

    @Override
    public SystemResource.GetSystemAclGroupResponse getSystemAclGroup(
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        SystemResource.XLaFormat var0,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        SystemResource.XLaSignMethod var1,
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
        SystemResource.GetSystemAclGroupResponse result;
        return GetSystemAclGroupResponse.withJsonOK(null);
    }

    @Override
    public SystemResource.PatchSystemAclGroupByGroupIdResponse patchSystemAclGroupByGroupId(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        SystemResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        SystemResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3, SysGroup var4)
        throws Exception
    {
        System.out.println("HelloWorld!");
        SystemResource.PatchSystemAclGroupByGroupIdResponse result;
        return PatchSystemAclGroupByGroupIdResponse.withJsonOK(null);
    }

    @Override
    public SystemResource.PatchSystemAclRolesByRoleIdResponse patchSystemAclRolesByRoleId(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        SystemResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        SystemResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3, SysRole var4)
        throws Exception
    {
        System.out.println("HelloWorld!");
        SystemResource.PatchSystemAclRolesByRoleIdResponse result;
        return PatchSystemAclRolesByRoleIdResponse.withJsonOK(null);
    }

    @Override
    public SystemResource.PostSystemAclGroupResponse postSystemAclGroup(
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        SystemResource.XLaFormat var0,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        SystemResource.XLaSignMethod var1,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var2, SysGroup var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        SystemResource.PostSystemAclGroupResponse result;
        return PostSystemAclGroupResponse.withJsonOK(null);
    }

    @Override
    public SystemResource.GetSystemAclGroupByGroupIdResponse getSystemAclGroupByGroupId(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        SystemResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        SystemResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        SystemResource.GetSystemAclGroupByGroupIdResponse result;
        return GetSystemAclGroupByGroupIdResponse.withJsonOK(null);
    }

    @Override
    public SystemResource.GetSystemAclRolesResponse getSystemAclRoles(
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        SystemResource.XLaFormat var0,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        SystemResource.XLaSignMethod var1,
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
        SystemResource.GetSystemAclRolesResponse result;
        return GetSystemAclRolesResponse.withJsonOK(null);
    }

    @Override
    public SystemResource.PostSystemAclRolesResponse postSystemAclRoles(
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        SystemResource.XLaFormat var0,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        SystemResource.XLaSignMethod var1,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var2, SysRole var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        SystemResource.PostSystemAclRolesResponse result;
        return PostSystemAclRolesResponse.withJsonOK(null);
    }

}
