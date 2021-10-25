package com.hmmloo.designpatterns.creational.factory1;

public class App {
  public static void main(String[] args) {
    //
    Coin goldCoin = CoinFactory.getCoin(CoinType.GOLD);
    Coin copperCoin = CoinFactory.getCoin(CoinType.COPPER);
    System.out.println("Gold:" + goldCoin.getDescription());
    System.out.println("Copper:" + copperCoin.getDescription());
  }
}
