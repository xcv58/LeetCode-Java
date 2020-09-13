package com.xcv58.leetcode.minimum_deletion_cost_to_avoid_repeating_letters;

public class Solution {

  public int minCost(String s, int[] cost) {
    if (s == null || cost == null || s.length() != cost.length) {
      return 0;
    }
    int res = 0;
    char[] chars = s.toCharArray();
    for (int i = 0; i < chars.length;) {
      int sum = 0;
      int max = cost[i];
      char c = chars[i];
      while (i < chars.length && chars[i] == c) {
        max = Math.max(max, cost[i]);
        sum += cost[i];
        i++;
      }
      res += sum - max;
    }
    return res;
  }
}
