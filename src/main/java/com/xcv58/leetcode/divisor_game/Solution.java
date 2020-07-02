package com.xcv58.leetcode.divisor_game;

public class Solution {

  /**
   * All odd number is false and all even numer is true. We can use the
   * mathematical induction to prove it. For N <= 10, it's clear.
   *
   * For a number of m, all number less than the m has the rule of odd number is false,
   * even number is true.
   *
   * Then if an odd number is false, (2 * k) + 1, whereas the 2 * k + 2 must be
   * true because one can remove one so the opposite must lose.
   *
   * If an even number is true, (2 * k), and the 2 * k + 1 must be false. Because of
   * regardless what x the opposite chooses, it must not be an even number. Otherwise,
   * it breaks the N % x = 0 rule. So the 2 * k + 1 - x is an odd number and less than 2 * k.
   * Since the N - x is less than m and it's an odd number thus the 2 * k + 1 must be false.
   *
   * @param N
   * @return
   */
  public boolean divisorGame(int N) {
    if (N <= 0) {
      // TODO: Handle invalid input
    // throw new Exception("Invalid input number");
    }
    return N % 2 == 0;
  }
}
