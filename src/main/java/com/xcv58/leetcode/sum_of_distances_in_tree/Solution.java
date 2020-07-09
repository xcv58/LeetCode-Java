package com.xcv58.leetcode.sum_of_distances_in_tree;

public class Solution {

  public int[] sumOfDistancesInTree(int N, int[][] edges) {
    int[][] distance = new int[N][N];
    for (int[] edge : edges) {
      int i = edge[0];
      int j = edge[1];
      distance[i][j] = 1;
      distance[j][i] = 1;
    }
    int remain = N * N;
    while (true) {
      int next = this.fillDistance(N, distance);
      if (next == remain || next == 0) {
        break;
      }
      remain = next;
    }
    int[] res = new int[N];
    for (int i = 0; i < N; i++) {
      int sum = 0;
      for (int j = 0; j < N; j++) {
        sum += distance[i][j];
      }
      res[i] = sum;
    }
    return res;
  }

  private int fillDistance(int N, int[][] distance) {
    for (int i = 0; i < N; i++) {
      int[] row = distance[i];
      for (int j = 0; j < N; j++) {
        if (i == j) {
          continue;
        }
        if (row[j] == 0) {
          continue;
        }
        int[] connectedRow = distance[j];
        for (int k = 0; k < N; k++) {
          if (k == i) {
            continue;
          }
          if (connectedRow[k] == 0) {
            continue;
          }
          int cost = connectedRow[k] + row[j];
          row[k] = row[k] != 0 ? Math.min(cost, row[k]) : cost;
        }
      }
    }

    int remain = 0;
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        if (i == j) {
          continue;
        }
        if (distance[i][j] == 0) {
          remain++;
        }
      }
    }
    return remain;
  }
}
