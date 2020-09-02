package com.xcv58.leetcode.three_consecutive_odds;

public class Solution {

  public boolean threeConsecutiveOdds(int[] arr) {
    if (arr == null) {
      return false;
    }
    int odd = 0;
    for (int n : arr) {
      if (n % 2 == 1) {
        odd++;
      } else {
        odd = 0;
      }
      if (odd >= 3) {
        return true;
      }
    }
    return false;
  }
}
