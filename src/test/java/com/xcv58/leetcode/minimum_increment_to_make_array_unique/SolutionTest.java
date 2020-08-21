package com.xcv58.leetcode.minimum_increment_to_make_array_unique;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.minIncrementForUnique(null));
    assertEquals(0, solution.minIncrementForUnique(new int[] {}));
    assertEquals(0, solution.minIncrementForUnique(new int[] { 1 }));
    assertEquals(0, solution.minIncrementForUnique(new int[] { 1, 2, 3, 4 }));
    assertEquals(1, solution.minIncrementForUnique(new int[] { 1, 2, 3, 3 }));
    assertEquals(1, solution.minIncrementForUnique(new int[] { 1, 1, 3, 4 }));
    assertEquals(
      4,
      solution.minIncrementForUnique(new int[] { 1, 1, 2, 3, 4 })
    );
    assertEquals(
      12,
      solution.minIncrementForUnique(
        new int[] { 3, 2, 1, 2, 1, 700, 699, 700, 701, 699 }
      )
    );
  }
}
