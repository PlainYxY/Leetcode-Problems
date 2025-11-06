package Lc25_11.Lc25_11_05;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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


// 3ms  96%
/*
class Solution2441 {
    public int findMaxK(int[] nums) {
        int[] ints = new int[1001];
        int ans = -1;
        for (int i = 0; i < nums.length; i++) {
            if(ints[Math.abs(nums[i])] == 0) {
                ints[Math.abs(nums[i])] += nums[i];
            }else if(ints[Math.abs(nums[i])] != 0 && ints[Math.abs(nums[i])]*nums[i] < 0){
                ans = Math.max(ans, Math.abs(nums[i]));
            }
        }
        return ans;
    }
}*/


// 7ms  50%
class Solution2441 {
    public int findMaxK(int[] nums) {
        int ans = -1;
        Set<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            hashSet.add(num);
            if (hashSet.contains(-num)) {
                ans = Math.max(ans, Math.abs(num));
            }
        }
        return ans;
    }
}


// 9ms  13%
/*
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
}*/
