package com.hmmloo.designpatterns.structural.decorator;

public class RoseBouquet extends FlowerBouquet{
    public RoseBouquet() {
        this.description = "Rose bouquet";
    }

    @Override
    public double cost() {
        return 12.0;
    }
}
