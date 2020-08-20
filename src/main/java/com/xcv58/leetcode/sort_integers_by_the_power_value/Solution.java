package com.xcv58.leetcode.sort_integers_by_the_power_value;

import java.util.*;

public class Solution {
  private HashMap<Integer, Integer> map = new HashMap<>();

  public int getKth(int lo, int hi, int k) {
    PriorityQueue<Integer> heap = new PriorityQueue<>(
      (i1, i2) -> {
        int p1 = getPowerValue(i1);
        int p2 = getPowerValue(i2);
        if (p1 == p2) {
          return Integer.compare(i1, i2);
        }
        return Integer.compare(p1, p2);
      }
    );
    for (int i = lo; i <= hi; i++) {
      heap.offer(i);
    }
    for (int i = 1; i < k; i++) {
      heap.poll();
    }
    return heap.poll();
  }

  private int getPowerValue(int x) {
    if (x == 1) {
      return 0;
    }
    if (!map.containsKey(x)) {
      if (x % 2 == 0) {
        map.put(x, 1 + getPowerValue(x / 2));
      } else {
        map.put(x, 1 + getPowerValue(x * 3 + 1));
      }
    }
    return map.get(x);
  }
}
