package com.xcv58.leetcode.reverse_string;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test public void test() {
        Solution solution = new Solution();
        assertEquals("", solution.reverseString(""));
        assertEquals("abc", solution.reverseString("cba"));
        assertEquals("abcd", solution.reverseString("dcba"));
        assertEquals("-1", solution.reverseString("1-"));
    }
}