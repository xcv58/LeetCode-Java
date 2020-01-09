package com.xcv58.leetcode.product_of_array_except_self;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertArrayEquals(
      new int[] { 1 },
      solution.productExceptSelf(new int[] { 1 })
    );
    assertArrayEquals(
      new int[] { 24, 12, 8, 6 },
      solution.productExceptSelf(new int[] { 1, 2, 3, 4 })
    );
    assertArrayEquals(
      new int[] { 60480, 30240, 20160, 15120, 12096, 10080, 8640, 5040 },
      solution.productExceptSelf(new int[] { 1, 2, 3, 4, 5, 6, 7, 12 })
    );
  }
}
