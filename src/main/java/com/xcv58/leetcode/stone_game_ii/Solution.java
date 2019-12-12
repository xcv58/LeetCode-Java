package com.xcv58.leetcode.stone_game_ii;

import java.util.HashMap;

public class Solution {
  private HashMap<String, Integer> map;
  private int[] reverseSum;

  public int stoneGameII(int[] piles) {
    this.map = new HashMap<>();
    this.reverseSum = new int[piles.length];
    for (int i = piles.length - 1, tmp = 0; i >= 0; i--) {
      tmp += piles[i];
      reverseSum[i] = tmp;
    }
    return this.stoneGameII(piles, 1, 0);
  }

  private int stoneGameII(int[] piles, int M, int start) {
    if (start >= piles.length) {
      return 0;
    }
    String key = start + "-" + M;
    if (this.map.containsKey(key)) {
      return map.get(key);
    }
    int max = 0;
    for (int i = 1; i <= 2 * M; i++) {
      int sum = 0;
      for (int j = start; j < start + i && j < piles.length; j++) {
        sum += piles[j];
      }
      int current = sum + this.restSum(start + i) - this.stoneGameII(piles, Math.max(M, i), start + i);
      max = Math.max(current, max);
    }
    this.map.put(key, max);
    return max;
  }

  private int restSum(int index) {
    if (index < this.reverseSum.length && index >= 0) {
      return this.reverseSum[index];
    }
    return 0;
  }
}
