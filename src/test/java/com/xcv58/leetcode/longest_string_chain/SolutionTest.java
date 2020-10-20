package com.xcv58.leetcode.longest_string_chain;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.longestStrChain(null));
    assertEquals(0, solution.longestStrChain(new String[] {}));
    assertEquals(
      5,
      solution.longestStrChain(
        new String[] {
          "a",
          "b",
          "ba",
          "bca",
          "bda",
          "bdca",
          "cde",
          "za",
          "aza",
          "azad",
          "aczad",
        }
      )
    );
    assertEquals(
      4,
      solution.longestStrChain(
        new String[] { "a", "b", "ba", "bca", "bda", "bdca" }
      )
    );
    assertEquals(
      1,
      solution.longestStrChain(new String[] { "a", "b", "c", "d", "a", "c" })
    );
    assertEquals(
      1,
      solution.longestStrChain(new String[] { "a", "b", "c", "d", "abc", "c" })
    );
    assertEquals(
      1,
      solution.longestStrChain(
        new String[] { "a", "b", "c", "d", "abc", "bac" }
      )
    );
    assertEquals(
      3,
      solution.longestStrChain(
        new String[] { "a", "b", "c", "d", "abc", "bac", "ac" }
      )
    );
  }
}
