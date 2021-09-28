package com.hmmloo.designpatterns.behavior.strategy;
/**
 * Strategy (EncryptionStrategy): Is an interface common to all supported algorithm-specific classes.
 * ConcreteStrategy (AesEncryptionStrategy and BlowfishEncryptionStrategy): Implements the algorithm using the Strategy interface.
 * Context (Encryptor): Provides the interface to client for encrypting data. The Context maintains a reference to a Strategy object and is instantiated and initialized by clients with a ConcreteStrategy object.
 */