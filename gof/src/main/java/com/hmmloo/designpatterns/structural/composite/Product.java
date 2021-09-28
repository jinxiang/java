package com.hmmloo.designpatterns.structural.composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Product extends CatalogComponent {
    private String name;
    private double price;


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("Product name: " + name + " Price: " + price);
    }
}
