/*
 * @lc app=leetcode id=509 lang=java
 *
 * [509] Fibonacci Number
 */

// @lc code=start
class Solution {

    public int fib(int n) {
        if (n < 2)
            return n;
        int a = 0, b = 1, i = 2;
        while (i++ <= n) {
            b += a;
            a = b - a;
        }
        return b;
    }
}
// @lc code=end
