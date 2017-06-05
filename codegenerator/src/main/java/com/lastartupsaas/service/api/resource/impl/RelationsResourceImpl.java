
package com.lastartupsaas.service.api.resource.impl;

import javax.validation.constraints.NotNull;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.QueryParam;
import com.lastartupsaas.service.api.model.Relation;
import com.lastartupsaas.service.api.resource.RelationsResource;

public class RelationsResourceImpl
    implements RelationsResource
{


    @Override
    public RelationsResource.PostRelationsResponse postRelations(
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        RelationsResource.XLaFormat var0,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        RelationsResource.XLaSignMethod var1,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var2, Relation var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        RelationsResource.PostRelationsResponse result;
        return PostRelationsResponse.withJsonOK(null);
    }

    @Override
    public RelationsResource.GetRelationsTargetResponse getRelationsTarget(
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        RelationsResource.XLaFormat var0,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        RelationsResource.XLaSignMethod var1,
        @QueryParam("target_id")
        String var2,
        @QueryParam("target_type")
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
        RelationsResource.GetRelationsTargetResponse result;
        return GetRelationsTargetResponse.withJsonOK(null);
    }

    @Override
    public RelationsResource.DeleteRelationsByRelationIdResponse deleteRelationsByRelationId(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        RelationsResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        RelationsResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        RelationsResource.DeleteRelationsByRelationIdResponse result;
        return DeleteRelationsByRelationIdResponse.withJsonOK(null);
    }

    @Override
    public RelationsResource.GetRelationsSourceResponse getRelationsSource(
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        RelationsResource.XLaFormat var0,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        RelationsResource.XLaSignMethod var1,
        @QueryParam("source_id")
        String var2,
        @QueryParam("source_type")
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
        RelationsResource.GetRelationsSourceResponse result;
        return GetRelationsSourceResponse.withJsonOK(null);
    }

}
