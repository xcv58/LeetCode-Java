package com.xcv58.leetcode.array_of_doubled_pairs;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(false, solution.canReorderDoubled(new int[] { 3, 1, 3, 6 }));
    assertEquals(false, solution.canReorderDoubled(new int[] { 2, 1, 2, 6 }));
    assertEquals(
      false,
      solution.canReorderDoubled(new int[] { 1, 2, 4, 16, 8, 4 })
    );
    assertEquals(true, solution.canReorderDoubled(new int[] { 4, -2, 2, -4 }));
    assertEquals(
      true,
      solution.canReorderDoubled(new int[] { 4, -2, 2, -4, 0, 0, 0, 0 })
    );
    assertEquals(
      false,
      solution.canReorderDoubled(new int[] { 4, -2, 2, -4, 0, 0, 0 })
    );
    assertEquals(
      true,
      solution.canReorderDoubled(
        new int[] {
          4,
          -2,
          2,
          -4,
          0,
          0,
          Integer.MAX_VALUE - 1,
          Integer.MAX_VALUE / 2,
        }
      )
    );
    assertEquals(
      true,
      solution.canReorderDoubled(
        new int[] {
          -16,
          -8,
          -8,
          -4,
          -4,
          -2,
          4,
          -2,
          2,
          -4,
          0,
          0,
          Integer.MAX_VALUE - 1,
          Integer.MAX_VALUE / 2,
        }
      )
    );
  }
}
