package com.xcv58.leetcode.longest_chunked_palindrome_decomposition;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.longestDecomposition(""));
    assertEquals(1, solution.longestDecomposition("abcdef"));
    assertEquals(2, solution.longestDecomposition("aa"));
    assertEquals(2, solution.longestDecomposition("elvtoelvto"));
    assertEquals(3, solution.longestDecomposition("aaa"));
    assertEquals(
      7,
      solution.longestDecomposition("ghiabcdefhelloadamhelloabcdefghi")
    );
    assertEquals(11, solution.longestDecomposition("antaprezatepzapreanta"));
    assertEquals(
      27,
      solution.longestDecomposition("mamamamamamamamamamamamamammamamamamama")
    );
  }
}
