package com.xcv58.leetcode.increasing_triplet_subsequence;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test public void test() {
        testIncreasing();
        testSolution(new Solution());
        testSolution(new TrivialSolution());
        testIncreasingK();
    }

    private void testIncreasing() {
        IncreasingSequence solution = new IncreasingSequence();
        assertTrue(solution.increasingSequence(new int[]{1, 2}));
        assertTrue(solution.increasingSequence(new int[]{1, 2, 3, 4, 5}));
        assertTrue(solution.increasingSequence(new int[]{1, 1, 1, 2}));
        assertTrue(solution.increasingSequence(new int[]{1, 3, 2}));
        assertTrue(solution.increasingSequence(new int[]{-1, 0}));
        assertTrue(solution.increasingSequence(new int[]{1, Integer.MAX_VALUE}));
        assertTrue(solution.increasingSequence(new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE}));

        assertFalse(solution.increasingSequence(new int[]{1}));
        assertFalse(solution.increasingSequence(new int[]{2}));
        assertFalse(solution.increasingSequence(new int[]{1, 1, 1}));
        assertFalse(solution.increasingSequence(new int[]{3, 2, 1}));
        assertFalse(solution.increasingSequence(new int[]{5, 4, 3, 2, 1}));
        assertFalse(solution.increasingSequence(new int[]{Integer.MAX_VALUE, 1}));
        assertFalse(solution.increasingSequence(new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE}));
        assertFalse(solution.increasingSequence(new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE}));
    }

    private void testSolution(IncreasingTriplet solution) {
        assertTrue(solution.increasingTriplet(new int[]{1, 2, 3}));
        assertTrue(solution.increasingTriplet(new int[]{1, 2, 3, 4, 5}));
        assertTrue(solution.increasingTriplet(new int[]{1, 1, 1, 2, 3}));
        assertTrue(solution.increasingTriplet(new int[]{1, 3, 2, 1, 2, 3}));
        assertTrue(solution.increasingTriplet(new int[]{-1, 0, 1}));
        assertTrue(solution.increasingTriplet(new int[]{Integer.MIN_VALUE, 2, 3}));

        assertFalse(solution.increasingTriplet(new int[]{1}));
        assertFalse(solution.increasingTriplet(new int[]{1, 2}));
        assertFalse(solution.increasingTriplet(new int[]{1, 1, 1}));
        assertFalse(solution.increasingTriplet(new int[]{3, 2, 1}));
        assertFalse(solution.increasingTriplet(new int[]{5, 4, 3, 2, 1}));
    }


    private void testIncreasingK() {
        Solution solution = new Solution();
        // skip 2 because we already test it.
        assertTrue(solution.increasingK(new int[]{1, 2}, 1));
        assertTrue(solution.increasingK(new int[]{Integer.MIN_VALUE, 0}, 1));
        assertTrue(solution.increasingK(new int[]{2, 3}, 1));

        assertFalse(solution.increasingK(new int[]{0}, 1));
        assertFalse(solution.increasingK(new int[]{1, 1}, 1));
        assertFalse(solution.increasingK(new int[]{2, 1}, 1));

        assertTrue(solution.increasingK(new int[]{1, 2, 3, 4}, 3));
        assertTrue(solution.increasingK(new int[]{1, 1, 2, 2, 2, 3, 4}, 3));

        assertFalse(solution.increasingK(new int[]{1}, 3));
        assertFalse(solution.increasingK(new int[]{1, 2}, 3));
        assertFalse(solution.increasingK(new int[]{1, 2, 3}, 3));

        assertTrue(solution.increasingK(new int[]{1, 2, 3, 4, 5, 6}, 5));
        assertTrue(solution.increasingK(new int[]{1, 1, 2, 2, 2, 3, 4, 1, 4, 5, 6}, 5));

        assertFalse(solution.increasingK(new int[]{1}, 5));
        assertFalse(solution.increasingK(new int[]{1, 2}, 5));
        assertFalse(solution.increasingK(new int[]{1, 2, 3}, 5));
    }

}
