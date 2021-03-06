package com.xcv58.leetcode.factorial_trailing_zeroes;

public class Solution {

  public int trailingZeroes(int n) {
    int count = 0;
    for (long i = 5; i <= (long) n; i *= 5) {
      count += n / i;
    }
    return count;
  }
}
