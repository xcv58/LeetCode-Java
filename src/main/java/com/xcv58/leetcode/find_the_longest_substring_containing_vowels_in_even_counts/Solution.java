package com.xcv58.leetcode.find_the_longest_substring_containing_vowels_in_even_counts;

public class Solution {

  public int findTheLongestSubstring(String s) {
    if (s == null || s.length() == 0) {
      return 0;
    }
    char[] chars = s.toCharArray();
    int len = chars.length;
    int res = 0;
    int[][] counts = new int[len + 1][5];
    for (int i = 0; i < len; i++) {
      char c = chars[i];
      int index = -1;
      switch (c) {
        case 'a':
          index = 0;
          break;
        case 'e':
          index = 1;
          break;
        case 'i':
          index = 2;
          break;
        case 'o':
          index = 3;
          break;
        case 'u':
          index = 4;
          break;
        default:
          index = -1;
          break;
      }
      for (int j = 0; j < 5; j++) {
        counts[i + 1][j] = counts[i][j];
      }
      if (index != -1) {
        counts[i + 1][index] = counts[i][index] + 1;
      }
    }
    for (int i = len; i >= 0 && i > res; i--) {
      for (int j = 0; j < i; j++) {
        if (isAllEven(counts[i], counts[j])) {
          res = Math.max(res, i - j);
          break;
        }
      }
    }
    return res;
  }

  private boolean isAllEven(int[] c1, int[] c2) {
    for (int i = 0; i < c1.length; i++) {
      if (((c1[i] - c2[i]) % 2) != 0) {
        return false;
      }
    }
    return true;
  }
}
