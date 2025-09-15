package Lc25_09.Lc25_09_15;

public class ScoreOfString_3110 {
    public static void main(String[] args) {
        Solution3110 solution3110 = new Solution3110();

        // 13
        System.out.println(solution3110.scoreOfString("hello"));
        // 50
        System.out.println(solution3110.scoreOfString("zaz"));
    }
}

// 用绝对值
class Solution3110 {
    public int scoreOfString(String s) {
        int ans = 0;
        for (int i = 1; i < s.length(); i++) {
            ans += Math.abs(s.charAt(i) - s.charAt(i - 1));
        }
        return ans;
    }
}

// 1ms  80%
/*
class Solution3110 {
    public int scoreOfString(String s) {
        int ans = 0;
        for (int i = 0; i < s.length()-1; i++) {
            if ((int)s.charAt(i) >= (int)s.charAt(i+1)) {
                ans += (int)s.charAt(i) - (int)s.charAt(i+1);
            }else  {
                ans += (int)s.charAt(i+1) - (int)s.charAt(i);
            }
        }
        return ans;
    }
}*/
