package com.xcv58.leetcode.k_closest_points_to_origin;

import java.util.*;

public class Solution {

  public int[][] kClosest(int[][] points, int K) {
    if (points == null || points.length == 0) {
      return new int[][] {};
    }
    PriorityQueue<int[]> heap = new PriorityQueue<>(
      (p1, p2) -> Integer.compare(getArea(p1), getArea(p2))
    );
    for (int[] point : points) {
      heap.offer(point);
    }
    int[][] res = new int[K][2];
    for (int i = 0; i < K; i++) {
      res[i] = heap.poll();
    }
    return res;
  }

  private int getArea(int[] point) {
    int x = point[0];
    int y = point[1];
    return x * x + y * y;
  }
}
