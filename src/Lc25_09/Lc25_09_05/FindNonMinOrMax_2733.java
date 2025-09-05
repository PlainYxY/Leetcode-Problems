package Lc25_09.Lc25_09_05;

// [25.9.5](数组) 既不是最小值也不是最大值
/**
 * <li>给你一个整数数组 nums ，数组由 不同正整数 组成，请你找出并返回数组中 任一 既不是 最小值 也不是 最大值 的数字，如果不存在这样的数字，返回 -1 。
 * <li>返回所选整数。
 */
public class FindNonMinOrMax_2733 {
    public static void main(String[] args) {
        Solution2733 solution2733 = new Solution2733();

        // 2 或 3
        System.out.println(solution2733.findNonMinOrMax(new int[]{3, 2, 1, 4}));
        // -1
        System.out.println(solution2733.findNonMinOrMax(new int[]{1, 2}));
        // 2
        System.out.println(solution2733.findNonMinOrMax(new int[]{2, 1, 3}));
        // 4
        System.out.println(solution2733.findNonMinOrMax(new int[]{2,4,25}));
    }
}


// 4ms  100%
class Solution2733 {
    public int findNonMinOrMax(int[] nums) {
        if (nums.length == 2 ) {
            return -1;
        }
        int min = Integer.MAX_VALUE;
        int max = -1;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        for (int num : nums) {
            if (num != min && num != max) {
                return num;
            }
        }
        return -1;
    }
}
