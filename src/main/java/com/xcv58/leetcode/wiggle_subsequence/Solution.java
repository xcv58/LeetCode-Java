package com.xcv58.leetcode.wiggle_subsequence;

public class Solution {

  public int wiggleMaxLength(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }
    int len = nums.length;
    int[] diff = new int[len - 1];
    for (int i = 1; i < len; i++) {
      diff[i - 1] = nums[i] - nums[i - 1];
    }
    int maxLen = 0;
    Integer pre = null; // indicate previous number
    for (int i = 0; i < len - 1; i++) {
      if (diff[i] == 0) {
        continue;
      }
      if (pre == null) {
        pre = diff[i];
        maxLen++;
        continue;
      }
      if ((pre < 0 && diff[i] > 0) || (pre > 0 && diff[i] < 0)) {
        pre = diff[i];
        maxLen++;
      }
    }
    return maxLen + 1;
  }
}
