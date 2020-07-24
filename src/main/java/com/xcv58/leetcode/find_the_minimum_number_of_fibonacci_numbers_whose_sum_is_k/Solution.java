package com.xcv58.leetcode.find_the_minimum_number_of_fibonacci_numbers_whose_sum_is_k;

import java.util.*;

public class Solution {

  public int findMinFibonacciNumbers(int k) {
    List<Integer> nums = new ArrayList<>(Arrays.asList(1, 1));
    for (int i = 1, j = 1; j < k && Integer.MAX_VALUE - j >= i;) {
      int sum = i + j;
      nums.add(sum);
      i = j;
      j = sum;
    }
    return findMinFibonacciNumbers(k, nums);
  }

  private int findMinFibonacciNumbers(int k, List<Integer> list) {
    int largest = 1;
    for (int i = 0, j = list.size() - 1; i <= j;) {
      int mid = (i + j) / 2;
      int num = list.get(mid);
      if (num == k) {
        largest = num;
        break;
      }
      if (num > k) {
        j = mid - 1;
      } else {
        largest = num;
        i = (mid == i) ? mid + 1 : mid;
      }
    }
    if (k == largest) {
      return 1;
    }
    return 1 + findMinFibonacciNumbers(k - largest);
  }
}
