package com.hmmloo.designpatterns.structural.decorator;

public class Glitter extends FlowerBouquetDecorator {
    private final FlowerBouquet flowerBouquet;

    public Glitter(FlowerBouquet flowerBouquet) {
        this.flowerBouquet = flowerBouquet;
    }

    @Override
    public String getDescription() {
        return flowerBouquet.getDescription() + ", glitter";
    }

    @Override
    public double cost() {
        return 4 + flowerBouquet.cost();
    }
}
