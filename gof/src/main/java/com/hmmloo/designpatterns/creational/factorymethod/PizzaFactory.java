package com.hmmloo.designpatterns.creational.factorymethod;

public class PizzaFactory implements BasePizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type.toLowerCase()) {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
            default:
                throw new IllegalArgumentException("no such pizza");
        }
        pizza.addIngredients();
        pizza.bakePizza();
        return pizza;
    }
}
