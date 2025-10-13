package Lc25_10.Lc25_10_15;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


// [25.10.13] 在长度2N的数组中找出重复N次的元素
/**
 * <li>给你一个整数数组 nums ，该数组具有以下属性：
 * <li>nums.length == 2 * n.
 * <li>nums 包含 n + 1 个 不同的 元素
 * <li>nums 中恰有一个元素重复 n 次
 * <li>找出并返回重复了 n 次的那个元素。
 */
public class RepeatedNTimes_961 {
    public static void main(String[] args) {
        Solution961 solution961 = new Solution961();

        // 3
        System.out.println(solution961.repeatedNTimes(new int[]{1,2,3,3}));
        // 2
        System.out.println(solution961.repeatedNTimes(new int[]{2,1,2,5,3,2}));
        // 5
        System.out.println(solution961.repeatedNTimes(new int[]{5,1,5,2,5,3,5,4}));
    }
}


// 1ms  66%
class Solution961 {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> intSet = new HashSet<>();
        for (int num : nums) {
            if (!intSet.add(num)) {
                return num;
            }
        }
        return 0;
    }
}


// 2ms  47%
/*
class Solution961 {
    public int repeatedNTimes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }
        return -1;
    }
}*/


// 19ms     14%
/*
class Solution961 {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length/2;
        Map<Integer, Integer> intMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            intMap.put(nums[i],intMap.getOrDefault(nums[i],0)+1);
        }
        for (int key : intMap.keySet()) {
            if (n == intMap.get(key)) return key;
        }
        return 0;
    }
}*/
