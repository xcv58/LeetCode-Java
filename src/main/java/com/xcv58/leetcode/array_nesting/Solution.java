package com.xcv58.leetcode.array_nesting;

public class Solution {

  public int arrayNesting(int[] nums) {
    boolean[] visited = new boolean[nums.length];
    int res = 0;
    for (int i = 0; i < nums.length; i++) {
      if (visited[i]) {
        continue;
      }
      int tmp = 0;
      for (int j = i; !visited[j];) {
        visited[j] = true;
        j = nums[j];
        tmp++;
      }
      res = Math.max(res, tmp);
    }
    return res;
  }
}
