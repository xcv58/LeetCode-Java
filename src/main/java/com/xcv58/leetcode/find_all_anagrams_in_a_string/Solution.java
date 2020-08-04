package com.xcv58.leetcode.find_all_anagrams_in_a_string;

import java.util.*;

public class Solution {

  public List<Integer> findAnagrams(String s, String p) {
    int[] left = new int[26];
    int[] right = new int[26];
    for (char c : p.toCharArray()) {
      right[c - 'a']++;
    }
    List<Integer> res = new ArrayList<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      left[c - 'a']++;
      if (i + 1 > p.length()) {
        left[s.charAt(i - p.length()) - 'a']--;
      }
      if (i + 1 >= p.length()) {
        boolean same = true;
        for (int j = 0; j < 26; j++) {
          if (left[j] != right[j]) {
            same = false;
            break;
          }
        }
        if (same) {
          res.add(i + 1 - p.length());
        }
      }
    }
    return res;
  }
}
