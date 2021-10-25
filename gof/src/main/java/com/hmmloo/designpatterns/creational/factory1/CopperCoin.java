package com.hmmloo.designpatterns.creational.factory1;

public class CopperCoin implements Coin {
  static final String DESCRIPTION = "This is a copper coin.";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }
}
