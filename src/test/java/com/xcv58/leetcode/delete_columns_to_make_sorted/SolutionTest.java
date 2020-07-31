package com.xcv58.leetcode.delete_columns_to_make_sorted;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.minDeletionSize(null));
    assertEquals(0, solution.minDeletionSize(new String[] {}));
    assertEquals(
      1,
      solution.minDeletionSize(new String[] { "cba", "daf", "ghi" })
    );
    assertEquals(0, solution.minDeletionSize(new String[] { "a", "d", "g" }));
    assertEquals(
      3,
      solution.minDeletionSize(new String[] { "zyx", "wvu", "tsr" })
    );
  }
}
