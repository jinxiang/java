package com.hmmloo.designpatterns.behavior.state;

public class ContainsCoinState implements CandyVendingMachineState {
    private final CandyVendingMachine candyVendingMachine;

    public ContainsCoinState(CandyVendingMachine candyVendingMachine) {
        this.candyVendingMachine = candyVendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin already inserted");
    }

    @Override
    public void pressButton() {
        candyVendingMachine.setState(candyVendingMachine.getDispensedState());
    }

    @Override
    public void dispense() {
        System.out.println("Press button to dispense");
    }

    @Override
    public String toString() {
        return "ContainsCoinState";
    }
}
