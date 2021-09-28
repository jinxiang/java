package com.hmmloo.designpatterns.behavior.state;

public class DispensedState implements CandyVendingMachineState {
    private final CandyVendingMachine candyVendingMachine;

    public DispensedState(CandyVendingMachine candyVendingMachine) {
        this.candyVendingMachine = candyVendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Error. System is currently dispensing");
    }

    @Override
    public void pressButton() {
        System.out.println("Error. System is currently dispensing");
    }

    @Override
    public void dispense() {
        if (candyVendingMachine.getCount() > 0) {
            candyVendingMachine.setState(candyVendingMachine.getNoCoinState());
            candyVendingMachine.setCount(candyVendingMachine.getCount() - 1);
        } else {
            System.out.println("No candies available");
            candyVendingMachine.setState(candyVendingMachine.getNoCandyState());
        }
    }

    @Override
    public String toString() {
        return "DispensedState";
    }
}
