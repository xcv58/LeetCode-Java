package com.xcv58.leetcode.sum_of_square_numbers;

import java.util.*;

public class Solution {

  public boolean judgeSquareSum(int c) {
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i <= c; i++) {
      if (i > 0 && Integer.MAX_VALUE / i <= i) {
        break;
      }
      int prod = i * i;
      set.add(prod);
      if (prod > c) {
        break;
      }
      if (set.contains(c - prod)) {
        return true;
      }
    }
    return false;
  }
}
