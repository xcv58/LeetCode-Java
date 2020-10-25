package com.xcv58.leetcode.find_the_longest_substring_containing_vowels_in_even_counts;

import java.util.Arrays;

public class Solution {
  private String TARGET = "aeiou";

  public int findTheLongestSubstring(String s) {
    if (s == null || s.length() == 0) {
      return 0;
    }
    char[] chars = s.toCharArray();
    int len = chars.length;
    int[] appears = new int[32];
    Arrays.fill(appears, len);
    int res = 0;
    appears[0] = -1;
    for (int i = 0, state = 0; i < len; i++) {
      int index = TARGET.indexOf(chars[i]);
      if (index != -1) {
        state ^= (1 << index);
      }
      if (appears[state] == len) {
        appears[state] = i;
      }
      res = Math.max(res, i - appears[state]);
    }
    return res;
  }
}
