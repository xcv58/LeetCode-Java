package com.xcv58.leetcode.maximum_number_of_balloons;

public class Solution {

  public int maxNumberOfBalloons(String text) {
    if (text == null) {
      return 0;
    }
    int[] map = new int[255];
    for (char c : text.toCharArray()) {
      map[c]++;
    }
    int res = Math.min(map['a'], map['b']);
    res = Math.min(res, map['n']);
    res = Math.min(res, map['o'] / 2);
    res = Math.min(res, map['l'] / 2);
    return res;
  }
}
