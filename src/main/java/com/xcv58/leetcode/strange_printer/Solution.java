package com.xcv58.leetcode.strange_printer;

public class Solution {

  public int strangePrinter(String s) {
    if (s == null || s.length() == 0) {
      return 0;
    }
    int len = s.length();
    int[][] dp = new int[len][len];
    return strangePrinter(s, 0, s.length() - 1, dp);
  }

  public int strangePrinter(String s, int i, int j, int[][] dp) {
    if (i > j) {
      return 0;
    }
    if (dp[i][j] != 0) {
      return dp[i][j];
    }
    int res = strangePrinter(s, i + 1, j, dp) + 1;
    for (int k = i + 1; k <= j; k++) {
      if (s.charAt(i) == s.charAt(k)) {
        res =
          Math.min(
            res,
            strangePrinter(s, i, k - 1, dp) + strangePrinter(s, k + 1, j, dp)
          );
      }
    }
    dp[i][j] = res;
    return res;
  }
}
