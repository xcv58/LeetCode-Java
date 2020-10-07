package com.xcv58.leetcode.find_the_kth_smallest_sum_of_a_matrix_with_sorted_rows;

import java.util.*;

public class Solution {

  public int kthSmallest(int[][] mat, int k) {
    if (mat == null || mat.length == 0) {
      return 0;
    }
    int m = mat.length;
    int n = mat[0].length;
    PriorityQueue<int[]> heap = new PriorityQueue<>(
      (a, b) -> Integer.compare(a[m], b[m])
    );
    int sum = 0;
    for (int i = 0; i < m; i++) {
      sum += mat[i][0];
    }
    int[] first = new int[m + 1];
    first[m] = sum;
    heap.add(first);
    HashSet<String> set = new HashSet<>();
    while (k-- > 1) {
      int[] cur = heap.poll();
      for (int i = 0; i < m; i++) {
        if (cur[i] + 1 >= n) {
          continue;
        }
        int[] tmp = new int[m + 1];
        for (int j = 0; j < m; j++) {
          tmp[j] = cur[j];
        }
        tmp[i]++;
        tmp[m] = cur[m] + mat[i][tmp[i]] - mat[i][cur[i]];
        String key = Arrays.toString(tmp);
        if (!set.contains(key)) {
          set.add(key);
          heap.offer(tmp);
        }
      }
    }
    return heap.poll()[m];
  }
}
