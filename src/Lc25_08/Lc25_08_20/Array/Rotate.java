package Lc25_08.Lc25_08_20.Array;

import java.util.Arrays;

//
public class Rotate {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // [5,6,7,1,2,3,4]
        int[] nums1 = {1,2,3,4,5,6,7};
        solution.rotate(nums1,3);
        System.out.println(Arrays.toString(nums1));
        // [3,99,-1,-100]
        int[] nums2 = {-1,-100,3,99};
        solution.rotate(nums2,2);
        System.out.println(Arrays.toString(nums2));
        // [3,99,-1,-100]
        int[] nums3 = {1,2};
        solution.rotate(nums3,7);
        System.out.println(Arrays.toString(nums3));
    }
}


// todo 解不出来，力扣初级算法模块-数组-【旋转数组】（这道题题库里没有）
class Solution {
    public void rotate(int[] nums, int k) {

    }
}

