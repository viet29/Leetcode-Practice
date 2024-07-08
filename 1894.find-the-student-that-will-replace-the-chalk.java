/*
 * @lc app=leetcode id=1894 lang=java
 *
 * [1894] Find the Student that Will Replace the Chalk
 */

// @lc code=start

class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long s = 0;
        int i;
        for (i = 0; i < chalk.length; i++) {
            s += chalk[i];
        }
        long remainChalk = (long) k % s;
        for (i = 0; i < chalk.length; i++) {
            if (remainChalk < chalk[i]) {
                return i;
            }
            remainChalk -= chalk[i];
        }
        return -1;
    }
}
// @lc code=end
