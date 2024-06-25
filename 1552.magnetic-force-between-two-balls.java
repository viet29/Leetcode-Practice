/*
 * @lc app=leetcode id=1552 lang=java
 *
 * [1552] Magnetic Force Between Two Balls
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    private boolean canPlaceBalls(int x, int[] position, int m) {
        int prevBallPos = position[0];
        int ballPlaced = 1;

        for (int i = 0; i < position.length && ballPlaced < m; i++) {
            int currPos = position[i];
            if (currPos - prevBallPos >= x) {
                ballPlaced++;
                prevBallPos = currPos;
            }
        }
        return ballPlaced == m;
    }

    public int maxDistance(int[] position, int m) {
        int res = 0, n = position.length;
        Arrays.sort(position);

        int low = 0, high = position[n - 1] / (m - 1), mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (canPlaceBalls(mid, position, m)) {
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
