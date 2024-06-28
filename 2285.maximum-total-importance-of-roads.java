/*
 * @lc app=leetcode id=2285 lang=java
 *
 * [2285] Maximum Total Importance of Roads
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public long maximumImportance(int n, int[][] roads) {
        int[] arr = new int[n];
        for (int i = 0; i < roads.length; i++) {
            arr[roads[i][0]]++;
            arr[roads[i][1]]++;
        }
        Arrays.sort(arr);
        long res = 0;
        for (int i = n - 1; i >= 0; i--) {
            res += (long) arr[i] * (i + 1);
        }
        return res;
    }
}
// @lc code=end
