/*
 * @lc app=leetcode id=1823 lang=java
 *
 * [1823] Find the Winner of the Circular Game
 */

// @lc code=start
class Solution {
    public int findTheWinner(int n, int k) {
        int i = 1, ans = 0;
        while (i <= n) {
            ans = (ans + k) % i;
            i++;
        }
        return ans + 1;
    }
}
// @lc code=end
