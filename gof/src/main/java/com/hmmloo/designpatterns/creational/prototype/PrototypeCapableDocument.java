package com.hmmloo.designpatterns.creational.prototype;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class PrototypeCapableDocument implements Cloneable{
    private String vendorName;
    private String content;

    public abstract PrototypeCapableDocument cloneDocument() throws CloneNotSupportedException;
}
