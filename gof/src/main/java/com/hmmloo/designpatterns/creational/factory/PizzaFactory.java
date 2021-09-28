package com.hmmloo.designpatterns.creational.factory;

public class PizzaFactory {
    public CheesePizza makeCheesePizza() {
        return new CheesePizza();
    }

    public PepperoniPizza makePepperoniPizza() {
        return new PepperoniPizza();
    }

    public VeggiePizza makeVeggiePizza() {
        return new VeggiePizza();
    }
}
