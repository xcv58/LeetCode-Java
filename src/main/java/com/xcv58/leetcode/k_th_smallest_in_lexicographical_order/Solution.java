package com.xcv58.leetcode.k_th_smallest_in_lexicographical_order;

public class Solution {

  public int findKthNumber(int n, int k) {
    long res = 1;
    for (int count = 0; count < k;) {
      int next = countStartsWith(n, res);
      if (count + next < k) {
        count += next;
        res++;
      } else {
        count++;
        if (count == k) {
          break;
        }
        res = moveLexicographically(n, res);
      }
    }
    return (int) res;
  }

  protected long moveLexicographically(int n, long i) {
    long res = i;
    if (res * 10 <= n) {
      res *= 10;
    } else {
      if (res + 1 > n) {
        res /= 10;
      }
      res += 1;
      while (res % 10 == 0) {
        res /= 10;
      }
    }
    return res;
  }

  protected int countStartsWith(int n, long prefix) {
    if (prefix > n) {
      return 0;
    }
    int res = 0;
    for (long base = 1, from = prefix; from <= n; base *= 10, from *= 10) {
      if (from + base <= n) {
        res += base;
      } else {
        res += n % base + 1;
      }
    }
    return res;
  }
}
