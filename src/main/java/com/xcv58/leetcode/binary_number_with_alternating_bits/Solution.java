package com.xcv58.leetcode.binary_number_with_alternating_bits;

public class Solution {

  public boolean hasAlternatingBits(int n) {
    for (
      long base = 1, target = 1 - (n % 2);
      base < n;
      base <<= 1, target ^= 1
    ) {
      if (((n & base) > 0) == (target > 0)) {
        return false;
      }
    }
    return true;
  }
}
