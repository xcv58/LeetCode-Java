package com.xcv58.leetcode.longest_common_subsequence;

public class Solution {

  public int longestCommonSubsequence(String text1, String text2) {
    if (text1 == null || text2 == null) {
      return 0;
    }
    int len1 = text1.length();
    int len2 = text2.length();
    if (len1 == 0 || len2 == 0) {
      return 0;
    }
    int[][] res = new int[len1][len2];
    for (int i = 0; i < len1; i++) {
      for (int j = 0; j < len2; j++) {
        char c1 = text1.charAt(i), c2 = text2.charAt(j);
        if (c1 == c2) {
          res[i][j] = 1 + ((i > 0 && j > 0) ? res[i - 1][j - 1] : 0);
        } else {
          res[i][j] =
            Math.max(i > 0 ? res[i - 1][j] : 0, j > 0 ? res[i][j - 1] : 0);
        }
      }
    }
    return res[len1 - 1][len2 - 1];
  }
}
