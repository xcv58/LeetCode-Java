package com.xcv58.leetcode.sum_of_subsequence_widths;

import java.util.*;

public class Solution {
  private int MOD = 1000000007;

  public int sumSubseqWidths(int[] A) {
    if (A == null || A.length == 0) {
      return 0;
    }
    Arrays.sort(A);
    long res = 0, possible = 1;
    for (int i = 0; i < A.length; i++) {
      int j = A.length - 1 - i;
      res = (res + possible * (A[i] - A[j])) % MOD;
      possible = (possible * 2) % MOD;
    }
    return (int) res;
  }
}
