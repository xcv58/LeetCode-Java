package com.xcv58.leetcode.n_th_tribonacci_number;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.tribonacci(0));
    assertEquals(1, solution.tribonacci(1));
    assertEquals(1, solution.tribonacci(2));
    assertEquals(2, solution.tribonacci(3));
    assertEquals(4, solution.tribonacci(4));
    assertEquals(7, solution.tribonacci(5));
    assertEquals(13, solution.tribonacci(6));
    assertEquals(24, solution.tribonacci(7));
    assertEquals(44, solution.tribonacci(8));
    assertEquals(81, solution.tribonacci(9));
    assertEquals(149, solution.tribonacci(10));
    assertEquals(274, solution.tribonacci(11));
    assertEquals(504, solution.tribonacci(12));
    assertEquals(927, solution.tribonacci(13));
    assertEquals(1705, solution.tribonacci(14));
    assertEquals(615693474, solution.tribonacci(35));
    assertEquals(1132436852, solution.tribonacci(36));
    assertEquals(2082876103, solution.tribonacci(37));
  }
}
