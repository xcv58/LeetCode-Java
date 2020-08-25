package com.xcv58.leetcode.permutations;

import java.util.*;

public class Solution {

  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    if (nums == null || nums.length == 0) {
      return res;
    }
    for (int i = nums.length - 1; i >= 0; i--) {
      List<List<Integer>> next = permute(getNewArray(nums, i));
      int num = nums[i];
      if (next.size() == 0) {
        res.add(new ArrayList<>(List.of(num)));
      } else {
        for (List<Integer> array : next) {
          array.add(num);
        }
        res.addAll(next);
      }
    }
    return res;
  }

  private int[] getNewArray(int[] nums, int i) {
    int[] res = new int[nums.length - 1];
    for (int j = 0; j < nums.length - 1; j++) {
      res[j] = nums[j < i ? j : j + 1];
    }
    return res;
  }
}
