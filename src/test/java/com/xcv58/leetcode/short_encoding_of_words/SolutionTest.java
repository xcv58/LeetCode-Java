package com.xcv58.leetcode.short_encoding_of_words;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.minimumLengthEncoding(null));
    assertEquals(0, solution.minimumLengthEncoding(new String[] {}));
    assertEquals(2, solution.minimumLengthEncoding(new String[] { "a" }));
    assertEquals(
      4,
      solution.minimumLengthEncoding(new String[] { "a", "aa", "aaa" })
    );
    assertEquals(
      6,
      solution.minimumLengthEncoding(new String[] { "a", "aa", "aaa", "b" })
    );
    assertEquals(
      11,
      solution.minimumLengthEncoding(
        new String[] { "a", "aa", "aaa", "b", "test" }
      )
    );
    assertEquals(
      16,
      solution.minimumLengthEncoding(
        new String[] { "a", "aa", "aaa", "b", "test", "est", "ttst" }
      )
    );
    assertEquals(
      10,
      solution.minimumLengthEncoding(new String[] { "time", "me", "tell" })
    );
    assertEquals(
      15,
      solution.minimumLengthEncoding(
        new String[] { "time", "me", "tell", "cell" }
      )
    );
    assertEquals(
      20,
      solution.minimumLengthEncoding(
        new String[] { "time", "me", "tell", "cell", "dell" }
      )
    );
    assertEquals(
      23,
      solution.minimumLengthEncoding(
        new String[] { "time", "me", "tell", "cell", "dell", "ab" }
      )
    );
  }
}
