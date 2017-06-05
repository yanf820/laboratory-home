
package com.lastartupsaas.service.api.resource.impl;

import javax.validation.constraints.NotNull;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.QueryParam;
import com.lastartupsaas.service.api.model.Product;
import com.lastartupsaas.service.api.resource.ProductsResource;

public class ProductsResourceImpl
    implements ProductsResource
{


    @Override
    public ProductsResource.GetProductsResponse getProducts(
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        ProductsResource.XLaFormat var0,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        ProductsResource.XLaSignMethod var1,
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
        ProductsResource.GetProductsResponse result;
        return GetProductsResponse.withJsonOK(null);
    }

    @Override
    public ProductsResource.PostProductsResponse postProducts(
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        ProductsResource.XLaFormat var0,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        ProductsResource.XLaSignMethod var1,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var2, Product var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        ProductsResource.PostProductsResponse result;
        return PostProductsResponse.withJsonOK(null);
    }

    @Override
    public ProductsResource.GetProductsByFieldSelectorsResponse getProductsByFieldSelectors(String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        ProductsResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        ProductsResource.XLaSignMethod var2,
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
        ProductsResource.GetProductsByFieldSelectorsResponse result;
        return GetProductsByFieldSelectorsResponse.withJsonOK(null);
    }

    @Override
    public ProductsResource.DeleteProductsByProductIdResponse deleteProductsByProductId(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        ProductsResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        ProductsResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        ProductsResource.DeleteProductsByProductIdResponse result;
        return DeleteProductsByProductIdResponse.withJsonOK(null);
    }

    @Override
    public ProductsResource.PatchProductsByProductIdOnlineResponse patchProductsByProductIdOnline(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        ProductsResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        ProductsResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3, Product var4)
        throws Exception
    {
        System.out.println("HelloWorld!");
        ProductsResource.PatchProductsByProductIdOnlineResponse result;
        return PatchProductsByProductIdOnlineResponse.withJsonOK(null);
    }

    @Override
    public ProductsResource.PatchProductsByProductIdResponse patchProductsByProductId(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        ProductsResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        ProductsResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3, Product var4)
        throws Exception
    {
        System.out.println("HelloWorld!");
        ProductsResource.PatchProductsByProductIdResponse result;
        return PatchProductsByProductIdResponse.withJsonOK(null);
    }

    @Override
    public ProductsResource.GetProductsByProductIdResponse getProductsByProductId(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        ProductsResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        ProductsResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        ProductsResource.GetProductsByProductIdResponse result;
        return GetProductsByProductIdResponse.withJsonOK(null);
    }

    @Override
    public ProductsResource.PatchProductsByProductIdOfflineResponse patchProductsByProductIdOffline(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        ProductsResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        ProductsResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3, Product var4)
        throws Exception
    {
        System.out.println("HelloWorld!");
        ProductsResource.PatchProductsByProductIdOfflineResponse result;
        return PatchProductsByProductIdOfflineResponse.withJsonOK(null);
    }

}
