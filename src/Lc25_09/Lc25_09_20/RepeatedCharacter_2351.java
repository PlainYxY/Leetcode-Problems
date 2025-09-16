package Lc25_09.Lc25_09_20;

import java.util.HashSet;

// [25.9.16] 特殊元素平方和
/**
 * <li>给你一个由小写英文字母组成的字符串 s ，请你找出并返回第一个出现 两次 的字母。
 * <li>注意：
 * <li>如果 a 的 第二次 出现比 b 的 第二次 出现在字符串中的位置更靠前，则认为字母 a 在字母 b 之前出现两次。
 * <li>s 包含至少一个出现两次的字母。
 */
public class RepeatedCharacter_2351 {
    public static void main(String[] args) {
        Solution2351 solution2351 = new Solution2351();

        // "c"
        System.out.println(solution2351.repeatedCharacter("abccbaacz"));
        // "d"
        System.out.println(solution2351.repeatedCharacter("abcdd"));
    }
}


// 0ms  100%
// Set内不能放重复元素
class Solution2351 {
    public char repeatedCharacter(String s) {
        HashSet<Character> characters = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (!characters.add(s.charAt(i))) {
                return s.charAt(i);
            }
        }
        return s.charAt(0);
    }
}
