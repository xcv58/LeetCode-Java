package com.xcv58.leetcode.longest_palindromic_substring;

public class Solution {

  public String longestPalindrome(String s) {
    if (s == null) {
      return "";
    }
    String res = "";
    for (int i = 0; i < s.length(); i++) {
      res = getLonger(res, longestPalindrome(s, i, i));
      res = getLonger(res, longestPalindrome(s, i, i + 1));
    }
    return res;
  }

  private String getLonger(String s1, String s2) {
    return s2.length() > s1.length() ? s2 : s1;
  }

  private String longestPalindrome(String s, int start, int end) {
    int i = start, j = end;
    for (; i >= 0 && j < s.length(); i--, j++) {
      if (s.charAt(i) != s.charAt(j)) {
        break;
      }
    }
    return s.substring(i + 1, j);
  }
}
