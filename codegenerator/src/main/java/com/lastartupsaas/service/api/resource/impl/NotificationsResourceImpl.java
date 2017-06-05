
package com.lastartupsaas.service.api.resource.impl;

import javax.validation.constraints.NotNull;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.QueryParam;
import com.lastartupsaas.service.api.model.Notification;
import com.lastartupsaas.service.api.resource.NotificationsResource;

public class NotificationsResourceImpl
    implements NotificationsResource
{


    @Override
    public NotificationsResource.GetNotificationsResponse getNotifications(
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        NotificationsResource.XLaFormat var0,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        NotificationsResource.XLaSignMethod var1,
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
        NotificationsResource.GetNotificationsResponse result;
        return GetNotificationsResponse.withJsonOK(null);
    }

    @Override
    public NotificationsResource.PatchNotificationsByNotificationIdSendResponse patchNotificationsByNotificationIdSend(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        NotificationsResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        NotificationsResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        NotificationsResource.PatchNotificationsByNotificationIdSendResponse result;
        return PatchNotificationsByNotificationIdSendResponse.withJsonOK(null);
    }

    @Override
    public NotificationsResource.PostNotificationsResponse postNotifications(
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        NotificationsResource.XLaFormat var0,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        NotificationsResource.XLaSignMethod var1,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var2, Notification var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        NotificationsResource.PostNotificationsResponse result;
        return PostNotificationsResponse.withJsonOK(null);
    }

    @Override
    public NotificationsResource.GetNotificationsByNotificationIdResponse getNotificationsByNotificationId(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        NotificationsResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        NotificationsResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        NotificationsResource.GetNotificationsByNotificationIdResponse result;
        return GetNotificationsByNotificationIdResponse.withJsonOK(null);
    }

}
