package com.xcv58.leetcode.increasing_triplet_subsequence;

import java.util.Arrays;

public class Solution implements IncreasingTriplet {
    public boolean increasingTriplet(int[] nums) {
        return increasingK(nums, 2);
    }

    public boolean increasingK(int[] nums, int k) {
        int[] array = new int[k];
        Arrays.fill(array, Integer.MAX_VALUE);
        for (int n : nums) {
            int i = 0;
            for (i = 0; i < k; i++) {
                if (n <= array[i]) {
                    array[i] = n;
                    break;
                }
            }
            if (i == k) {
                return true;
            }
        }
        return false;
    }
}