package com.xcv58.leetcode.rank_teams_by_votes;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals("", solution.rankTeams(null));
    assertEquals("", solution.rankTeams(new String[] {}));
    assertEquals("", solution.rankTeams(new String[] { "" }));
    assertEquals(
      "ACB",
      solution.rankTeams(new String[] { "ABC", "ACB", "ABC", "ACB", "ACB" })
    );
    assertEquals("XWYZ", solution.rankTeams(new String[] { "WXYZ", "XYZW" }));
    assertEquals(
      "ZMNAGUEDSJYLBOPHRQICWFXTVK",
      solution.rankTeams(new String[] { "ZMNAGUEDSJYLBOPHRQICWFXTVK" })
    );
    assertEquals(
      "ABC",
      solution.rankTeams(
        new String[] { "BCA", "CAB", "CBA", "ABC", "ACB", "BAC" }
      )
    );
    assertEquals("M", solution.rankTeams(new String[] { "M", "M", "M", "M" }));
    assertEquals(
      "VWFHSJARNPEMOXLTUKICZGYQ",
      solution.rankTeams(
        new String[] {
          "FVSHJIEMNGYPTQOURLWCZKAX",
          "AITFQORCEHPVJMXGKSLNZWUY",
          "OTERVXFZUMHNIYSCQAWGPKJL",
          "VMSERIJYLZNWCPQTOKFUHAXG",
          "VNHOZWKQCEFYPSGLAMXJIUTR",
          "ANPHQIJMXCWOSKTYGULFVERZ",
          "RFYUXJEWCKQOMGATHZVILNSP",
          "SCPYUMQJTVEXKRNLIOWGHAFZ",
          "VIKTSJCEYQGLOMPZWAHFXURN",
          "SVJICLXKHQZTFWNPYRGMEUAO",
          "JRCTHYKIGSXPOZLUQAVNEWFM",
          "NGMSWJITREHFZVQCUKXYAPOL",
          "WUXJOQKGNSYLHEZAFIPMRCVT",
          "PKYQIOLXFCRGHZNAMJVUTWES",
          "FERSGNMJVZXWAYLIKCPUQHTO",
          "HPLRIUQMTSGYJVAXWNOCZEKF",
          "JUVWPTEGCOFYSKXNRMHQALIZ",
          "MWPIAZCNSLEYRTHFKQXUOVGJ",
          "EZXLUNFVCMORSIWKTYHJAQPG",
          "HRQNLTKJFIEGMCSXAZPYOVUW",
          "LOHXVYGWRIJMCPSQENUAKTZF",
          "XKUTWPRGHOAQFLVYMJSNEIZC",
          "WTCRQMVKPHOSLGAXZUEFYNJI",
        }
      )
    );
  }
}
