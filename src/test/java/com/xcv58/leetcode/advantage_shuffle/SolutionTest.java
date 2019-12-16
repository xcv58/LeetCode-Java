package com.xcv58.leetcode.advantage_shuffle;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();
        assertArrayEquals(new int[] { 2, 11, 7, 15 },
                solution.advantageCount(new int[] { 2, 7, 11, 15 }, new int[] { 1, 10, 4, 11 }));
        assertArrayEquals(new int[] { 24, 32, 8, 12 },
                solution.advantageCount(new int[] { 12, 24, 8, 32 }, new int[] { 13, 25, 32, 11 }));
        assertArrayEquals(new int[] { 1, 2, 3, 4 },
                solution.advantageCount(new int[] { 4, 3, 2, 1 }, new int[] { 4, 5, 6, 7 }));
    }
}
