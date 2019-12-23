package com.xcv58.leetcode.all_possible_full_binary_trees;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();
        assertEquals(1, solution.allPossibleFBT(1).size());
        assertEquals(1, solution.allPossibleFBT(3).size());
        assertEquals(2, solution.allPossibleFBT(5).size());
        assertEquals(5, solution.allPossibleFBT(7).size());
        assertEquals(14, solution.allPossibleFBT(9).size());
        assertEquals(42, solution.allPossibleFBT(11).size());
    }
}
