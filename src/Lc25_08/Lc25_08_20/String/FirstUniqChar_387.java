package Lc25_08.Lc25_08_20.String;

import java.util.*;

// [25.8.20](字符串) 字符串的第一个唯一字符
/**
 * <li>给定一个字符串 s ，找到 它的第一个不重复的字符，并返回它的索引 。如果不存在，则返回 -1 。
 * <li>s 只包含小写字母
 */
public class FirstUniqChar_387 {
    public static void main(String[] args) {
        Solution387 solution387 = new Solution387();

        // 0
        System.out.println(solution387.firstUniqChar("leetcode"));
        // 2
        System.out.println(solution387.firstUniqChar("loveleetcode"));
        // -1
        System.out.println(solution387.firstUniqChar("aabb"));
    }
}
// 或者放map里，找到是1（只出现了一次）的最小的value


// 33ms  21%
// 1. 放map里，然后检测谁是第一个为1的key
class Solution387 {
    public int firstUniqChar(String s) {
        int ans = -1;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return ans;
    }
}
