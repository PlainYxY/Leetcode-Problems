package Lc25_10.Lc25_10_20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// [25.10.20] 统计和小于目标的下标对数目
/**
 * <li>给你一个下标从 0 开始长度为 n 的整数数组 nums 和一个整数 target ，
 * <li>请你返回满足 0 <= i < j < n 且 nums[i] + nums[j] < target 的下标对 (i, j) 的数目。
 */
public class CountPairs_2824 {
    public static void main(String[] args) {
        Solution2824 solution2824 = new Solution2824();

        // todo    List集合初始化赋值的两种方法     1.Array.asList()  2.List.of()
        //          还有 Set 和 Map的，查询一下

        // 3
        System.out.println(solution2824.countPairs(new ArrayList<>(List.of(-1,1,2,3,1)),2));
        // 10
        System.out.println(solution2824.countPairs(new ArrayList<>(Arrays.asList(-6,2,5,-2,-7,-1,3)),-2));
    }
}


// 2ms  98%
class Solution2824 {
    public int countPairs(List<Integer> nums, int target) {
        int ans = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    ans++;
                }
            }
        }
        return ans;
    }
}