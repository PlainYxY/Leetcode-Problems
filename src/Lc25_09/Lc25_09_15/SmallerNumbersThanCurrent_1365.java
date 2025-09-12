package Lc25_09.Lc25_09_15;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// [25.9.12] 有多少小于当前数字的数字
/**
 *<li>给你一个数组 nums，对于其中每个元素 nums[i]，请你统计数组中比它小的所有数字的数目。
 * <li>换而言之，对于每个 nums[i] 你必须计算出有效的 j 的数量，其中 j 满足 j != i 且 nums[j] < nums[i] 。
 * <li>以数组形式返回答案。
 */
public class SmallerNumbersThanCurrent_1365 {
    public static void main(String[] args) {
        Solution1365 solution1365 = new Solution1365();

        // [4,0,1,1,3]
        System.out.println(Arrays.toString(solution1365.smallerNumbersThanCurrent(new int[]{8,1,2,2,3})));
        // [2,1,0,3]
        System.out.println(Arrays.toString(solution1365.smallerNumbersThanCurrent(new int[]{6,5,4,8})));
        // [0,0,0,0]
        System.out.println(Arrays.toString(solution1365.smallerNumbersThanCurrent(new int[]{7,7,7,7})));
    }
}


// 0ms  100%
class Solution1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] map = new int[110];
        for (int num : nums) {
            map[num]++;
        }

        int[] res = new int[110];
        int ss = 0;
        for(int i =0 ;i<=100; i++){
            res[i] =ss ;
            ss+= map[i];
        }

        int[] ans = new int[nums.length];
        for(int i =0 ;i< nums.length ; i++){
            ans[i] = res[nums[i]];
        }
        return ans ;
    }
}


// 4ms  76%
/*
class Solution1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ansArr = new int[nums.length];
        int[] copyArr = nums.clone();
        Arrays.sort(copyArr);
        Map<Integer, Integer> intMap = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < copyArr.length; i++) {
            // 12238
            if (i != 0 && copyArr[i] == copyArr[i-1]) {
                sum++;
                continue;
            }
            intMap.put(copyArr[i], sum);
            sum++;
        }
        for (int i = 0; i < ansArr.length; i++) {
            ansArr[i] = intMap.get(nums[i]);
        }
        return ansArr;
    }
}*/


// 11ms  12%
/*class Solution1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ansArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int num = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    num++;
                }
            }
            ansArr[i] = num;
        }
        return ansArr;
    }
}*/
