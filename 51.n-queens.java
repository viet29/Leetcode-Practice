/*
 * @lc app=leetcode id=51 lang=java
 *
 * [51] N-Queens
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {

    private void fillArray(int[][] arr, int n, int i, int j, int value) {
        // Fill the row and column
        for (int k = 0; k < n; k++) {
            arr[i][k] += value;
            arr[k][j] += value;
        }
        // Fill the diagonals
        for (int k = 0; k < n; k++) {
            // Main diagonal
            if (i + k < n && j + k < n) {
                arr[i + k][j + k] += value;
            }
            // Anti-diagonal
            if (i + k < n && j - k >= 0) {
                arr[i + k][j - k] += value;
            }
            // Upper part of the main diagonal
            if (i - k >= 0 && j - k >= 0) {
                arr[i - k][j - k] += value;
            }
            // Upper part of the anti-diagonal
            if (i - k >= 0 && j + k < n) {
                arr[i - k][j + k] += value;
            }
        }
    }

    private String rowWithQueen(int i, int n) {
        String s = "";
        for (int j = 0; j < n; j++) {
            s += (i == j) ? "Q" : ".";
        }
        return s;
    }

    public void backTrack(int row, int[][] arr, int n, List<List<String>> res, List<String> tmp) {
        for (int i = 0; i < n; i++) {
            if (arr[row][i] == 0) {
                String s = rowWithQueen(i, n);
                tmp.add(s);
                if (row == n - 1) {
                    res.add(List.copyOf(tmp));
                } else {
                    fillArray(arr, n, row, i, 1);
                    backTrack(row + 1, arr, n, res, tmp);
                    fillArray(arr, n, row, i, -1);
                }
                tmp.remove(s);
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        List<String> tmp = new ArrayList<>();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = 0;
            }
        }
        backTrack(0, arr, n, res, tmp);
        return res;
    }
}
// @lc code=end

