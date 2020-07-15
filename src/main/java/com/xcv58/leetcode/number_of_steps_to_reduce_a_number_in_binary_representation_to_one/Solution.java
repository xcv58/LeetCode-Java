package com.xcv58.leetcode.number_of_steps_to_reduce_a_number_in_binary_representation_to_one;

public class Solution {

  public int numSteps(String s) {
    if (s == null) {
      return 0;
    }
    int len = s.length();
    if (len <= 0) {
      return 0;
    }
    if (s.equals("1")) {
      return 0;
    }
    char lastChar = s.charAt(len - 1);
    if (lastChar == '0') {
      return 1 + numSteps(s.substring(0, len - 1));
    }
    String nextString = "0";
    for (int i = len - 1; i >= 0; i--) {
      char c = s.charAt(i);
      if (c == '0') {
        return numSteps(s.substring(0, i) + '1' + nextString);
      }
      nextString = '0' + nextString;
    }
    return numSteps('1' + nextString);
  }
}
