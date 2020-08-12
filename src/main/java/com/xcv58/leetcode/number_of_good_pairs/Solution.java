package com.xcv58.leetcode.number_of_good_pairs;

import java.util.*;

public class Solution {

  public int numIdenticalPairs(int[] nums) {
    if (nums == null) {
      return 0;
    }
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
      int count = map.getOrDefault(num, 0);
      map.put(num, count + 1);
    }
    int res = 0;
    for (int count : map.values()) {
      res += (count - 1) * count / 2;
    }
    return res;
  }
}
