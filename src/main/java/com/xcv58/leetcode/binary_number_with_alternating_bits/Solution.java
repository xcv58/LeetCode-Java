package com.xcv58.leetcode.binary_number_with_alternating_bits;

public class Solution {

  public boolean hasAlternatingBits(int n) {
    for (int target = 1 - (n % 2); n > 0; n /= 2, target ^= 1) {
      if (target == n % 2) {
        return false;
      }
    }
    return true;
  }
}
