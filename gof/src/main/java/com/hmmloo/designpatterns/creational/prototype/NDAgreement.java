package com.hmmloo.designpatterns.creational.prototype;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NDAgreement extends PrototypeCapableDocument {
    private AuthorizedSignatory authorizedSignatory;

    @Override
    public PrototypeCapableDocument cloneDocument() throws CloneNotSupportedException {
        /*Clone with deep copy*/
        NDAgreement nda;
        nda = (NDAgreement) super.clone();
        AuthorizedSignatory clonedAuthorizedSignatory = (AuthorizedSignatory) nda.getAuthorizedSignatory().clone();
        nda.setAuthorizedSignatory(clonedAuthorizedSignatory);
        return nda;
    }

    @Override
    public String toString() {
        return "[NDAgreement: Vendor Name - " + getVendorName() + ", Content - " + getContent() + ", Authorized Signatory - " + getAuthorizedSignatory() + "]";
    }
}
