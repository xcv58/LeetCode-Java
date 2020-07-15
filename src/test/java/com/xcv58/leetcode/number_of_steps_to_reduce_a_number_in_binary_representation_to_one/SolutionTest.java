package com.xcv58.leetcode.number_of_steps_to_reduce_a_number_in_binary_representation_to_one;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.numSteps(null));
    assertEquals(0, solution.numSteps("1"));
    assertEquals(1, solution.numSteps("0"));
    assertEquals(6, solution.numSteps("1101"));
    assertEquals(5, solution.numSteps("1100"));
    assertEquals(
      142,
      solution.numSteps(
        "11011110001111111110010010101010100110101001010101001010101001010010100101010010101010101001011"
      )
    );
  }
}
