
package com.lastartupsaas.service.api.resource.impl;

import javax.validation.constraints.NotNull;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.QueryParam;
import com.lastartupsaas.service.api.model.Order;
import com.lastartupsaas.service.api.resource.OrdersResource;

public class OrdersResourceImpl
    implements OrdersResource
{


    @Override
    public OrdersResource.PostOrdersResponse postOrders(
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        OrdersResource.XLaFormat var0,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        OrdersResource.XLaSignMethod var1,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var2, Order var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        OrdersResource.PostOrdersResponse result;
        return PostOrdersResponse.withJsonOK(null);
    }

    @Override
    public OrdersResource.GetOrdersByFieldSelectorsResponse getOrdersByFieldSelectors(String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        OrdersResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        OrdersResource.XLaSignMethod var2,
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
        OrdersResource.GetOrdersByFieldSelectorsResponse result;
        return GetOrdersByFieldSelectorsResponse.withJsonOK(null);
    }

    @Override
    public OrdersResource.DeleteOrdersByOrderIdResponse deleteOrdersByOrderId(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        OrdersResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        OrdersResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        OrdersResource.DeleteOrdersByOrderIdResponse result;
        return DeleteOrdersByOrderIdResponse.withJsonOK(null);
    }

    @Override
    public OrdersResource.PatchOrdersByOrderIdResponse patchOrdersByOrderId(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        OrdersResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        OrdersResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3, Order var4)
        throws Exception
    {
        System.out.println("HelloWorld!");
        OrdersResource.PatchOrdersByOrderIdResponse result;
        return PatchOrdersByOrderIdResponse.withJsonOK(null);
    }

    @Override
    public OrdersResource.PatchOrdersByOrderIdRefundResponse patchOrdersByOrderIdRefund(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        OrdersResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        OrdersResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3, Order var4)
        throws Exception
    {
        System.out.println("HelloWorld!");
        OrdersResource.PatchOrdersByOrderIdRefundResponse result;
        return PatchOrdersByOrderIdRefundResponse.withJsonOK(null);
    }

    @Override
    public OrdersResource.GetOrdersByOrderIdResponse getOrdersByOrderId(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        OrdersResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        OrdersResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3)
        throws Exception
    {
        System.out.println("HelloWorld!");
        OrdersResource.GetOrdersByOrderIdResponse result;
        return GetOrdersByOrderIdResponse.withJsonOK(null);
    }

    @Override
    public OrdersResource.PatchOrdersByOrderIdCancelResponse patchOrdersByOrderIdCancel(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        OrdersResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        OrdersResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3, Order var4)
        throws Exception
    {
        System.out.println("HelloWorld!");
        OrdersResource.PatchOrdersByOrderIdCancelResponse result;
        return PatchOrdersByOrderIdCancelResponse.withJsonOK(null);
    }

    @Override
    public OrdersResource.PatchOrdersByOrderIdPayResponse patchOrdersByOrderIdPay(
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var0,
        @HeaderParam("x-la-format")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        OrdersResource.XLaFormat var1,
        @HeaderParam("x-la-sign-method")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        OrdersResource.XLaSignMethod var2,
        @QueryParam("sign")
        @NotNull(message = "{javax.validation.constraints.NotNull.message}")
        String var3, Order var4)
        throws Exception
    {
        System.out.println("HelloWorld!");
        OrdersResource.PatchOrdersByOrderIdPayResponse result;
        return PatchOrdersByOrderIdPayResponse.withJsonOK(null);
    }

}
