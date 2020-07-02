package com.xcv58.leetcode.keyboard_row;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertArrayEquals(
      solution.findWords(new String[] { "a", "b", "c" }),
      new String[] { "a", "b", "c" }
    );
    assertArrayEquals(
      solution.findWords(
        new String[] {
          "askdlasjdlaksdl",
          "zxnczxbcnzmnxcbmz",
          "qweoiqweoirtp",
          "qweoiqweoisrtp",
          "zaxnczxbcnzmnxcbmz",
          "askdlasjdlaksdlz"
        }
      ),
      new String[] { "askdlasjdlaksdl", "zxnczxbcnzmnxcbmz", "qweoiqweoirtp" }
    );
  }
}
