package com.xcv58.leetcode.short_encoding_of_words;

import java.util.*;

public class Solution {

  class Node {
    private HashMap<Character, Node> map = new HashMap<>();

    public void add(String word) {
      this.add(word.toCharArray(), word.length() - 1);
    }

    public void add(char[] chars, int i) {
      if (chars == null || i < 0 || i >= chars.length) {
        return;
      }
      char c = chars[i];
      Node node = map.getOrDefault(c, new Node());
      map.put(c, node);
      node.add(chars, i - 1);
    }

    public int size(int len) {
      if (map.isEmpty()) {
        return len;
      }
      int res = 0;
      for (Node node : map.values()) {
        res += node.size(len + 1);
      }
      return res;
    }
  }

  public int minimumLengthEncoding(String[] words) {
    if (words == null || words.length <= 0) {
      return 0;
    }
    Node node = new Node();
    for (String word : words) {
      node.add(word);
    }
    return node.size(1);
  }
}
