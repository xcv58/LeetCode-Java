package com.xcv58.leetcode.jump_game_iv;

import java.util.*;

public class Solution {

  public int minJumps(int[] arr) {
    if (arr == null || arr.length <= 1) {
      return 0;
    }
    HashMap<Integer, List<Integer>> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      map.computeIfAbsent(arr[i], x -> new LinkedList<>()).add(i);
    }
    if (map.size() == 1) {
      return 1;
    }
    List<Integer> current = new LinkedList<>();
    HashSet<Integer> visited = new HashSet<>();
    current.add(0);
    visited.add(0);
    int steps = 0;
    while (!current.contains(arr.length - 1)) {
      List<Integer> next = new LinkedList<>();
      for (int index : current) {
        process(visited, next, arr, index + 1);
        process(visited, next, arr, index - 1);
        for (int x : map.get(arr[index])) {
          process(visited, next, arr, x);
        }
        map.get(arr[index]).clear();
      }
      current = next;
      steps++;
    }
    return steps;
  }

  private void process(
    HashSet<Integer> visited,
    List<Integer> next,
    int[] arr,
    int i
  ) {
    if (i < 0 || i >= arr.length) {
      return;
    }
    if (visited.contains(i)) {
      return;
    }
    next.add(i);
    visited.add(i);
  }
}
