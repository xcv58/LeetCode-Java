package com.xcv58.leetcode.paint_fence;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test public void test() {
        Solution solution = new Solution();
        assertEquals(solution.numWays(0, 0), 0);
        assertEquals(solution.numWays(0, 1), 0);
        assertEquals(solution.numWays(1, 0), 0);
        assertEquals(solution.numWays(1, 1), 1);
        assertEquals(solution.numWays(1, 2), 2);
        assertEquals(solution.numWays(2, 2), 4);
        assertEquals(solution.numWays(3, 2), 6);
        assertEquals(solution.numWays(3, 3), 24);
        assertEquals(solution.numWays(3, 4), 60);
        assertEquals(solution.numWays(4, 3), 66);
        assertEquals(solution.numWays(4, 4), 228);
        assertEquals(solution.numWays(4, 5), 580);
    }
}