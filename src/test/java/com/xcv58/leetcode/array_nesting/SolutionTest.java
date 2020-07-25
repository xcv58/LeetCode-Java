package com.xcv58.leetcode.array_nesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.arrayNesting(new int[] {}));
    assertEquals(1, solution.arrayNesting(new int[] { 0 }));
    assertEquals(1, solution.arrayNesting(new int[] { 0, 1 }));
    assertEquals(2, solution.arrayNesting(new int[] { 1, 0 }));
    assertEquals(2, solution.arrayNesting(new int[] { 1, 0, 2 }));
    assertEquals(2, solution.arrayNesting(new int[] { 0, 2, 1 }));
    assertEquals(3, solution.arrayNesting(new int[] { 2, 0, 1 }));
    assertEquals(4, solution.arrayNesting(new int[] { 5, 4, 0, 3, 1, 6, 2 }));
    assertEquals(
      6,
      solution.arrayNesting(new int[] { 5, 4, 0, 9, 3, 8, 1, 6, 2, 7 })
    );
  }
}
