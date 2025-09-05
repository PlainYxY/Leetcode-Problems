package Lc25_09.Lc25_09_05;

// [25.9.4] 多数元素

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <li>给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 * <li>你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 */
public class MajorityElement_169 {
    public static void main(String[] args) {
        Solution169 solution169 = new Solution169();

        // 3
        System.out.println(solution169.majorityElement(new int[]{3,2,3}));
        // 2
        System.out.println(solution169.majorityElement(new int[]{2,2,1,1,1,2,2}));
    }
}


// 3. todo 投票算法
/*
class Solution169 {
    public int majorityElement(int[] nums) {
        return 0;
    }
}*/


// 2.排序，然后取中间值
class Solution169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}


// 14ms  17%
/*
class Solution169 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                return entry.getKey();
            }
        }
        return -1;
    }
}*/
