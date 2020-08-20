package com.xcv58.leetcode.minimum_falling_path_sum_ii;

import java.util.*;

public class Solution {

  public int minFallingPathSum(int[][] arr) {
    if (arr == null || arr.length == 0 || arr[0].length == 0) {
      return 0;
    }
    int m = arr.length;
    int n = arr[0].length;
    int[] previous = new int[n];
    for (int i = 0; i < m; i++) {
      int[] row = arr[i];
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
    if (result == null || result.length <= 1) {
      return 0;
    }
    Integer res = null;
    for (int j = 0; j < result.length; j++) {
      if (j == i) {
        continue;
      }
      if (res == null) {
        res = result[j];
      }
      res = Math.min(res, result[j]);
    }
    return res;
  }
}
