package com.xcv58.leetcode.sum_of_subsequence_widths;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(0, solution.sumSubseqWidths(null));
    assertEquals(0, solution.sumSubseqWidths(new int[] {}));
    assertEquals(0, solution.sumSubseqWidths(new int[] { 0 }));
    assertEquals(0, solution.sumSubseqWidths(new int[] { 1 }));
    assertEquals(23, solution.sumSubseqWidths(new int[] { 1, 2, 3, 4 }));
    assertEquals(72, solution.sumSubseqWidths(new int[] { 1, 2, 3, 4, 5 }));
    assertEquals(
      136988321,
      solution.sumSubseqWidths(
        new int[] {
          96,
          87,
          191,
          197,
          40,
          101,
          108,
          35,
          169,
          50,
          168,
          182,
          95,
          80,
          144,
          43,
          18,
          60,
          174,
          13,
          77,
          173,
          38,
          46,
          80,
          117,
          13,
          19,
          11,
          6,
          13,
          118,
          39,
          80,
          171,
          36,
          86,
          156,
          165,
          190,
          53,
          49,
          160,
          192,
          57,
          42,
          97,
          35,
          124,
          200,
          84,
          70,
          145,
          180,
          54,
          141,
          159,
          42,
          66,
          66,
          25,
          95,
          24,
          136,
          140,
          159,
          71,
          131,
          5,
          140,
          115,
          76,
          151,
          137,
          63,
          47,
          69,
          164,
          60,
          172,
          153,
          183,
          6,
          70,
          40,
          168,
          133,
          45,
          116,
          188,
          20,
          52,
          70,
          156,
          44,
          27,
          124,
          59,
          42,
          172,
        }
      )
    );
  }
}
