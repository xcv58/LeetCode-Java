package com.xcv58.leetcode.number_of_ways_to_stay_in_the_same_place_after_some_steps;

public class Solution {

  public int numWays(int steps, int arrLen) {
    int maxLen = Math.min(steps, arrLen);
    long[] dp = new long[maxLen + 2];
    dp[1] = 1;
    for (int i = 1; i <= steps; i++) {
      long[] tmp = new long[maxLen + 2];
      for (int j = 1; j <= maxLen; j++) {
        tmp[j] = dp[j] + dp[j - 1] + dp[j + 1];
        tmp[j] %= 1_000_000_007;
      }
      dp = tmp;
    }
    return (int) dp[1];
  }
}
