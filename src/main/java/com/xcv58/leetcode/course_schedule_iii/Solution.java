package com.xcv58.leetcode.course_schedule_iii;

import java.util.*;

public class Solution {

  public int scheduleCourse(int[][] courses) {
    if (courses == null) {
      return 0;
    }
    Arrays.sort(courses, (a, b) -> Integer.compare(a[1], b[1]));
    PriorityQueue<Integer> queue = new PriorityQueue<>(
      (a, b) -> Integer.compare(b, a)
    );
    int time = 0;
    for (int[] course : courses) {
      if (time + course[0] <= course[1]) {
        time += course[0];
        queue.offer(course[0]);
      } else if (queue.size() > 0 && queue.peek() > course[0]) {
        time += course[0] - queue.poll();
        queue.offer(course[0]);
      }
    }
    return queue.size();
  }
}
