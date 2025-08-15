package Lc25_08.Lc25_08_15.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

// [25.8.14](数组) 只出现一次的数字
/**
 * <li>给你一个 非空 整数数组 nums ，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * <li>你必须设计并实现线性时间复杂度的算法来解决此问题，且该算法只使用常量额外空间。
 */
public class SingleNumber_136 {
    public static void main(String[] args) {
        Solution136 solution136 = new Solution136();

        // 1
        System.out.println(solution136.singleNumber(new int[]{2,2,1}));
        // 4
        System.out.println(solution136.singleNumber(new int[]{4,1,2,1,2}));
        // 1
        System.out.println(solution136.singleNumber(new int[]{1}));
    }
}
// 这个数组一定是奇数个，[1.可以放map里，检测谁的value是1。][2.排序后挨个检测]


// 3.看了题解,使用位运算
class Solution136 {
    public int singleNumber(int[] nums) {
        int ans = 0;

        return ans;
    }
}


// 13ms  8%
// 2.放入map的key,出现次数为value,然后找value为1的key
/*
class Solution136 {
    public int singleNumber(int[] nums) {
        int ans = 0;
        HashMap<Integer, Integer> intMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            intMap.put(nums[i], intMap.getOrDefault(nums[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> map : intMap.entrySet()) {
            if (map.getValue() == 1) {
                ans = map.getKey();
            }
        }
        return ans;
    }
}*/


// 6ms  19%
// 1.排序，然后两两比较
/*
class Solution136 {
    public int singleNumber(int[] nums) {
        int ans;
        int left = 0,right = 1;
        Arrays.sort(nums);
        while (right < nums.length) {
            if (nums[left] != nums[right]) {
                ans = nums[left];
                return ans;
            }
            left+=2;
            right+=2;
        }
        // 能运行到这里,说明在最后一位
        ans = nums[nums.length-1];
        return ans;
    }
}*/
