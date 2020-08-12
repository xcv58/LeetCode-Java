package com.xcv58.leetcode.intersection_of_two_arrays_ii;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(null, solution.intersect(null, null));
    assertEquals(null, solution.intersect(null, new int[] {}));
    assertEquals(null, solution.intersect(new int[] {}, null));
    assertArrayEquals(
      new int[] {},
      solution.intersect(new int[] {}, new int[] {})
    );
    assertArrayEquals(
      new int[] {},
      solution.intersect(new int[] { 1 }, new int[] { 2 })
    );
    assertArrayEquals(
      new int[] {},
      solution.intersect(new int[] { 1, 1 }, new int[] { 2, 2 })
    );
    assertArrayEquals(
      new int[] { 1, 2 },
      solution.intersect(new int[] { 1, 2 }, new int[] { 1, 2 })
    );
    assertArrayEquals(
      new int[] { 1, 1, 1 },
      solution.intersect(new int[] { 1, 1, 1 }, new int[] { 1, 2, 2, 1, 1 })
    );
    assertArrayEquals(
      new int[] { 1, 1, 2, 2 },
      solution.intersect(new int[] { 1, 2, 2, 2, 1 }, new int[] { 1, 1, 2, 2 })
    );
    assertArrayEquals(
      new int[] { 1, 1, 2, 2 },
      solution.intersect(
        new int[] { 1, 2, 2, 2, 1, 1, 1, 1, 1 },
        new int[] { 1, 1, 2, 2, 3 }
      )
    );
  }
}
