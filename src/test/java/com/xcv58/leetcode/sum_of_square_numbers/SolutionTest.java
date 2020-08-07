package com.xcv58.leetcode.sum_of_square_numbers;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(true, solution.judgeSquareSum(0));
    assertEquals(true, solution.judgeSquareSum(1));
    assertEquals(true, solution.judgeSquareSum(2));
    assertEquals(false, solution.judgeSquareSum(3));
    assertEquals(true, solution.judgeSquareSum(4));
    assertEquals(true, solution.judgeSquareSum(5));
    assertEquals(false, solution.judgeSquareSum(6));
    assertEquals(false, solution.judgeSquareSum(7));
    assertEquals(true, solution.judgeSquareSum(8));
    assertEquals(true, solution.judgeSquareSum(9));
    assertEquals(true, solution.judgeSquareSum(10));
    assertEquals(false, solution.judgeSquareSum(11));
    assertEquals(false, solution.judgeSquareSum(12));
    assertEquals(true, solution.judgeSquareSum(13));
    assertEquals(false, solution.judgeSquareSum(14));
    assertEquals(false, solution.judgeSquareSum(15));
    assertEquals(true, solution.judgeSquareSum(16));
    assertEquals(true, solution.judgeSquareSum(17));
    assertEquals(true, solution.judgeSquareSum(18));
    assertEquals(false, solution.judgeSquareSum(19));
    assertEquals(true, solution.judgeSquareSum(20));
    assertEquals(false, solution.judgeSquareSum(21));
    assertEquals(false, solution.judgeSquareSum(22));
    assertEquals(false, solution.judgeSquareSum(23));
    assertEquals(false, solution.judgeSquareSum(24));
    assertEquals(true, solution.judgeSquareSum(25));
    assertEquals(false, solution.judgeSquareSum(42));
    assertEquals(false, solution.judgeSquareSum(Integer.MAX_VALUE));
    assertEquals(true, solution.judgeSquareSum(2 << 31));
    assertEquals(false, solution.judgeSquareSum(2 << 30));
    assertEquals(true, solution.judgeSquareSum(2 << 29));
    assertEquals(true, solution.judgeSquareSum(2 << 28));
    assertEquals(true, solution.judgeSquareSum(100));
    assertEquals(true, solution.judgeSquareSum(1000));
    assertEquals(true, solution.judgeSquareSum(10000));
    assertEquals(true, solution.judgeSquareSum(100000));
    assertEquals(true, solution.judgeSquareSum(1000000));
    assertEquals(true, solution.judgeSquareSum(1000000));
    assertEquals(true, solution.judgeSquareSum(10000000));
  }
}
