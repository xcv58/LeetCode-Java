package com.xcv58.leetcode.greatest_common_divisor_of_strings;

public class Solution {

  public String gcdOfStrings(String str1, String str2) {
    if (str1 == null || str2 == null) {
      return "";
    }
    String res = "";
    for (int i = 1; i <= Math.min(str1.length(), str2.length()); i++) {
      String tmp = str1.substring(0, i);
      if (isDividable(str1, tmp) && isDividable(str2, tmp)) {
        res = tmp;
      }
    }
    return res;
  }

  private boolean isDividable(String s, String dividor) {
    if (s.length() % dividor.length() != 0) {
      return false;
    }
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) != dividor.charAt(i % dividor.length())) {
        return false;
      }
    }
    return true;
  }
}
