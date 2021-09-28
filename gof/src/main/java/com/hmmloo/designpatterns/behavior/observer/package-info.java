package com.hmmloo.designpatterns.behavior.observer;
/**
 * Subject (Subject interface): Provides an interface to attach and detach Observer objects.
 * ConcreteSubject (Product class): Implements the Subject interface. A ConcreteSubject sends notification to Observer objects when its state change.
 * Observer (Observer interface): Provides an interface for objects that should be notified of changes in a Subject.
 * ConcreteObserver (Bidder class): Implements Observer to receive notifications from the Subject and keep its state consistent with the state of the Subject.
 */