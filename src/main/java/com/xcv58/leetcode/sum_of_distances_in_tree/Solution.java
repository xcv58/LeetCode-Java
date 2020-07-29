package com.xcv58.leetcode.sum_of_distances_in_tree;

import java.util.*;

public class Solution {

  public int[] sumOfDistancesInTree(int N, int[][] edges) {
    int[] count = new int[N];
    int[] sum = new int[N];
    Arrays.fill(count, 1);
    List<List<Integer>> childMap = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      childMap.add(new ArrayList<>());
    }
    for (int[] edge : edges) {
      childMap.get(edge[0]).add(edge[1]);
      childMap.get(edge[1]).add(edge[0]);
    }
    bottomUpTraversal(0, -1, count, sum, childMap);
    calculateChildSum(0, -1, count, sum, childMap, N);
    return sum;
  }

  private void bottomUpTraversal(
    int node,
    int parent,
    int[] count,
    int[] sum,
    List<List<Integer>> childMap
  ) {
    for (int child : childMap.get(node)) {
      if (child == parent) {
        continue;
      }
      bottomUpTraversal(child, node, count, sum, childMap);
      count[node] += count[child];
      sum[node] += sum[child] + count[child];
    }
  }

  private void calculateChildSum(
    int node,
    int parent,
    int[] count,
    int[] sum,
    List<List<Integer>> childMap,
    int N
  ) {
    for (int child : childMap.get(node)) {
      if (child == parent) {
        continue;
      }
      sum[child] = sum[node] - count[child] + (N - count[child]);
      calculateChildSum(child, node, count, sum, childMap, N);
    }
  }
}
