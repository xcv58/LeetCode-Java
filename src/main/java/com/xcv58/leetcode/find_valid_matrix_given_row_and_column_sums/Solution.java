package com.xcv58.leetcode.find_valid_matrix_given_row_and_column_sums;

public class Solution {

  public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
    if (rowSum == null || colSum == null) {
      // return new int[][]{};
      return null;
    }
    int[][] res = new int[rowSum.length][colSum.length];
    while (true) {
      int[] row = this.findMinIndex(rowSum);
      int[] col = this.findMinIndex(colSum);
      if (row[1] == -1 || col[1] == -1) {
        break;
      }
      int x = row[1];
      int y = col[1];
      int min = Math.min(row[0], col[0]);
      res[x][y] = min;
      rowSum[x] -= min;
      colSum[y] -= min;
    }
    return res;
  }

  private int[] findMinIndex(int[] nums) {
    int index = -1;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > 0 && min > nums[i]) {
        min = nums[i];
        index = i;
      }
    }
    return new int[] { min, index };
  }
}
