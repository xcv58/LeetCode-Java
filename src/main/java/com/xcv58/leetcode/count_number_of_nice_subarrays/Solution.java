package com.xcv58.leetcode.count_number_of_nice_subarrays;

public class Solution {

  public int numberOfSubarrays(int[] nums, int k) {
    if (nums == null) {
      return 0;
    }
    int len = nums.length;
    int res = 0;
    for (int i = 0, j = 0, count = 0; j < len && i < len;) {
      for (; count < k && j < len; j++) {
        if (nums[j] % 2 == 1) {
          count++;
        }
      }
      if (count < k) {
        return res;
      }
      int pre = 1;
      for (; i < len && nums[i] % 2 == 0; i++) {
        pre++;
      }
      int next = 1;
      for (; j < len && nums[j] % 2 == 0; j++) {
        next++;
      }
      res += pre * next;
      i++;
      count--;
    }
    return res;
  }
}
