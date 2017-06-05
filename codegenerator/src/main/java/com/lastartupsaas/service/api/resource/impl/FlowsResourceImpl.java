
package com.lastartupsaas.service.api.resource.impl;

import javax.validation.constraints.NotNull;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.QueryParam;
import com.lastartupsaas.service.api.model.Flow;
import com.lastartupsaas.service.api.model.GraphNode;
import com.lastartupsaas.service.api.model.Step;
import com.lastartupsaas.service.api.resource.FlowsResource;

public class FlowsResourceImpl
    implements FlowsResource
{


    @Override
    public FlowsResource.GetFlowsResponse getFlows(
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        FlowsResource.XLaFormat var0,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        FlowsResource.XLaSignMethod var1,
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
        FlowsResource.GetFlowsResponse result;
        return GetFlowsResponse.withJsonOK(null);
    }

    @Override
    public FlowsResource.GetFlowsByFlowIdResponse getFlowsByFlowId(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        FlowsResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        FlowsResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        FlowsResource.GetFlowsByFlowIdResponse result;
        return GetFlowsByFlowIdResponse.withJsonOK(null);
    }

    @Override
    public FlowsResource.PostFlowsResponse postFlows(
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        FlowsResource.XLaFormat var0,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        FlowsResource.XLaSignMethod var1,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var2, GraphNode var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        FlowsResource.PostFlowsResponse result;
        return PostFlowsResponse.withJsonOK(null);
    }

    @Override
    public FlowsResource.PatchFlowsByFlowIdStartResponse patchFlowsByFlowIdStart(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        FlowsResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        FlowsResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        FlowsResource.PatchFlowsByFlowIdStartResponse result;
        return PatchFlowsByFlowIdStartResponse.withJsonOK(null);
    }

    @Override
    public FlowsResource.PatchFlowsByFlowIdSuspendResponse patchFlowsByFlowIdSuspend(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        FlowsResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        FlowsResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        FlowsResource.PatchFlowsByFlowIdSuspendResponse result;
        return PatchFlowsByFlowIdSuspendResponse.withJsonOK(null);
    }

    @Override
    public FlowsResource.GetFlowsByFlowIdStepsResponse getFlowsByFlowIdSteps(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        FlowsResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        FlowsResource.XLaSignMethod var2,
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
        FlowsResource.GetFlowsByFlowIdStepsResponse result;
        return GetFlowsByFlowIdStepsResponse.withJsonOK(null);
    }

    @Override
    public FlowsResource.PostFlowsByFlowIdStepsResponse postFlowsByFlowIdSteps(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        FlowsResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        FlowsResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3, Step var4)
        throws Exception
    {
        System.out.println("HelloWorld!");
        FlowsResource.PostFlowsByFlowIdStepsResponse result;
        return PostFlowsByFlowIdStepsResponse.withJsonOK(null);
    }

    @Override
    public FlowsResource.PatchFlowsByFlowIdResponse patchFlowsByFlowId(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        FlowsResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        FlowsResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3, Flow var4)
        throws Exception
    {
        System.out.println("HelloWorld!");
        FlowsResource.PatchFlowsByFlowIdResponse result;
        return PatchFlowsByFlowIdResponse.withJsonOK(null);
    }

    @Override
    public FlowsResource.DeleteFlowsByFlowIdResponse deleteFlowsByFlowId(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        FlowsResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        FlowsResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        FlowsResource.DeleteFlowsByFlowIdResponse result;
        return DeleteFlowsByFlowIdResponse.withJsonOK(null);
    }

    @Override
    public FlowsResource.GetFlowsByFlowIdStepsByStepCodeResponse getFlowsByFlowIdStepsByStepCode(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var1,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        FlowsResource.XLaFormat var2,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        FlowsResource.XLaSignMethod var3,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var4)
        throws Exception
    {
        System.out.println("HelloWorld!");
        FlowsResource.GetFlowsByFlowIdStepsByStepCodeResponse result;
        return GetFlowsByFlowIdStepsByStepCodeResponse.withJsonOK(null);
    }

    @Override
    public FlowsResource.PatchFlowsByFlowIdStepsByStepCodeResponse patchFlowsByFlowIdStepsByStepCode(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var1,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        FlowsResource.XLaFormat var2,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        FlowsResource.XLaSignMethod var3,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var4, Step var5)
        throws Exception
    {
        System.out.println("HelloWorld!");
        FlowsResource.PatchFlowsByFlowIdStepsByStepCodeResponse result;
        return PatchFlowsByFlowIdStepsByStepCodeResponse.withJsonOK(null);
    }

    @Override
    public FlowsResource.PatchFlowsByFlowIdStepsByStepCodeCompleteResponse patchFlowsByFlowIdStepsByStepCodeComplete(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var1,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        FlowsResource.XLaFormat var2,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        FlowsResource.XLaSignMethod var3,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var4)
        throws Exception
    {
        System.out.println("HelloWorld!");
        FlowsResource.PatchFlowsByFlowIdStepsByStepCodeCompleteResponse result;
        return PatchFlowsByFlowIdStepsByStepCodeCompleteResponse.withJsonOK(null);
    }

    @Override
    public FlowsResource.PatchFlowsByFlowIdStepsByStepCodeStartResponse patchFlowsByFlowIdStepsByStepCodeStart(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var1,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        FlowsResource.XLaFormat var2,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        FlowsResource.XLaSignMethod var3,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var4)
        throws Exception
    {
        System.out.println("HelloWorld!");
        FlowsResource.PatchFlowsByFlowIdStepsByStepCodeStartResponse result;
        return PatchFlowsByFlowIdStepsByStepCodeStartResponse.withJsonOK(null);
    }

    @Override
    public FlowsResource.GetFlowsByFlowIdStepsByStepCodeInfoResponse getFlowsByFlowIdStepsByStepCodeInfo(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var1,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        FlowsResource.XLaFormat var2,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        FlowsResource.XLaSignMethod var3,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var4)
        throws Exception
    {
        System.out.println("HelloWorld!");
        FlowsResource.GetFlowsByFlowIdStepsByStepCodeInfoResponse result;
        return GetFlowsByFlowIdStepsByStepCodeInfoResponse.withJsonOK(null);
    }

    @Override
    public FlowsResource.DeleteFlowsByFlowIdStepsByStepCodeResponse deleteFlowsByFlowIdStepsByStepCode(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var1,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        FlowsResource.XLaFormat var2,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        FlowsResource.XLaSignMethod var3,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var4)
        throws Exception
    {
        System.out.println("HelloWorld!");
        FlowsResource.DeleteFlowsByFlowIdStepsByStepCodeResponse result;
        return DeleteFlowsByFlowIdStepsByStepCodeResponse.withJsonOK(null);
    }

}
