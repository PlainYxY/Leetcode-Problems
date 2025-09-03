package Lc25_09.Lc25_09_05;

//  [25.9.1] 整数的各位积和之差
/**
 * <li>给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。
 */
public class SubtractProductAndSum_1281 {
    public static void main(String[] args) {
        Solution1281 solution1281 = new Solution1281();

        // 15
        System.out.println(solution1281.subtractProductAndSum(234));
        // 21
        System.out.println(solution1281.subtractProductAndSum(4421));
    }
}

// 0ms  100%
class Solution1281 {
    public int subtractProductAndSum(int n) {
        int ji = 1;
        int sum = 0;
        String nLength = String.valueOf(n);
        for (int i = 0; i < nLength.length(); i++) {
            ji *= (n % 10);
            sum += (n % 10);
            n /= 10;
        }
        return ji - sum;
    }
}
