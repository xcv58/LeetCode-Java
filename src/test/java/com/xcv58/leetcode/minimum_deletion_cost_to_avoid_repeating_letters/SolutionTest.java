package com.xcv58.leetcode.minimum_deletion_cost_to_avoid_repeating_letters;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.minCost(null, null));
    assertEquals(0, solution.minCost("", null));
    assertEquals(0, solution.minCost(null, new int[] {}));
    assertEquals(0, solution.minCost("ab", new int[] { 1 }));
    assertEquals(0, solution.minCost("ab", new int[] { 1, 1 }));
    assertEquals(1, solution.minCost("aa", new int[] { 1, 1 }));
    assertEquals(3, solution.minCost("abaac", new int[] { 1, 2, 3, 4, 5 }));
    assertEquals(0, solution.minCost("abcde", new int[] { 1, 2, 3, 4, 5 }));
    assertEquals(2, solution.minCost("aabaa", new int[] { 1, 2, 3, 4, 1 }));
    assertEquals(
      12,
      solution.minCost("aaaccc", new int[] { 1, 2, 3, 4, 5, 6 })
    );
  }
}
