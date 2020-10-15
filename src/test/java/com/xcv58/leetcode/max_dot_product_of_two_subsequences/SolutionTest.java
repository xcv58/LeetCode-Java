package com.xcv58.leetcode.max_dot_product_of_two_subsequences;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.maxDotProduct(null, null));
    assertEquals(0, solution.maxDotProduct(new int[] {}, null));
    assertEquals(0, solution.maxDotProduct(null, new int[] {}));
    assertEquals(0, solution.maxDotProduct(new int[] {}, new int[] {}));
    assertEquals(0, solution.maxDotProduct(new int[] { 1 }, new int[] {}));
    assertEquals(1, solution.maxDotProduct(new int[] { 1 }, new int[] { 1 }));
    assertEquals(
      -1,
      solution.maxDotProduct(new int[] { 1, 1, 2 }, new int[] { -1, -1 })
    );
    assertEquals(
      1,
      solution.maxDotProduct(new int[] { 1, -1, 2 }, new int[] { -1, -1 })
    );
    assertEquals(
      18,
      solution.maxDotProduct(new int[] { 2, 1, -2, 5 }, new int[] { 3, 0, -6 })
    );
    assertEquals(
      21,
      solution.maxDotProduct(new int[] { 3, -2 }, new int[] { 2, -6, 7 })
    );
    assertEquals(
      176,
      solution.maxDotProduct(
        new int[] { 1, 3, 2, 4, 6, 7, 8, 9 },
        new int[] { 9, 2, 3, 7, -9, 1, -8, 5, -1, -1 }
      )
    );
    assertEquals(
      200,
      solution.maxDotProduct(
        new int[] { -3, -8, 3, -10, 1, 3, 9 },
        new int[] { 9, 2, 3, 7, -9, 1, -8, 5, -1, -1 }
      )
    );
  }
}
