package com.xcv58.leetcode.minimum_number_of_vertices_to_reach_all_nodes;

import java.util.*;

public class Solution {

  public List<Integer> findSmallestSetOfVertices(
    int n,
    List<List<Integer>> edges
  ) {
    if (n <= 0 || edges == null) {
      return null;
    }
    boolean[] hasIncomeEdge = new boolean[n];
    for (List<Integer> edge : edges) {
      hasIncomeEdge[edge.get(1)] = true;
    }
    List<Integer> res = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      if (!hasIncomeEdge[i]) {
        res.add(i);
      }
    }
    return res;
  }
}
