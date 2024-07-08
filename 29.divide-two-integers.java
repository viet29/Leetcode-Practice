/*
 * @lc app=leetcode id=29 lang=java
 *
 * [29] Divide Two Integers
 */

// @lc code=start
class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        boolean sign = (dividend < 0) == (divisor < 0);

        long dividd = Math.abs((long) dividend);
        long divis = Math.abs((long) divisor);

        int result = 0;

        while (dividd >= divis) {
            int count = 0;
            while (dividd >= (divis << (count + 1))) {
                count++;
            }
            result += 1 << count;
            dividd -= divis << count;
        }

        return sign ? result : -result;
    }
}
// @lc code=end
