package com.xcv58.leetcode.score_of_parentheses;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.scoreOfParentheses(""));
    assertEquals(1, solution.scoreOfParentheses("()"));
    assertEquals(2, solution.scoreOfParentheses("()()"));
    assertEquals(3, solution.scoreOfParentheses("()()()"));
    assertEquals(3, solution.scoreOfParentheses("(())()"));
    assertEquals(4, solution.scoreOfParentheses("(()())"));
    assertEquals(6, solution.scoreOfParentheses("(()()())"));
    assertEquals(6, solution.scoreOfParentheses("((())())"));
    assertEquals(32, solution.scoreOfParentheses("(((((())))))"));
    assertEquals(35, solution.scoreOfParentheses("(((((())))))()()()"));
  }
}
