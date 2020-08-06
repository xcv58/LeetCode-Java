package com.xcv58.leetcode.k_th_smallest_prime_fraction;

import java.util.*;

public class Solution {

  public int[] kthSmallestPrimeFraction(int[] A, int K) {
    if (A == null) {
      return null;
    }
    int m = A.length;
    PriorityQueue<int[]> heap = new PriorityQueue<>(
      (a1, a2) -> Integer.compare(A[a1[0]] * A[a2[1]], A[a1[1]] * A[a2[0]])
    );
    for (int i = 1; i < A.length; i++) {
      heap.offer(new int[] { 0, i });
    }
    while (K-- > 1) {
      int[] cur = heap.poll();
      if (cur[0] + 1 < A.length) {
        heap.offer(new int[] { cur[0] + 1, cur[1] });
      }
    }
    int[] res = heap.poll();
    return new int[] { A[res[0]], A[res[1]] };
  }
}
