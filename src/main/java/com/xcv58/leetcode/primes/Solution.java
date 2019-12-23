package com.xcv58.leetcode.primes;

public class Solution {

  public int countPrime(int n) {
    boolean[] notPrimes = new boolean[n + 1];
    for (int i = 2; i < n + 1; i++) {
      if (!notPrimes[i]) {
        for (int j = i + i; j < n + 1; j += i) {
          notPrimes[j] = true;
        }
      }
    }

    int sum = 0;
    for (int i = 2; i < n + 1; i++) {
      sum += notPrimes[i] ? 0 : 1;
    }
    return sum;
  }
}
