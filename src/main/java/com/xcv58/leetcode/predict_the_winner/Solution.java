package com.xcv58.leetcode.predict_the_winner;

public class Solution {

  public boolean PredictTheWinner(int[] nums) {
    return nums.length < 2 || this.PredictTheWinner(nums, 0, nums.length, 0);
  }

  private boolean PredictTheWinner(int[] nums, int start, int end, int delta) {
    if (end <= start) {
      return delta >= 0;
    }
    return (
      (!this.PredictTheWinner(nums, start + 1, end, -(delta + nums[start]))) ||
      (!this.PredictTheWinner(nums, start, end - 1, -(delta + nums[end - 1])))
    );
  }
}
