package com.xcv58.leetcode.longest_turbulent_subarray;

public class Solution {

  public int maxTurbulenceSize(int[] A) {
    if (A == null || A.length == 0) {
      return 0;
    }
    int res = 1;
    for (int i = 0; i < A.length;) {
      int direction = 0;
      int j = i + 1;
      for (; j < A.length; j++) {
        if (A[j] == A[j - 1]) {
          break;
        }
        int next = A[j] > A[j - 1] ? 1 : -1;
        if (next == direction) {
          break;
        }
        direction = next;
      }
      res = Math.max(res, j - i);
      i = j - Math.abs(direction);
    }
    return res;
  }
}
