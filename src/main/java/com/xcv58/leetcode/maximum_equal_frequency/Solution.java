package com.xcv58.leetcode.maximum_equal_frequency;

import java.util.*;
import java.util.stream.*;

public class Solution {

  public int maxEqualFreq(int[] nums) {
    if (nums == null) {
      return 0;
    }
    int res = 0;
    HashMap<Integer, Integer> countMap = new HashMap<>();
    HashMap<Integer, Integer> timesMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int count = countMap.getOrDefault(nums[i], 0);
      countMap.put(nums[i], count + 1);
      this.updateTimesMap(timesMap, count);
      if (timesMap.size() > 2) {
        continue;
      }
      if (timesMap.size() == 1) {
        if (timesMap.containsKey(1) || timesMap.containsValue(1)) {
          res = i + 1;
        }
        continue;
      }
      Integer[] keys = new Integer[2];
      timesMap.keySet().toArray(keys);
      int max = keys[0] > keys[1] ? keys[0] : keys[1];
      int min = keys[0] > keys[1] ? keys[1] : keys[0];
      if (
        (max - min == 1 && timesMap.get(max) == 1) ||
        (min == 1 && timesMap.get(1) == 1)
      ) {
        res = i + 1;
      }
    }
    return res;
  }

  private void updateTimesMap(HashMap<Integer, Integer> timesMap, int count) {
    if (timesMap.containsKey(count)) {
      int times = timesMap.get(count);
      if (times > 1) {
        timesMap.put(count, times - 1);
      } else {
        timesMap.remove(count);
      }
    }
    timesMap.put(count + 1, timesMap.getOrDefault(count + 1, 0) + 1);
  }
}
