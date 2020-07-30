package com.xcv58.leetcode.max_consecutive_ones_iii;

public class Solution {

  public int longestOnes(int[] A, int K) {
    if (A == null || A.length == 0) {
      return 0;
    }
    int max = 0;
    for (int i = 0, j = 0, zeroCount = 0; i < A.length && j < A.length;) {
      if (A[j++] == 0) {
        zeroCount++;
      }
      for (; zeroCount > K; i++) {
        if (A[i] == 0) {
          zeroCount--;
        }
      }
      max = Math.max(max, j - i);
    }
    return max;
  }
}
