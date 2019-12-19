package com.xcv58.leetcode.can_i_win;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
  public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
    if ((maxChoosableInteger + 1) * maxChoosableInteger / 2 < desiredTotal) {
      return false;
    }
    int[] nums = new int[maxChoosableInteger];
    HashMap<String, Boolean> map = new HashMap<>();
    return this.canIWin(nums, desiredTotal, map);
  }

  private boolean canIWin(int[] nums, int desiredTotal, HashMap<String, Boolean> map) {
    String key = Arrays.toString(nums) + "-" + desiredTotal;
    if (map.containsKey(key)) {
      return map.get(key);
    }
    for (int i = nums.length - 1; i >= 0; i--) {
      if (nums[i] == 0) {
        if (i + 1 >= desiredTotal) {
          return true;
        }
        nums[i] = 1;
        if (!this.canIWin(nums, desiredTotal - i - 1, map)) {
          nums[i] = 0;
          map.put(key, true);
          return true;
        }
        nums[i] = 0;
      }
    }
    map.put(key, false);
    return false;
  }
}
