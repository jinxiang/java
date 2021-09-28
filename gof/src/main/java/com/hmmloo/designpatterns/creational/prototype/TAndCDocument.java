package com.hmmloo.designpatterns.creational.prototype;

public class TAndCDocument extends PrototypeCapableDocument {
    @Override
    public PrototypeCapableDocument cloneDocument() {
        TAndCDocument tAndC = null;
        try {
            tAndC = (TAndCDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return tAndC;
    }

    @Override
    public String toString() {
        return "[TAndC: Vendor Name - " + getVendorName() + ", Content - " + getContent() + "]";
    }
}
