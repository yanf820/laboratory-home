
package com.lastartupsaas.service.api.resource.impl;

import javax.validation.constraints.NotNull;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.QueryParam;
import com.lastartupsaas.service.api.model.Graph;
import com.lastartupsaas.service.api.model.GraphNode;
import com.lastartupsaas.service.api.resource.GraphResource;

public class GraphResourceImpl
    implements GraphResource
{


    @Override
    public GraphResource.PostGraphResponse postGraph(
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        GraphResource.XLaFormat var0,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        GraphResource.XLaSignMethod var1,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var2, Graph var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        GraphResource.PostGraphResponse result;
        return PostGraphResponse.withJsonOK(null);
    }

    @Override
    public GraphResource.GetGraphByGraphIdNodesByNodeIdInfoResponse getGraphByGraphIdNodesByNodeIdInfo(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var1,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        GraphResource.XLaFormat var2,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        GraphResource.XLaSignMethod var3,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var4)
        throws Exception
    {
        System.out.println("HelloWorld!");
        GraphResource.GetGraphByGraphIdNodesByNodeIdInfoResponse result;
        return GetGraphByGraphIdNodesByNodeIdInfoResponse.withJsonOK(null);
    }

    @Override
    public GraphResource.PatchGraphByGraphIdDeployResponse patchGraphByGraphIdDeploy(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        GraphResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        GraphResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        GraphResource.PatchGraphByGraphIdDeployResponse result;
        return PatchGraphByGraphIdDeployResponse.withJsonOK(null);
    }

    @Override
    public GraphResource.GetGraphByGraphIdNodesByNodeIdResponse getGraphByGraphIdNodesByNodeId(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var1,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        GraphResource.XLaFormat var2,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        GraphResource.XLaSignMethod var3,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var4)
        throws Exception
    {
        System.out.println("HelloWorld!");
        GraphResource.GetGraphByGraphIdNodesByNodeIdResponse result;
        return GetGraphByGraphIdNodesByNodeIdResponse.withJsonOK(null);
    }

    @Override
    public GraphResource.GetGraphByGraphIdResponse getGraphByGraphId(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        GraphResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        GraphResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        GraphResource.GetGraphByGraphIdResponse result;
        return GetGraphByGraphIdResponse.withJsonOK(null);
    }

    @Override
    public GraphResource.DeleteGraphByGraphIdResponse deleteGraphByGraphId(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        GraphResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        GraphResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        GraphResource.DeleteGraphByGraphIdResponse result;
        return DeleteGraphByGraphIdResponse.withJsonOK(null);
    }

    @Override
    public GraphResource.GetGraphByGraphIdNodesResponse getGraphByGraphIdNodes(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        GraphResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        GraphResource.XLaSignMethod var2,
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
        GraphResource.GetGraphByGraphIdNodesResponse result;
        return GetGraphByGraphIdNodesResponse.withJsonOK(null);
    }

    @Override
    public GraphResource.PostGraphByGraphIdNodesResponse postGraphByGraphIdNodes(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        GraphResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        GraphResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3, GraphNode var4)
        throws Exception
    {
        System.out.println("HelloWorld!");
        GraphResource.PostGraphByGraphIdNodesResponse result;
        return PostGraphByGraphIdNodesResponse.withJsonOK(null);
    }

    @Override
    public GraphResource.DeleteGraphByGraphIdNodesResponse deleteGraphByGraphIdNodes(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        GraphResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        GraphResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        GraphResource.DeleteGraphByGraphIdNodesResponse result;
        return DeleteGraphByGraphIdNodesResponse.withJsonOK(null);
    }

    @Override
    public GraphResource.PatchGraphByGraphIdResponse patchGraphByGraphId(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        GraphResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        GraphResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3, Graph var4)
        throws Exception
    {
        System.out.println("HelloWorld!");
        GraphResource.PatchGraphByGraphIdResponse result;
        return PatchGraphByGraphIdResponse.withJsonOK(null);
    }

}
