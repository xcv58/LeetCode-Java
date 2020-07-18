package com.xcv58.leetcode.swim_in_rising_water;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.swimInWater(null));
    assertEquals(0, solution.swimInWater(new int[][] {}));
    assertEquals(0, solution.swimInWater(new int[][] { { 0 } }));
    assertEquals(3, solution.swimInWater(new int[][] { { 0, 1 }, { 2, 3 } }));
    assertEquals(2, solution.swimInWater(new int[][] { { 0, 1 }, { 3, 2 } }));
    assertEquals(2, solution.swimInWater(new int[][] { { 0, 2 }, { 3, 1 } }));
    assertEquals(
      8,
      solution.swimInWater(
        new int[][] { { 0, 1, 2 }, { 5, 4, 3 }, { 6, 7, 8 } }
      )
    );
    assertEquals(
      5,
      solution.swimInWater(
        new int[][] { { 0, 1, 2 }, { 8, 4, 3 }, { 6, 7, 5 } }
      )
    );
    assertEquals(
      16,
      solution.swimInWater(
        new int[][] {
          { 0, 1, 2, 3, 4 },
          { 24, 23, 22, 21, 5 },
          { 12, 13, 14, 15, 16 },
          { 11, 17, 18, 19, 20 },
          { 10, 9, 8, 7, 6 },
        }
      )
    );
  }
}
