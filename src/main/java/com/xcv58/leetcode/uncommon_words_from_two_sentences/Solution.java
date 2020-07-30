package com.xcv58.leetcode.uncommon_words_from_two_sentences;

import java.util.*;

public class Solution {

  public String[] uncommonFromSentences(String A, String B) {
    List<String> res = new ArrayList<>();
    HashMap<String, Integer> mapA = getCommonWordMap(A);
    HashMap<String, Integer> mapB = getCommonWordMap(B);
    res.addAll(getUncommonWords(mapA, mapB));
    res.addAll(getUncommonWords(mapB, mapA));
    return res.toArray(String[]::new);
  }

  private List<String> getUncommonWords(
    HashMap<String, Integer> mapA,
    HashMap<String, Integer> mapB
  ) {
    List<String> res = new ArrayList<>();
    for (String keyA : mapA.keySet()) {
      if (mapA.get(keyA) == 1 && !mapB.containsKey(keyA)) {
        res.add(keyA);
      }
    }
    return res;
  }

  private HashMap<String, Integer> getCommonWordMap(String s) {
    HashMap<String, Integer> map = new HashMap<>();
    for (String token : s.split("\\s+")) {
      int count = map.getOrDefault(token, 0);
      map.put(token, count + 1);
    }
    return map;
  }
}
