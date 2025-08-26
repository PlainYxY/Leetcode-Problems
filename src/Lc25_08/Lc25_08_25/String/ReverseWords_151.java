package Lc25_08.Lc25_08_25.String;

// [25.8.26](字符串) 反转字符串中里的单词

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <li>给你一个字符串 s ，请你反转字符串中 单词 的顺序。
 * <li>单词 是由非空格字符组成的字符串。s 中使用至少一个空格将字符串中的 单词 分隔开。
 * <li>返回 单词 顺序颠倒且 单词 之间用单个空格连接的结果字符串。
 * <li>注意：输入字符串 s中可能会存在前导空格、尾随空格或者单词间的多个空格。
 * 返回的结果字符串中，单词间应当仅用单个空格分隔，且不包含任何额外的空格。
 */
public class ReverseWords_151 {
    public static void main(String[] args) {
        Solution151 solution151 = new Solution151();

        // "blue is sky the"
        System.out.println(solution151.reverseWords("the sky is blue"));
        // "world hello"
        System.out.println(solution151.reverseWords("  hello world  "));
        // "example good a"
        System.out.println(solution151.reverseWords("a good   example"));
    }
}


// 11ms   10%
// 1.题友解法，todo Arrays.asList(s.split(" ")); 将字符串以 " "(空格)分割装进数组
//                Collections.reverse(words);  反转数组
class Solution151 {
    public String reverseWords(String s) {
        List<String> words = Arrays.asList(s.split(" "));
        Collections.reverse(words);
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if  (!word.equals("")) {
                sb.append(word + " ");
            }
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }
}


// 18ms  5%
// 1.装到ArrayList中反转遍历
/*
class Solution151 {
    public String reverseWords(String s) {
        // 去掉字符串头尾空格
        String trim = s.trim();
        int left = 0;
        List<String> strings = new ArrayList<String>() {{}};
        String temp = "";
        for (int i = left; i < trim.length(); i++) {
            if (trim.charAt(i) != ' ') {
                temp += trim.charAt(i);
            } else if (trim.charAt(i) == ' ') {
                strings.add(temp);
                temp = "";
                while (trim.charAt(i) == ' ') {
                    i++;
                }
                i--;
            }
        }
        strings.add(temp);
        // 倒着遍历ArrayList
        String ans = strings.get(strings.size() - 1);
        for (int i = strings.size() - 2; i >= 0; i--) {
            ans = ans + " " + strings.get(i);
        }
        return ans;
    }
}*/
