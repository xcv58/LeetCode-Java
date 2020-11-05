package com.xcv58.leetcode.count_all_valid_pickup_and_delivery_options;

import java.util.*;

public class Solution {
  private HashMap<String, Long> map = new HashMap<>();

  private long MOD = 1_000_000_007;

  public int countOrders(int n) {
    return (int) countOrders(n, n);
  }

  private long countOrders(int p, int d) {
    String key = p + "-" + d;
    if (map.containsKey(key)) {
      return map.get(key);
    }
    if (p == 1 && d == 1) {
      return 1L;
    }
    if (p == 0 || d == 0) {
      int count = p + d;
      long res = count;
      while (count-- > 1) {
        res = res * count % MOD;
      }
      map.put(key, res);
      return res;
    }
    long res =
      p * countOrders(p - 1, d) + Math.max(0, d - p) * countOrders(p, d - 1);
    res %= MOD;
    map.put(key, res);
    return res;
  }
}
