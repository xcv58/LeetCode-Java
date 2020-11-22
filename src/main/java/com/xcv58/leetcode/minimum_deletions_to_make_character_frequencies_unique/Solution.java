package com.xcv58.leetcode.minimum_deletions_to_make_character_frequencies_unique;

import java.util.*;

public class Solution {

  public int minDeletions(String s) {
    int[] counts = new int[26];
    for (char c : s.toCharArray()) {
      counts[c - 'a']++;
    }
    List<Integer> list = new ArrayList<>();
    int max = Integer.MIN_VALUE;
    for (int count : counts) {
      if (count != 0) {
        list.add(count);
        max = Math.max(max, count);
      }
    }
    Collections.sort(list, (a, b) -> Integer.compare(b, a));
    HashSet<Integer> used = new HashSet<>();
    int res = 0;
    for (int count : list) {
      if (used.contains(count)) {
        int anchor = Math.min(count, max + 1);
        res += count - anchor;
        while (anchor-- > 0) {
          res++;
          if (!used.contains(anchor)) {
            used.add(anchor);
            max = anchor;
            break;
          }
        }
      }
      used.add(count);
    }
    return res;
  }
}
