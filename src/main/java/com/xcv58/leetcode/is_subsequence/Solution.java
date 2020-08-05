package com.xcv58.leetcode.is_subsequence;

public class Solution {

  public boolean isSubsequence(String s, String t) {
    return isSubsequence(s, t, 0, 0);
  }

  private boolean isSubsequence(String s, String t, int i1, int i2) {
    if (i1 >= s.length()) {
      return true;
    }
    if (i2 >= t.length()) {
      return false;
    }
    if (s.charAt(i1) == t.charAt(i2)) {
      return isSubsequence(s, t, i1 + 1, i2 + 1);
    }
    return isSubsequence(s, t, i1, i2 + 1);
  }
}
