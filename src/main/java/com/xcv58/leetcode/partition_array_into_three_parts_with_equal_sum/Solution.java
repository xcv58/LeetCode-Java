package com.xcv58.leetcode.partition_array_into_three_parts_with_equal_sum;

public class Solution {

  public boolean canThreePartsEqualSum(int[] A) {
    if (A == null) {
      return false;
    }
    int sum = 0;
    for (int a : A) {
      sum += a;
    }
    if (sum % 3 != 0) {
      return false;
    }
    int target = sum / 3;
    int partSum = 0;
    int parts = 0;
    for (int i = 0; i < A.length; i++) {
      partSum += A[i];
      if (partSum == target) {
        parts++;
        partSum = 0;
      }
    }
    return partSum == 0 && parts == 3 || (parts >= 3 && target == 0);
  }
}
