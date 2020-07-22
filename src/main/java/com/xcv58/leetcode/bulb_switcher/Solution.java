package com.xcv58.leetcode.bulb_switcher;

public class Solution {

  public int bulbSwitch(int n) {
    int res = 1;
    while (n / res >= res) {
      res++;
    }
    return res - 1;
  }
}
