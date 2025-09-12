package Lc25_09.Lc25_09_15;

// [25.9.11] 特殊元素平方和
/**
 * <li>给你一个下标从 1 开始、长度为 n 的整数数组 nums 。
 * <li>对 nums 中的元素 nums[i] 而言，如果 n 能够被 i 整除，即 n % i == 0 ，则认为 num[i] 是一个 特殊元素 。
 * <li>返回 nums 中所有 特殊元素 的 平方和 。
 */
public class SumOfSquares_2778 {
    public static void main(String[] args) {
        Solution2778 solution2778 = new Solution2778();

        // 21
        System.out.println(solution2778.sumOfSquares(new int[]{1,2,3,4}));
        // 63
        System.out.println(solution2778.sumOfSquares(new int[]{2,7,1,19,18,3}));
    }
}


//1ms   100%
class Solution2778 {
    public int sumOfSquares(int[] nums) {
        int ans = 0;
        for (int i = 1; i <= nums.length; i++) {
            if (nums.length % i == 0) {
                ans += nums[i-1] * nums[i-1];
            }
        }
        return ans;
    }
}