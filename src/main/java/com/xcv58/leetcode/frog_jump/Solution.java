package com.xcv58.leetcode.frog_jump;

import java.util.*;

public class Solution {

  public boolean canCross(int[] stones) {
    if (stones == null || stones.length == 0) {
      return false;
    }
    int len = stones.length;
    HashSet<Integer>[] sets = new HashSet[len];
    sets[0] = new HashSet<>();
    sets[0].add(0);
    for (int i = 1, max = 0; i < len; i++) {
      sets[i] = new HashSet<>();
      for (int j = i - 1; j >= 0; j--) {
        int distance = stones[i] - stones[j];
        for (int k : sets[j]) {
          if (Math.abs(k - distance) <= 1) {
            sets[i].add(distance);
            max = Math.max(max, distance);
          }
        }
        if (distance > max) {
          break;
        }
      }
    }
    return sets[len - 1].size() > 0;
  }
}
