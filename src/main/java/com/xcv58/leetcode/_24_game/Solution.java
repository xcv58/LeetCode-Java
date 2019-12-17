package com.xcv58.leetcode._24_game;

import java.util.ArrayList;
import java.util.List;

public class Solution {
  public boolean judgePoint24(int[] nums) {
    List<Float> list = new ArrayList<>();
    for (int n: nums) {
      list.add((float)n);
    }
    return this.judgePoint24(list);
  }

  private boolean judgePoint24(List<Float> nums) {
    if (nums.size() == 1) {
      return Math.abs(nums.get(0) - 24.0) < 0.00001;
    }
    for (int i = 0; i < nums.size(); i++) {
      for (int j = 0; j < nums.size(); j++) {
        if (i == j) {
          continue;
        }
        List<Float> combo = this.getAllCombo(nums.get(i), nums.get(j));
        List<Float> rest = this.getRest(nums, i, j);
        for (float c: combo) {
          rest.add(c);
          if (this.judgePoint24(rest)) {
            return true;
          }
          rest.remove(c);
        }
      }
    }
    return false;
  }

  private List<Float> getRest(List<Float> nums, int i, int j) {
    List<Float> res = new ArrayList<>();
    for (int x = 0; x < nums.size(); x++) {
      if (x != i && x != j) {
        res.add(nums.get(x));
      }
    }
    return res;
  }

  private List<Float> getAllCombo(float x, float y) {
    List<Float> res = new ArrayList<>();
    res.add(x + y);
    res.add(x - y);
    res.add(x * y);
    res.add(y - x);
    if (y != 0) {
      res.add(x / y);
    }
    if (x != 0) {
      res.add(y / x);
    }
    return res;
  }
}
