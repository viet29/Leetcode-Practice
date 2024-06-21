/*
 * @lc app=leetcode id=12 lang=java
 *
 * [12] Integer to Roman
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public String intToRoman(int num) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "I");
        hm.put(5, "V");
        hm.put(10, "X");
        hm.put(50, "L");
        hm.put(100, "C");
        hm.put(500, "D");
        hm.put(1000, "M");

        String res = "";
        int digit = 1, a;
        while (num > 0) {
            a = num % 10;
            num /= 10;
            switch (a) {
                case 1:
                case 2:
                case 3:
                    for (int i = 0; i < a; i++) {
                        res = hm.get(digit) + res;
                    }
                    break;
                case 4:
                    res = hm.get(digit) + hm.get(5 * digit) + res;
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                    for (int i = 6; i <= a; i++) {
                        res = hm.get(digit) + res;
                    }
                    res = hm.get(5 * digit) + res;
                    break;
                case 9:
                    res = hm.get(digit) + hm.get(digit * 10) + res;
                    break;
                default:
                    break;
            }
            digit *= 10;
        }
        return res;
    }
}
// @lc code=end
