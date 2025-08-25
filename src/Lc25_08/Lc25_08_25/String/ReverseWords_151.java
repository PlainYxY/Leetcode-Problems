package Lc25_08.Lc25_08_25.String;

// [25.8.25](字符串) 翻转字符串中的单词
/**
 * <li>给你一个字符串 s ，请你反转字符串中 单词 的顺序。
 * <li>单词 是由非空格字符组成的字符串。s 中使用至少一个空格将字符串中的 单词 分隔开。
 * <li>返回 单词 顺序颠倒且 单词 之间用单个空格连接的结果字符串。
 * <li>注意：输入字符串 s中可能会存在前导空格、尾随空格或者单词间的多个空格。
 *     返回的结果字符串中，单词间应当仅用单个空格分隔，且不包含任何额外的空格。
 */
public class ReverseWords_151 {
    public static void main(String[] args) {
        Solution151 solution151 = new Solution151();

        // "blue is sky the"
        System.out.println(solution151.reverseWords("the sky is blue"));
        // "world hello" 反转后的字符串中不能存在前导空格和尾随空格。
        System.out.println(solution151.reverseWords("  hello world  "));
        // "example good a" 如果两个单词间有多余的空格，反转后的字符串需要将单词间的空格减少到仅有一个。
        System.out.println(solution151.reverseWords("a good   example"));
    }
}


//
class Solution151 {
    public String reverseWords(String s) {
        return "";
    }
}