
package com.lastartupsaas.service.api.resource.impl;

import javax.validation.constraints.NotNull;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.QueryParam;
import com.lastartupsaas.service.api.model.Category;
import com.lastartupsaas.service.api.resource.CategoriesResource;

public class CategoriesResourceImpl
    implements CategoriesResource
{


    @Override
    public CategoriesResource.PostCategoriesResponse postCategories(
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        CategoriesResource.XLaFormat var0,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        CategoriesResource.XLaSignMethod var1,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var2, Category var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        CategoriesResource.PostCategoriesResponse result;
        return PostCategoriesResponse.withJsonOK(null);
    }

    @Override
    public CategoriesResource.PatchCategoriesByCategoryIdResponse patchCategoriesByCategoryId(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        CategoriesResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        CategoriesResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3, Category var4)
        throws Exception
    {
        System.out.println("HelloWorld!");
        CategoriesResource.PatchCategoriesByCategoryIdResponse result;
        return PatchCategoriesByCategoryIdResponse.withJsonOK(null);
    }

    @Override
    public CategoriesResource.DeleteCategoriesByCategoryIdResponse deleteCategoriesByCategoryId(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        CategoriesResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        CategoriesResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        CategoriesResource.DeleteCategoriesByCategoryIdResponse result;
        return DeleteCategoriesByCategoryIdResponse.withJsonOK(null);
    }

    @Override
    public CategoriesResource.GetCategoriesByCategoryIdResponse getCategoriesByCategoryId(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        CategoriesResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        CategoriesResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        CategoriesResource.GetCategoriesByCategoryIdResponse result;
        return GetCategoriesByCategoryIdResponse.withJsonOK(null);
    }

}
