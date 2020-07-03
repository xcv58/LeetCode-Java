package com.xcv58.leetcode.coin_change_2;

import java.util.*;

public class Solution {

  public int change(int amount, int[] coins) {
    return this.change(amount, coins, 0, new HashMap<>());
  }

  private int change(
    int amount,
    int[] coins,
    int fromIndex,
    HashMap<String, Integer> cache
  ) {
    if (amount == 0) {
      return 1;
    }
    if (fromIndex >= coins.length) {
      return 0;
    }
    String key = amount + "-" + fromIndex;
    if (cache.containsKey(key)) {
      return cache.get(key);
    }
    int coin = coins[fromIndex];
    int res = 0;
    for (int i = 0; i * coin <= amount; i++) {
      int tmp = this.change(amount - i * coin, coins, fromIndex + 1, cache);
      res += tmp;
    }
    cache.put(key, res);
    return res;
  }
}
