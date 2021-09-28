package com.hmmloo.designpatterns.structural.facade.facade;

import com.hmmloo.designpatterns.structural.facade.domain.Product;
import com.hmmloo.designpatterns.structural.facade.subcomponents.InventoryService;
import com.hmmloo.designpatterns.structural.facade.subcomponents.PaymentService;
import com.hmmloo.designpatterns.structural.facade.subcomponents.ShippingService;

public class OrderServiceFacadeImpl implements OrderServiceFacade {
    @Override
    public boolean placeOrder(int productId) {
        boolean orderFulfilled = false;
        Product product = new Product();
        product.setProductId(productId);
        if (InventoryService.isAvailable(product)) {
            System.out.println("Product with ID: " + product.getProductId() + " is available.");
            boolean paymentConfirmed = PaymentService.makePayment();
            if (paymentConfirmed) {
                System.out.println("Payment confirmed...");
                ShippingService.shipProduct(product);
                System.out.println("Product shipped...");
                orderFulfilled = true;
            }
        }
        return orderFulfilled;
    }
}
