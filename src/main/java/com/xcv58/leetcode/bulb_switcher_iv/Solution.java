package com.xcv58.leetcode.bulb_switcher_iv;

public class Solution {

  public int minFlips(String target) {
    if (target == null || target.length() == 0) {
      return 0;
    }
    int res = 0;
    int from = findNextIndex(target, 0, '0');
    char c = '1';
    for (int i = from; i < target.length(); res++) {
      i = findNextIndex(target, i, c);
      c = c == '0' ? '1' : '0';
    }
    return res;
  }

  private int findNextIndex(String target, int from, char c) {
    int i = from;
    while (i < target.length() && target.charAt(i) == c) {
      i++;
    }
    return i;
  }
}
