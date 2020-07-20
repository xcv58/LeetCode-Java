package com.xcv58.leetcode.wiggle_subsequence;

public class Solution {

  public int wiggleMaxLength(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }
    int maxLen = 0;
    Integer pre = null; // indicate previous number
    for (int i = 1; i < nums.length; i++) {
      int diff = nums[i] - nums[i - 1];
      if (diff == 0) {
        continue;
      }
      if ((pre == null) || (pre < 0 && diff > 0) || (pre > 0 && diff < 0)) {
        pre = diff;
        maxLen++;
      }
    }
    return maxLen + 1;
  }
}
