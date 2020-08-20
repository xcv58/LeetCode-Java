package com.xcv58.leetcode.minimum_falling_path_sum;

public class Solution {

  public int minFallingPathSum(int[][] A) {
    if (A == null || A.length == 0 || A[0].length == 0) {
      return 0;
    }
    int m = A.length;
    int n = A[0].length;
    int[] previous = new int[n];
    for (int i = 0; i < m; i++) {
      int[] row = A[i];
      int[] current = new int[n];
      for (int j = 0; j < n; j++) {
        current[j] = row[j] + getMin(previous, j);
      }
      previous = current;
    }
    int res = previous[0];
    for (int num : previous) {
      res = Math.min(res, num);
    }
    return res;
  }

  private int getMin(int[] result, int i) {
    if (result == null) {
      return 0;
    }
    int res = result[i];
    if (i - 1 >= 0) {
      res = Math.min(res, result[i - 1]);
    }
    if (i + 1 < result.length) {
      res = Math.min(res, result[i + 1]);
    }
    return res;
  }
}
