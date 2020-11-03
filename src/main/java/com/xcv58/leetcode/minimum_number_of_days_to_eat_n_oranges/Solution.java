package com.xcv58.leetcode.minimum_number_of_days_to_eat_n_oranges;

import java.util.HashMap;

public class Solution {
  private HashMap<Integer, Integer> cache = new HashMap<>();

  public int minDays(int n) {
    if (n <= 1) {
      return n;
    }
    if (cache.containsKey(n)) {
      return cache.get(n);
    }
    int res = 1 + Math.min((n % 2) + minDays(n / 2), (n % 3) + minDays(n / 3));
    cache.put(n, res);
    return res;
  }
}
