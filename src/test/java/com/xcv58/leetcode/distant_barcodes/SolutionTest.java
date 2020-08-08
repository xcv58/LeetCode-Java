package com.xcv58.leetcode.distant_barcodes;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(null, solution.rearrangeBarcodes(null));
    assertArrayEquals(new int[] {}, solution.rearrangeBarcodes(new int[] {}));
    assertArrayEquals(
      new int[] { 1 },
      solution.rearrangeBarcodes(new int[] { 1 })
    );
    assertArrayEquals(
      new int[] { 1, 2 },
      solution.rearrangeBarcodes(new int[] { 1, 2 })
    );
    assertArrayEquals(
      new int[] { 1, 2, 1, 2, 1, 2, 1 },
      solution.rearrangeBarcodes(new int[] { 1, 1, 1, 1, 2, 2, 2 })
    );
    assertArrayEquals(
      new int[] { 1, 2, 1, 2, 1, 3, 1, 3, 2, 4 },
      solution.rearrangeBarcodes(new int[] { 1, 1, 1, 1, 3, 2, 2, 2, 3, 4 })
    );
  }
}
