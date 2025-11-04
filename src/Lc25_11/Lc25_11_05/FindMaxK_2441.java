package Lc25_11.Lc25_11_05;


import java.util.Arrays;

// [25.11.04] 与对应负数同时存在的最大正整数
public class FindMaxK_2441 {
    public static void main(String[] args) {
        Solution2441 solution2441 = new Solution2441();

        // 3
        System.out.println(solution2441.findMaxK(new int[]{-1,2,-3,3}));
        // 7
        System.out.println(solution2441.findMaxK(new int[]{-1,10,6,7,-7,1}));
        // -1
        System.out.println(solution2441.findMaxK(new int[]{-10,8,6,7,-2,-3}));
    }
}


// 9ms  13%
class Solution2441 {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 0; i--) {
            int i1 = Arrays.binarySearch(nums,-nums[i]);
            if (i1 >= 0) {
                return nums[i];
            }
        }
        return -1;
    }
}