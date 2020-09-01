package com.xcv58.leetcode.allocate_mailboxes;

import java.util.*;

public class Solution {

  public int minDistance(int[] houses, int k) {
    if (houses == null || houses.length == 0 || k <= 0) {
      return 0;
    }
    Arrays.sort(houses);
    return minDistance(houses, 0, k, new HashMap<>());
  }

  private int minDistance(
    int[] houses,
    int from,
    int k,
    HashMap<String, Integer> cache
  ) {
    String key = from + "-" + k;
    if (cache.containsKey(key)) {
      return cache.get(key);
    }
    if (k >= houses.length - from) {
      return 0;
    }
    if (k <= 0) {
      return -1;
    }
    int res = Integer.MAX_VALUE;
    for (int i = from + 1; i <= houses.length; i++) {
      int left = getMinDistance(houses, from, i);
      int right = minDistance(houses, i, k - 1, cache);
      if (right == -1) {
        continue;
      }
      res = Math.min(res, left + right);
    }
    cache.put(key, res);
    return res;
  }

  private int getMinDistance(int[] houses, int from, int to) {
    int res = 0;
    for (int i = from, mid = from + (to - from) / 2; i < to; i++) {
      res += Math.abs(houses[mid] - houses[i]);
    }
    return res;
  }
}
