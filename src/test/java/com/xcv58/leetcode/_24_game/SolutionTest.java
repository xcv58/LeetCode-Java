package com.xcv58.leetcode._24_game;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test public void test() {
        Solution solution = new Solution();
        assertEquals(true, solution.judgePoint24(new int[]{3, 3, 8, 8}));
        assertEquals(true, solution.judgePoint24(new int[]{1, 3, 4, 2}));
        assertEquals(true, solution.judgePoint24(new int[]{1, 3, 4, 6}));
        assertEquals(true, solution.judgePoint24(new int[]{1, 2, 3, 4}));
        assertEquals(false, solution.judgePoint24(new int[]{0, 0, 0, 0}));
        assertEquals(false, solution.judgePoint24(new int[]{1, 0, 1, 0}));
        assertEquals(false, solution.judgePoint24(new int[]{1, 0, 3, 4}));
    }
}
