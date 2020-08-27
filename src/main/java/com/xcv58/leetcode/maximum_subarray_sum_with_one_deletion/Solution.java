package com.xcv58.leetcode.maximum_subarray_sum_with_one_deletion;

public class Solution {

  public int maximumSum(int[] arr) {
    if (arr == null || arr.length < 1) {
      return 0;
    }
    int[] noDeletion = new int[arr.length];
    int[] withDeletion = new int[arr.length];
    noDeletion[0] = arr[0];
    withDeletion[0] = arr[0];
    for (int i = 1; i < arr.length; i++) {
      int num = arr[i];
      noDeletion[i] = Math.max(noDeletion[i - 1] + num, num);
      withDeletion[i] =
        Math.max(
          withDeletion[i - 1] + num,
          Math.max(noDeletion[i - 1], noDeletion[i])
        );
    }

    int res = withDeletion[0];
    for (int i = 0; i < arr.length; i++) {
      res = Math.max(res, withDeletion[i]);
    }
    return res;
  }
}
