package Lc25_09.Lc25_09_30;

import java.util.HashMap;
import java.util.Map;

// [25.9.30] 好数对的数目
/**
 * <li>给你一个整数数组 nums 。
 * <li>如果一组数字 (i,j) 满足 nums[i] == nums[j] 且 i < j ，就可以认为这是一组 好数对 。
 * <li>返回好数对的数目。
 */
public class NumIdenticalPairs_1512 {
    public static void main(String[] args) {
        Solution1512 solution1512 = new Solution1512();

        // 4
        System.out.println(solution1512.numIdenticalPairs(new int[]{1,2,3,1,1,3}));
        // 6
        System.out.println(solution1512.numIdenticalPairs(new int[]{1,1,1,1}));
        // 0
        System.out.println(solution1512.numIdenticalPairs(new int[]{1,2,3}));
    }
}


// 0ms  100%
// 根据给出的范围处理 (最速题解)
class Solution1512 {
    public int numIdenticalPairs(int[] nums) {
        int ans = 0;
        int[] arr =  new int[101];
        for (int i : nums) {
            ans += arr[i];
            arr[i]++;
        }
        return ans;
    }
}


// 2ms  1%
// 放入map中，每个数字出现次数见一，然后把所有出现的相加
/*class Solution1512 {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        int ans = 0;
        for (int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num, -1) + 1);
        }
        for(Integer value :hashMap.values()) {
            ans += value*(value+1)/2;
        }
        return ans;
    }
}
*/


// 1ms  76%
// 两层循环
/*class Solution1512 {
    public int numIdenticalPairs(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
*/
