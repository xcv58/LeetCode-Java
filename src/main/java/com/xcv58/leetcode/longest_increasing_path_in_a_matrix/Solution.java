package com.xcv58.leetcode.longest_increasing_path_in_a_matrix;

import java.util.*;

public class Solution {

  public int longestIncreasingPath(int[][] matrix) {
    if (matrix == null || matrix.length == 0) {
      return 0;
    }
    int m = matrix.length;
    int n = matrix[0].length;
    int res = 0;
    HashSet<Integer> visited = new HashSet<>();
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        visited.add(i * n + j);
        int len = this.longestIncreasingPath(matrix, i, j, m, n, visited, map);
        visited.remove(i * n + j);
        res = Math.max(len, res);
      }
    }
    return res;
  }

  private int longestIncreasingPath(
    int[][] matrix,
    int x,
    int y,
    int m,
    int n,
    HashSet<Integer> visited,
    HashMap<Integer, Integer> map
  ) {
    List<Integer> paths = getNextPath(x, y, m, n, visited);
    if (paths.size() == 0) {
      return visited.size();
    }
    int key = x * n + y;
    if (map.containsKey(key)) {
      return visited.size() + map.get(key);
    }
    int res = visited.size();
    for (Integer index : paths) {
      int i = index / n;
      int j = index % n;
      if (matrix[i][j] > matrix[x][y]) {
        visited.add(index);
        int length = longestIncreasingPath(matrix, i, j, m, n, visited, map);
        res = Math.max(length, res);
        visited.remove(index);
      }
    }
    map.put(key, res - visited.size());
    return res;
  }

  private List<Integer> getNextPath(
    int x,
    int y,
    int m,
    int n,
    HashSet<Integer> visited
  ) {
    List<Integer> res = new ArrayList<>();
    processPath(x - 1, y, m, n, visited, res);
    processPath(x + 1, y, m, n, visited, res);
    processPath(x, y - 1, m, n, visited, res);
    processPath(x, y + 1, m, n, visited, res);
    return res;
  }

  private void processPath(
    int x,
    int y,
    int m,
    int n,
    HashSet<Integer> visited,
    List<Integer> res
  ) {
    if (isValidIndex(x, y, m, n)) {
      int index = x * n + y;
      if (!visited.contains(index)) {
        res.add(index);
      }
    }
  }

  private boolean isValidIndex(int x, int y, int m, int n) {
    return x >= 0 && x < m && y >= 0 && y < n;
  }
}
