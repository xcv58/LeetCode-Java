package com.xcv58.leetcode.can_i_win;

import java.util.HashMap;

public class Solution {
  public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
    if ((maxChoosableInteger + 1) * maxChoosableInteger / 2 < desiredTotal) {
      return false;
    }
    int index = this.getIndex(maxChoosableInteger);
    HashMap<Integer, Boolean> map = new HashMap<>();
    return this.canIWin(index, desiredTotal, map);
  }

  protected int getIndex(int x) {
    int index = 0;
    for (int i = 0, bit = 1; i < x; i++, bit <<= 1) {
      index = index | bit;
    }
    return index;
  }

  private boolean canIWin(int index, int desiredTotal, HashMap<Integer, Boolean> map) {
    Integer key = (index << 10) + desiredTotal;
    if (map.containsKey(key)) {
      return map.get(key);
    }
    for (int i = 1, bit = 1; i <= 20; i++, bit <<= 1) {
      if ((bit & index) > 0) {
        if (i >= desiredTotal) {
          return true;
        }
        index -= bit;
        if (!this.canIWin(index, desiredTotal - i, map)) {
          index += bit;
          map.put(key, true);
          return true;
        }
        index += bit;
      }
    }
    map.put(key, false);
    return false;
  }
}
