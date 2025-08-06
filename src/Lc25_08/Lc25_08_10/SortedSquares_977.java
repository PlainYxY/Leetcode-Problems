package Lc25_08.Lc25_08_10;

// [25.8.6] 有序数组的平方

import java.util.Arrays;

/**
* 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
* */
public class SortedSquares_977 {
    public static void main(String[] args) {
        Solution977 solution977 = new Solution977();

        //输出：[0,1,9,16,100]
        int[] ints1 = solution977.sortedSquares(new int[]{-4,-1,0,3,10});
        for (int int1 : ints1) {
            System.out.print(int1 + ",");
        }
        System.out.println();
        //输出：[4,9,9,49,121]
        int[] ints2 = solution977.sortedSquares(new int[]{-7,-3,2,3,11});
        for (int int2 : ints2) {
            System.out.print(int2 + ",");
        }
        System.out.println();
    }
}


// 3.
class Solution977 {
    public int[] sortedSquares(int[] nums) {

        return  nums;
    }
}


// 2.官方题解一  todo Arrays.sort(arr)方法 {快速递增的给数组排序，时杂为nlogn};
/*
class Solution977 {
    public int[] sortedSquares(int[] nums) {
        //平方
        for (int i =0 ; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return  nums;
    }
}*/


// 573ms    5.26
// 1.想象到的就是先品平方后，然后再排序，这种时间复杂度肯定高
/*
class Solution977 {
    public int[] sortedSquares(int[] nums) {
        //平方
        for (int i =0 ; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        //排序
        int box = 0;
        for (int i =0 ; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    box = nums[i];
                    nums[i] = nums[j];
                    nums[j] = box;
                }
            }
        }
        return nums;
    }
}*/
