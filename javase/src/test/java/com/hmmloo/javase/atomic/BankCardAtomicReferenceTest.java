package com.hmmloo.javase.atomic;

import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

class BankCardAtomicReferenceTest {
  private AtomicReference<BankCard> bankCardRef = new AtomicReference<>(new BankCard("JX", 100));

  @Test
  public void test1() {
    for (int i = 0; i < 10; i++) {
      new Thread(
              () -> {
                while (true) {
                  // 使用 AtomicReference.get 获取
                  final BankCard bankCard = bankCardRef.get();
                  BankCard newCard =
                      new BankCard(bankCard.getAccountName(), bankCard.getMoney() + 100);
                  if (bankCardRef.compareAndSet(bankCard, newCard)) {
                    System.out.println(newCard);
                  }
                  try {
                    TimeUnit.SECONDS.sleep(1);
                  } catch (Exception e) {
                    e.printStackTrace();
                  }
                }
              })
          .start();
    }
    ;
  }
}
