package Lc25_09.Lc25_09_05;

// [25.9.1](数组) 分类求和并作差
/**
 * <li>给你两个正整数 n 和 m 。
 * <li>现定义两个整数 num1 和 num2 ，如下所示：
 * <li>num1：范围 [1, n] 内所有 无法被 m 整除 的整数之和。
 * <li>num2：范围 [1, n] 内所有 能够被 m 整除 的整数之和。
 * <li>返回整数 num1 - num2 。
 */
public class DifferenceOfSums_2894 {
    public static void main(String[] args) {
        Solution2894 solution2894 = new Solution2894();

        // 19
        System.out.println(solution2894.differenceOfSums(10,3));
        // 15
        System.out.println(solution2894.differenceOfSums(5,6));
        // -15
        System.out.println(solution2894.differenceOfSums(5,1));
    }
}


// 0ms 100%
class Solution2894 {
    public int differenceOfSums(int n, int m) {
        int count = 1;
        int nSum = 0;
        int mSum = 0;
        while (count <= n) {
            if (count % m != 0) {
                nSum += count;
            }else mSum += count;

            count++;
        }
        return nSum - mSum;
    }
}
