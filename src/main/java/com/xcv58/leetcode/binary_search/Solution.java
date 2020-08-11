package com.xcv58.leetcode.binary_search;

public class Solution {

  public int search(int[] nums, int target) {
    if (nums == null) {
      return -1;
    }
    int i = 0, j = nums.length - 1;
    while (i < j) {
      int mid = i + (j - i) / 2;
      if (nums[mid] < target) {
        i = mid + 1;
      } else {
        j = mid;
      }
    }
    if (i > nums.length || i <= 0) {
      return -1;
    }
    if (nums[i] == target) {
      return i;
    }
    return -1;
  }
}
