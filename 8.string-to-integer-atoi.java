/*
 * @lc app=leetcode id=8 lang=java
 *
 * [8] String to Integer (atoi)
 */

// @lc code=start
class Solution {
    public int myAtoi(String s) {
        long res = 0;
        char c;
        boolean sign = true, isNum = false;
        s = s.trim();
        int i = 0;
        while (i < s.length()) {
            c = s.charAt(i++);
            if (c >= '0' && c <= '9') {
                isNum = true;
                res = res * 10 + (c - '0');
                if ((res > Integer.MAX_VALUE && sign) ||
                        (res > Integer.MAX_VALUE + 1l && !sign)) {
                    res = Integer.MAX_VALUE;
                    if (!sign) {
                        res += 1;
                    }
                    break;
                }
            } else {
                if (isNum) {
                    break;
                }
                if (c == '-') {
                    sign = false;
                    isNum = true;
                } else if (c == '+') {
                    sign = true;
                    isNum = true;
                } else if (c != ' ') {
                    break;
                }
            }
        }
        res = sign ? res : -res;

        return (int) res;
    }
}
// @lc code=end
