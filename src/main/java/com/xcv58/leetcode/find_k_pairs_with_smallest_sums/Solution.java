package com.xcv58.leetcode.find_k_pairs_with_smallest_sums;

import java.util.*;

public class Solution {

  public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
    List<List<Integer>> res = new ArrayList<>();
    if (
      nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0
    ) {
      return res;
    }
    PriorityQueue<int[]> heap = new PriorityQueue<>(
      (a1, a2) ->
        Integer.compare(
          nums1[a1[0]] + nums2[a1[1]],
          nums1[a2[0]] + nums2[a2[1]]
        )
    );
    for (int i = 0; i < nums1.length; i++) {
      heap.offer(new int[] { i, 0 });
    }
    while (k-- > 0 && heap.size() > 0) {
      int[] arr = heap.poll();
      res.add(List.of(nums1[arr[0]], nums2[arr[1]]));
      if (++arr[1] < nums2.length) {
        heap.offer(arr);
      }
    }
    return res;
  }
}
