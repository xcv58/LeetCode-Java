package com.xcv58.leetcode.maximum_number_of_events_that_can_be_attended;

import java.util.*;
import java.util.stream.*;

public class Solution {

  public int maxEvents(int[][] events) {
    if (events == null) {
      return 0;
    }
    Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));
    int max = Arrays.stream(events).mapToInt(x -> x[1]).max().orElse(1);
    PriorityQueue<Integer> heap = new PriorityQueue<>();
    int index = 0;
    int res = 0;
    for (int i = 1; i <= max; i++) {
      while (heap.size() > 0 && heap.peek() < i) {
        heap.poll();
      }
      for (; index < events.length; index++) {
        int[] event = events[index];
        if (event[0] <= i) {
          heap.offer(event[1]);
        } else {
          break;
        }
      }
      if (heap.size() > 0) {
        heap.poll();
        res++;
      }
    }
    return res;
  }
}
