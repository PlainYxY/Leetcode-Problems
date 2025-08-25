package Lc25_08.Lc25_08_25.String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// [25.8.24](字符串) 最长公共前缀

/**
 * <li>编写一个函数来查找字符串数组中的最长公共前缀。
 * <li>如果不存在公共前缀，返回空字符串 ""。
 */
public class LongestCommonPrefix_14 {
    public static void main(String[] args) {
        Solution14 solution14 = new Solution14();

        // "fl"
        System.out.println(solution14.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        // ""
        System.out.println(solution14.longestCommonPrefix(new String[]{"dog","racecar","car"}));
        // ""
        System.out.println(solution14.longestCommonPrefix(new String[]{"","b"}));
        // ""
        System.out.println(solution14.longestCommonPrefix(new String[]{"cc","cacc","ccc"}));
    }
}

// 1ms   73%
// 2.题友解法，数组排序（会先按照字母排序，然后按照长度）【这一步很精妙】，然后比较头尾两个前缀
class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        Arrays.sort(strs);
        int index = 0;
        String first = strs[0];
        String last = strs[strs.length - 1];
        while(index < first.length()
                && index < last.length()
                && first.charAt(index) == last.charAt(index)){
            index ++;
        }
        return strs[0].substring(0, index);
    }
}



// 1ms   73%
// 1.,循环 然后后续再挨个检测 todo String(字符串).substring(开头下标，结尾下标)  可以截取字符串的一段
/*
class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        String ansStr = "";
        if (!strs[0].isEmpty()) {
            ansStr = strs[0];
        }else return "";
        int temp = 0;
        int len = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            for (int j = 0; j < Math.min(ansStr.length(),strs[i].length()); j++) {
                if (ansStr.charAt(j) == strs[i].charAt(j)) {
                    temp++;
                }else break;
            }
            if (temp < len) {
                len = temp;
            }
            temp = 0;
        }
        return strs[0].substring(0, len);
    }
}*/
