package Lc25_08.Lc25_08_25.String;

import java.util.*;

// [25.8.21](字符串) 有效字符异位词
/**
 * <li>给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的 字母异位词。
 */
public class IsAnagram_242 {
    public static void main(String[] args) {
        Solution242 solution242 = new Solution242();

        // true
        System.out.println(solution242.isAnagram("anagram", "nagaram"));
        // false
        System.out.println(solution242.isAnagram("rat", "car"));
        // false
        System.out.println(solution242.isAnagram("ggii", "eekk"));
    }
}


// 3ms  80%
// 1.题解     todo toCharArray() 可以将字符串变为Char数组
class Solution242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }
}
