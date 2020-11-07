package com.xcv58.leetcode.sum_of_subarray_minimums;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.sumSubarrayMins(null));
    assertEquals(0, solution.sumSubarrayMins(new int[] {}));
    assertEquals(1, solution.sumSubarrayMins(new int[] { 1 }));
    assertEquals(10, solution.sumSubarrayMins(new int[] { 10 }));
    assertEquals(17, solution.sumSubarrayMins(new int[] { 3, 1, 2, 4 }));
    assertEquals(45, solution.sumSubarrayMins(new int[] { 3, 1, 2, 12, 3, 2 }));
    assertEquals(
      106,
      solution.sumSubarrayMins(new int[] { 3, 1, 2, 1, 3, 4, 1, 4, 4, 4, 4 })
    );
    assertEquals(
      148,
      solution.sumSubarrayMins(
        new int[] { 3, 1, 2, 12, 3, 2, 4, 2, 5, 1, 2, 3, 4 }
      )
    );
    assertEquals(
      2816,
      solution.sumSubarrayMins(
        new int[] {
          3,
          1,
          2,
          12,
          3,
          2,
          412,
          31,
          39,
          19,
          22,
          113,
          1234,
          12,
          3,
          2,
          5,
          1,
          2,
          3,
          4,
        }
      )
    );
    assertEquals(
      147483633,
      solution.sumSubarrayMins(new int[] { Integer.MAX_VALUE })
    );
    assertEquals(
      147483646,
      solution.sumSubarrayMins(new int[] { Integer.MAX_VALUE, 1, 2, 3 })
    );
    assertEquals(
      294967286,
      solution.sumSubarrayMins(
        new int[] { Integer.MAX_VALUE, 1, 2, 3, Integer.MAX_VALUE }
      )
    );
    assertEquals(
      622319997,
      solution.sumSubarrayMins(
        new int[] {
          Integer.MAX_VALUE,
          1,
          2,
          3,
          Integer.MAX_VALUE,
          Integer.MAX_VALUE,
          Integer.MAX_VALUE,
          Integer.MAX_VALUE,
        }
      )
    );
  }
}
