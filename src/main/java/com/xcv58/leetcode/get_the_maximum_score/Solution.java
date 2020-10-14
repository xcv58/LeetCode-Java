package com.xcv58.leetcode.get_the_maximum_score;

import java.util.*;

public class Solution {
  private long MOD = 1_000_000_007;

  public int maxSum(int[] nums1, int[] nums2) {
    if (nums1 == null || nums2 == null) {
      return 0;
    }
    List<Integer> commonNums = getCommonNums(nums1, nums2);

    long[] dp1 = new long[nums1.length + 1];
    long[] dp2 = new long[nums2.length + 1];
    int i1 = 0, i2 = 0;
    for (
      int i = 0;
      i1 < nums1.length && i2 < nums2.length && i < commonNums.size();
      i++, i1++, i2++
    ) {
      int common = commonNums.get(i);
      i1 = process(nums1, i1, dp1, common);
      i2 = process(nums2, i2, dp2, common);
      long tmp = common + Math.max(dp1[i1], dp2[i2]);
      dp1[i1 + 1] = tmp;
      dp2[i2 + 1] = tmp;
    }
    process(nums1, i1, dp1);
    process(nums2, i2, dp2);
    return (int) (Math.max(dp1[nums1.length], dp2[nums2.length]) % MOD);
  }

  private List<Integer> getCommonNums(int[] nums1, int[] nums2) {
    List<Integer> res = new ArrayList<>();
    for (
      int i1 = 0, i2 = 0;
      i1 < nums1.length && i2 < nums2.length;
      i1++, i2++
    ) {
      if (nums1[i1] == nums2[i2]) {
        res.add(nums1[i1]);
      } else if (nums1[i1] < nums2[i2]) {
        i2--;
      } else {
        i1--;
      }
    }
    return res;
  }

  private void process(int[] nums, int from, long[] dp) {
    for (int i = from; i < nums.length; i++) {
      dp[i + 1] = nums[i] + dp[i];
    }
  }

  private int process(int[] nums, int from, long[] dp, int limit) {
    int i = from;
    while (i < nums.length && nums[i] < limit) {
      dp[i + 1] = nums[i] + dp[i];
      i++;
    }
    return i;
  }
}
