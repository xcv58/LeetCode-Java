package com.xcv58.leetcode.increasing_triplet_subsequence;

public class TrivialSolution implements IncreasingTriplet {
    public boolean increasingTriplet(int[] nums) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        for (int n : nums) {
            if (n <= a) {
                a = n;
            } else if (n <= b) {
                b = n;
            } else {
                return true;
            }
        }

        return false;
    }
}