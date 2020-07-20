package com.xcv58.leetcode.distinct_subsequences;

import java.util.*;

public class Solution {

  public int numDistinct(String s, String t) {
    if (
      s == null ||
      t == null ||
      s.length() == 0 ||
      t.length() == 0 ||
      s.length() < t.length()
    ) {
      return 0;
    }
    int m = t.length() + 1;
    int n = s.length() + 1;
    int[][] dp = new int[m][n];
    Arrays.fill(dp[0], 1);
    for (int i = 1; i < m; i++) {
      for (int j = i; j < n; j++) {
        dp[i][j] = dp[i][j - 1];
        if (s.charAt(j - 1) == t.charAt(i - 1)) {
          dp[i][j] += dp[i - 1][j - 1];
        }
      }
    }
    return dp[m - 1][n - 1];
  }
}
