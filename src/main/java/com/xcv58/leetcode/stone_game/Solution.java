package com.xcv58.leetcode.stone_game;

import java.util.HashMap;

public class Solution {
  private HashMap<String, Integer> map;

  public boolean stoneGame(int[] piles) {
    this.map = new HashMap<>();
    return this.stoneGame(piles, 0, piles.length - 1) > 0;
  }

  private int stoneGame(int[] piles, int start, int end) {
    if (start > end) {
      return 0;
    }
    String key = start + "-" + end;
    if (this.map.containsKey(key)) {
      return this.map.get(key);
    }
    int left = piles[start] - this.stoneGame(piles, start + 1, end);
    int right = piles[end] - this.stoneGame(piles, start, end - 1);
    int res = Math.max(left, right);
    this.map.put(key, res);
    return res;
  }
}
