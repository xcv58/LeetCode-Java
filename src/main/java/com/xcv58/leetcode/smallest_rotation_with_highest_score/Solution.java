package com.xcv58.leetcode.smallest_rotation_with_highest_score;

public class Solution {

  public int bestRotation(int[] A) {
    if (A == null) {
      return 0;
    }
    int len = A.length;
    int[] counts = new int[len];
    for (int i = 0; i < len; i++) {
      int low = (i - A[i] + 1 + len) % len;
      int high = (low + A[i] + len) % len;
      counts[low]--;
      counts[high]++;
      if (low > high) {
        counts[0]--;
      }
    }
    int res = 0;
    for (int i = 0, max = -len, cur = 0; i < len; i++) {
      cur += counts[i];
      if (cur > max) {
        max = cur;
        res = i;
      }
    }
    return res;
  }
}
