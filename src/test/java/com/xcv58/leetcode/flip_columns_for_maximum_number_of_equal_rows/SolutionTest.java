package com.xcv58.leetcode.flip_columns_for_maximum_number_of_equal_rows;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.maxEqualRowsAfterFlips(null));
    assertEquals(0, solution.maxEqualRowsAfterFlips(new int[][] {}));
    assertEquals(1, solution.maxEqualRowsAfterFlips(new int[][] { { 0 } }));
    assertEquals(1, solution.maxEqualRowsAfterFlips(new int[][] { { 1 } }));
    assertEquals(
      1,
      solution.maxEqualRowsAfterFlips(new int[][] { { 1, 1 }, { 1, 0 } })
    );
    assertEquals(
      1,
      solution.maxEqualRowsAfterFlips(new int[][] { { 0, 0 }, { 1, 0 } })
    );
    assertEquals(
      2,
      solution.maxEqualRowsAfterFlips(new int[][] { { 0, 0 }, { 1, 1 } })
    );
    assertEquals(
      1,
      solution.maxEqualRowsAfterFlips(
        new int[][] { { 0, 0, 1, 0 }, { 1, 1, 1, 0 } }
      )
    );
    assertEquals(
      2,
      solution.maxEqualRowsAfterFlips(
        new int[][] { { 0, 0, 0, 1 }, { 0, 0, 1, 0 }, { 1, 1, 1, 0 } }
      )
    );
  }
}
