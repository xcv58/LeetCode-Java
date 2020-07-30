package com.xcv58.leetcode.minimum_index_sum_of_two_lists;

import java.util.*;

public class Solution {

  public String[] findRestaurant(String[] list1, String[] list2) {
    if (list1 == null || list2 == null) {
      return null;
    }
    HashMap<String, Integer> map1 = getIndexMap(list1);
    HashMap<String, Integer> map2 = getIndexMap(list2);
    Integer min = null;
    for (String key : map1.keySet()) {
      if (map2.containsKey(key)) {
        int sum = map1.get(key) + map2.get(key);
        if (min == null) {
          min = sum;
        }
        min = Math.min(min, sum);
      }
    }
    if (min == null) {
      return null;
    }
    List<String> res = new ArrayList<>();
    for (String key : map1.keySet()) {
      if (map2.containsKey(key)) {
        int sum = map1.get(key) + map2.get(key);
        if (sum == min) {
          res.add(key);
        }
      }
    }
    return res.toArray(String[]::new);
  }

  private HashMap<String, Integer> getIndexMap(String[] list) {
    HashMap<String, Integer> map = new HashMap<>();
    for (int i = 0; i < list.length; i++) {
      map.put(list[i], i);
    }
    return map;
  }
}
