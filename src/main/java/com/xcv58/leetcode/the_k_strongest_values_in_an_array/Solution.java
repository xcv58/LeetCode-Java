package com.xcv58.leetcode.the_k_strongest_values_in_an_array;

import java.util.*;

public class Solution {

  public int[] getStrongest(int[] arr, int k) {
    int[] res = new int[k];
    Arrays.sort(arr);
    int median = arr[(arr.length - 1) / 2];
    for (
      int i = 0, j = arr.length - 1, index = 0;
      i <= j && index < k;
      index++
    ) {
      if (Math.abs(arr[j] - median) >= Math.abs(arr[i] - median)) {
        res[index] = arr[j--];
      } else {
        res[index] = arr[i++];
      }
    }
    return res;
  }
}
