package com.xcv58.leetcode.validate_stack_sequences;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(false, solution.validateStackSequences(null, null));
    assertEquals(false, solution.validateStackSequences(null, new int[] {}));
    assertEquals(false, solution.validateStackSequences(new int[] {}, null));
    assertEquals(
      false,
      solution.validateStackSequences(new int[] {}, new int[] { 1 })
    );
    assertEquals(
      false,
      solution.validateStackSequences(new int[] { 1, 2 }, new int[] { 1 })
    );
    assertEquals(
      false,
      solution.validateStackSequences(
        new int[] { 1, 2, 3, 4, 5 },
        new int[] { 5, 4, 3, 1, 2 }
      )
    );
    assertEquals(
      false,
      solution.validateStackSequences(
        new int[] { 1, 2, 3, 4, 5 },
        new int[] { 3, 4, 5, 1, 2 }
      )
    );
    assertEquals(
      true,
      solution.validateStackSequences(
        new int[] { 1, 2, 3, 4, 5 },
        new int[] { 3, 4, 5, 2, 1 }
      )
    );
    assertEquals(
      true,
      solution.validateStackSequences(
        new int[] { 1, 2, 3, 4, 5 },
        new int[] { 3, 5, 4, 2, 1 }
      )
    );
    assertEquals(
      true,
      solution.validateStackSequences(
        new int[] { 1, 2, 3, 4, 5 },
        new int[] { 3, 2, 1, 5, 4 }
      )
    );
    assertEquals(
      true,
      solution.validateStackSequences(
        new int[] { 1, 2, 3, 4, 5 },
        new int[] { 2, 3, 1, 5, 4 }
      )
    );
  }
}
