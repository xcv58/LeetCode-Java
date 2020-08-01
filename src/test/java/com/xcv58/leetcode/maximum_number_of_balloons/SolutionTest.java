package com.xcv58.leetcode.maximum_number_of_balloons;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.maxNumberOfBalloons(""));
    assertEquals(0, solution.maxNumberOfBalloons("balloo"));
    assertEquals(0, solution.maxNumberOfBalloons("ballon"));
    assertEquals(1, solution.maxNumberOfBalloons("balloon"));
    assertEquals(1, solution.maxNumberOfBalloons("nlaebolko"));
    assertEquals(2, solution.maxNumberOfBalloons("loonbalxballpoon"));
    assertEquals(
      3,
      solution.maxNumberOfBalloons("loonbalxballpoonbbbbaaalllooonnn")
    );
    assertEquals(
      5,
      solution.maxNumberOfBalloons("loonbalxballpoonbbbbaaalllooonnnlloool")
    );
  }
}
