package com.xcv58.leetcode.find_all_numbers_disappeared_in_an_array;

import static org.junit.Assert.*;

import java.util.*;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(), solution.findDisappearedNumbers(null));
    assertEquals(
      Arrays.asList(),
      solution.findDisappearedNumbers(new int[] {})
    );
    assertEquals(
      Arrays.asList(5, 6),
      solution.findDisappearedNumbers(new int[] { 4, 3, 2, 7, 8, 2, 3, 1 })
    );
    assertEquals(
      Arrays.asList(5),
      solution.findDisappearedNumbers(new int[] { 4, 3, 6, 7, 8, 2, 3, 1 })
    );
  }
}
