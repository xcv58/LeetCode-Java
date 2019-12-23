package com.xcv58.leetcode.alien_dictionary;

import java.util.*;
import java.util.stream.Collector;

public class Solution {

  public String alienOrder(String[] words) {
    if (words == null || words.length == 0) {
      return "";
    }
    HashMap<Character, HashSet<Character>> inMap = new HashMap<>();
    HashMap<Character, HashSet<Character>> outMap = new HashMap<>();
    HashSet<Character> allCharSet = new HashSet<>();

    for (String s : words) {
      for (char c : s.toCharArray()) {
        allCharSet.add(c);
      }
    }

    for (int i = 1; i < words.length; i++) {
      String s1 = words[i - 1];
      String s2 = words[i];
      for (int j = 0; j < Math.min(s1.length(), s2.length()); j++) {
        char c1 = s1.charAt(j);
        char c2 = s2.charAt(j);
        if (c1 != c2) {
          HashSet<Character> outSet = outMap.getOrDefault(c1, new HashSet<>());
          HashSet<Character> inSet = inMap.getOrDefault(c2, new HashSet<>());

          outSet.add(c2);
          inSet.add(c1);

          outMap.putIfAbsent(c1, outSet);
          inMap.putIfAbsent(c2, inSet);
          break;
        }
      }
    }

    StringBuilder sb = new StringBuilder();

    while (!allCharSet.isEmpty()) {
      HashSet<Character> set = new HashSet<>();
      for (Character c : allCharSet) {
        HashSet<Character> inSet = inMap.getOrDefault(c, new HashSet<>());
        if (inSet.size() == 0) {
          set.add(c);
          sb.append(c);
        }
      }

      for (char c : set) {
        HashSet<Character> outSet = outMap.getOrDefault(c, new HashSet<>());
        for (char dest : outSet) {
          inMap.getOrDefault(dest, new HashSet<>()).remove(c);
        }
        allCharSet.remove(c);
      }

      if (set.size() == 0) {
        return "";
      }
    }

    return sb.toString();
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    String string = solution.alienOrder(
      new String[] {
        //                "wtrf",
        //                "ettff",
        //                "ettrrff",
        //                "z",
        //                "eff"
        //                "wrt","wrf","er","ett","rftt"
        //                "wrt","wrf","er","ett","rftt"
        //                "za","zb","ca","cb"
        "ab",
        "adc"
      }
    );

    // a -> b, z -> c
    // abcz
    System.out.println(string);
  }
}
