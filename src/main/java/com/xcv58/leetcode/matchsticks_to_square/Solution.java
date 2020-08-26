package com.xcv58.leetcode.matchsticks_to_square;

import java.util.*;

public class Solution {

  public boolean makesquare(int[] nums) {
    if (nums == null || nums.length < 4) {
      return false;
    }
    HashMap<Integer, Integer> countMap = new HashMap<>();
    int sum = 0;
    for (int num : nums) {
      sum += num;
      int count = countMap.getOrDefault(num, 0);
      countMap.put(num, count + 1);
    }
    if (sum % 4 != 0) {
      return false;
    }
    int target = sum / 4;
    return makesquare(countMap, target, 0);
  }

  private boolean makesquare(
    HashMap<Integer, Integer> countMap,
    int target,
    int current
  ) {
    if (countMap.size() == 0) {
      return current == 0;
    }
    List<Integer> nums = new ArrayList<>(countMap.keySet());
    for (int num : nums) {
      int count = countMap.get(num);
      int sum = num + current;
      if (sum > target) {
        continue;
      }
      if (count > 1) {
        countMap.put(num, count - 1);
      } else {
        countMap.remove(num);
      }
      if (makesquare(countMap, target, sum % target)) {
        return true;
      }
      countMap.put(num, count);
    }
    return false;
  }
}
