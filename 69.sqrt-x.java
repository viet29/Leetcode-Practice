/*
 * @lc app=leetcode id=69 lang=java
 *
 * [69] Sqrt(x)
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1)
            return x;

        int start = 1, end = x, mid;
        long tmp;
        while (start <= end) {
            mid = start + (end - start) / 2;
            tmp = (long) mid * mid;
            if (tmp > x) {
                end = mid - 1;
            } else if (tmp == x) {
                return mid;
            } else {
                start = mid + 1;
            }
        }
        return Math.round(end);
    }
}
// @lc code=end
