package com.xcv58.leetcode.find_the_minimum_number_of_fibonacci_numbers_whose_sum_is_k;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(1, solution.findMinFibonacciNumbers(1));
    assertEquals(1, solution.findMinFibonacciNumbers(2));
    assertEquals(1, solution.findMinFibonacciNumbers(3));
    assertEquals(2, solution.findMinFibonacciNumbers(4));
    assertEquals(1, solution.findMinFibonacciNumbers(5));
    assertEquals(2, solution.findMinFibonacciNumbers(6));
    assertEquals(2, solution.findMinFibonacciNumbers(7));
    assertEquals(1, solution.findMinFibonacciNumbers(8));
    assertEquals(2, solution.findMinFibonacciNumbers(9));
    assertEquals(2, solution.findMinFibonacciNumbers(10));
    assertEquals(2, solution.findMinFibonacciNumbers(11));
    assertEquals(3, solution.findMinFibonacciNumbers(12));
    assertEquals(1, solution.findMinFibonacciNumbers(13));
    assertEquals(3, solution.findMinFibonacciNumbers(100));
    assertEquals(2, solution.findMinFibonacciNumbers(1000));
    assertEquals(12, solution.findMinFibonacciNumbers(Integer.MAX_VALUE));
  }
}
