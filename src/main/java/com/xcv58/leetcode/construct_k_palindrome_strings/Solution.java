package com.xcv58.leetcode.construct_k_palindrome_strings;

import java.util.*;

public class Solution {

  public boolean canConstruct(String s, int k) {
    if (s == null || s.length() < k) {
      return false;
    }
    HashMap<Character, Integer> map = new HashMap<>();
    for (char c : s.toCharArray()) {
      int count = map.getOrDefault(c, 0);
      map.put(c, count + 1);
    }
    int oddNums = 0;
    for (int value : map.values()) {
      if (value % 2 != 0) {
        oddNums++;
      }
    }
    return oddNums <= k;
  }
}
