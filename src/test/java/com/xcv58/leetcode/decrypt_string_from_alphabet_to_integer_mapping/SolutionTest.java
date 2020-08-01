package com.xcv58.leetcode.decrypt_string_from_alphabet_to_integer_mapping;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals("", solution.freqAlphabets(null));
    assertEquals("", solution.freqAlphabets(""));
    assertEquals("jkab", solution.freqAlphabets("10#11#12"));
    assertEquals("acz", solution.freqAlphabets("1326#"));
    assertEquals("y", solution.freqAlphabets("25#"));
    assertEquals(
      "abcdefghijklmnopqrstuvwxyz",
      solution.freqAlphabets(
        "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"
      )
    );
  }
}
