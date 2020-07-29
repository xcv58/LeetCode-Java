package com.xcv58.leetcode.the_k_weakest_rows_in_a_matrix;

import java.util.*;

public class Solution {

  class Row {
    int value;
    int index;

    public Row(int i, int v) {
      this.index = i;
      this.value = v;
    }

    public long toLong() {
      return ((long) value << 32) + index;
    }
  }

  public int[] kWeakestRows(int[][] mat, int k) {
    if (mat == null || mat.length <= 0) {
      return new int[] {};
    }
    PriorityQueue<Row> heap = new PriorityQueue<>(
      (r1, r2) -> Long.compare(r1.toLong(), r2.toLong())
    );
    int m = mat.length;
    int n = mat[0].length;
    for (int i = 0; i < m; i++) {
      int sum = 0;
      for (int j = 0; j < n; j++) {
        if (mat[i][j] == 1) {
          sum++;
        }
      }
      heap.offer(new Row(i, sum));
    }
    int[] res = new int[Math.min(k, heap.size())];
    for (int i = 0; i < k && !heap.isEmpty(); i++) {
      res[i] = heap.poll().index;
    }
    return res;
  }
}
