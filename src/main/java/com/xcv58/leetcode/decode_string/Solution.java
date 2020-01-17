package com.xcv58.leetcode.decode_string;

public class Solution {

  public String decodeString(String s) {
    String res = "";
    for (int i = 0, num = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c >= '0' && c <= '9') {
        num = num * 10 + (c - '0');
      } else if (c == '[') {
        int end = this.getInnerString(s, i);
        res +=
          this.getRepeateString(
              this.decodeString(s.substring(i + 1, end)),
              num
            );
        num = 0;
        i = end;
      } else {
        res += c;
      }
    }
    return res;
  }

  private int getInnerString(String s, int start) {
    int count = 0;
    for (int i = start; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c == '[') {
        count++;
      } else if (c == ']') {
        count--;
      }
      if (count == 0) {
        return i;
      }
    }
    return -1;
  }

  private String getRepeateString(String s, int num) {
    String res = "";
    while (num-- > 0) {
      res += s;
    }
    return res;
  }
}
