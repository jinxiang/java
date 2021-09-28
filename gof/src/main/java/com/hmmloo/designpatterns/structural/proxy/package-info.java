package com.hmmloo.designpatterns.structural.proxy;

/**
 * Subject (ReportGenerator): Is an interface for both the real object and its proxy. The Subject enables the proxy to be used anywhere the real object is expected.
 * RealSubject (ReportGeneratorImpl): The real object that is expensive to create, requires protection, or running on a remote JVM. RealSubject implements Subject and we create proxy of it.
 * Proxy (ReportGeneratorImplProxy): Implements Subject and maintains a reference to RealSubject.
 */