package com.hmmloo.designpatterns.creational.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaFactoryTest {

    @Test
    public void test1() {
        BasePizzaFactory pizzaFactory = new PizzaFactory();
        Pizza pepperoniPizza = pizzaFactory.createPizza("Pepperoni");
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        Pizza veggiePizza = pizzaFactory.createPizza("veggie");
    }

}