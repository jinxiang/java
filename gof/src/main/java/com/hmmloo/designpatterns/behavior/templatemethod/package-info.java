package com.hmmloo.designpatterns.behavior.templatemethod;
/**
 * AbstractClass (PizzaMaker): Is an abstract class that contains a template method defining the skeleton of an algorithm. The template method calls methods to perform the steps of an algorithm. The methods can be both common across and specific to different algorithm implementations.
 * ConcreteClass (VegPizzaMaker, NonVegPizzaMaker, and InHouseAssortedPizzaMaker): Are concrete subclasses of AbstractClass that implements the operations to carry out the algorithm-specific primitive steps.
 */