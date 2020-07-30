package com.xcv58.leetcode.three_equal_parts;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] { -1, -1 }, solution.threeEqualParts(null));
    assertArrayEquals(
      new int[] { -1, -1 },
      solution.threeEqualParts(new int[] { 0 })
    );
    assertArrayEquals(
      new int[] { -1, -1 },
      solution.threeEqualParts(new int[] { 0, 0 })
    );
    assertArrayEquals(
      new int[] { 0, 2 },
      solution.threeEqualParts(new int[] { 0, 0, 0 })
    );
    assertArrayEquals(
      new int[] { 0, 4 },
      solution.threeEqualParts(new int[] { 0, 0, 0, 0, 0 })
    );
    assertArrayEquals(
      new int[] { 0, 3 },
      solution.threeEqualParts(new int[] { 1, 0, 1, 0, 1 })
    );
    assertArrayEquals(
      new int[] { -1, -1 },
      solution.threeEqualParts(new int[] { 1, 0, 1, 0, 1, 1 })
    );
    assertArrayEquals(
      new int[] { -1, -1 },
      solution.threeEqualParts(new int[] { 1, 1, 1, 0, 1 })
    );
    assertArrayEquals(
      new int[] { 1, 4 },
      solution.threeEqualParts(new int[] { 0, 1, 0, 1, 1 })
    );
  }
}
