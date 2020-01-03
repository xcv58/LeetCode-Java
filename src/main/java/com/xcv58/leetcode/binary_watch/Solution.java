package com.xcv58.leetcode.binary_watch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
  private static HashMap<Integer, List<Integer>> hourMap = new HashMap<>();
  private static HashMap<Integer, List<Integer>> minMap = new HashMap<>();

  static {
    fill(hourMap, 12);
    fill(minMap, 60);
  }

  private static void fill(HashMap<Integer, List<Integer>> map, int n) {
    for (int i = 0; i < n; i++) {
      int bits = bits(i);
      List<Integer> list = map.computeIfAbsent(bits, x -> new ArrayList<>());
      list.add(i);
    }
  }

  private static int bits(int n) {
    int res = 0;
    while (n > 0) {
      n &= n - 1;
      res++;
    }
    return res;
  }

  public List<String> readBinaryWatch(int num) {
    List<String> res = new ArrayList<>();
    for (int i = 0; i <= num; i++) {
      for (Integer hour : hourMap.getOrDefault(i, new ArrayList<>())) {
        for (Integer minute : minMap.getOrDefault(num - i, new ArrayList<>())) {
          res.add(hour + ":" + (minute < 10 ? "0" + minute : minute));
        }
      }
    }
    return res;
  }
}
