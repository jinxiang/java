package com.hmmloo.designpatterns.creational.builder;

public interface HouseBuilder {
    void buildFoundation();

    void buildStructure();

    void buildRoof();

    void paintHouse();

    void furnishHouse();

    House getHouse();
}
