package com.xcv58.leetcode.longest_chunked_palindrome_decomposition;

import java.util.*;

public class Solution {

  public int longestDecomposition(String text) {
    return longestDecomposition(text, new HashMap<>());
  }

  private int longestDecomposition(String text, HashMap<String, Integer> map) {
    if (text == null || text.length() == 0) {
      return 0;
    }
    if (map.containsKey(text)) {
      return map.get(text);
    }
    int res = 1;
    for (int i = 1; i <= text.length() / 2; i++) {
      if (isSame(text, i)) {
        int tmp =
          2 + longestDecomposition(text.substring(i, text.length() - i), map);
        res = Math.max(res, tmp);
      }
    }
    map.put(text, res);
    return res;
  }

  private boolean isSame(String text, int len) {
    if (len * 2 > text.length()) {
      return false;
    }
    return text.substring(0, len).equals(text.substring(text.length() - len));
  }
}
