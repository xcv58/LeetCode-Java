package com.xcv58.leetcode.patching_array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test public void test() {
        Solution solution = new Solution();
        assertEquals(0,
                solution.minPatches(new int[]{1}, 1));
        assertEquals(1,
                solution.minPatches(new int[]{}, 1));
        assertEquals(2,
                solution.minPatches(new int[]{}, 2));
        assertEquals(3,
                solution.minPatches(new int[]{}, (1 << 2)));
        assertEquals(4,
                solution.minPatches(new int[]{}, (1 << 3)));
        assertEquals(5,
                solution.minPatches(new int[]{}, (1 << 4)));
        assertEquals(9,
                solution.minPatches(new int[]{}, (1 << 8)));
        assertEquals(21,
                solution.minPatches(new int[]{}, (1 << 20)));
        assertEquals(31,
                solution.minPatches(new int[]{}, (1 << 30)));
        assertEquals(31,
                solution.minPatches(new int[]{}, Integer.MAX_VALUE));
        assertEquals(
                1,
                solution.minPatches(new int[]{1,3}, 6)
        );
        assertEquals(
                2,
                solution.minPatches(new int[]{1,5,10}, 20)
        );
        assertEquals(
                0,
                solution.minPatches(new int[]{1,2,2}, 5)
        );
    }
}
