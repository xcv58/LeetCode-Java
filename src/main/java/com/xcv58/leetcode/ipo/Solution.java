package com.xcv58.leetcode.ipo;

import java.util.*;

public class Solution {

  class Project {
    int profit;
    int capital;

    public Project(int c, int p) {
      this.capital = c;
      this.profit = p;
    }
  }

  public int findMaximizedCapital(int k, int W, int[] Profits, int[] Capital) {
    PriorityQueue<Project> heap = new PriorityQueue<>(
      (p1, p2) -> Integer.compare(p2.profit, p1.profit)
    );
    for (int i = 0; i < Profits.length; i++) {
      heap.offer(new Project(Capital[i], Profits[i]));
    }
    int res = W;
    for (int p = 0; p < k; p++) {
      if (heap.size() == 0) {
        break;
      }
      List<Project> tmpList = new ArrayList<>();
      while (heap.size() > 0) {
        Project project = heap.poll();
        if (project.capital <= res) {
          res += project.profit;
          break;
        } else {
          tmpList.add(project);
        }
      }
      heap.addAll(tmpList);
    }
    return res;
  }
}
