package com.xcv58.leetcode._132_pattern;

import java.util.*;

public class Solution {

  public boolean find132pattern(int[] nums) {
    if (nums == null || nums.length < 3) {
      return false;
    }
    Integer[] minArr = new Integer[nums.length];
    int min = nums[0];
    for (int i = 0; i < nums.length; i++) {
      min = Math.min(min, nums[i]);
      if (min < nums[i]) {
        minArr[i] = min;
      }
    }
    TreeMap<Integer, Integer> map = new TreeMap<>();
    for (int i = nums.length - 1; i >= 0; i--) {
      map.put(nums[i], 0);
      Integer floor = map.floorKey(nums[i] - 1);
      if (minArr[i] != null && floor != null) {
        if (minArr[i] < floor) {
          return true;
        }
      }
    }
    return false;
  }
}
