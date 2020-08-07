package com.xcv58.leetcode.sum_of_mutated_array_closest_to_target;

public class Solution {

  public int findBestValue(int[] arr, int target) {
    if (arr == null || arr.length == 0) {
      return 0;
    }
    int max = arr[0];
    for (int num : arr) {
      max = Math.max(max, num);
    }
    int res = max;
    int diff = Math.abs(getSum(arr, Integer.MAX_VALUE) - target);
    for (int i = 0, j = max; i < j;) {
      int mid = i + (j - i) / 2;
      int sum = getSum(arr, mid);
      int tmp = Math.abs(sum - target);
      if (diff == tmp) {
        res = Math.min(res, mid);
      }
      if (diff > tmp) {
        diff = tmp;
        res = mid;
      }
      if (sum >= target) {
        j = mid;
      } else {
        i = mid + 1;
      }
    }
    return res;
  }

  private int getSum(int[] arr, int upper) {
    int sum = 0;
    for (int num : arr) {
      sum += Math.min(num, upper);
    }
    return sum;
  }
}
