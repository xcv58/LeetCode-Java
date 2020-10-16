package com.xcv58.leetcode.reducing_dishes;

import java.util.Arrays;

public class Solution {

  public int maxSatisfaction(int[] satisfaction) {
    if (satisfaction == null) {
      return 0;
    }
    Arrays.sort(satisfaction);
    int len = satisfaction.length;
    int[] dp = new int[len + 1];
    for (int i = len - 1, sum = 0; i >= 0; i--) {
      int num = satisfaction[i];
      dp[i] = dp[i + 1];
      if (num + sum > 0) {
        dp[i] += num + sum;
        sum += num;
      }
    }
    return dp[0];
  }
}
