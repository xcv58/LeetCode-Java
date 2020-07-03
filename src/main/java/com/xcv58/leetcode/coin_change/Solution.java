package com.xcv58.leetcode.coin_change;

import java.util.*;

public class Solution {

  public int coinChange(int[] coins, int amount) {
    int[] dp = new int[amount + 1];
    Arrays.fill(dp, 1, amount + 1, amount + 1);
    for (int i = 1; i < amount + 1; i++) {
      for (int coin : coins) {
        if (i >= coin) {
          dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
        }
      }
    }
    return dp[amount] == amount + 1 ? -1 : dp[amount];
  }
}
