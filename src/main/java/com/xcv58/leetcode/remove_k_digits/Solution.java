package com.xcv58.leetcode.remove_k_digits;

public class Solution {

  public String removeKdigits(String num, int k) {
    if (k <= 0 || num == null || num.length() <= 0) {
      return num;
    }
    int n = 0;
    int i = 0;
    for (; i < num.length(); i++) {
      int current = num.charAt(i) - '0';
      if (current < n) {
        break;
      }
      n = current;
    }
    String res = removeKdigits(
      num.substring(0, i - 1) + num.substring(i),
      k - 1
    );
    return removeLeadingZero(res);
  }

  private String removeLeadingZero(String num) {
    if (num == null) {
      return num;
    }
    for (int i = 0; i < num.length(); i++) {
      if (num.charAt(i) != '0') {
        return num.substring(i);
      }
    }
    return "0";
  }
}
