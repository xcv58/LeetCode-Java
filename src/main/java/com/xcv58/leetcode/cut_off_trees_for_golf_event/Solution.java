package com.xcv58.leetcode.cut_off_trees_for_golf_event;

import java.util.*;

public class Solution {

  public int cutOffTree(List<List<Integer>> forest) {
    if (forest == null || forest.size() == 0) {
      return -1;
    }
    int m = forest.size();
    int n = forest.get(0).size();
    List<Integer> trees = new ArrayList<>();
    for (List<Integer> row : forest) {
      for (Integer num : row) {
        if (num > 1) {
          trees.add(num);
        }
      }
    }
    Collections.sort(trees);
    int res = 0;
    HashSet<Integer> current = new HashSet<>();
    current.add(0);
    for (Integer target : trees) {
      int steps = stepToTarget(
        forest,
        m,
        n,
        target,
        new HashSet<>(),
        current,
        0
      );
      if (steps == -1) {
        return -1;
      }
      res += steps;
    }
    return res;
  }

  private int stepToTarget(
    List<List<Integer>> forest,
    int m,
    int n,
    int target,
    HashSet<Integer> visited,
    HashSet<Integer> current,
    int preSteps
  ) {
    HashSet<Integer> next = new HashSet<>();
    for (Integer x : current) {
      if (visited.contains(x)) {
        continue;
      }
      int i = x / n;
      int j = x % n;
      int num = forest.get(i).get(j);
      if (num < 1) {
        continue;
      }
      if (num == target) {
        current.clear();
        current.add(x);
        return preSteps;
      }
      addToNext(m, n, i + 1, j, visited, next);
      addToNext(m, n, i - 1, j, visited, next);
      addToNext(m, n, i, j + 1, visited, next);
      addToNext(m, n, i, j - 1, visited, next);
    }
    if (next.size() == 0) {
      return -1;
    }
    visited.addAll(current);
    current.clear();
    current.addAll(next);
    return stepToTarget(forest, m, n, target, visited, current, preSteps + 1);
  }

  private void addToNext(
    int m,
    int n,
    int i,
    int j,
    HashSet<Integer> visited,
    HashSet<Integer> next
  ) {
    if (i < 0 || j < 0 || i >= m || j >= n) {
      return;
    }
    int index = i * n + j;
    if (visited.contains(index)) {
      return;
    }
    next.add(index);
  }
}
