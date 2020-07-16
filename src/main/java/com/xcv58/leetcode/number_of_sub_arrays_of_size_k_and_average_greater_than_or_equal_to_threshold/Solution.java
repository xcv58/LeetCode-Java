package com.xcv58.leetcode.number_of_sub_arrays_of_size_k_and_average_greater_than_or_equal_to_threshold;

public class Solution {

  public int numOfSubarrays(int[] arr, int k, int threshold) {
    if (arr == null || arr.length == 0) {
      return 0;
    }
    int sum = 0;
    int res = 0;
    for (int i = 0; i < arr.length; i++) {
      sum -= (i - k >= 0) ? arr[i - k] : 0;
      sum += arr[i];
      if (i + 1 < k) {
        continue;
      }
      if (sum / k >= threshold) {
        res++;
      }
    }
    return res;
  }
}
