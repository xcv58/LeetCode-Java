package com.xcv58.leetcode.cherry_pickup_ii;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.cherryPickup(null));
    assertEquals(0, solution.cherryPickup(new int[][] {}));
    assertEquals(1, solution.cherryPickup(new int[][] { new int[] { 1 } }));
    assertEquals(
      2,
      solution.cherryPickup(new int[][] { new int[] { 1 }, new int[] { 1 } })
    );
    assertEquals(
      4,
      solution.cherryPickup(
        new int[][] { new int[] { 1, 0 }, new int[] { 1, 2 } }
      )
    );
    assertEquals(
      11,
      solution.cherryPickup(
        new int[][] {
          new int[] { 1, 2, 3, 2, 1 },
          new int[] { 1, 2, 100, 2, 1 },
          new int[] { 1, 2, 3, 2, 1 },
        }
      )
    );
    assertEquals(
      24,
      solution.cherryPickup(
        new int[][] {
          new int[] { 3, 1, 1 },
          new int[] { 2, 5, 1 },
          new int[] { 1, 5, 5 },
          new int[] { 2, 1, 1 },
        }
      )
    );
    assertEquals(
      28,
      solution.cherryPickup(
        new int[][] {
          new int[] { 1, 0, 0, 0, 0, 0, 1 },
          new int[] { 2, 0, 0, 0, 0, 3, 0 },
          new int[] { 2, 0, 9, 0, 0, 0, 0 },
          new int[] { 0, 3, 0, 5, 4, 0, 0 },
          new int[] { 1, 0, 2, 3, 0, 0, 6 },
        }
      )
    );
    assertEquals(
      22,
      solution.cherryPickup(
        new int[][] {
          new int[] { 1, 0, 0, 3 },
          new int[] { 0, 0, 0, 3 },
          new int[] { 0, 0, 3, 3 },
          new int[] { 9, 0, 3, 3 },
        }
      )
    );
  }
}
