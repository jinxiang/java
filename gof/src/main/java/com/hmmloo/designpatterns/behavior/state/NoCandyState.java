package com.hmmloo.designpatterns.behavior.state;

public class NoCandyState implements CandyVendingMachineState {
    private final CandyVendingMachine candyVendingMachine;

    public NoCandyState(CandyVendingMachine candyVendingMachine) {
        this.candyVendingMachine = candyVendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("No candies available");
    }

    @Override
    public void pressButton() {
        System.out.println("No candies available");
    }

    @Override
    public void dispense() {
        System.out.println("No candies available");
    }

    @Override
    public String toString() {
        return "NoCandyState";
    }
}
