package com.hmmloo.designpatterns.structural.decorator;

public class OrchidBouquet extends FlowerBouquet{
    public OrchidBouquet() {
        this.description = "Orchid bouquet";
    }

    @Override
    public double cost() {
        return 29.0;
    }
}
