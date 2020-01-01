package com.xcv58.leetcode._01_matrix;

import java.util.HashSet;

public class Solution {

  public int[][] updateMatrix(int[][] matrix) {
    if (matrix == null || matrix.length <= 0) {
      return new int[0][0];
    }
    int m = matrix.length;
    int n = matrix[0].length;
    int[][] res = new int[m][n];
    HashSet<Integer> visitedSet = new HashSet<>();
    HashSet<Integer> unreachSet = new HashSet<>();
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (matrix[i][j] == 0) {
          res[i][j] = 0;
          visitedSet.add(i * n + j);
        } else {
          res[i][j] = -1;
          unreachSet.add(i * n + j);
        }
      }
    }
    while (unreachSet.size() > 0) {
      HashSet<Integer> tmpSet = new HashSet<>();
      for (Integer index : visitedSet) {
        int i = index / n;
        int j = index % n;
        int len = res[i][j] + 1;
        this.updateMatrix(matrix, res, i + 1, j, len, tmpSet, unreachSet);
        this.updateMatrix(matrix, res, i - 1, j, len, tmpSet, unreachSet);
        this.updateMatrix(matrix, res, i, j + 1, len, tmpSet, unreachSet);
        this.updateMatrix(matrix, res, i, j - 1, len, tmpSet, unreachSet);
      }
      visitedSet = tmpSet;
    }
    return res;
  }

  private void updateMatrix(
    int[][] matrix,
    int[][] distance,
    int i,
    int j,
    int len,
    HashSet<Integer> visitedSet,
    HashSet<Integer> unreachSet
  ) {
    if (i < 0 || j < 0 || i >= matrix.length || j >= matrix[0].length) {
      return;
    }
    int index = i * matrix[0].length + j;
    if (distance[i][j] == -1 || distance[i][j] > len) {
      unreachSet.remove(index);
      visitedSet.add(index);
      distance[i][j] = len;
      return;
    }
  }
}
