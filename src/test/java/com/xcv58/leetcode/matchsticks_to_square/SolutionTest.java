package com.xcv58.leetcode.matchsticks_to_square;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(false, solution.makesquare(null));
    assertEquals(false, solution.makesquare(new int[] {}));
    assertEquals(false, solution.makesquare(new int[] { 1 }));
    assertEquals(false, solution.makesquare(new int[] { 1, 1, 1, 2 }));
    assertEquals(false, solution.makesquare(new int[] { 1, 1, 2, 2 }));
    assertEquals(false, solution.makesquare(new int[] { 1, 2, 2, 2 }));
    assertEquals(true, solution.makesquare(new int[] { 1, 2, 2, 2, 1 }));
    assertEquals(
      true,
      solution.makesquare(new int[] { 1, 2, 2, 2, 1, 1, 1, 1, 1 })
    );
    assertEquals(
      false,
      solution.makesquare(new int[] { 1, 2, 2, 2, 1, 1, 1, 1 })
    );
    assertEquals(
      false,
      solution.makesquare(
        new int[] { 5, 5, 5, 5, 16, 4, 4, 4, 4, 4, 3, 3, 3, 3, 4 }
      )
    );
    assertEquals(
      false,
      solution.makesquare(
        new int[] { 5, 5, 5, 5, 16, 4, 4, 4, 4, 4, 3, 3, 3, 3, 4, 1 }
      )
    );
    assertEquals(
      true,
      solution.makesquare(new int[] { 1, 2, 2, 2, 1, 1, 1, 1, 2, 5, 5, 5 })
    );
    assertEquals(
      false,
      solution.makesquare(
        new int[] { 1, 2, 2, 2, 1, 1, 1, 1, 3, 5, 5, 5, 5, 5, 5, 5, 20 }
      )
    );
    assertEquals(
      true,
      solution.makesquare(
        new int[] {
          1,
          1,
          1,
          1,
          1,
          3,
          2,
          2,
          1,
          1,
          3,
          5,
          3,
          5,
          5,
          5,
          5,
          5,
          5,
          5,
          20,
        }
      )
    );
  }
}
