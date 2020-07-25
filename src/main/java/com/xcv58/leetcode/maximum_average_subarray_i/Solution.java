package com.xcv58.leetcode.maximum_average_subarray_i;

public class Solution {

  public double findMaxAverage(int[] nums, int k) {
    Double max = null;
    for (int i = 0, sum = 0; i < nums.length; i++) {
      sum += nums[i];
      if (i >= k) {
        sum -= nums[i - k];
      }
      if (i + 1 >= k) {
        double avg = (double) sum / k;
        max = max == null ? avg : max;
        max = Math.max(max, avg);
      }
    }
    return max;
  }
}
