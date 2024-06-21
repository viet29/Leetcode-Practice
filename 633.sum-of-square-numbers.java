/*
 * @lc app=leetcode id=633 lang=java
 *
 * [633] Sum of Square Numbers
 */

// @lc code=start
class Solution {
    public boolean judgeSquareSum(int c) {
        if (c <= 2)
            return true;
        double sqr_c = Math.sqrt(c);
        if (sqr_c == (long) sqr_c) {
            return true;
        }
        long low = 1, high = (long) sqr_c, tmp;
        while (low <= high) {
            tmp = low * low + high * high;
            if (tmp == c) {
                return true;
            } else if (tmp > c) {
                high--;
            } else {
                low++;
            }
        }
        return false;
    }

}
// @lc code=end
