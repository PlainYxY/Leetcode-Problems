package Lc25_09.Lc25_09_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// [25.9.12] 找出数组排序后的目标下标
/**
 *<li>给你一个下标从 0 开始的整数数组 nums 以及一个目标元素 target 。
 * <li>目标下标 是一个满足 nums[i] == target 的下标 i 。
 * <li>将 nums 按 非递减 顺序排序后，返回由 nums 中目标下标组成的列表。如果不存在目标下标，返回一个 空 列表。返回的列表必须按 递增 顺序排列。
 */
public class TargetIndices_2089 {
    public static void main(String[] args) {
        Solution2089 solution2089 = new Solution2089();

        // [1,2]
        System.out.println(solution2089.targetIndices(new int[]{1,2,5,2,3}, 2));
        // [3]
        System.out.println(solution2089.targetIndices(new int[]{1,2,5,2,3}, 3));
        // [4]
        System.out.println(solution2089.targetIndices(new int[]{1,2,5,2,3}, 5));
        // []
        System.out.println(solution2089.targetIndices(new int[]{1,2,5,2,3}, 4));
    }
}


//
// 0ms  100%
class Solution2089 {
    public List<Integer> targetIndices(int[] nums, int target) {
        int count1 = 0;
        int count2 = 0;
        for (int i =0;i<nums.length;i++){
            if (nums[i]<target){
                count1++;
            }else if (nums[i]==target){
                count2++;
            }
        }
        List<Integer> ansList = new ArrayList<>();
        for (int i =0;i<count2;i++){
            ansList.add(count1++);
        }
        return ansList;
    }
}


// 2ms  81%
/*
class Solution2089 {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> arrList = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                arrList.add(i);
            }
        }
        return arrList;
    }
}*/
