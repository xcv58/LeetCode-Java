package com.xcv58.leetcode.longest_string_chain;

import java.util.*;

public class Solution {

  public int longestStrChain(String[] words) {
    if (words == null) {
      return 0;
    }
    HashSet<String> set = new HashSet<>();
    for (String word : words) {
      set.add(word);
    }
    HashMap<String, Integer> map = new HashMap<>();
    int res = 0;
    for (String word : set) {
      res = Math.max(res, longestStrChain(word, set, map));
    }
    return res;
  }

  private int longestStrChain(
    String word,
    HashSet<String> set,
    HashMap<String, Integer> map
  ) {
    if (!set.contains(word)) {
      return 0;
    }
    if (map.containsKey(word)) {
      return map.get(word);
    }
    int res = 0;
    for (int j = 0; j < word.length(); j++) {
      String next = word.substring(0, j) + word.substring(j + 1);
      int size = longestStrChain(next, set, map);
      res = Math.max(res, size + 1);
    }
    map.put(word, res);
    return res;
  }
}
