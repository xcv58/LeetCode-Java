package com.xcv58.leetcode.reaching_points;

public class Solution {

  public boolean reachingPoints(int sx, int sy, int tx, int ty) {
    if (sx == tx && sy == ty) {
      return true;
    }
    if (sx > tx || sy > ty) {
      return false;
    }
    if (tx > ty) {
      tx = reduce(tx, ty, sx);
    } else {
      ty = reduce(ty, tx, sy);
    }
    return reachingPoints(sx, sy, tx, ty);
  }

  private int reduce(int large, int small, int base) {
    if (base > small) {
      return large - small;
    }
    if (base == small) {
      return large % small + small;
    }
    return large % small;
  }
}
