package com.xcv58.leetcode.minimum_value_to_get_positive_step_by_step_sum;

public class Solution {

  public int minStartValue(int[] nums) {
    if (nums == null) {
      return 1;
    }
    int i = 1;
    int min = 1;
    for (int num : nums) {
      i += num;
      min = Math.min(min, i);
    }
    if (min < 1) {
      return 2 - min;
    }
    return 1;
  }
}
