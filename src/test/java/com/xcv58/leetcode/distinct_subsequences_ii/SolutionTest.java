package com.xcv58.leetcode.distinct_subsequences_ii;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.distinctSubseqII(null));
    assertEquals(0, solution.distinctSubseqII(""));
    assertEquals(1, solution.distinctSubseqII("a"));
    assertEquals(3, solution.distinctSubseqII("ab"));
    assertEquals(7, solution.distinctSubseqII("abc"));
    assertEquals(15, solution.distinctSubseqII("abcd"));
    assertEquals(6, solution.distinctSubseqII("aba"));
    assertEquals(985, solution.distinctSubseqII("ababababababa"));
    assertEquals(
      5599,
      solution.distinctSubseqII("zzzzzzaaaaaaaaabbbbbbbbbccccccc")
    );
    assertEquals(
      97915677,
      solution.distinctSubseqII(
        "zchmliaqdgvwncfatcfivphddpzjkgyygueikthqzyeeiebczqbqhdytkoawkehkbizdmcnilcjjlpoeoqqoqpswtqdpvszfaksn"
      )
    );
    assertEquals(
      637502874,
      solution.distinctSubseqII(
        "asdlkajsdlhasjlapoejaslkdjaslhdzlxkjlfhalsjdlkashdlkasjdlasjdlkashjkgfhqpowesdfhthnalkdjalksdhasodhasodjaslkjdaslkdjlkasjdlkasjdlasjdapodjqpwjeopqwjeqoiejwqke"
      )
    );
  }
}
