package com.xcv58.leetcode.nim_game;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by xcv58 on 10/17/15.
 */
public class SolutionTest {
    @Test public void test() {
        Solution solution = new Solution();
        assertTrue(solution.canWinNim(1));
        assertTrue(solution.canWinNim(2));
        assertTrue(solution.canWinNim(3));
        assertTrue(solution.canWinNim(5));
        assertTrue(solution.canWinNim(6));
        assertTrue(solution.canWinNim(7));
        assertTrue(solution.canWinNim(9));
        assertTrue(solution.canWinNim(10));
        assertTrue(solution.canWinNim(11));
        assertTrue(solution.canWinNim(13));
        assertTrue(solution.canWinNim(14));
        assertTrue(solution.canWinNim(15));
        assertTrue(solution.canWinNim(17));
        assertFalse(solution.canWinNim(4));
        assertFalse(solution.canWinNim(8));
        assertFalse(solution.canWinNim(12));
        assertFalse(solution.canWinNim(16));
        assertFalse(solution.canWinNim(20));
    }

    private void test(int target, int n, Solution solution) {
    }
}
