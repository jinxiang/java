package com.hmmloo.designpatterns.creational.prototype;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AuthorizedSignatory implements Cloneable{
    private String name;
    private String designation;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "[AuthorizedSignatory: Name - " + getName() + ", Designation - " + getDesignation() + "]";
    }
}
