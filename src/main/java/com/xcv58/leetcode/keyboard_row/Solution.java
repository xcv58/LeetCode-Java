package com.xcv58.leetcode.keyboard_row;

import java.util.*;

public class Solution {
  private String[] ROWS = new String[] { "qwertyuiop", "asdfghjkl", "zxcvbnm" };

  private boolean isInSameRow(String word) {
    String str = word.toLowerCase();
    int res = 0;
    for (int i = 0; i < str.length(); i++) {
      String tmp = str.substring(i, i + 1);
      for (int j = 0; j < ROWS.length; j++) {
        if (ROWS[j].contains(tmp)) {
          res |= (1 << j);
          break;
        }
      }
    }
    return (res & (res - 1)) == 0;
  }

  public String[] findWords(String[] words) {
    List<String> res = new ArrayList<>();
    for (String word : words) {
      if (this.isInSameRow(word)) {
        res.add(word);
      }
    }
    return res.toArray(String[]::new);
  }
}
