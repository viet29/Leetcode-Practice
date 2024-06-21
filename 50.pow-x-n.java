/*
 * @lc app=leetcode id=50 lang=java
 *
 * [50] Pow(x, n)
 */

// @lc code=start
class Solution {
    public double myPow(double x, int n) {
        if (n == 0 || x == 1)
            return 1;
        if (n == 1)
            return x;
        if (n == -1)
            return 1.0 / x;
        if (n % 2 == 0) {
            double y = myPow(x, n / 2);
            return y * y;
        }
        return myPow(x, n - 1) * x;
    }
}
// @lc code=end
