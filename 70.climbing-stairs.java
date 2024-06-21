/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        int[] steps = new int[n + 1];
        steps[0] = 1;
        steps[1] = 1;

        if (n < 2)
            return steps[n];

        for (int i = 2; i < n + 1; i++) {
            steps[i] = steps[i - 1] + steps[i - 2];
        }

        return steps[n];
    }
}
// @lc code=end
