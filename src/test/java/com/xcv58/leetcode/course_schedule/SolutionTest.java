package com.xcv58.leetcode.course_schedule;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertTrue(solution.canFinish(2, new int[][] {}));
    assertTrue(solution.canFinish(2, new int[][] { { 0, 1 } }));
    assertTrue(solution.canFinish(2, new int[][] { { 1, 0 } }));
    assertTrue(
      solution.canFinish(3, new int[][] { { 1, 0 }, { 1, 2 }, { 2, 0 } })
    );

    assertFalse(solution.canFinish(2, new int[][] { { 1, 0 }, { 0, 1 } }));
    assertFalse(solution.canFinish(3, new int[][] { { 1, 0 }, { 0, 1 } }));
    assertFalse(
      solution.canFinish(
        5,
        new int[][] {
          { 1, 0 },
          { 2, 0 },
          { 3, 0 },
          { 3, 1 },
          { 2, 3 },
          { 1, 2 }
        }
      )
    );
    assertFalse(solution.canFinish(100, new int[][] { { 1, 0 }, { 0, 1 } }));
  }
}
