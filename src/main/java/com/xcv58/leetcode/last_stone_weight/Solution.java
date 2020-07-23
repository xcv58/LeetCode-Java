package com.xcv58.leetcode.last_stone_weight;

import java.util.*;

public class Solution {

  public int lastStoneWeight(int[] stones) {
    if (stones == null || stones.length == 0) {
      return 0;
    }
    PriorityQueue<Integer> heap = new PriorityQueue<>(
      (n1, n2) -> Integer.compare(n2, n1)
    );
    for (int stone : stones) {
      heap.offer(stone);
    }
    while (heap.size() > 1) {
      int s1 = heap.poll();
      int s2 = heap.poll();
      heap.offer(Math.abs(s1 - s2));
    }
    if (heap.size() == 0) {
      return 0;
    }
    return heap.poll();
  }
}
