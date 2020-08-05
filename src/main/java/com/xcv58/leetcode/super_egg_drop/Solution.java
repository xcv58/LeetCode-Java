package com.xcv58.leetcode.super_egg_drop;

import java.util.*;

public class Solution {
  HashMap<String, Integer> cache = new HashMap<>();

  public int superEggDrop(int K, int N) {
    if (N <= 2) {
      return N;
    }
    if (K == 1) {
      return N;
    }
    int ceilLog = ceilLog(N + 1);
    if (K >= ceilLog) {
      return ceilLog;
    }
    String key = K + "-" + N;
    if (cache.containsKey(key)) {
      return cache.get(key);
    }
    int res = N;
    for (int i = N / 2; i < N - K + 1; i++) {
      int tmp =
        1 + Math.max(superEggDrop(K, i - 1), superEggDrop(K - 1, N - i));
      res = Math.min(res, tmp);
    }
    cache.put(key, res);
    return res;
  }

  private int ceilLog(int x) {
    int res = 0;
    for (int num = 1; num < x; num *= 2) {
      res++;
    }
    return res;
  }
}
