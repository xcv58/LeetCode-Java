package com.xcv58.leetcode.integer_break;

public class Solution {
  private int[] map = new int[100];

  public int integerBreak(int n) {
    if (n == 1) {
      return 0;
    }
    if (n == 2) {
      return 1;
    }
    if (map[n] == 0) {
      int max = 0;
      for (int i = 1; i < (n + 2) / 2; i++) {
        max = Math.max(max, this.max(i) * this.max(n - i));
      }
      map[n] = max;
    }
    return map[n];
  }

  private int max(int n) {
    return Math.max(n, this.integerBreak(n));
  }
}
