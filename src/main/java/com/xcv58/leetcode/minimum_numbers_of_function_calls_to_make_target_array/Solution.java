package com.xcv58.leetcode.minimum_numbers_of_function_calls_to_make_target_array;

public class Solution {

  public int minOperations(int[] nums) {
    if (nums == null) {
      return 0;
    }
    int res = 0;
    while (true) {
      int max = 0;
      for (int i = 0; i < nums.length; i++) {
        if (nums[i] % 2 == 1) {
          res++;
          nums[i]--;
        }
        max = Math.max(max, nums[i]);
      }
      if (max == 0) {
        return res;
      }
      for (int i = 0; i < nums.length; i++) {
        nums[i] /= 2;
      }
      res++;
    }
  }
}
