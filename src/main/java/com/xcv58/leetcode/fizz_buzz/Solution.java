package com.xcv58.leetcode.fizz_buzz;

import java.util.*;

public class Solution {

  public List<String> fizzBuzz(int n) {
    List<String> res = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      String tmp = "";
      if (i % 3 == 0) {
        tmp += "Fizz";
      }
      if (i % 5 == 0) {
        tmp += "Buzz";
      }
      if (tmp == "") {
        tmp += i;
      }
      res.add(tmp);
    }
    return res;
  }
}
