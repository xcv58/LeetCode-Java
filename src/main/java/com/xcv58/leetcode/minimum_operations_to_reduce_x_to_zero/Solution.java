package com.xcv58.leetcode.minimum_operations_to_reduce_x_to_zero;

import java.util.*;

public class Solution {

  public int minOperations(int[] nums, int x) {
    if (nums == null) {
      return -1;
    }
    int len = nums.length;
    int[] left = new int[len + 1];
    for (int i = 0, sum = 0; i < len; i++) {
      sum += nums[i];
      left[i + 1] = sum;
    }
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0, len);
    for (int i = len - 1, sum = 0; i >= 0; i--) {
      sum += nums[i];
      map.put(sum, i);
    }
    int res = -1;
    for (int i = 0; i < len; i++) {
      int j = map.getOrDefault(x - left[i], -1);
      if (j >= i) {
        if (res == -1) {
          res = len - j + i;
        }
        res = Math.min(res, len - j + i);
      }
    }
    return res;
  }
}
