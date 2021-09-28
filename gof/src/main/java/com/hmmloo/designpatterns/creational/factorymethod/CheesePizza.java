package com.hmmloo.designpatterns.creational.factorymethod;

public class CheesePizza extends Pizza{
    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for cheese pizza.");
    }
}
