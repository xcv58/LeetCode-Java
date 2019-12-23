package com.xcv58.leetcode.word_pattern;

import java.util.HashMap;

/**
 * Created by xcv58 on 10/19/15.
 */
public class Solution {

  public boolean wordPattern(String pattern, String str) {
    String[] tokens = str.split(" ");
    if (pattern.length() != tokens.length) {
      return false;
    }
    HashMap<Character, String> charMap = new HashMap<Character, String>();
    HashMap<String, Character> tokenMap = new HashMap<String, Character>();
    for (int i = 0; i < tokens.length; i++) {
      String token = tokens[i];
      Character c = pattern.charAt(i);
      String vString = charMap.get(c);
      Character vChar = tokenMap.get(token);
      if (vString == null && vChar == null) {
        charMap.put(c, token);
        tokenMap.put(token, c);
      } else if (
        vString == null ||
        vChar == null ||
        !vString.equals(token) ||
        !vChar.equals(c)
      ) {
        return false;
      }
    }
    return true;
  }
}
