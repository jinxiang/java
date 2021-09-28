package com.hmmloo.designpatterns.structural.decorator;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class FlowerBouquet {
    String description;

    public abstract double cost();
}
