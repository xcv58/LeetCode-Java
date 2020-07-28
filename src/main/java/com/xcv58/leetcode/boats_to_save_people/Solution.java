package com.xcv58.leetcode.boats_to_save_people;

import java.util.*;

public class Solution {

  public int numRescueBoats(int[] people, int limit) {
    if (people == null) {
      return 0;
    }
    Arrays.sort(people);
    int res = 0;
    for (int i = 0, j = people.length - 1; i <= j; j--, res++) {
      if (people[i] + people[j] <= limit) {
        i++;
      }
    }
    return res;
  }
}
