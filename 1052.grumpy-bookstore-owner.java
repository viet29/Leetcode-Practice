/*
 * @lc app=leetcode id=1052 lang=java
 *
 * [1052] Grumpy Bookstore Owner
 */

// @lc code=start
class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int currWin = 0, maxWin = 0, n = customers.length, j = 0;
        for (int i = 0; i < n; i++) {
            currWin += customers[i] * grumpy[i];
            maxWin = Math.max(maxWin, currWin);
            if (i >= minutes - 1) {
                currWin -= customers[j] * grumpy[j++];
            }
        }

        for (int i = 0; i < n; i++) {
            maxWin += customers[i] * (1 - grumpy[i]);
        }
        return maxWin;
    }
}
// @lc code=end
