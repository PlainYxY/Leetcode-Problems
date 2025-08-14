package Lc25_08.Lc25_08_15.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

//  [25.8.14](数组) 存在重复元素
/**
 * <li>给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；
 * <li>如果数组中每个元素互不相同，返回 false 。
 */
public class ContainsDuplicate_217 {
    public static void main(String[] args) {
        Solution217 solution217 = new Solution217();

        // true
        System.out.println(solution217.containsDuplicate(new int[]{1,2,3,1}));
        // false
        System.out.println(solution217.containsDuplicate(new int[]{1,2,3,4}));
        // true
        System.out.println(solution217.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }
}


// 21ms  16%
// 4.排序后，依次比较看看?
class Solution217 {
    public boolean containsDuplicate(int[] nums) {
        boolean ans = false;
        Arrays.sort(nums);
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return ans;
    }
}


// 15ms   56%
// 3.放map的key测?
/*
class Solution217 {
    public boolean containsDuplicate(int[] nums) {
        boolean ans = false;
        HashMap<Integer, Integer> intMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (intMap.containsKey(nums[i])) {
                return true;
            }
            intMap.put(nums[i], i);
        }
        return ans;
    }
}
*/


// 20ms  35%
// 2.放入不能重复的set，然后看两个长度是否相同
/*
class Solution217 {
    public boolean containsDuplicate(int[] nums) {
        boolean ans = false;
        HashSet<Integer> intSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            intSet.add(nums[i]);
        }
        if (intSet.size() != nums.length) {
            return true;
        }
        return ans;
    }
}
*/


// 超时，这题好狗，写了一个超级长的用例
// 1.嵌套for,
/*
class Solution217 {
    public boolean containsDuplicate(int[] nums) {
        boolean ans = false;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    ans = true;
                }
            }
        }
        return ans;
    }
}
*/
