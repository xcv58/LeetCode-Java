package com.xcv58.leetcode.number_of_dice_rolls_with_target_sum;

import java.util.*;

public class Solution {
  private long MOD = 1_000_000_007;

  private HashMap<String, Integer> cache = new HashMap<>();

  public int numRollsToTarget(int d, int f, int target) {
    if (d <= 0 || target <= 0) {
      return 0;
    }
    if (d == 1) {
      return target <= f ? 1 : 0;
    }
    int prod = d * f;
    if (prod < target) {
      return 0;
    }
    if (prod == target) {
      return 1;
    }
    String key = d + "-" + f + "-" + target;
    if (!cache.containsKey(key)) {
      long sum = 0;
      for (int i = 1; i <= f; i++) {
        sum = (sum + numRollsToTarget(d - 1, f, target - i)) % MOD;
      }
      cache.put(key, (int) sum);
    }
    return cache.get(key);
  }
}
