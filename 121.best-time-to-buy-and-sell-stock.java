/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int op = 0;
        int pist = 0;

        int days = prices.length;

        for (int i = 1; i < days; i++) {
            if (buy > prices[i])
                buy = prices[i];

            pist = prices[i] - buy;

            if (op < pist)
                op = pist;
        }

        return op;
    }
}
// @lc code=end
