package com.xcv58.leetcode.queue_reconstruction_by_height;

import java.util.*;

public class Solution {

  public int[][] reconstructQueue(int[][] people) {
    if (people == null || people.length == 0) {
      return new int[0][0];
    }
    Arrays.sort(
      people,
      (p1, p2) -> {
        if (p1[0] == p2[0]) {
          return Integer.compare(p1[1], p2[1]);
        }
        return Integer.compare(p2[0], p1[0]);
      }
    );

    ArrayList<int[]> res = new ArrayList<>();
    for (int[] p : people) {
      res.add(p[1], p);
    }
    return res.toArray(new int[people.length][2]);
  }
}
