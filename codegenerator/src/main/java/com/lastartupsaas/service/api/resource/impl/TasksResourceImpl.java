
package com.lastartupsaas.service.api.resource.impl;

import javax.validation.constraints.NotNull;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.QueryParam;
import com.lastartupsaas.service.api.model.Task;
import com.lastartupsaas.service.api.resource.TasksResource;

public class TasksResourceImpl
    implements TasksResource
{


    @Override
    public TasksResource.PostTasksResponse postTasks(
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        TasksResource.XLaFormat var0,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        TasksResource.XLaSignMethod var1,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var2, Task var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        TasksResource.PostTasksResponse result;
        return PostTasksResponse.withJsonOK(null);
    }

    @Override
    public TasksResource.GetTasksByTaskIdResponse getTasksByTaskId(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        TasksResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        TasksResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        TasksResource.GetTasksByTaskIdResponse result;
        return GetTasksByTaskIdResponse.withJsonOK(null);
    }

    @Override
    public TasksResource.PatchTasksByTaskIdDoneResponse patchTasksByTaskIdDone(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        TasksResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        TasksResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        TasksResource.PatchTasksByTaskIdDoneResponse result;
        return PatchTasksByTaskIdDoneResponse.withJsonOK(null);
    }

    @Override
    public TasksResource.PatchTasksByTaskIdDelegateResponse patchTasksByTaskIdDelegate(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        TasksResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        TasksResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        TasksResource.PatchTasksByTaskIdDelegateResponse result;
        return PatchTasksByTaskIdDelegateResponse.withJsonOK(null);
    }

    @Override
    public TasksResource.PatchTasksByTaskIdSuspendResponse patchTasksByTaskIdSuspend(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        TasksResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        TasksResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        TasksResource.PatchTasksByTaskIdSuspendResponse result;
        return PatchTasksByTaskIdSuspendResponse.withJsonOK(null);
    }

    @Override
    public TasksResource.PatchTasksByTaskIdCompleteResponse patchTasksByTaskIdComplete(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        TasksResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        TasksResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        TasksResource.PatchTasksByTaskIdCompleteResponse result;
        return PatchTasksByTaskIdCompleteResponse.withJsonOK(null);
    }

    @Override
    public TasksResource.GetTasksByTaskIdInfoResponse getTasksByTaskIdInfo(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        TasksResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        TasksResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        TasksResource.GetTasksByTaskIdInfoResponse result;
        return GetTasksByTaskIdInfoResponse.withJsonOK(null);
    }

}
