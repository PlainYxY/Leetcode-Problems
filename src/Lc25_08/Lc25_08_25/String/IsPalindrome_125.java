package Lc25_08.Lc25_08_25.String;


// [25.8.22](字符串) 验证回文串
/**
 *如果在将所有大写字符转换为小写字符、并移除所有非字母数字字符之后，短语正着读和反着读都一样。则可以认为该短语是一个 回文串 。
 * 字母和数字都属于字母数字字符。
 * 给你一个字符串 s，如果它是 回文串 ，返回 true ；否则，返回 false 。
 */
public class IsPalindrome_125 {
    public static void main(String[] args) {
        Solution125 solution125 = new Solution125();

        // true
        System.out.println(solution125.isPalindrome("A man, a plan, a canal: Panama"));
        // false
        System.out.println(solution125.isPalindrome("race a car"));
        // true
        System.out.println(solution125.isPalindrome(" "));
        // false
        System.out.println(solution125.isPalindrome("0P"));
    }
}


// 2ms  97%
// 3.题解: 直接双指针，判断
class Solution125 {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            } else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            } else if (Character.toLowerCase(s.charAt(left)) == Character.toLowerCase(s.charAt(right))) {
                left++;
                right--;
            }else
                return false;
        }
        return true;
    }
}


// 2. todo StringBuffer的reverse方法可以 反转字符串
/*
class Solution125 {
    public boolean isPalindrome(String s) {
        String S = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        StringBuffer sb = new StringBuffer(S).reverse();
        return S.equals(sb.toString());
    }
}*/


// 13ms  14%
// 1.去除不必要元素和全部小写后，用头尾指针检测是否相等
/*
class Solution125 {
    public boolean isPalindrome(String s) {
        String s1 = s.toLowerCase();
        String S = s1.replaceAll("[^a-zA-Z0-9]", "");
        int left = 0, right = S.length() - 1;
        while (left < right) {
            if (S.charAt(left) != S.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}*/
