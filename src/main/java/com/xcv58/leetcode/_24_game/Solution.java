package com.xcv58.leetcode._24_game;

public class Solution {
  public boolean judgePoint24(int[] nums) {
    float[] floatNums = new float[nums.length];
    for (int i = 0; i < nums.length; i++) {
      floatNums[i] = nums[i];
    }
    return this.judgePoint24(floatNums);
  }

  private boolean judgePoint24(float[] nums) {
    if (nums.length == 1) {
      return Math.abs(nums[0] - 24.0) < 0.00001;
    }
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        float[] combo = this.getAllCombo(nums[i], nums[j]);
        float[] rest = this.getRest(nums, i, j);
        for (float c: combo) {
          rest[0] = c;
          if (this.judgePoint24(rest)) {
            return true;
          }
        }
      }
    }
    return false;
  }

  private float[] getRest(float[] nums, int i, int j) {
    float[] res = new float[nums.length - 1];
    for (int x = 0, c = 1; x < nums.length; x++) {
      if (x != i && x != j) {
        res[c++] = nums[x];
      }
    }
    return res;
  }

  private float[] getAllCombo(float x, float y) {
    float[] res = new float[4 + (x != 0 ? 1 : 0) + (y != 0 ? 1 : 0)];
    int i = 0;
    res[i++] = x + y;
    res[i++] = x - y;
    res[i++] = x * y;
    res[i++] = y - x;
    if (y != 0) {
      res[i++] = x / y;
    }
    if (x != 0) {
      res[i++] = y / x;
    }
    return res;
  }
}
