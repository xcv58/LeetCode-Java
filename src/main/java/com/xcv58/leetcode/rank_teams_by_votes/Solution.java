package com.xcv58.leetcode.rank_teams_by_votes;

import java.util.HashMap;
import java.util.PriorityQueue;

public class Solution {

  class Team {
    char code;
    int[] votes;

    public Team(char c, int len) {
      this.code = c;
      this.votes = new int[len];
    }
  }

  public String rankTeams(String[] votes) {
    if (votes == null || votes.length == 0) {
      return "";
    }
    HashMap<Character, Team> map = new HashMap<>();
    int len = votes[0].length();
    for (String vote : votes) {
      char[] chars = vote.toCharArray();
      for (int i = 0; i < chars.length; i++) {
        char code = chars[i];
        Team team = map.getOrDefault(code, new Team(code, len));
        team.votes[i]++;
        map.put(code, team);
      }
    }
    PriorityQueue<Team> heap = new PriorityQueue<>(
      (t1, t2) -> {
        for (int i = 0; i < t1.votes.length; i++) {
          if (t1.votes[i] != t2.votes[i]) {
            return Integer.compare(t2.votes[i], t1.votes[i]);
          }
        }
        return Character.compare(t1.code, t2.code);
      }
    );
    for (Team team : map.values()) {
      heap.offer(team);
    }
    String res = "";
    while (heap.size() > 0) {
      res += heap.poll().code;
    }
    return res;
  }
}
