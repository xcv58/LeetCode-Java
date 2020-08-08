package com.xcv58.leetcode.k_closest_points_to_origin;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(new int[][] {}, solution.kClosest(null, 1));
    assertEquals(new int[][] {}, solution.kClosest(new int[][] {}, 1));
    assertEquals(
      new int[][] { { 2, 2 } },
      solution.kClosest(new int[][] { { 2, 2 } }, 1)
    );
    assertEquals(
      new int[][] { { -2, 2 } },
      solution.kClosest(new int[][] { { -2, 2 }, { 1, 3 } }, 1)
    );
    assertEquals(
      new int[][] { { 3, 3 }, { -2, 4 } },
      solution.kClosest(new int[][] { { 3, 3 }, { -2, 4 }, { 5, -1 } }, 2)
    );
    assertEquals(
      new int[][] { { -2, 2 }, { 1, 3 }, { 3, 3 } },
      solution.kClosest(
        new int[][] { { 1, 3 }, { -2, 2 }, { 3, 3 }, { 5, -1 }, { -2, 4 } },
        3
      )
    );
  }
}
