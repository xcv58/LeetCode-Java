package com.xcv58.leetcode.alien_dictionary;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Created by xcv58 on 10/17/15.
 */
public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(
      "",
      solution.alienOrder(new String[] { "wtrf", "etrf", "efff", "ettt" })
    );
    assertEquals("abcd", solution.alienOrder(new String[] { "ab", "adc" }));
    assertEquals(
      "azbc",
      solution.alienOrder(new String[] { "za", "zb", "ca", "cb" })
    );
  }
}
