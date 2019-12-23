package com.xcv58.leetcode.reverse_string;

public class Solution {

  public String reverseString(String s) {
    StringBuilder sb = new StringBuilder();
    for (char c : s.toCharArray()) {
      sb.append(c);
    }
    sb.reverse();
    return sb.toString();
  }
}
