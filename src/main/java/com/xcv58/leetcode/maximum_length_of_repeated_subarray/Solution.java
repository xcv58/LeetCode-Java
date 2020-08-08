package com.xcv58.leetcode.maximum_length_of_repeated_subarray;

public class Solution {

  public int findLength(int[] A, int[] B) {
    if (A == null || B == null) {
      return 0;
    }
    int res = 0;
    int lenA = A.length;
    int lenB = B.length;
    int[][] dp = new int[lenA + 1][lenB + 1];
    for (int i = 0; i < lenA; i++) {
      int a = A[i];
      for (int j = 0; j < lenB; j++) {
        int b = B[j];
        if (a == b) {
          dp[i + 1][j + 1] = dp[i][j] + 1;
          res = Math.max(res, dp[i + 1][j + 1]);
        }
      }
    }
    return res;
  }
}
