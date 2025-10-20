package Lc25_10.Lc25_10_20;

import java.util.Scanner;

// [25.10.20] 连续字符
/**
 * <li>给你一个字符串 s ，字符串的「能量」定义为：只包含一种字符的最长非空子字符串的长度。
 * <li>请你返回字符串 s 的 能量。
 */
public class MaxPower_1446 {
    public static void main(String[] args) {

        // todo 下面为 Scanner.不同的next返回值用法
        /**
         * nextInt() - 读取整数（int 类型）
         * next() - 读取单词（String 类型）
         * nextLine() - 读取整行（String 类型）
         */
//        String scanner = new Scanner(System.in).next();
//        System.out.println(scanner);\

        Solution1446 solution1446 = new Solution1446();

        // 2
        System.out.println(solution1446.maxPower("leetcode"));
        // 5
        System.out.println(solution1446.maxPower("abbcccddddeeeeedcba"));
        // 2
        System.out.println(solution1446.maxPower("cc"));
    }
}
// 用双指针（快慢指针）解题


// 1ms  100%
class Solution1446 {
    public int maxPower(String s) {
        int ans = 1;
        int slow = 0, fast = 1;
        char[] charArray = s.toCharArray();
        while (fast < s.length()) {
            if (charArray[slow] == charArray[fast]) {
                ans = Math.max(ans, fast - slow + 1);
                fast++;
            }else{
                ans = Math.max(ans, fast - slow);
                slow = fast;
                fast++;
            }
        }
        return ans;
    }
}
