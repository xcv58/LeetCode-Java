package com.xcv58.leetcode.course_schedule;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution {

  public boolean canFinish(int numCourses, int[][] prerequisites) {
    int[] inEdges = new int[numCourses];
    List<Integer>[] outEdges = new List[numCourses];
    for (int i = 0; i < numCourses; i++) {
      outEdges[i] = new LinkedList<>();
    }
    for (int[] pair : prerequisites) {
      int second = pair[0];
      int first = pair[1];
      inEdges[second]++;
      outEdges[first].add(second);
    }
    Stack<Integer> stack = new Stack<>();
    int sum = 0;
    for (int i = 0; i < numCourses; i++) {
      if (inEdges[i] == 0) {
        sum++;
        stack.push(i);
      }
    }
    while (!stack.empty()) {
      int n = stack.pop();
      for (Integer i : outEdges[n]) {
        inEdges[i]--;
        if (inEdges[i] == 0) {
          sum++;
          stack.push(i);
        }
      }
    }
    return sum == numCourses;
  }
}
