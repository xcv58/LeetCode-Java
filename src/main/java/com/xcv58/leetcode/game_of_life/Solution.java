package com.xcv58.leetcode.game_of_life;

public class Solution {
    public void gameOfLife(int[][] board) {
        if (board == null || board.length == 0) {
            return;
        }
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int count = getNeighbors(board, i, j, m , n);
                if (count == 3 || board[i][j] + count == 3) {
                    board[i][j] ^= 2;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = board[i][j] >> 1;
            }
        }
    }

    private int getNeighbors(int[][] board, int i, int j, int m, int n) {
        int result = 0;
        for (int x = Math.max(i-1, 0); x < Math.min(i+2, m); x++) {
            for (int y = Math.max(j-1, 0); y < Math.min(j+2, n); y++) {
                result += (board[x][y] & 1);
            }
        }
        return result - (board[i][j] & 1);
    }
}
