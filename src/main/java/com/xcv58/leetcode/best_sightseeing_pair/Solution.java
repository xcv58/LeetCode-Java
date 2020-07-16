package com.xcv58.leetcode.best_sightseeing_pair;

public class Solution {

  public int maxScoreSightseeingPair(int[] A) {
    if (A == null || A.length == 0) {
      return 0;
    }
    int max = 0;
    int pre = 0;
    for (int i = 0; i < A.length; i++) {
      if (pre == i) {
        continue;
      }
      int tmp = A[i] + A[pre] + pre - i;
      max = Math.max(max, tmp);
      if (A[pre] - A[i] <= i - pre) {
        pre = i;
      }
    }
    return max;
  }
}
