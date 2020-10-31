package com.xcv58.leetcode.sliding_window_median;

import java.util.*;

public class Solution {

  class Median {
    private PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
      (a, b) -> Integer.compare(a, b)
    );
    private PriorityQueue<Integer> minHeap = new PriorityQueue<>(
      (a, b) -> Integer.compare(b, a)
    );

    public void add(Integer num) {
      maxHeap.offer(num);
      minHeap.offer(maxHeap.poll());
      balance();
    }

    private void balance() {
      if (minHeap.size() > maxHeap.size()) {
        maxHeap.offer(minHeap.poll());
      } else if (maxHeap.size() > 1 + minHeap.size()) {
        minHeap.offer(maxHeap.poll());
      }
    }

    public void remove(Integer num) {
      if (!minHeap.remove(num)) {
        maxHeap.remove(num);
      }
      balance();
    }

    public double median() {
      if (maxHeap.size() == 0 && minHeap.size() == 0) {
        return 0.0;
      }
      if (maxHeap.size() == minHeap.size()) {
        return ((double) maxHeap.peek() + minHeap.peek()) / 2.0;
      }
      return (double) maxHeap.peek();
    }
  }

  public double[] medianSlidingWindow(int[] nums, int k) {
    if (nums == null || nums.length < k) {
      return null;
    }
    Median median = new Median();
    double[] res = new double[nums.length - k + 1];
    for (int i = 0; i < nums.length; i++) {
      median.add(nums[i]);
      if (i >= k) {
        median.remove(nums[i - k]);
      }
      if (i + 1 >= k) {
        res[i + 1 - k] = median.median();
      }
    }
    return res;
  }
}
