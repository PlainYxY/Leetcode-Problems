package Lc25_10.Lc25_10_15;

// [25.10.13] 字母在字符串中的百分比

/**
 * 给你一个字符串 s 和一个字符 letter ，返回在 s 中等于 letter 字符所占的 百分比 ，向下取整到最接近的百分比。
 */
public class PercentageLetter_2278 {
    public static void main(String[] args) {
        Solution2278 solution2278 = new Solution2278();

        // 33
        System.out.println(solution2278.percentageLetter("foobar",'o'));
        // 0
        System.out.println(solution2278.percentageLetter("jjjj",'k'));
    }
}


// 0ms  100%
class Solution2278 {
    public int percentageLetter(String s, char letter) {
        int count = 0;
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if (c == letter) {
                count++;
            }
        }

        return count*100/s.length();
    }
}
