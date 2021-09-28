package com.hmmloo.designpatterns.structural.bridge;

/**
 * Abstraction (Message): Is the interface implemented as an abstract class that clients communicate with.
 * RefinedAbstraction (TextMessage and EmailMessage): Are classes that implement or extend Abstraction.
 * Implementor (MessageSender): Is the interface of the implementation class hierarchy.
 * ConcreteImplementor(TextMessageSender and EmailMessageSender): Are concrete subclasses that implements Implementor.
 */