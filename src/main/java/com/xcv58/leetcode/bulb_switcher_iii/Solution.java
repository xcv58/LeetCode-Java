package com.xcv58.leetcode.bulb_switcher_iii;

public class Solution {

  public int numTimesAllBlue(int[] light) {
    if (light == null || light.length == 0) {
      return 0;
    }
    int res = 0;
    for (int i = 0, max = 0; i < light.length; i++) {
      if (max < light[i]) {
        max = light[i];
      }
      if (max == i + 1) {
        res++;
      }
    }
    return res;
  }
}
