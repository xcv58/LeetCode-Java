package com.xcv58.leetcode.flip_game_ii;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test public void test() {
        Solution solution = new Solution();
        assertEquals(true, solution.canWin("++"));
        assertEquals(true, solution.canWin("+++"));
        assertEquals(true, solution.canWin("++++"));
        assertEquals(false, solution.canWin("+++++"));
        assertEquals(true, solution.canWin("++++++++++"));
        assertEquals(true, solution.canWin("+++++++++++"));
    }
}