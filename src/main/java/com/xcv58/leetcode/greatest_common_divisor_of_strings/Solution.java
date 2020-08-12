package com.xcv58.leetcode.greatest_common_divisor_of_strings;

public class Solution {

  public String gcdOfStrings(String str1, String str2) {
    if (str1 == null || str2 == null) {
      return "";
    }
    if (!(str1 + str2).equals(str2 + str1)) {
      return "";
    }
    if (str1.length() == str2.length()) {
      return str1;
    }
    String large = str1.length() > str2.length() ? str1 : str2;
    String small = large == str1 ? str2 : str1;
    return gcdOfStrings(small, large.substring(small.length()));
  }
}
