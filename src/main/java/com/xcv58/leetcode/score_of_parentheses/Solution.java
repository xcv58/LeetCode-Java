package com.xcv58.leetcode.score_of_parentheses;

public class Solution {

  public int scoreOfParentheses(String S) {
    if (S.length() == 0) {
      return 0;
    }
    char[] arr = S.toCharArray();
    int leftCount = 0;
    for (int i = 0; i < arr.length; i++) {
      char c = arr[i];
      if (c == '(') {
        leftCount++;
      } else if (c == ')') {
        leftCount--;
      }
      if (leftCount == 0) {
        if (i <= 2) {
          return 1 + this.scoreOfParentheses(S.substring(i + 1));
        }
        return (
          2 *
          this.scoreOfParentheses(S.substring(1, i)) +
          this.scoreOfParentheses(S.substring(i + 1))
        );
      }
    }
    return 0;
  }
}
