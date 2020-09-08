package com.xcv58.leetcode.delete_and_earn;

import java.util.*;

public class Solution {

  public int deleteAndEarn(int[] nums) {
    if (nums == null || nums.length < 1) {
      return 0;
    }
    Arrays.sort(nums);
    int len = nums.length;
    int[] pre = new int[len];
    int[] cur = new int[len];
    cur[0] = nums[0];
    int[] base = pre;
    for (int i = 1, count = 1; i < len; i++) {
      if (nums[i - 1] == nums[i]) {
        count++;
        pre[i] = pre[i - 1];
      } else {
        base = nums[i] - nums[i - 1] == 1 ? pre : cur;
        count = 1;
        pre[i] = cur[i - 1];
      }
      cur[i] = Math.max(pre[i], base[Math.max(0, i - count)] + count * nums[i]);
    }
    return cur[len - 1];
  }
}
