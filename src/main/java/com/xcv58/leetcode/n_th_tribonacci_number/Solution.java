package com.xcv58.leetcode.n_th_tribonacci_number;

public class Solution {

  public int tribonacci(int n) {
    if (n == 0) {
      return 0;
    }
    if (n <= 2) {
      return 1;
    }
    int t0 = 0, t1 = 1, t2 = 1;
    while (n-- > 2) {
      int next = t2 + t1 + t0;
      t0 = t1;
      t1 = t2;
      t2 = next;
    }
    return t2;
  }
}
