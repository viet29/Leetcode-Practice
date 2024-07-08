/*
 * @lc app=leetcode id=168 lang=java
 *
 * [168] Excel Sheet Column Title
 */

// @lc code=start
class Solution {

    public String convertToTitle(int columnNumber) {
        StringBuilder res = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            int remainder = columnNumber % 26;
            res.insert(0, (char) ('A' + remainder));
            columnNumber /= 26;
        }
        return res.toString();
    }
}
// @lc code=end
