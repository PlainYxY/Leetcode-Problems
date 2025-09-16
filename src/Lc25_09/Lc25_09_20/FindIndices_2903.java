package Lc25_09.Lc25_09_20;

import java.util.Arrays;

// [25.9.16] 找出满足差值的条件下标 |
public class FindIndices_2903 {
    public static void main(String[] args) {
        Solution2903 solution2903 = new Solution2903();

        // [0,3]
        System.out.println(Arrays.toString(solution2903.findIndices(new int[]{5,1,4,1},2,4)));
        // [0,0]
        System.out.println(Arrays.toString(solution2903.findIndices(new int[]{2,1},0,0)));
        // [-1,-1]
        System.out.println(Arrays.toString(solution2903.findIndices(new int[]{1,2,3},2,4)));
        // [0,2]
        System.out.println(Arrays.toString(solution2903.findIndices(new int[]{4,22,43},0,34)));
    }
}


// 官方题解，一层循环
class Solution2903 {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int i = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int indexMin=0, indexMax=0;
        for (int j = indexDifference; j < nums.length; j++) {
            if (nums[i] < min) {
                min = nums[i];
                indexMin = i;
            }
            if (nums[i] > max) {
                max = nums[i];
                indexMax = i;
            }
            if (max - nums[j] >= valueDifference) {
                return new int[]{indexMax, j};
            }else if (nums[j] - min >= valueDifference) {
                return new int[]{indexMin, j};
            }
            i++;
        }
        return new int[]{-1, -1};
    }
}


// 1ms  50%
// 两层for循环
/*
class Solution2903 {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0+indexDifference; j < nums.length; j++) {
                if (j - i >= indexDifference && Math.abs(nums[i] - nums[j]) >= valueDifference) {
                    return new int[]{i, j};
                }
            }
        }
        return  new int[]{-1,-1};
    }
}*/
