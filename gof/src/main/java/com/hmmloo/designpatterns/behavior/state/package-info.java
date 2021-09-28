package com.hmmloo.designpatterns.behavior.state;
/**
 * Context (CandyVendingMachine): Provides and interface to client to perform some action and delegates state specific requests to the ConcreteState subclass that defines the current state.
 * State (CandyVendingMachineState): Is an interface that encapsulates the behavior associated with a particular state of the Context.
 * ConcreteState subclasses (NoCoinState, ContainsCoinState, DispensedState, and NoCandyState): Concrete classes that implements a behavior associated with a state of the Context.
 */