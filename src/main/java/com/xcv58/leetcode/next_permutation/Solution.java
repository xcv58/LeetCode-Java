package com.xcv58.leetcode.next_permutation;

public class Solution {

  public void nextPermutation(int[] nums) {
    if (nums == null) {
      return;
    }
    int i = nums.length - 1;
    for (; i > 0; i--) {
      if (nums[i] > nums[i - 1]) {
        break;
      }
    }

    if (i > 0) {
      for (int j = nums.length - 1; j >= i; j--) {
        if (nums[j] > nums[i - 1]) {
          this.swap(nums, i - 1, j);
          break;
        }
      }
    }

    for (int j = nums.length - 1; i < j; i++) {
      if (nums[i] > nums[j]) {
        this.swap(nums, i, j);
        j--;
      }
    }
  }

  private void swap(int[] nums, int i, int j) {
    int tmp = nums[i];
    nums[i] = nums[j];
    nums[j] = tmp;
  }
}
