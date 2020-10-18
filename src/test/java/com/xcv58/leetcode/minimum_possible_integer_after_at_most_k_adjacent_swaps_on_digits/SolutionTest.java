package com.xcv58.leetcode.minimum_possible_integer_after_at_most_k_adjacent_swaps_on_digits;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(null, solution.minInteger(null, 1));
    assertEquals("123", solution.minInteger("123", -1));
    assertEquals("", solution.minInteger("", 1));
    assertEquals("", solution.minInteger("", 100));
    assertEquals("0123456789", solution.minInteger("1234567890", 100));
    assertEquals("3421", solution.minInteger("4321", 1));
    assertEquals("2431", solution.minInteger("4321", 2));
    assertEquals("1432", solution.minInteger("4321", 3));
    assertEquals("1342", solution.minInteger("4321", 4));
    assertEquals("1243", solution.minInteger("4321", 5));
    assertEquals("1234", solution.minInteger("4321", 6));
    assertEquals("1234", solution.minInteger("4321", 7));
    assertEquals("1234", solution.minInteger("4321", 100));
    assertEquals("010", solution.minInteger("100", 1));
    assertEquals("34679", solution.minInteger("34679", 1));
    assertEquals("34679", solution.minInteger("34679", 10000));
    assertEquals(
      "0345989723478563548",
      solution.minInteger("9438957234785635408", 23)
    );
    assertEquals(
      "0294389573478563548",
      solution.minInteger("9438957234785635408", 24)
    );
  }
}
