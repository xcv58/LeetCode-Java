package com.xcv58.leetcode.delete_columns_to_make_sorted_ii;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.minDeletionSize(null));
    assertEquals(0, solution.minDeletionSize(new String[] {}));
    assertEquals(0, solution.minDeletionSize(new String[] { "" }));
    assertEquals(0, solution.minDeletionSize(new String[] { "a", "b", "c" }));
    assertEquals(
      1,
      solution.minDeletionSize(new String[] { "ca", "bb", "ac" })
    );
    assertEquals(
      0,
      solution.minDeletionSize(new String[] { "xc", "yb", "za" })
    );
    assertEquals(
      3,
      solution.minDeletionSize(new String[] { "zyx", "wvu", "tsr" })
    );
    assertEquals(
      3,
      solution.minDeletionSize(new String[] { "doeeqiy", "yabhbqe", "twckqte" })
    );
  }
}
