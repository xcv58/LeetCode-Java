package com.xcv58.leetcode.intersection_of_two_arrays_ii;

import java.util.*;

public class Solution {

  public int[] intersect(int[] nums1, int[] nums2) {
    if (nums1 == null || nums2 == null) {
      return null;
    }
    HashMap<Integer, Integer> map1 = getCountMap(nums1);
    HashMap<Integer, Integer> map2 = getCountMap(nums2);
    List<Integer> list = new ArrayList<>();
    for (int key : map1.keySet()) {
      int v1 = map1.get(key);
      if (map2.containsKey(key)) {
        int v2 = map2.get(key);
        int v = Math.min(v1, v2);
        for (int i = 0; i < v; i++) {
          list.add(key);
        }
      }
    }
    int[] res = new int[list.size()];
    for (int i = 0; i < list.size(); i++) {
      res[i] = list.get(i);
    }
    return res;
  }

  private HashMap<Integer, Integer> getCountMap(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
      int c = map.getOrDefault(num, 0);
      map.put(num, c + 1);
    }
    return map;
  }
}
