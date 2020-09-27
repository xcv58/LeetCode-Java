package com.xcv58.leetcode.minimum_number_of_k_consecutive_bit_flips;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(-1, solution.minKBitFlips(null, 1));
    assertEquals(-1, solution.minKBitFlips(new int[] {}, 1));
    assertEquals(0, solution.minKBitFlips(new int[] { 1, 1, 1, 1 }, 1));
    assertEquals(
      7,
      solution.minKBitFlips(
        new int[] { 0, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0 },
        3
      )
    );
    assertEquals(
      -1,
      solution.minKBitFlips(
        new int[] { 0, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0 },
        2
      )
    );
    assertEquals(
      9,
      solution.minKBitFlips(
        new int[] { 0, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0 },
        1
      )
    );
    assertEquals(
      -1,
      solution.minKBitFlips(
        new int[] { 0, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0 },
        4
      )
    );
    assertEquals(
      -1,
      solution.minKBitFlips(
        new int[] { 0, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0 },
        100
      )
    );
    assertEquals(
      -1,
      solution.minKBitFlips(
        new int[] { 0, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0 },
        5
      )
    );
    assertEquals(
      -1,
      solution.minKBitFlips(
        new int[] { 0, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0 },
        6
      )
    );
  }
}
