package com.xcv58.leetcode.friend_circles;

public class Solution {

  public int findCircleNum(int[][] M) {
    if (M == null || M.length == 0) {
      return 0;
    }
    int n = M.length;
    boolean[] visited = new boolean[n];
    int res = 0;
    for (int i = 0; i < n; i++) {
      res += traversal(M, n, visited, i);
    }
    return res;
  }

  private int traversal(int[][] M, int n, boolean[] visited, int i) {
    if (visited[i]) {
      return 0;
    }
    int[] row = M[i];
    visited[i] = true;
    for (int j = 0; j < row.length; j++) {
      if (row[j] == 1) {
        if (!visited[j]) {
          traversal(M, n, visited, j);
        }
      }
    }
    return 1;
  }
}
