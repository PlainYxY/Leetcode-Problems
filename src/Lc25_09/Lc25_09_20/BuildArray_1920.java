package Lc25_09.Lc25_09_20;

import java.util.Arrays;

// [25.9.17] 基于排序构建数组
public class BuildArray_1920 {
    public static void main(String[] args) {
        Solution1920 solution1920 = new Solution1920();

        // [0,1,2,4,5,3]
        System.out.println(Arrays.toString(solution1920.buildArray(new int[]{0,2,1,5,3,4})));
        // [4,5,0,1,2,3]
        System.out.println(Arrays.toString(solution1920.buildArray(new int[]{5,0,1,2,3,4})));
    }
}


// 1ms  85%
class Solution1920 {
    public int[] buildArray(int[] nums) {
        int[] ansArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ansArr[i] = nums[nums[i]];
        }
        return ansArr;
    }
}
