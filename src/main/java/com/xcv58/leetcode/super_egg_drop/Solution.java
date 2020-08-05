package com.xcv58.leetcode.super_egg_drop;

import java.util.*;

public class Solution {

  public int superEggDrop(int K, int N) {
    if (K == 1) {
      return N;
    }
    int[] dp = new int[K + 1];
    for (int step = 1; true; step++) {
      int[] next = new int[K + 1];
      for (int i = 1; i < K + 1; i++) {
        if (Integer.MAX_VALUE - dp[i] - 1 <= dp[i - 1]) {
          return step;
        }
        next[i] = dp[i] + dp[i - 1] + 1;
      }
      dp = next;
      if (dp[K] >= N) {
        return step;
      }
    }
  }
}
