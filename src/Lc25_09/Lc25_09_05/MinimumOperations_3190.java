package Lc25_09.Lc25_09_05;

// [25.9.1](数组) 使用所有元素都可以被3整除的最少操作
/**
 * <li>给你一个整数数组 nums 。一次操作中，你可以将 nums 中的 任意 一个元素增加或者减少 1 。
 * <li>请你返回将 nums 中所有元素都可以被 3 整除的 最少 操作次数。
 */
public class MinimumOperations_3190 {
    public static void main(String[] args) {
        Solution3190 solution3190 = new Solution3190();

        // 3
        System.out.println(solution3190.minimumOperations(new int[]{1,2,3,4}));
        // 0
        System.out.println(solution3190.minimumOperations(new int[]{3,6,9}));
    }
}


//
class Solution3190 {
    public int minimumOperations(int[] nums) {
        return 0;
    }
}