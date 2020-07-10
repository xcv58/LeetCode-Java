package com.xcv58.leetcode.shortest_subarray_with_sum_at_least_k;

import java.util.*;

public class Solution {

  public int shortestSubarray(int[] A, int K) {
    if (A == null) {
      return -1;
    }
    int len = A.length;
    int res = Integer.MAX_VALUE;
    int[] sum = new int[len + 1];
    int tmp = 0;
    for (int i = 0; i < A.length; i++) {
      tmp += A[i];
      sum[i + 1] = tmp;
    }
    LinkedList<Integer> list = new LinkedList<>();
    for (int i = 0; i < sum.length; i++) {
      while (!list.isEmpty() && sum[i] <= sum[list.getLast()]) {
        list.removeLast();
      }
      while (!list.isEmpty() && sum[i] >= sum[list.getFirst()] + K) {
        res = Math.min(res, i - list.removeFirst());
      }
      list.addLast(i);
    }
    return res == Integer.MAX_VALUE ? -1 : res;
  }
}
