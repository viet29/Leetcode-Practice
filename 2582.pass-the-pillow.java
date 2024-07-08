/*
 * @lc app=leetcode id=2582 lang=java
 *
 * [2582] Pass the Pillow
 */

// @lc code=start
class Solution {
    public int passThePillow(int n, int time) {
        int halfRounds = time / (n - 1);
        int extraStep = time % (n - 1);
        return halfRounds % 2 == 0 ? 1 + extraStep : n - extraStep;
    }
}
// @lc code=end
