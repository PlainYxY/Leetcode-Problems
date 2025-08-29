package Lc25_08.Lc25_08_31;

// [25.8.27](数组) 数组串联

import java.util.Arrays;

/**
 * <li>给你一个长度为 n 的整数数组 nums 。请你构建一个长度为 2n 的答案数组 ans ，数组下标 从 0 开始计数 ，对于所有 0 <= i < n 的 i ，满足下述所有要求：
 * <li>ans[i] == nums[i]
 * <li>ans[i + n] == nums[i]
 * <li>具体而言，ans 由两个 nums 数组 串联 形成。
 * <li>返回数组 ans 。
 */
public class GetConcatenation_1929 {
    public static void main(String[] args) {
        Solution1929 solution1929 = new Solution1929();

        // [1,2,1,1,2,1]
        System.out.println(Arrays.toString(solution1929.getConcatenation(new int[]{1,2,1})));
        // [1,3,2,1,1,3,2,1]
        System.out.println(Arrays.toString(solution1929.getConcatenation(new int[]{1,3,2,1})));
    }
}


// 1.
class Solution1929 {
    public int[] getConcatenation(int[] nums) {
        int[] ansArr = new int[nums.length * 2];
        int left = 0;
        int leftNums = 0;
        while (left < ansArr.length) {
            ansArr[left] = nums[leftNums];
            leftNums++;
            left++;
            if (leftNums == nums.length) {
                leftNums = 0;
            }
        }
        return  ansArr;
    }
}