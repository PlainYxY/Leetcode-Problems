package Lc25_08;

import java.util.Arrays;
import java.util.HashMap;

public class IpLose_1 {
    //两数之和
    //数组问题
    public static void main(String[] args) {
        // 示例测试
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        System.out.println("示例1: " + Arrays.toString(twoSum(nums1, target1))); // 输出 [0,1]

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        System.out.println("示例2: " + Arrays.toString(twoSum(nums2, target2))); // 输出 [1,2]

        int[] nums3 = {3, 3};
        int target3 = 6;
        System.out.println("示例3: " + Arrays.toString(twoSum(nums3, target3))); // 输出 [0,1]
    }

    public static int[] twoSum(int[] nums, int target) {

        //2ms   99%
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        //如果没有匹配成功，则返回空数组
        return new int[]{};

        //55ms  20%
        //先拿到数组两次遍历寻找
        //for (int i = 0; i < nums.length; i++) {
        //    for (int j = i + 1; j < nums.length; j++) {
        //        if (nums[i] + nums[j] == target) {
        //            return new int[]{i, j};
        //        }
        //    }
        //}
        ////如果没有匹配成功，则返回空数组
        //return new int[]{};
    }



}
