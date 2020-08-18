package com.xcv58.leetcode.non_decreasing_array;

public class Solution {

  public boolean checkPossibility(int[] nums) {
    if (nums == null) {
      return true;
    }
    for (int i = 1; i < nums.length; i++) {
      if (nums[i - 1] > nums[i]) {
        return isNoDecreasingArray(nums, i) || isNoDecreasingArray(nums, i - 1);
      }
    }
    return true;
  }

  private boolean isNoDecreasingArray(int[] nums, int skip) {
    if (nums == null) {
      return true;
    }
    for (int i = 1; i < nums.length; i++) {
      int left = i - 1;
      int right = i;
      if (left == skip) {
        left--;
      }
      if (right == skip) {
        right++;
      }
      if (left < 0 || right >= nums.length) {
        continue;
      }
      if (nums[left] > nums[right]) {
        return false;
      }
    }
    return true;
  }
}
