package com.xcv58.leetcode.as_far_from_land_as_possible;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(-1, solution.maxDistance(null));
    assertEquals(-1, solution.maxDistance(new int[][] {}));
    assertEquals(-1, solution.maxDistance(new int[][] { { 0 } }));
    assertEquals(-1, solution.maxDistance(new int[][] { { 1 } }));
    assertEquals(1, solution.maxDistance(new int[][] { { 1, 0 }, { 1, 0 } }));
    assertEquals(-1, solution.maxDistance(new int[][] { { 1, 1 }, { 1, 1 } }));
    assertEquals(
      -1,
      solution.maxDistance(
        new int[][] { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } }
      )
    );
    assertEquals(
      1,
      solution.maxDistance(
        new int[][] { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 0 } }
      )
    );
    assertEquals(
      2,
      solution.maxDistance(
        new int[][] { { 1, 0, 1 }, { 0, 0, 0 }, { 1, 0, 1 } }
      )
    );
    assertEquals(
      2,
      solution.maxDistance(
        new int[][] { { 1, 0, 1 }, { 0, 0, 0 }, { 1, 0, 0 } }
      )
    );
    assertEquals(
      3,
      solution.maxDistance(
        new int[][] { { 1, 0, 1 }, { 0, 0, 0 }, { 0, 0, 0 } }
      )
    );
    assertEquals(
      4,
      solution.maxDistance(
        new int[][] { { 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }
      )
    );
  }
}
