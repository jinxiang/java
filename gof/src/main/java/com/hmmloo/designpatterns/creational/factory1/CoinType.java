package com.hmmloo.designpatterns.creational.factory1;

import java.util.function.Supplier;

public enum CoinType {
  COPPER(CopperCoin::new),
  GOLD(GoldCoin::new);
  private final Supplier<Coin> constructor;

  CoinType(Supplier<Coin> constructor) {
    this.constructor = constructor;
  }

  public Supplier<Coin> getConstructor() {
    return constructor;
  }
}
