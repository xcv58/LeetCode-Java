package com.xcv58.leetcode.friend_circles;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.findCircleNum(null));
    assertEquals(0, solution.findCircleNum(new int[][] {}));
    assertEquals(
      3,
      solution.findCircleNum(
        new int[][] { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } }
      )
    );
    assertEquals(
      2,
      solution.findCircleNum(
        new int[][] { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1 } }
      )
    );
    assertEquals(
      1,
      solution.findCircleNum(
        new int[][] { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 } }
      )
    );
    assertEquals(
      1,
      solution.findCircleNum(
        new int[][] {
          { 1, 1, 1, 0 },
          { 1, 1, 0, 0 },
          { 1, 0, 1, 1 },
          { 0, 0, 1, 1 },
        }
      )
    );
    assertEquals(
      2,
      solution.findCircleNum(
        new int[][] {
          { 1, 0, 1, 0 },
          { 0, 1, 0, 0 },
          { 1, 0, 1, 1 },
          { 0, 0, 1, 1 },
        }
      )
    );
  }
}
