package com.hmmloo.cleancraftmanship.chap03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeFactorsTest {
  @Test
  public void factors() {
    assertTrue(factorsOf(1).isEmpty());
    assertThat(factorsOf(2), contains(2));
    assertThat(factorsOf(3), contains(3));
    assertThat(factorsOf(4), contains(2, 2));
    assertThat(factorsOf(5), contains(5));
    assertThat(factorsOf(6), contains(2, 3));
    assertThat(factorsOf(7), contains(7));
    assertThat(factorsOf(8), contains(2, 2, 2));
    assertThat(factorsOf(9), contains(3, 3));
  }

  private List<Integer> factorsOf(int n) {
    ArrayList<Integer> factors = new ArrayList<>();
    if (n > 1) {
      while (n % 2 == 0) {
        factors.add(2);
        n /= 2;
      }
      while (n % 3 == 0) {
        factors.add(3);
        n /= 3;
      }
      if (n > 1) factors.add(n);
    }
    return factors;
  }
}
