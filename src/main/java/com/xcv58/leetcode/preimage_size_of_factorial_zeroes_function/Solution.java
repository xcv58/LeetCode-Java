package com.xcv58.leetcode.preimage_size_of_factorial_zeroes_function;

public class Solution {

  public int preimageSizeFZF(int K) {
    long i = 0, j = Long.MAX_VALUE;
    while (i < j) {
      long mid = i + (j - i) / 2;
      long count = this.trailingZeroes(mid);
      if (count == K) {
        return 5;
      }
      if (count > K) {
        j = mid;
      } else {
        i = mid + 1;
      }
    }
    return 0;
  }

  private long trailingZeroes(long n) {
    long count = 0;
    for (long i = 5; i <= n && Long.MAX_VALUE / 5 >= i; i *= 5) {
      count += n / i;
    }
    return count;
  }
}
