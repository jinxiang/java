package com.hmmloo.designpatterns.creational.factory1;

public class GoldCoin implements Coin {
  static final String DESCRIPTION = "This is a gold coin.";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }
}
