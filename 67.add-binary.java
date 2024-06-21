/*
 * @lc app=leetcode id=67 lang=java
 *
 * [67] Add Binary
 */

// @lc code=start
class Solution {
    public String addBinary(String a, String b) {
        // System.out.println(a.length() + " " + b.length());
        if (a.length() > b.length()) {
            for (int i = b.length(); i < a.length(); i++) {
                b = "0" + b;
            }
        } else {
            for (int i = a.length(); i < b.length(); i++) {
                a = "0" + a;
            }
        }
        // System.out.println(a + " " + b);

        int carry = 0;
        String res = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            int digit = (a.charAt(i) - '0') + (b.charAt(i) - '0') + carry;
            if (digit <= 1) {
                res = digit + res;
                carry = 0;
            } else {
                res = (digit % 2) + res;
                carry = 1;
            }
        }

        if (carry == 1) {
            res = "1" + res;
        }
        return res;
    }
}
// @lc code=end
