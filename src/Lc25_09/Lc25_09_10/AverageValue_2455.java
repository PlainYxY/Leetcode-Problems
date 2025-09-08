package Lc25_09.Lc25_09_10;

// [25.9.8] 可被三整数的偶数的平均值
/**
 * <li>给你一个由正整数组成的整数数组 nums ，返回其中可被 3 整除的所有偶数的平均值。
 * <li>注意：n 个元素的平均值等于 n 个元素 求和 再除以 n ，结果 向下取整 到最接近的整数。
 */
public class AverageValue_2455 {
    public static void main(String[] args) {
        Solution2455 solution2455 = new Solution2455();

        // 9
        System.out.println(solution2455.averageValue(new int[]{1,3,6,10,12,15}));
        // 0
        System.out.println(solution2455.averageValue(new int[]{1,2,4,7,10}));
    }
}


// 0ms  100%
class Solution2455 {
    public int averageValue(int[] nums) {
        int sum = 0;
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 6 == 0) {
                sum += nums[i];
                num++;
            }
        }
        if (num == 0) {
            return 0;
        }
        return sum / num;
    }
}


// 1ms  53%
// 1.
/*
class Solution2455 {
    public int averageValue(int[] nums) {
        int ans = 0;
        int sum = 0;
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 3 == 0 && nums[i] % 2 == 0) {
                sum += nums[i];
                num++;
            }
        }
        if (num != 0) {
            ans = sum / num;
        }
        return ans;
    }
}*/
