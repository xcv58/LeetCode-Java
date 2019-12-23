package com.xcv58.leetcode.increasing_triplet_subsequence;

public class IncreasingSequence {

  public boolean increasingSequence(int[] nums) {
    int min = Integer.MAX_VALUE;

    for (int n : nums) {
      if (n <= min) {
        min = n;
      } else {
        return true;
      }
    }

    return false;
  }
}
