/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        int curr = digits.length - 1;
        boolean carry = true;
        while (carry) {
            digits[curr] += 1;
            if (digits[curr] > 9) {
                digits[curr] = 0;
                if (curr == 0) {
                    int[] newDigits = new int[digits.length + 1];
                    newDigits[0] = 1;
                    for (int i = 0; i < digits.length; i++) {
                        newDigits[i + 1] = digits[i];
                    }
                    return newDigits;
                } else {
                    curr--;
                }
            } else {
                carry = false;
            }
        }
        return digits;
    }
}
// @lc code=end
