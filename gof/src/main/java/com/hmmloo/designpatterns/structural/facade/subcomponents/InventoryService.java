package com.hmmloo.designpatterns.structural.facade.subcomponents;

import com.hmmloo.designpatterns.structural.facade.domain.Product;

public class InventoryService {
    public static boolean isAvailable(Product product) {
        /*Check Warehouse database for product availability*/
        return true;
    }
}
