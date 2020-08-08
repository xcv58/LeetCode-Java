package com.xcv58.leetcode.distant_barcodes;

import java.util.*;

public class Solution {

  public int[] rearrangeBarcodes(int[] barcodes) {
    if (barcodes == null) {
      return null;
    }
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int barcode : barcodes) {
      int count = map.getOrDefault(barcode, 0);
      map.put(barcode, count + 1);
    }
    PriorityQueue<int[]> heap = new PriorityQueue<>(
      (a1, a2) -> Integer.compare(a2[1], a1[1])
    );
    for (int code : map.keySet()) {
      heap.offer(new int[] { code, map.get(code) });
    }
    int[] res = new int[barcodes.length];
    for (int i = 0; i < res.length && !heap.isEmpty(); i++) {
      int[] current = heap.poll();
      if (i == 0 || res[i - 1] != current[0]) {
        res[i] = current[0];
        current[1]--;
      } else {
        int[] next = heap.poll();
        res[i] = next[0];
        next[1]--;
        if (next[1] > 0) {
          heap.offer(next);
        }
      }
      if (current[1] > 0) {
        heap.offer(current);
      }
    }
    return res;
  }
}
