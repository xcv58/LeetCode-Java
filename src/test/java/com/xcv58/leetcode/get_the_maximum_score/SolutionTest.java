package com.xcv58.leetcode.get_the_maximum_score;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.maxSum(null, null));
    assertEquals(0, solution.maxSum(new int[] {}, null));
    assertEquals(0, solution.maxSum(null, new int[] {}));
    assertEquals(0, solution.maxSum(new int[] {}, new int[] {}));
    assertEquals(1, solution.maxSum(new int[] { 1 }, new int[] {}));
    assertEquals(2, solution.maxSum(new int[] { 1 }, new int[] { 2 }));
    assertEquals(
      30,
      solution.maxSum(new int[] { 2, 4, 5, 8, 10 }, new int[] { 4, 6, 8, 9 })
    );
    assertEquals(
      30,
      solution.maxSum(new int[] { 2, 4, 5, 8, 10 }, new int[] { 2, 4, 6, 8, 9 })
    );
    assertEquals(
      109,
      solution.maxSum(new int[] { 1, 3, 5, 7, 9 }, new int[] { 3, 5, 100 })
    );
    assertEquals(
      40,
      solution.maxSum(new int[] { 1, 2, 3, 4, 5 }, new int[] { 6, 7, 8, 9, 10 })
    );
    assertEquals(
      61,
      solution.maxSum(
        new int[] { 1, 4, 5, 8, 9, 11, 19 },
        new int[] { 2, 3, 4, 11, 12 }
      )
    );
    assertEquals(
      160749580,
      solution.maxSum(
        new int[] {
          1,
          2,
          3,
          4,
          5,
          6,
          7,
          8,
          9,
          Integer.MAX_VALUE / 16,
          Integer.MAX_VALUE / 8,
          Integer.MAX_VALUE / 4,
          Integer.MAX_VALUE / 2,
          Integer.MAX_VALUE,
        },
        new int[] {
          1,
          2,
          3,
          4,
          5,
          6,
          7,
          8,
          9,
          Integer.MAX_VALUE / 16,
          Integer.MAX_VALUE / 8,
          Integer.MAX_VALUE / 4,
          Integer.MAX_VALUE / 2,
          Integer.MAX_VALUE,
        }
      )
    );
  }
}
