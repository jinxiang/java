package com.hmmloo.designpatterns.structural.facade.controller;

import com.hmmloo.designpatterns.structural.facade.facade.OrderServiceFacadeImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderFulfillmentControllerTest {

    @Test
    public void testOrderProduct() throws Exception {
        OrderFulfillmentController controller = new OrderFulfillmentController();
        controller.facade = new OrderServiceFacadeImpl();
        controller.orderProduct(9);
        boolean result = controller.orderFulfilled;
        assertTrue(result);
    }

}