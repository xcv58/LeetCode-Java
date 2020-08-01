package com.xcv58.leetcode.partition_array_into_three_parts_with_equal_sum;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(false, solution.canThreePartsEqualSum(null));
    assertEquals(false, solution.canThreePartsEqualSum(new int[] {}));
    assertEquals(false, solution.canThreePartsEqualSum(new int[] { 1, 2, 3 }));
    assertEquals(
      false,
      solution.canThreePartsEqualSum(new int[] { 1, 2, 3, 4, 5, 6 })
    );
    assertEquals(
      false,
      solution.canThreePartsEqualSum(
        new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 }
      )
    );
    assertEquals(
      false,
      solution.canThreePartsEqualSum(
        new int[] { 0, 2, 1, -6, 6, 7, 9, -1, 2, 0, 1 }
      )
    );
    assertEquals(
      true,
      solution.canThreePartsEqualSum(
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
          8,
          7,
          6,
          5,
          4,
          3,
          2,
          1,
          9,
          2,
          3,
          4,
          5,
          6,
          7,
          8,
          1,
          9,
        }
      )
    );
    assertEquals(
      true,
      solution.canThreePartsEqualSum(
        new int[] { 0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1 }
      )
    );
    assertEquals(
      true,
      solution.canThreePartsEqualSum(
        new int[] { 3, 3, 6, 5, -2, 2, 5, 1, -9, 4 }
      )
    );
  }
}
