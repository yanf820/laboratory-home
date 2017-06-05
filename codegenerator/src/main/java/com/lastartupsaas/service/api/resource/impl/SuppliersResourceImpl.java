
package com.lastartupsaas.service.api.resource.impl;

import javax.validation.constraints.NotNull;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.QueryParam;
import com.lastartupsaas.service.api.model.Supplier;
import com.lastartupsaas.service.api.resource.SuppliersResource;

public class SuppliersResourceImpl
    implements SuppliersResource
{


    @Override
    public SuppliersResource.PatchSuppliersBySupplierIdUnregisterResponse patchSuppliersBySupplierIdUnregister(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        SuppliersResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        SuppliersResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3, Supplier var4)
        throws Exception
    {
        System.out.println("HelloWorld!");
        SuppliersResource.PatchSuppliersBySupplierIdUnregisterResponse result;
        return PatchSuppliersBySupplierIdUnregisterResponse.withJsonOK(null);
    }

    @Override
    public SuppliersResource.GetSuppliersBySupplierIdContractsByContractTypeResponse getSuppliersBySupplierIdContractsByContractType(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var1)
        throws Exception
    {
        System.out.println("HelloWorld!");
        SuppliersResource.GetSuppliersBySupplierIdContractsByContractTypeResponse result;
        return GetSuppliersBySupplierIdContractsByContractTypeResponse.withJsonOK(null);
    }

    @Override
    public SuppliersResource.GetSuppliersBySupplierIdContractsResponse getSuppliersBySupplierIdContracts(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0)
        throws Exception
    {
        System.out.println("HelloWorld!");
        SuppliersResource.GetSuppliersBySupplierIdContractsResponse result;
        return GetSuppliersBySupplierIdContractsResponse.withJsonOK(null);
    }

    @Override
    public SuppliersResource.PatchSuppliersBySupplierIdResponse patchSuppliersBySupplierId(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        SuppliersResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        SuppliersResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3, Supplier var4)
        throws Exception
    {
        System.out.println("HelloWorld!");
        SuppliersResource.PatchSuppliersBySupplierIdResponse result;
        return PatchSuppliersBySupplierIdResponse.withJsonOK(null);
    }

    @Override
    public SuppliersResource.PostSuppliersRegisterResponse postSuppliersRegister(
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        SuppliersResource.XLaFormat var0,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        SuppliersResource.XLaSignMethod var1,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var2, Supplier var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        SuppliersResource.PostSuppliersRegisterResponse result;
        return PostSuppliersRegisterResponse.withJsonOK(null);
    }

    @Override
    public SuppliersResource.GetSuppliersByFieldSelectorsResponse getSuppliersByFieldSelectors(String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        SuppliersResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        SuppliersResource.XLaSignMethod var2,
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
        SuppliersResource.GetSuppliersByFieldSelectorsResponse result;
        return GetSuppliersByFieldSelectorsResponse.withJsonOK(null);
    }

    @Override
    public SuppliersResource.GetSuppliersBySupplierIdResponse getSuppliersBySupplierId(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        SuppliersResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        SuppliersResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        SuppliersResource.GetSuppliersBySupplierIdResponse result;
        return GetSuppliersBySupplierIdResponse.withJsonOK(null);
    }

    @Override
    public SuppliersResource.GetSuppliersResponse getSuppliers(
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        SuppliersResource.XLaFormat var0,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        SuppliersResource.XLaSignMethod var1,
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
        SuppliersResource.GetSuppliersResponse result;
        return GetSuppliersResponse.withJsonOK(null);
    }

}
