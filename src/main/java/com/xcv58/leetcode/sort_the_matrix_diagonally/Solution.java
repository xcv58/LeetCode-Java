package com.xcv58.leetcode.sort_the_matrix_diagonally;

import java.util.*;

public class Solution {

  public int[][] diagonalSort(int[][] mat) {
    if (mat == null || mat.length == 0) {
      return new int[0][0];
    }
    int m = mat.length;
    int n = mat[0].length;
    int[][] res = new int[m][n];
    for (int i = 0; i < m; i++) {
      this.diagonalSort(mat, i, 0, res);
    }
    for (int i = 0; i < n; i++) {
      this.diagonalSort(mat, 0, i, res);
    }
    return res;
  }

  private void diagonalSort(int[][] mat, int x, int y, int[][] next) {
    int m = mat.length;
    int n = mat[0].length;
    int len = Math.min(m - x, n - y);
    int[] res = new int[len];
    for (int i = 0; i < len; i++) {
      res[i] = mat[x + i][y + i];
    }
    Arrays.sort(res);
    for (int i = 0; i < len; i++) {
      next[x + i][y + i] = res[i];
    }
  }
}
