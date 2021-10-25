package com.hmmloo.designpatterns.creational.factory1;

public class CoinFactory {
    public static Coin getCoin(CoinType type) {
        return type.getConstructor().get();
    }
}
