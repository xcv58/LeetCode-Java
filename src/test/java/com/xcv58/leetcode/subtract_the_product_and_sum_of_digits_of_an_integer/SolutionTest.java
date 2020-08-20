package com.xcv58.leetcode.subtract_the_product_and_sum_of_digits_of_an_integer;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.subtractProductAndSum(0));
    assertEquals(0, solution.subtractProductAndSum(1));
    assertEquals(0, solution.subtractProductAndSum(2));
    assertEquals(0, solution.subtractProductAndSum(3));
    assertEquals(0, solution.subtractProductAndSum(4));
    assertEquals(0, solution.subtractProductAndSum(5));
    assertEquals(0, solution.subtractProductAndSum(6));
    assertEquals(0, solution.subtractProductAndSum(7));
    assertEquals(0, solution.subtractProductAndSum(8));
    assertEquals(0, solution.subtractProductAndSum(9));
    assertEquals(-1, solution.subtractProductAndSum(10));
    assertEquals(-1, solution.subtractProductAndSum(100));
    assertEquals(-1, solution.subtractProductAndSum(100000));
    assertEquals(-2, solution.subtractProductAndSum(200000));
    assertEquals(-3, solution.subtractProductAndSum(300000));
    assertEquals(362835, solution.subtractProductAndSum(123456789));
    assertEquals(45323, solution.subtractProductAndSum(12345679));
    assertEquals(-5, solution.subtractProductAndSum(111111));
  }
}
