package Lc25_09.Lc25_09_10;

// [25.9.8] 超过阈值的最少操作数 Ⅰ
/**
 * <li>给你一个下标从 0 开始的整数数组 nums 和一个整数 k 。
 * <li>一次操作中，你可以删除 nums 中的最小元素。
 * <li>你需要使数组中的所有元素都大于或等于 k ，请你返回需要的 最少 操作次数。
 */
public class MinOperations_3065 {
    public static void main(String[] args) {
        Solution3065 solution3065 = new Solution3065();

        // 3
        System.out.println(solution3065.minOperations(new int[]{2,11,10,1,3},10));
        // 0
        System.out.println(solution3065.minOperations(new int[]{1,1,2,4,9},1));
        // 4
        System.out.println(solution3065.minOperations(new int[]{1,1,2,4,9},9));
    }
}


class Solution3065 {
    public int minOperations(int[] nums, int k) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < k) {
                ans++;
            }
        }
        return ans;
    }
}
