import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, String> hm = new HashMap<>();
        hm.put('I', "1");
        hm.put('V', "5");
        hm.put('X', "10");
        hm.put('L', "50");
        hm.put('C', "100");
        hm.put('D', "500");
        hm.put('M', "1000");

        String tmp = hm.get(s.charAt(0)), tmp2;
        int S = 0, a = Integer.parseInt(tmp), b;

        for (int i = 1; i < s.length(); i++) {
            tmp2 = hm.get(s.charAt(i));
            if (tmp.length() > tmp2.length()) {
                S += a;
                a = Integer.parseInt(tmp2);
            } else if (tmp.length() == tmp2.length()) {
                b = Integer.parseInt(tmp2);
                if (a < b) {
                    a = b - a;
                } else {
                    a += b;
                }
            } else {
                a = 9 * (int) Math.pow(10, tmp.length() - 1);
            }

            tmp = tmp2;
        }

        S += a;

        return S;
    }
}
// @lc code=end
