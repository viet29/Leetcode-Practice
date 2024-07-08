/*
 * @lc app=leetcode id=3178 lang=java
 *
 * [3178] Find the Child Who Has the Ball After K Seconds
 */

// @lc code=start
class Solution {
    public int numberOfChild(int n, int k) {
        int halfRounds = k / (n - 1);
        int extraStep = k % (n - 1);
        return (halfRounds % 2 == 0) ? extraStep : n - 1 - extraStep;
    }
}
// @lc code=end
