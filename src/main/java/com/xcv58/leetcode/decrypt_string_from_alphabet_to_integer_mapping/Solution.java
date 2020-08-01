package com.xcv58.leetcode.decrypt_string_from_alphabet_to_integer_mapping;

public class Solution {

  public String freqAlphabets(String s) {
    if (s == null || s.length() == 0) {
      return "";
    }
    String res = "";
    for (int i = 0; i < s.length(); i++) {
      int num = s.charAt(i) - '0';
      if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
        num = num * 10 + s.charAt(i + 1) - '0';
        i += 2;
      }
      res += getChar(num);
    }
    return res;
  }

  private char getChar(int num) {
    return (char) (num + 'a' - 1);
  }
}
