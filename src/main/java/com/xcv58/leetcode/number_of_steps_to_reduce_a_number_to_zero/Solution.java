package com.xcv58.leetcode.number_of_steps_to_reduce_a_number_to_zero;

public class Solution {

  public int numberOfSteps(int num) {
    int res = 0;
    for (; num > 1; num >>= 1) {
      res += 1 + (num & 1);
    }
    return res + num;
  }
}
