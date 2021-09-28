package com.hmmloo.designpatterns.behavior.chainofresponsibility;

/**
 * Handler (AbstractSupportHandler) Abstract base class acting as the interface to handle request. Optionally, but most often the Handler implements the chain links.
 * ConcreteHandler (TechnicalSupportHandler, BillingSupportHandler, and GeneralSupportHandler.) Handles request, else passes it to the next successor of the handler chain
 * Client(RequestorClient): Initiates a request that one of the chain of handlers ( a ConcreteHandler) handles
 */