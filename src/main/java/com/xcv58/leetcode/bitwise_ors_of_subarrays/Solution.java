package com.xcv58.leetcode.bitwise_ors_of_subarrays;

import java.util.HashSet;

public class Solution {

  public int subarrayBitwiseORs(int[] A) {
    HashSet<Integer> res = new HashSet<>();
    HashSet<Integer> current = new HashSet<>();
    current.add(0);
    for (int a : A) {
      HashSet<Integer> next = new HashSet<>();
      next.add(a);
      for (int pre : current) {
        next.add(pre | a);
      }
      current = next;
      res.addAll(next);
    }
    return res.size();
  }
}
