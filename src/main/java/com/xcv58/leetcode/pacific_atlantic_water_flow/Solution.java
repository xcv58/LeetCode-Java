package com.xcv58.leetcode.pacific_atlantic_water_flow;

import java.util.*;

public class Solution {
  int[][] directions = new int[][] { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

  public List<List<Integer>> pacificAtlantic(int[][] matrix) {
    List<List<Integer>> res = new ArrayList<>();
    if (matrix == null || matrix.length == 0) {
      return res;
    }
    int m = matrix.length;
    int n = matrix[0].length;
    boolean[][] topLeft = new boolean[m][n];
    boolean[][] bottomRight = new boolean[m][n];
    for (int i = 0; i < m; i++) {
      traversal(matrix, m, n, i, 0, matrix[i][0], topLeft);
      traversal(matrix, m, n, i, n - 1, matrix[i][n - 1], bottomRight);
    }
    for (int i = 0; i < n; i++) {
      traversal(matrix, m, n, 0, i, matrix[0][i], topLeft);
      traversal(matrix, m, n, m - 1, i, matrix[m - 1][i], bottomRight);
    }

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (topLeft[i][j] && bottomRight[i][j]) {
          res.add(Arrays.asList(i, j));
        }
      }
    }
    return res;
  }

  private void traversal(
    int[][] matrix,
    int m,
    int n,
    int i,
    int j,
    int pre,
    boolean[][] visited
  ) {
    if (i < 0 || j < 0 || i >= m || j >= n) {
      return;
    }
    if (matrix[i][j] < pre) {
      return;
    }
    if (visited[i][j]) {
      return;
    }
    visited[i][j] = true;
    for (int[] d : directions) {
      traversal(matrix, m, n, i + d[0], j + d[1], matrix[i][j], visited);
    }
  }
}
