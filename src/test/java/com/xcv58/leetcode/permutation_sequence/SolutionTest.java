package com.xcv58.leetcode.permutation_sequence;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals("1", solution.getPermutation(1, 10));
    assertEquals("1", solution.getPermutation(1, 10000));
    assertEquals("1", solution.getPermutation(1, 1));
    assertEquals("12", solution.getPermutation(2, 1));
    assertEquals("21", solution.getPermutation(2, 2));
    assertEquals("12", solution.getPermutation(2, 3));
    assertEquals("21", solution.getPermutation(2, 4));
    assertEquals("12", solution.getPermutation(2, 5));
    assertEquals("21", solution.getPermutation(2, 6));
    assertEquals("53142", solution.getPermutation(5, 110));
    assertEquals("54321", solution.getPermutation(5, 120));
    assertEquals("12354", solution.getPermutation(5, 2));
    assertEquals("54312", solution.getPermutation(5, 119));
    assertEquals("139846527", solution.getPermutation(9, 9999));
    assertEquals("912436578", solution.getPermutation(9, Integer.MAX_VALUE));
    assertEquals(
      "987654321",
      solution.getPermutation(9, 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2)
    );
    assertEquals(
      "987654312",
      solution.getPermutation(9, 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 - 1)
    );
    assertEquals(
      "987654231",
      solution.getPermutation(9, 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 - 2)
    );
    assertEquals(
      "987654213",
      solution.getPermutation(9, 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 - 3)
    );
    assertEquals(
      "219876543",
      solution.getPermutation(9, 9 * 7 * 6 * 5 * 4 * 3 * 2)
    );
    assertEquals(
      "329876541",
      solution.getPermutation(9, 9 * 8 * 7 * 6 * 5 * 3 * 2)
    );
  }
}
