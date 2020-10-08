package com.xcv58.leetcode.count_vowels_permutation;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.countVowelPermutation(0));
    assertEquals(5, solution.countVowelPermutation(1));
    assertEquals(10, solution.countVowelPermutation(2));
    assertEquals(10, solution.countVowelPermutation(2));
    assertEquals(68, solution.countVowelPermutation(5));
    assertEquals(44779, solution.countVowelPermutation(15));
    assertEquals(243247493, solution.countVowelPermutation(444));
    assertEquals(793084836, solution.countVowelPermutation(2000));
    assertEquals(515367209, solution.countVowelPermutation(1000000));
  }
}
