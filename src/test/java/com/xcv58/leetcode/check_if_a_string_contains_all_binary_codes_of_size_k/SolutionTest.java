package com.xcv58.leetcode.check_if_a_string_contains_all_binary_codes_of_size_k;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    Solution solution = new Solution();
    assertEquals(true, solution.hasAllCodes("00110110", 2));
    assertEquals(
      true,
      solution.hasAllCodes(
        "00011010111101010111110111011110101001111001111100010010010001111001000010010010001110010000111000010001001000010011111111100010111011101101111100001110001110101110101001110000010101100100100010100110101110110001000011011011000111001101111000000010101110110100110001100010111111110101010001111000001110000000011111101011011111011110001100011100001011000000111101011100011011111110001010001111110100011110101101101011100100000100110011110111011000001010111011100011000100001000000111101001101010010000111110001110111100100110000101001011010101010101000100011000111100100101100010100111100111000010110011011110110001100101010101111001011000000010",
        6
      )
    );
    assertEquals(
      false,
      solution.hasAllCodes(
        "00011010111101010111110111011110101001111001111100010010010001111001000010010010001110010000111000010001001000010011111111100010111011101101111100001110001110101110101001110000010101100100100010100110101110110001000011011011000111001101111000000010101110110100110001100010111111110101010001111000001110000000011111101011011111011110001100011100001011000000111101011100011011111110001010001111110100011110101101101011100100000100110011110111011000001010111011100011000100001000000111101001101010010000111110001110111100100110000101001011010101010101000100011000111100100101100010100111100111000010110011011110110001100101010101111001011000000010",
        7
      )
    );
  }
}