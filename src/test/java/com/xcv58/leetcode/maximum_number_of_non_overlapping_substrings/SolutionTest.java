package com.xcv58.leetcode.maximum_number_of_non_overlapping_substrings;

import static org.junit.Assert.*;

import java.util.*;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(null, solution.maxNumOfSubstrings(null));
    assertEquals(Arrays.asList(), solution.maxNumOfSubstrings(""));
    assertEquals(
      Arrays.asList("e", "f", "ccc"),
      solution.maxNumOfSubstrings("adefaddaccc")
    );
    assertEquals(
      Arrays.asList("d", "bb", "cc"),
      solution.maxNumOfSubstrings("abbaccd")
    );
    assertEquals(Arrays.asList("abab"), solution.maxNumOfSubstrings("abab"));
    assertEquals(
      Arrays.asList("z"),
      solution.maxNumOfSubstrings("bcdezfabcdefa")
    );
    assertEquals(
      Arrays.asList("bcdezfabcdzefa"),
      solution.maxNumOfSubstrings("bcdezfabcdzefa")
    );
    assertEquals(
      Arrays.asList("cabcccbaa"),
      solution.maxNumOfSubstrings("cabcccbaa")
    );
  }
}
