/*
 * @lc app=leetcode id=1550 lang=java
 *
 * [1550] Three Consecutive Odds
 */

// @lc code=start
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                a = 0;
            } else {
                a += 1;
            }
            if (a == 3) {
                return true;
            }
        }
        return false;
    }
}
// @lc code=end
