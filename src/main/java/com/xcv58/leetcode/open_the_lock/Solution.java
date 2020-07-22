package com.xcv58.leetcode.open_the_lock;

import java.util.*;

public class Solution {

  public int openLock(String[] deadends, String target) {
    HashSet<String> deadendSet = new HashSet<>(Arrays.asList(deadends));
    HashSet<String> currentLevel = new HashSet<>(Arrays.asList("0000"));
    HashSet<String> visited = new HashSet<>(Arrays.asList(deadends));
    return openLock(deadendSet, target, visited, currentLevel, 0);
  }

  private int openLock(
    HashSet<String> deadends,
    String target,
    HashSet<String> visited,
    HashSet<String> currentLevel,
    int step
  ) {
    if (currentLevel.size() == 0) {
      return -1;
    }
    HashSet<String> nextLevel = new HashSet<>();
    visited.addAll(currentLevel);
    for (String current : currentLevel) {
      if (deadends.contains(current)) {
        continue;
      }
      if (target.equals(current)) {
        return step;
      }
      for (int i = 0; i < current.length(); i++) {
        int num = current.charAt(i) - '0';
        for (int j = 9; j < 12; j += 2) {
          int next = (num + j) % 10;
          char c = (char) (next + '0');
          String tmp = current.substring(0, i) + c + current.substring(i + 1);
          if (visited.contains(tmp)) {
            continue;
          }
          nextLevel.add(tmp);
        }
      }
    }
    return openLock(deadends, target, visited, nextLevel, step + 1);
  }
}
