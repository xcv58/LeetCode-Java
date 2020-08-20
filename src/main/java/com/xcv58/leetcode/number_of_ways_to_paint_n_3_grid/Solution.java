package com.xcv58.leetcode.number_of_ways_to_paint_n_3_grid;

import java.util.*;

public class Solution {
  private int[] PAINTS = new int[] {
    10,
    12,
    20,
    21,
    101,
    102,
    121,
    120,
    202,
    201,
    212,
    210,
  };

  private long MOD = 1_000_000_007;

  private HashMap<Integer, List<Integer>> compatibleMap = new HashMap<>();

  public int numOfWays(int n) {
    HashMap<Integer, Long> map = new HashMap<>();
    for (int paint : PAINTS) {
      map.put(paint, 1L);
    }
    for (int i = 1; i < n; i++) {
      HashMap<Integer, Long> newMap = new HashMap<>();
      for (int paint : PAINTS) {
        // get list of compatible paints
        // Sum up and set the new map
        List<Integer> compatiblePaints = getCompatiblePaints(paint);
        long sum = 0L;
        for (int compatiblePaint : compatiblePaints) {
          sum = (sum + map.get(compatiblePaint)) % MOD;
        }
        newMap.put(paint, sum);
      }
      map = newMap;
    }
    long res = 0;
    for (long v : map.values()) {
      res = (res + v) % MOD;
    }
    return (int) res;
  }

  private List<Integer> getCompatiblePaints(int paint) {
    if (!compatibleMap.containsKey(paint)) {
      List<Integer> list = new ArrayList<>();
      for (int p : PAINTS) {
        if (isCompatiblePaints(p, paint)) {
          list.add(p);
        }
      }
      compatibleMap.put(paint, list);
    }
    return compatibleMap.get(paint);
  }

  private boolean isCompatiblePaints(int p1, int p2) {
    for (int i = 0; i < 3; i++) {
      if ((p1 % 10) == (p2 % 10)) {
        return false;
      }
      p1 /= 10;
      p2 /= 10;
    }
    return true;
  }
}
