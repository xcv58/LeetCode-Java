package com.xcv58.leetcode._4sum_ii;

import java.util.*;

public class Solution {

  public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
    HashMap<Integer, Integer> m1 = getSumMap(A, B);
    HashMap<Integer, Integer> m2 = getSumMap(C, D);
    int res = 0;
    for (Map.Entry<Integer, Integer> entry : m1.entrySet()) {
      int key = entry.getKey();
      int value = entry.getValue();
      int count = m2.getOrDefault(-key, 0);
      res += count * value;
    }
    return res;
  }

  private HashMap<Integer, Integer> getSumMap(int[] A, int[] B) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int a : A) {
      for (int b : B) {
        int sum = a + b;
        int count = map.getOrDefault(sum, 0);
        map.put(sum, count + 1);
      }
    }
    return map;
  }
}
