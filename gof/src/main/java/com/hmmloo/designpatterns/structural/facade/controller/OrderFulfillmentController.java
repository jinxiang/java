package com.hmmloo.designpatterns.structural.facade.controller;

import com.hmmloo.designpatterns.structural.facade.facade.OrderServiceFacade;

public class OrderFulfillmentController {
    OrderServiceFacade facade;
    boolean orderFulfilled = false;

    public void orderProduct(int productId) {
        orderFulfilled = facade.placeOrder(productId);
        System.out.println("OrderFulfillmentController: Order fulfillment completed. ");
    }
}
