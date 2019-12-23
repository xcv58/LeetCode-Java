package com.xcv58.leetcode.primes;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    for (int i = 0; i < 10000; i++) {
      int num = countPrime(i);
      assertEquals(
        String.format("n = %d, num = %d", i, num),
        num,
        solution.countPrime(i)
      );
    }
  }

  private int countPrime(int n) {
    int sum = 0;
    for (int i = 2; i <= n; i++) {
      sum += isPrime(i) ? 1 : 0;
    }
    return sum;
  }

  private boolean isPrime(int n) {
    if (n < 2) {
      return false;
    }
    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}
