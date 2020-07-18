package com.xcv58.leetcode.swim_in_rising_water;

import java.util.*;

public class Solution {

  class Cell {
    int i;
    int j;
    int val;

    public Cell(int i, int j, int val) {
      this.i = i;
      this.j = j;
      this.val = val;
    }
  }

  public int swimInWater(int[][] grid) {
    if (grid == null || grid.length == 0) {
      return 0;
    }
    int m = grid.length;
    int n = grid[0].length;
    PriorityQueue<Cell> heap = new PriorityQueue<>(
      (c1, c2) -> Integer.compare(c1.val, c2.val)
    );
    HashSet<Integer> visited = new HashSet<>();
    int res = 0;
    heap.offer(new Cell(0, 0, grid[0][0]));
    while (heap.size() > 0) {
      Cell cell = heap.poll();
      if (cell.val > res) {
        res = cell.val;
      }
      traversal(grid, cell.i, cell.j, res, m, n, visited, heap);
      while (heap.size() > 0 && heap.peek().val <= res) {
        cell = heap.poll();
        traversal(grid, cell.i, cell.j, res, m, n, visited, heap);
      }
      if (visited.contains(m * n - 1)) {
        return res;
      }
    }
    return res;
  }

  private void traversal(
    int[][] grid,
    int i,
    int j,
    int t,
    int m,
    int n,
    HashSet<Integer> visited,
    PriorityQueue<Cell> heap
  ) {
    if (i < 0 || j < 0 || i >= m || j >= n) {
      return;
    }
    if (visited.contains(i * n + j)) {
      return;
    }
    if (grid[i][j] <= t) {
      visited.add(i * n + j);
      traversal(grid, i + 1, j, t, m, n, visited, heap);
      traversal(grid, i - 1, j, t, m, n, visited, heap);
      traversal(grid, i, j + 1, t, m, n, visited, heap);
      traversal(grid, i, j - 1, t, m, n, visited, heap);
    } else {
      heap.add(new Cell(i, j, grid[i][j]));
    }
  }
}
