package com.xcv58.leetcode.last_stone_weight_ii;

import java.util.*;

public class Solution {

  public int lastStoneWeightII(int[] stones) {
    if (stones == null || stones.length == 0) {
      return 0;
    }
    int len = stones.length;
    HashSet<Integer> set = new HashSet<>(Arrays.asList(0));
    for (int i = 0; i < len; i++) {
      HashSet<Integer> tmpSet = new HashSet<>();
      for (Integer pre : set) {
        tmpSet.add(Math.abs(pre + stones[i]));
        tmpSet.add(Math.abs(pre - stones[i]));
      }
      set = tmpSet;
    }
    if (set.size() == 0) {
      return 0;
    }
    int res = -1;
    for (int i : set) {
      if (res == -1) {
        res = i;
      }
      res = Math.min(res, i);
    }
    return res;
  }
}
