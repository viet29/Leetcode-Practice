/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        int y = 0, z = x;

        while (z > 0) {
            y = y * 10 + z % 10;
            z /= 10;
        }

        return y == x;
    }
}
// @lc code=end
