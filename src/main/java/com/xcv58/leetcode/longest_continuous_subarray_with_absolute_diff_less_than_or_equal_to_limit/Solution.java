package com.xcv58.leetcode.longest_continuous_subarray_with_absolute_diff_less_than_or_equal_to_limit;

public class Solution {

  public int longestSubarray(int[] nums, int limit) {
    if (nums == null || nums.length == 0) {
      return 0;
    }
    int res = 0;
    for (int i = 0, j = 0; i < nums.length;) {
      int max = nums[i], min = nums[i], maxIndex = i, minIndex = i;
      for (; j < nums.length; j++) {
        if (max <= nums[j]) {
          max = nums[j];
          maxIndex = j;
        }
        if (min >= nums[j]) {
          min = nums[j];
          minIndex = j;
        }
        if (max - min > limit) {
          break;
        }
        res = Math.max(res, j - i + 1);
      }
      if (j >= nums.length) {
        break;
      }
      i = Math.min(maxIndex, minIndex) + 1;
      j = i;
    }
    return res;
  }
}
