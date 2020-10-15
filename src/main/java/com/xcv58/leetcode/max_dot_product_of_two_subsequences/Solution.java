package com.xcv58.leetcode.max_dot_product_of_two_subsequences;

public class Solution {

  public int maxDotProduct(int[] nums1, int[] nums2) {
    if (
      nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0
    ) {
      return 0;
    }
    int len1 = nums1.length;
    int len2 = nums2.length;
    int[][] dp = new int[len1 + 1][len2 + 1];
    int res = Integer.MIN_VALUE;
    for (int i = 0; i < len1; i++) {
      for (int j = 0; j < len2; j++) {
        int prod = nums1[i] * nums2[j];
        dp[i + 1][j + 1] = prod;
        if (i == 0 && j > 0) {
          dp[i + 1][j + 1] = dp[i + 1][j];
        } else if (i > 0 && j == 0) {
          dp[i + 1][j + 1] = dp[i][j + 1];
        } else if (i > 0 && j > 0) {
          dp[i + 1][j + 1] =
            Math.max(prod + dp[i][j], Math.max(dp[i + 1][j], dp[i][j + 1]));
        }

        dp[i + 1][j + 1] = Math.max(prod, dp[i + 1][j + 1]);
        res = Math.max(res, dp[i + 1][j + 1]);
      }
    }
    return res;
  }
}
