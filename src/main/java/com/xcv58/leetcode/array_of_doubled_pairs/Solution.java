package com.xcv58.leetcode.array_of_doubled_pairs;

import java.util.*;

public class Solution {

  public boolean canReorderDoubled(int[] A) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int a : A) {
      map.put(a, map.getOrDefault(a, 0) + 1);
    }
    List<Integer> keys = new ArrayList<>(map.keySet());
    Collections.sort(keys);
    for (Integer key : keys) {
      if (!map.containsKey(key)) {
        continue;
      }
      if (key == 0) {
        if (map.get(key) % 2 != 0) {
          return false;
        }
      } else if (key < 0) {
        if (key % 2 != 0) {
          return false;
        }
        int target = key / 2;
        if (!resolveTarget(map, target, map.get(key))) {
          return false;
        }
      } else {
        int target = key * 2;
        if (!resolveTarget(map, target, map.get(key))) {
          return false;
        }
      }
      map.remove(key);
    }
    return map.size() == 0;
  }

  private boolean resolveTarget(
    HashMap<Integer, Integer> map,
    int target,
    int num
  ) {
    if (!map.containsKey(target)) {
      return false;
    }
    int value = map.get(target);
    if (value < num) {
      return false;
    }
    if (value == num) {
      map.remove(target);
    } else {
      map.put(target, value - num);
    }
    return true;
  }
}
