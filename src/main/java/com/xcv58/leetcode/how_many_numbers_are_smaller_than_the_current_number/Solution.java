package com.xcv58.leetcode.how_many_numbers_are_smaller_than_the_current_number;

import java.util.*;

public class Solution {

  public int[] smallerNumbersThanCurrent(int[] nums) {
    if (nums == null) {
      return null;
    }
    int[] arr = Arrays.copyOf(nums, nums.length);
    Arrays.sort(arr);
    int[] res = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      res[i] = countSmallThan(arr, nums[i]);
    }
    return res;
  }

  private int countSmallThan(int[] arr, int target) {
    int i = 0;
    int j = arr.length - 1;
    while (i < j) {
      int mid = i + (j - i) / 2;
      if (arr[mid] >= target) {
        j = mid;
      } else {
        i = mid + 1;
      }
    }
    return i;
  }
}
