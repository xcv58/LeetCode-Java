package com.xcv58.leetcode.add_to_array_form_of_integer;

import java.util.*;

public class Solution {

  public List<Integer> addToArrayForm(int[] A, int K) {
    List<Integer> res = new ArrayList<>();
    int remain = 0;
    for (int i = A.length - 1; i >= 0; i--) {
      int a = A[i];
      int sum = a + remain + (K % 10);
      remain = sum / 10;
      res.add(sum % 10);
      K /= 10;
    }
    remain += K;
    while (remain > 0) {
      res.add(remain % 10);
      remain /= 10;
    }
    Collections.reverse(res);
    return res;
  }
}
