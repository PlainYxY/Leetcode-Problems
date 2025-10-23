package Lc25_10.Lc25_10_25;

import java.util.HashSet;
import java.util.Set;

// [25.10.21] 判断句子是否为全字母
public class CheckIfPangram_1832 {
    public static void main(String[] args) {
        Solution1832 solution1832 = new Solution1832();

        // true
        System.out.println(solution1832.checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
        // false
        System.out.println(solution1832.checkIfPangram("thequickbroxjumverthelazydog"));
    }
}
/// 思路：1.放入set中检测数量


// 0ms  100%
// 官方题解思路，直接遍历26个字母，判断是否在字符串中存在
class Solution1832 {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26) return false;
        for (int i = 0; i < 26; i++) {
            char temp = (char) ('a' + i);
            if (!sentence.contains(String.valueOf(temp))) {
                return false;
            }
        }
        return true;
    }
}


//  3ms  29%
//  放入set中检测数量
/*
class Solution1832 {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26)
            return false;
        Set<Character> charSet = new HashSet<>();
        int index = 0;
        while(index < sentence.length()) {
            charSet.add(sentence.charAt(index));
            index++;
            if (charSet.size() == 26) {
                return true;
            }
        }
        return false;
    }
}*/
