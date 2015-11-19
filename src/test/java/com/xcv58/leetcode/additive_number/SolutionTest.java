package com.xcv58.leetcode.additive_number;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test public void test() {
        Solution solution = new Solution();
        assertTrue(solution.isAdditiveNumber("123"));
        assertTrue(solution.isAdditiveNumber("101"));
        assertTrue(solution.isAdditiveNumber("112358132134558914423337761098715972584"));
        assertFalse(solution.isAdditiveNumber(null));
        assertFalse(solution.isAdditiveNumber("0"));
        assertFalse(solution.isAdditiveNumber("1"));
        assertFalse(solution.isAdditiveNumber("2"));
        assertFalse(solution.isAdditiveNumber("12"));
        assertFalse(solution.isAdditiveNumber("99"));
        assertFalse(solution.isAdditiveNumber("112358132134558914423337761098715972585"));
    }
}