package Lc25_10.Lc25_10_25;

import java.util.Arrays;

// [25.10.21] 交替合并字符
public class MergeAlternately_1768 {
    public static void main(String[] args) {
        Solution1768 solution1768 = new Solution1768();

        // "apbqcr"
        System.out.println(solution1768.mergeAlternately("abc","pqr"));
        // "apbqrs"
        System.out.println(solution1768.mergeAlternately("ab","pqrs"));
        // "apbqcd"
        System.out.println(solution1768.mergeAlternately("abcd","pq"));
    }
}


// 0ms  100%
class Solution1768 {
    public String mergeAlternately(String word1, String word2) {
        int len = Math.min(word1.length(), word2.length());
        StringBuilder sb = new StringBuilder(word1.length()+word2.length());
        int index = 0;
        while (index <len) {
            sb.append(word1.charAt(index));
            sb.append(word2.charAt(index));
            index++;
        }

        if (word1.length() < word2.length()) {
            // todo  字符串.substring(开始下标，结束下标) 用于截取字符串的子串。
            //       string.substring(beginIndex, endIndex) 是String类的常用方法，用于截取字符串的子串。
            sb.append(word2.substring(len));
        }else {
            sb.append(word1.substring(len));
        }
        return sb.toString();
    }
}

// 2ms  80%
/*class Solution1768 {
    public String mergeAlternately(String word1, String word2) {
        int len = Math.max(word1.length(), word2.length());
        StringBuilder sb = new StringBuilder(word1.length()+word2.length());
        int index = 0;
        while (index < len) {
            if (index < word1.length())
                sb.append(word1.charAt(index));
            if (index < word2.length())
                sb.append(word2.charAt(index));
            index++;
        }
        return sb.toString();
    }
}*/


// 2ms  80%
/*
class Solution1768 {
    public String mergeAlternately(String word1, String word2) {
        int len = Math.max(word1.length(), word2.length());
        int arrIndex = 0;
        char[] ansArr = new char[word1.length()+word2.length()];
        int index = 0;
        while (index < len) {
            if (index < word1.length()) {
                ansArr[arrIndex++] = word1.charAt(index);
            }
            if(index < word2.length()){
                ansArr[arrIndex++] = word2.charAt(index);
            }
            index++;
        }
        // todo     String.valueOf() 是一个静态方法，用于将各种数据类型转换为字符串。
        return String.valueOf(ansArr);
    }
}*/
