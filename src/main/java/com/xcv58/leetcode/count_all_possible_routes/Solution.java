package com.xcv58.leetcode.count_all_possible_routes;

public class Solution {
  private long MOD = 1_000_000_007;

  public int countRoutes(int[] locations, int start, int finish, int fuel) {
    if (locations == null || locations.length == 0) {
      return 0;
    }
    int len = locations.length;
    if (start < 0 || finish < 0 || start >= len || finish >= len) {
      return 0;
    }
    long[][] dp = new long[len][fuel + 1];
    dp[start][fuel] = 1;
    for (int j = fuel - 1; j >= 0; j--) {
      for (int i = 0; i < len; i++) {
        for (int ii = 0; ii < len; ii++) {
          if (i == ii) {
            continue;
          }
          int distance = Math.abs(locations[i] - locations[ii]);
          if (j + distance > fuel) {
            continue;
          }
          dp[i][j] = (dp[i][j] + dp[ii][j + distance]) % MOD;
        }
      }
    }
    long res = 0;
    for (int j = 0; j < fuel + 1; j++) {
      res = (res + dp[finish][j]) % MOD;
    }
    return (int) res;
  }
}
