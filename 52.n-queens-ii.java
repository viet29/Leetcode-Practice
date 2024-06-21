/*
 * @lc app=leetcode id=52 lang=java
 *
 * [52] N-Queens II
 */

// @lc code=start

class Solution {

    private int count;

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

    private void backTrack(int row, int[][] arr, int n) {
        for (int i = 0; i < n; i++) {
            if(arr[row][i] == 0) {
                if(row == n - 1) {
                    count++;
                } else {
                    fillArray(arr, n, row, i, 1);
                    backTrack(row + 1, arr, n);
                    fillArray(arr, n, row, i, -1);
                }
            }
        }
    }

    public int totalNQueens(int n) {
        count = 0;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = 0;
            }
        }
        backTrack(0, arr, n);
        return count;
    }
}
// @lc code=end

