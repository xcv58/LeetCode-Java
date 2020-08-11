package com.xcv58.leetcode.smallest_range_i;

public class Solution {

  public int smallestRangeI(int[] A, int K) {
    if (A == null || A.length < 1) {
      return 0;
    }
    int min = A[0];
    int max = A[0];
    for (int a : A) {
      min = Math.min(min, a);
      max = Math.max(max, a);
    }
    if (max - min <= 2 * K) {
      return 0;
    }
    return max - min - 2 * K;
  }
}
