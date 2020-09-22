package com.xcv58.leetcode.subarray_product_less_than_k;

public class Solution {

  public int numSubarrayProductLessThanK(int[] nums, int k) {
    if (nums == null) {
      return 0;
    }
    int res = 0;
    for (int i = 0, j = 0, product = 1; j < nums.length; j++) {
      product *= nums[j];
      while (i <= j && product >= k) {
        product /= nums[i++];
      }
      res += j - i + 1;
    }
    return res;
  }
}
