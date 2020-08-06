package com.xcv58.leetcode.kth_smallest_number_in_multiplication_table;

public class Solution {

  public int findKthNumber(int m, int n, int k) {
    int high = m * n;
    int low = 1;
    while (low < high) {
      int mid = low + (high - low) / 2;
      int[] range = getRange(m, n, mid);
      if (range[0] < k && k <= range[1]) {
        return mid;
      }
      if (k > range[1]) {
        low = mid + 1;
      } else {
        high = mid;
      }
    }
    return low;
  }

  private int[] getRange(int m, int n, int target) {
    int res = 0;
    int same = 0;
    for (int i = 1; i < m + 1; i++) {
      res += Math.min(target / i, n);
      if (target % i == 0 && target / i <= n) {
        same++;
      }
    }
    return new int[] { res - same, res };
  }
}
