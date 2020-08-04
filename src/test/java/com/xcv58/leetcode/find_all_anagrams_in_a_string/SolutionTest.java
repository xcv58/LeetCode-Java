package com.xcv58.leetcode.find_all_anagrams_in_a_string;

import static org.junit.Assert.*;

import java.util.*;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(
      Arrays.asList(0, 6),
      solution.findAnagrams("cbaebabacd", "abc")
    );
    assertEquals(Arrays.asList(0, 1, 2), solution.findAnagrams("abab", "ab"));
    assertEquals(
      Arrays.asList(
        0,
        1,
        2,
        3,
        13,
        15,
        16,
        21,
        25,
        26,
        29,
        30,
        34,
        36,
        37,
        38,
        39
      ),
      solution.findAnagrams("ababasdkjalsdbaabasbdabsdabasbabsdbaababa", "ab")
    );
  }
}
