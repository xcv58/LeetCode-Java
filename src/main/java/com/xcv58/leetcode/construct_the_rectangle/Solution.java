package com.xcv58.leetcode.construct_the_rectangle;

public class Solution {

  public int[] constructRectangle(int area) {
    if (area <= 0) {
      return null;
    }
    int[] res = new int[] { -1, -1 };
    for (int i = 1; i * i <= area; i++) {
      if (area % i != 0) {
        continue;
      }
      int j = area / i;
      if (res[0] == -1) {
        res = new int[] { j, i };
      }
      if (j - i < res[0] - res[1]) {
        res = new int[] { j, i };
      }
    }
    return res;
  }
}
