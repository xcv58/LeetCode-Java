package com.xcv58.leetcode.permutations_ii;

import java.util.*;

public class Solution {

  public List<List<Integer>> permuteUnique(int[] nums) {
    if (nums == null) {
      return null;
    }
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
      int count = map.getOrDefault(num, 0);
      map.put(num, count + 1);
    }
    return permuteUnique(map);
  }

  private List<List<Integer>> permuteUnique(HashMap<Integer, Integer> map) {
    List<List<Integer>> res = new ArrayList<>();
    if (map.size() == 0) {
      return res;
    }
    for (Integer key : new ArrayList<>(map.keySet())) {
      int count = map.get(key);
      if (count == 1) {
        map.remove(key);
      } else {
        map.put(key, count - 1);
      }
      List<List<Integer>> remains = this.permuteUnique(map);
      if (remains.size() == 0) {
        List<Integer> tmp = new ArrayList<>();
        tmp.add(key);
        res.add(tmp);
      } else {
        for (List<Integer> tmp : remains) {
          tmp.add(key);
        }
        res.addAll(remains);
      }
      map.put(key, count);
    }
    return res;
  }
}
