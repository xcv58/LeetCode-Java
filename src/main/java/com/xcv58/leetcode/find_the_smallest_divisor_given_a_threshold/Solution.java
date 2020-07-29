package com.xcv58.leetcode.find_the_smallest_divisor_given_a_threshold;

public class Solution {

  public int smallestDivisor(int[] nums, int threshold) {
    int res = 0;
    for (int i = 1, j = Integer.MAX_VALUE; i <= j;) {
      int mid = i + (j - i) / 2;
      int sum = getDivisionSum(nums, mid);
      if (sum > threshold) {
        i = mid + (mid == i ? 1 : 0);
      } else {
        res = mid;
        j = mid - 1;
      }
    }
    return res;
  }

  private int getDivisionSum(int[] nums, int n) {
    int sum = 0;
    for (int num : nums) {
      sum += num / n;
      if (num % n != 0) {
        sum += 1;
      }
    }
    return sum;
  }
}
