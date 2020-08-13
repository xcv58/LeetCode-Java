package com.xcv58.leetcode.running_sum_of_1d_array;

public class Solution {

  public int[] runningSum(int[] nums) {
    if (nums == null) {
      return null;
    }
    int[] res = new int[nums.length];
    for (int i = 0, sum = 0; i < nums.length; i++) {
      sum += nums[i];
      res[i] = sum;
    }
    return res;
  }
}
