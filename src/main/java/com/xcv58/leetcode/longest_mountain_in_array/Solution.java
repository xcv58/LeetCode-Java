package com.xcv58.leetcode.longest_mountain_in_array;

public class Solution {

  public int longestMountain(int[] A) {
    if (A == null || A.length == 0) {
      return 0;
    }
    int len = A.length;
    int[] inc = new int[len];
    int[] dec = new int[len];
    for (int i = 1; i < len; i++) {
      if (A[i] <= A[i - 1]) {
        continue;
      }
      inc[i] = inc[i - 1] + 1;
    }
    for (int i = len - 2; i >= 0; i--) {
      if (A[i] <= A[i + 1]) {
        continue;
      }
      dec[i] = dec[i + 1] + 1;
    }
    int max = 0;
    for (int i = 0; i < len; i++) {
      if (inc[i] > 0 && dec[i] > 0) {
        max = Math.max(inc[i] + dec[i] + 1, max);
      }
    }
    return max;
  }
}
