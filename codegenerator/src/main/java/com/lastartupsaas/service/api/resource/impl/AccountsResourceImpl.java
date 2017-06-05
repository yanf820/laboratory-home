
package com.lastartupsaas.service.api.resource.impl;

import javax.validation.constraints.NotNull;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.QueryParam;
import com.lastartupsaas.service.api.model.Account;
import com.lastartupsaas.service.api.model.AccountChange;
import com.lastartupsaas.service.api.model.AccountChangeApply;
import com.lastartupsaas.service.api.resource.AccountsResource;

public class AccountsResourceImpl
    implements AccountsResource
{


    @Override
    public AccountsResource.PostAccountsByAccountIdChangesChangesappliesResponse postAccountsByAccountIdChangesChangesapplies(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        AccountsResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        AccountsResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3, AccountChangeApply var4)
        throws Exception
    {
        System.out.println("HelloWorld!");
        AccountsResource.PostAccountsByAccountIdChangesChangesappliesResponse result;
        return PostAccountsByAccountIdChangesChangesappliesResponse.withJsonOK(null);
    }

    @Override
    public AccountsResource.PatchAccountsByAccountIdResponse patchAccountsByAccountId(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        AccountsResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        AccountsResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3, Account var4)
        throws Exception
    {
        System.out.println("HelloWorld!");
        AccountsResource.PatchAccountsByAccountIdResponse result;
        return PatchAccountsByAccountIdResponse.withJsonOK(null);
    }

    @Override
    public AccountsResource.PostAccountsByAccountIdChangesResponse postAccountsByAccountIdChanges(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        AccountsResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        AccountsResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3, AccountChange var4)
        throws Exception
    {
        System.out.println("HelloWorld!");
        AccountsResource.PostAccountsByAccountIdChangesResponse result;
        return PostAccountsByAccountIdChangesResponse.withJsonOK(null);
    }

    @Override
    public AccountsResource.GetAccountsByAccountIdResponse getAccountsByAccountId(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        AccountsResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        AccountsResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        AccountsResource.GetAccountsByAccountIdResponse result;
        return GetAccountsByAccountIdResponse.withJsonOK(null);
    }

    @Override
    public AccountsResource.GetAccountsByFieldSelectorsResponse getAccountsByFieldSelectors(String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        AccountsResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        AccountsResource.XLaSignMethod var2,
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
        AccountsResource.GetAccountsByFieldSelectorsResponse result;
        return GetAccountsByFieldSelectorsResponse.withJsonOK(null);
    }

    @Override
    public AccountsResource.GetAccountsByAccountIdChangesResponse getAccountsByAccountIdChanges(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        AccountsResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        AccountsResource.XLaSignMethod var2,
        @QueryParam("count")
        @DefaultValue("10")
        int var3,
        @QueryParam("start")
        @DefaultValue("0")
        int var4,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var5)
        throws Exception
    {
        System.out.println("HelloWorld!");
        AccountsResource.GetAccountsByAccountIdChangesResponse result;
        return GetAccountsByAccountIdChangesResponse.withJsonOK(null);
    }

    @Override
    public AccountsResource.PostAccountsResponse postAccounts(
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        AccountsResource.XLaFormat var0,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        AccountsResource.XLaSignMethod var1,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var2, Account var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        AccountsResource.PostAccountsResponse result;
        return PostAccountsResponse.withJsonOK(null);
    }

    @Override
    public AccountsResource.GetAccountsResponse getAccounts(
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        AccountsResource.XLaFormat var0,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        AccountsResource.XLaSignMethod var1,
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
        AccountsResource.GetAccountsResponse result;
        return GetAccountsResponse.withJsonOK(null);
    }

}
