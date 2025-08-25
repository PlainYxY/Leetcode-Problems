package Lc25_08.Lc25_08_25.String;

//  [25.8.24](字符串) 找出字符串第一个匹配的下标
/**
 * <li>给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串的第一个匹配项的下标（下标从 0 开始）。
 * <li>如果 needle 不是 haystack 的一部分，则返回  -1 。
 */
public class StrStr_28 {
    public static void main(String[] args) {
        Solution28 solution28 = new Solution28();

        // 0
        System.out.println(solution28.strStr("sadbutsad","sad"));
        // -1
        System.out.println(solution28.strStr("leetcode","leeto"));
        // -1
        System.out.println(solution28.strStr("mississippi","issipi"));
    }
}


//3. KMP算法
class Solution28 {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}


// 2.这是题解（一行代码） todo haystack.indexOf(needle),在干草堆（haystack）里找一根针（needle）
//                         在字符串 haystack 中从头开始搜索子字符串 needle，并返回 needle 第一次出现的位置（索引）
/*
class Solution28 {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}*/


// 1ms  40%
// 1.两层循环，然后逐一对比
/*
class Solution28 {
    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;
        }
        for (int i = 0; i <= haystack.length()-needle.length(); i++) {
            int j;
                for (j = 0; j < needle.length(); j++) {
                    if (needle.charAt(j) !=  haystack.charAt(j+i)) {
                        break;
                    }
                }
                if (j == needle.length()) {
                    return i;
                }
            }
        return -1;
    }
}*/
