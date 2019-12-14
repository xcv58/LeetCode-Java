package com.xcv58.leetcode.stone_game;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test public void test() {
        Solution solution = new Solution();
        assertEquals(true, solution.stoneGame(new int[]{5, 4, 3, 5}));
        assertEquals(true, solution.stoneGame(new int[]{4, 5, 4, 4}));
        assertEquals(true, solution.stoneGame(new int[]{1, 5, 4, 1}));
        assertEquals(true, solution.stoneGame(new int[]{1, 501, 4, 1}));
        assertEquals(true, solution.stoneGame(new int[]{1001, 501, 4, 1}));
        assertEquals(true, solution.stoneGame(new int[]{1001, 4, 501, 1}));
        assertEquals(true, solution.stoneGame(new int[]{1001, 4, 501, 1001}));
        assertEquals(true, solution.stoneGame(new int[]{1, 2, 3, 100, 4, 5}));
        assertEquals(true, solution.stoneGame(new int[]{101, 2, 3, 100, 98, 5, 100, 100}));
    }
}
