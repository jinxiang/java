package com.hmmloo.designpatterns.behavior.visitor;
/**
 * Element (MailClient): Is an interface that contains accept() method that takes a visitor as an argument.
 * ConcreteElement (OperaMailClient, SquirrelMailClient, and ZimbraMailClient): Implements the accept() method declared in Element.
 * Visitor (MailClientVisitor): Is an interface that declares a visit() method for each class of ConcreteElement in the object structure.
 * ConcreteVisitor (MacMailClientVisitor, WindowsMailClientVisitor, and LinuxMailClientVisitor): Are the concrete classes that implements each method declared by Visitor.
 */