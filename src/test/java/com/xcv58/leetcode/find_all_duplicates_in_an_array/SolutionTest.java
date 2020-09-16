package com.xcv58.leetcode.find_all_duplicates_in_an_array;

import static org.junit.Assert.*;

import java.util.*;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(), solution.findDuplicates(null));
    assertEquals(Arrays.asList(), solution.findDuplicates(new int[] {}));
    assertEquals(
      Arrays.asList(),
      solution.findDuplicates(new int[] { 1, 2, 3, 4 })
    );
    assertEquals(
      Arrays.asList(),
      solution.findDuplicates(new int[] { 1, 2, 3, 4, 5 })
    );
    assertEquals(
      Arrays.asList(1),
      solution.findDuplicates(new int[] { 4, 2, 3, 1, 1 })
    );
    assertEquals(
      Arrays.asList(4),
      solution.findDuplicates(new int[] { 4, 2, 3, 1, 4 })
    );
    assertEquals(
      Arrays.asList(2, 3),
      solution.findDuplicates(new int[] { 4, 3, 2, 7, 8, 2, 3, 1 })
    );
    assertEquals(
      Arrays.asList(2, 3, 7),
      solution.findDuplicates(new int[] { 4, 3, 2, 7, 7, 2, 3, 1 })
    );
    assertEquals(
      Arrays.asList(1, 2, 3, 7),
      solution.findDuplicates(new int[] { 1, 3, 2, 7, 7, 2, 3, 1 })
    );
    assertEquals(
      Arrays.asList(5, 6, 7, 8),
      solution.findDuplicates(new int[] { 8, 8, 7, 7, 6, 6, 5, 5 })
    );
  }
}
