package com.hmmloo.designpatterns.structural.decorator;

/**
 * Component (FlowerBouquet): Is an abstract base class that can be decorated with responsibilities dynamically.
 * ConcreteComponent(RoseBouquet and OrchidBouquet): Are concrete classes that extends Component to represent objects to which additional responsibilities can be attached.
 * Decorator (FlowerBouquetDecorator): Is an abstract class that extends Component and acts as the base class for concrete decorator classes.
 * ConcreteDecorator (PapperWrapper, RibbonBow, and Glitter): Are concrete classes that extends Decorator to decorate Components with responsibilities.
 */