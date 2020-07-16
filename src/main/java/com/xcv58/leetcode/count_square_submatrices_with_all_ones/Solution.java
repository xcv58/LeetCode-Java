package com.xcv58.leetcode.count_square_submatrices_with_all_ones;

public class Solution {

  public int countSquares(int[][] matrix) {
    if (matrix == null || matrix.length == 0) {
      return 0;
    }
    int m = matrix.length;
    int n = matrix[0].length;
    int[][] horizontalSum = new int[m][n];
    int[][] verticalSum = new int[m][n];
    for (int i = 0; i < m; i++) {
      int sum = 0;
      for (int j = 0; j < n; j++) {
        sum += matrix[i][j];
        horizontalSum[i][j] = sum;
      }
    }
    for (int j = 0; j < n; j++) {
      int sum = 0;
      for (int i = 0; i < m; i++) {
        sum += matrix[i][j];
        verticalSum[i][j] = sum;
      }
    }
    int res = 0;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (matrix[i][j] == 0) {
          continue;
        }
        res++;
        for (int len = 1; true; len++) {
          int ii = i + len;
          int jj = j + len;
          if (ii >= m || jj >= n) {
            break;
          }
          boolean isSquare = true;
          for (int k = 0; k <= len; k++) {
            if (horizontalSum[i + k][jj] - horizontalSum[i + k][j] < len) {
              isSquare = false;
              break;
            }
            if (verticalSum[ii][j + k] - verticalSum[i][j + k] < len) {
              isSquare = false;
              break;
            }
          }
          if (isSquare) {
            res++;
          }
        }
      }
    }
    return res;
  }
}
