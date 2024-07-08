/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {

    private boolean isAlphanumeric(char c) {
        return (c >= '0' && c <= '9') || (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            char l = s.charAt(left), r = s.charAt(right);
            if (!isAlphanumeric(l)) {
                left++;
                continue;
            }
            if (!isAlphanumeric(r)) {
                right--;
                continue;
            }
            if (l >= 'A' && l <= 'Z')
                l += 32;
            if (r >= 'A' && r <= 'Z')
                r += 32;

            if (l != r) {
                break;
            }
            left++;
            right--;
        }
        return left >= right;
    }
}
// @lc code=end
