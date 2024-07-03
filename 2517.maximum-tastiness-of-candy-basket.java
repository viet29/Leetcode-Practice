/*
 * @lc app=leetcode id=2517 lang=java
 *
 * [2517] Maximum Tastiness of Candy Basket
 */

// @lc code=start

import java.util.Arrays;

class Solution {

    private boolean check(int x, int[] price, int k) {
        int prev = price[0];
        int count = 1;
        for (int i = 0; i < price.length && count < k; i++) {
            if (price[i] - prev >= x) {
                count++;
                prev = price[i];
            }
        }
        return count == k;
    }

    public int maximumTastiness(int[] price, int k) {
        int res = 0, n = price.length;
        Arrays.sort(price);

        int low = 0, high = price[n - 1] / (k - 1), mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (check(mid, price, k)) {
                res = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return res;
    }
}
// @lc code=end
