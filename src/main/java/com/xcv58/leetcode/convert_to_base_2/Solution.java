package com.xcv58.leetcode.convert_to_base_2;

public class Solution {

  public String baseNeg2(int N) {
    if (N == 0) {
      return "0";
    }
    StringBuilder res = new StringBuilder();
    for (; N != 0; N /= -2) {
      int unit = (N % 2) * (N % 2);
      res.append(unit);
      N -= unit;
    }
    return res.reverse().toString();
  }
}
