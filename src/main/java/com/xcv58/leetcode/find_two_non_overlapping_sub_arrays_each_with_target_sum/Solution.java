package com.xcv58.leetcode.find_two_non_overlapping_sub_arrays_each_with_target_sum;

public class Solution {

  public int minSumOfLengths(int[] arr, int target) {
    if (arr == null || arr.length == 0) {
      return -1;
    }
    int len = arr.length;
    int[] prefix = new int[len];
    int[] suffix = new int[len];
    for (int i = 0, j = 0, sum = 0; i < len; i++) {
      sum += arr[i];
      while (true) {
        if (sum == target) {
          prefix[i] = i - j + 1;
          break;
        }
        if (sum > target && j <= i) {
          sum -= arr[j++];
        } else {
          break;
        }
      }
      if (i > 0 && prefix[i - 1] != 0) {
        if (prefix[i] > 0) {
          prefix[i] = Math.min(prefix[i], prefix[i - 1]);
        } else {
          prefix[i] = prefix[i - 1];
        }
      }
    }

    for (int i = len - 1, j = len - 1, sum = 0; i >= 0; i--) {
      sum += arr[i];
      while (true) {
        if (sum == target) {
          suffix[i] = j - i + 1;
          break;
        }
        if (sum > target && j >= i) {
          sum -= arr[j--];
        } else {
          break;
        }
      }
      if (i + 1 < len && suffix[i + 1] != 0) {
        if (suffix[i] > 0) {
          suffix[i] = Math.min(suffix[i], suffix[i + 1]);
        } else {
          suffix[i] = suffix[i + 1];
        }
      }
    }

    int res = -1;
    for (int i = 0; i < len - 1; i++) {
      if (prefix[i] <= 0 || suffix[i + 1] <= 0) {
        continue;
      }
      int tmp = prefix[i] + suffix[i + 1];
      if (res == -1) {
        res = tmp;
      }
      res = Math.min(res, tmp);
    }
    return res;
  }
}
