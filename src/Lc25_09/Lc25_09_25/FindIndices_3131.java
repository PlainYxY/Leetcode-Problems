package Lc25_09.Lc25_09_25;

import java.util.Arrays;

//
/**
 * <li>给你一个下标从 0 开始、长度为 n 的整数数组 nums ，以及整数 indexDifference 和整数 valueDifference 。
 * <li>你的任务是从范围 [0, n - 1] 内找出  2 个满足下述所有条件的下标 i 和 j ：
 * <li>abs(i - j) >= indexDifference 且
 * <li>abs(nums[i] - nums[j]) >= valueDifference
 * <li>返回整数数组 answer。如果存在满足题目要求的两个下标，则 answer = [i, j] ；否则，answer = [-1, -1] 。如果存在多组可供选择的下标对，只需要返回其中任意一组即可。
 * <li>注意：i 和 j 可能 相等 。
 */
public class FindIndices_3131 {
    public static void main(String[] args) {
        Solution3131 solution3131 = new Solution3131();

        // [0,3]
        System.out.println(solution3131.addedInteger(new int[]{2,6,4},new int[]{9,7,5}));
        // [0,0]
        System.out.println(solution3131.addedInteger(new int[]{10},new int[]{5}));
        // [-1,-1]
        System.out.println(solution3131.addedInteger(new int[]{1,1,1,1},new int[]{1,1,1,1}));
    }
}


//
class Solution3131 {
    public int addedInteger(int[] nums1, int[] nums2) {
        return 0;
    }
}
