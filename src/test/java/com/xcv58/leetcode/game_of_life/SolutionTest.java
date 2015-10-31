package com.xcv58.leetcode.game_of_life;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test public void test() {
        int result;
        result = this.test(new int[][]{
                {1, 1},
                {1, 0}
        }, new int[][] {
                {1, 1},
                {1, 1}
        });
        assertEquals(0, result);

        result = this.test(new int[][]{
                {0, 0},
                {0, 0}
        }, new int[][] {
                {0, 0},
                {0, 0}
        });
        assertEquals(0, result);

        result = this.test(new int[][]{
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        }, new int[][] {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        });
        assertEquals(0, result);

        result = this.test(new int[][]{
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        }, new int[][] {
                {1, 0, 1},
                {0, 0, 0},
                {1, 0, 1}
        });
        assertEquals(0, result);

        result = this.test(new int[][]{
                {1, 0, 1},
                {0, 0, 0},
                {1, 0, 1}
        }, new int[][] {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        });
        assertEquals(0, result);

        result = this.test(new int[][]{
                {0, 1, 1},
                {0, 1, 0},
                {1, 0, 1}
        }, new int[][] {
                {0, 1, 1},
                {1, 0, 0},
                {0, 1, 0}
        });
        assertEquals(0, result);
    }

    private int test(int[][] board, int[][] target) {
        Solution solution = new Solution();
        solution.gameOfLife(board);
        return diff(board, target);
    }

    private int diff(int[][] board, int[][] target) {
        int result = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                result += Math.abs(board[i][j] - target[i][j]);
            }
        }
        return result;
    }
}