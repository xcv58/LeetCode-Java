package com.xcv58.leetcode.kth_smallest_element_in_a_sorted_matrix;

public class Solution {

  public int kthSmallest(int[][] matrix, int k) {
    if (matrix == null || matrix.length <= 0) {
      return -1;
    }
    int m = matrix.length;
    int n = matrix[0].length;
    int[] rows = new int[m];
    int current = matrix[0][0];
    int index = 1;
    rows[0] = 1;
    while (index < k) {
      Integer next = null;
      boolean found = false;
      for (int i = 0; i < m; i++) {
        int j = rows[i];
        if (j >= n) {
          continue;
        }
        if (matrix[i][j] == current) {
          rows[i]++;
          found = true;
          break;
        }
        if (matrix[i][j] > current) {
          if (next == null) {
            next = matrix[i][j];
          }
          next = Math.min(next, matrix[i][j]);
        }
      }
      if (next != null && !found) {
        for (int i = 0; i < m; i++) {
          int j = rows[i];
          if (j >= n) {
            continue;
          }
          if (matrix[i][j] == next) {
            rows[i]++;
            break;
          }
        }
        current = next;
      }
      index++;
    }
    return current;
  }
}
