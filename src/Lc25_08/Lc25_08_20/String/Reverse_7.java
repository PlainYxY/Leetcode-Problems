package Lc25_08.Lc25_08_20.String;

// [25.8.19](字符串) 整数反转
/**
 * <li>给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 * <li>如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 * <li>假设环境不允许存储 64 位整数（有符号或无符号）。
 */
public class Reverse_7 {
    public static void main(String[] args) {
        Solution7 solution7 = new Solution7();

        // 321
        System.out.println(solution7.reverse(123));
        // -321
        System.out.println(solution7.reverse(-123));
        // 21
        System.out.println(solution7.reverse(120));
        // 0
        System.out.println(solution7.reverse(0));
    }
}


// 取模，颠倒，然后判断
// 1ms  40%
class Solution7 {
    public int reverse(int x) {
        int ans = 0;
        int temp;
        while (x != 0) {
            if (ans > 214748364 || ans < -214748364) {
                return 0;
            }
            temp = x%10;
            ans = ans * 10 + temp;
            x /= 10;
        }
        return ans;
    }
}
