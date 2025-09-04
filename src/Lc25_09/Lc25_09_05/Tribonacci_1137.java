package Lc25_09.Lc25_09_05;

// [25.9.4] 第N个泰波那契数
/**
 * <li>泰波那契序列 Tn 定义如下：
 * <li>T0 = 0, T1 = 1, T2 = 1, 且在 n >= 0 的条件下 Tn+3 = Tn + Tn+1 + Tn+2
 * <li>给你整数 n，请返回第 n 个泰波那契数 Tn 的值。
 */
public class Tribonacci_1137 {
    public static void main(String[] args) {
        Solution1137 solution1137 = new Solution1137();

        // 4
        System.out.println(solution1137.tribonacci(4));
        // 1389537
        System.out.println(solution1137.tribonacci(25));
    }
}


// 0ms  100%
class Solution1137 {
    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }else if (n <= 2) {
            return 1;
        }
        int[] ansArr = new int[n];
        ansArr[0] = 1;
        ansArr[1] = 1;
        ansArr[2] = 2;
        for (int i = 3; i < n; i++) {
            ansArr[i] = ansArr[i - 1] + ansArr[i - 2] + ansArr[i - 3];
        }
        return ansArr[n - 1];
    }
}
