package Lc25_08.Lc25_08_10.DoublePointer;

import java.util.Arrays;

// [25.8.7] 拆分数组
/**
 * 给定长度为 2n 的整数数组 nums ，你的任务是将这些数分成 n 对,
 * 例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从 1 到 n 的 min(ai, bi) 总和最大。
 * 返回该 最大总和 。
 */
public class arrayPairSum_561 {
    public static void main(String[] args) {
        Solution561 solution561 = new Solution561();

        System.out.println(solution561.arrayPairSum(new int[]{1,4,3,2}));
        System.out.println(solution561.arrayPairSum(new int[]{6,2,6,5,1,2}));
    }
}

// 12ms   98%
// 1.理解题目可知，这是需要递增排序后取所有 奇数 位的和
class Solution561 {
    public int arrayPairSum(int[] nums) {
        //先递增排序
        Arrays.sort(nums);
        //然后把所有奇数位相加
        int ans = 0;
        for (int i = 0; i < nums.length; i =i+2)
            ans += nums[i];
        return ans;
    }
}
