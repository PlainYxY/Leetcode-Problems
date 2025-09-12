package Lc25_09.Lc25_09_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// [25.9.12] 判别首字母缩略词
public class IsAcronym_2828 {
    public static void main(String[] args) {
        Solution2828 solution2828 = new Solution2828();

        //todo list可以用Arrays.asList()来初始化

        // true
        List<String> listSting1 = new ArrayList<>(Arrays.asList("alice","bob","charlie"));
        System.out.println(solution2828.isAcronym(listSting1,"abc"));
        // false
        List<String> listSting2 = new ArrayList<>(Arrays.asList("an","apple"));
        System.out.println(solution2828.isAcronym(listSting2,"a"));
        // true
        List<String> listSting3 = new ArrayList<>(Arrays.asList("never","gonna","give","up","on","you"));
        System.out.println(solution2828.isAcronym(listSting3,"ngguoy"));
    }
}


// 1ms  100%
class Solution2828 {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder str = new StringBuilder();
        for (String word : words) {
            str.append(word.charAt(0));
        }
        return str.toString().equals(s);
    }
}