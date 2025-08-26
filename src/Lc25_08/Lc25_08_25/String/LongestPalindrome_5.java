package Lc25_08.Lc25_08_25.String;

// [25.8.25](字符串) 最长回文子串
/**
 * <li>给你一个字符串 s，找到 s 中最长的 回文 子串。
 */
public class LongestPalindrome_5 {
    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();

        // "bab"
        System.out.println(solution5.longestPalindrome("babad"));
        // "bb"
        System.out.println(solution5.longestPalindrome("cbbd"));
    }
}


// todo 解不出来，没思路
class Solution5 {
    public String longestPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {

        }
        return "";
    }
}