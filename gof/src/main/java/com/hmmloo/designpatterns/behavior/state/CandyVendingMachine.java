package com.hmmloo.designpatterns.behavior.state;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CandyVendingMachine {
    private CandyVendingMachineState noCandyState;
    private CandyVendingMachineState dispensedState;
    private CandyVendingMachineState containsCoinState;
    private CandyVendingMachineState noCoinState;
    private CandyVendingMachineState state;
    private int count;

    public CandyVendingMachine(int numberOfCandies) {
        count = numberOfCandies;
        noCoinState = new NoCoinState(this);
        noCandyState = new NoCandyState(this);
        dispensedState = new DispensedState(this);
        containsCoinState = new ContainsCoinState(this);
        state = noCoinState;
    }

    public void refillCandy(int count) {
        this.count += count;
        this.state = noCoinState;
    }

    public void ejectCandy() {
        if (count != 0) {
            count--;
        }
    }

    public void insertCoin() {
        System.out.println("You inserted a coin.");
        state.insertCoin();
    }

    public void pressButton() {
        System.out.println("You have pressed the button.");
        state.pressButton();
        state.dispense();
    }
}
