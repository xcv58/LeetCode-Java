package com.xcv58.leetcode.longest_well_performing_interval;

public class Solution {

  public int longestWPI(int[] hours) {
    if (hours == null || hours.length == 0) {
      return 0;
    }
    int len = hours.length;
    int[] nums = new int[len + 1];
    for (int i = 0, sum = 0; i < len; i++) {
      sum += (hours[i] > 8 ? 1 : -1);
      nums[i + 1] = sum;
    }
    int res = 0;
    for (int i = 0; i <= len; i++) {
      for (int j = 0; j < i; j++) {
        if (nums[i] - nums[j] > 0) {
          res = Math.max(res, i - j);
          break;
        }
      }
    }
    return res;
  }
}
