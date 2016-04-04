package com.xcv58.leetcode.patching_array;

public class Solution {
    public int minPatches(int[] nums, int n) {
        long missed = 1;
        int i = 0;

        int res = 0;
        while (missed <= n) {
            if (i < nums.length) {
                if (missed < nums[i]) {
                    res++;
                    missed += missed;
                } else {
                    missed += nums[i];
                    i++;
                }
            } else {
                res++;
                missed += missed;
            }
        }
        return res;
    }
}
