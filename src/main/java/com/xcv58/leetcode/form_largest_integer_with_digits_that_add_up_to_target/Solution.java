package com.xcv58.leetcode.form_largest_integer_with_digits_that_add_up_to_target;

public class Solution {

  public String largestNumber(int[] cost, int target) {
    if (cost == null || cost.length != 9 || target <= 0) {
      return "0";
    }
    int[] counts = new int[target + 1];
    for (int t = 1; t <= target; t++) {
      counts[t] = Integer.MIN_VALUE;
      for (int i = 0; i < 9; i++) {
        if (t >= cost[i]) {
          counts[t] = Math.max(counts[t], 1 + counts[t - cost[i]]);
        }
      }
    }
    if (counts[target] < 0) {
      return "0";
    }
    String res = "";
    for (int i = 8; i >= 0; i--) {
      while (
        target >= cost[i] && counts[target] == counts[target - cost[i]] + 1
      ) {
        res += i + 1;
        target -= cost[i];
      }
    }
    return res;
  }
}
