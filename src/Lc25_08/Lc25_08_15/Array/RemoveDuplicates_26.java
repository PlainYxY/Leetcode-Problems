package Lc25_08.Lc25_08_15.Array;

import java.util.Arrays;

// [25.8.13(数组)] 删除排序数组中的重复项
/**
 * <li>给你一个 非严格递增排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。然后返回 nums 中唯一元素的个数。
 * <li>考虑 nums 的唯一元素的数量为 k ，你需要做以下事情确保你的题解可以被通过：4
 * <li>更改数组 nums ，使 nums 的前 k 个元素包含唯一元素，并按照它们最初在 nums 中出现的顺序排列。nums 的其余元素与 nums 的大小不重要。
 * <li>返回 k。
 */
public class RemoveDuplicates_26 {
    public static void main(String[] args) {
        Solution26 solution26 = new Solution26();

        // 2, nums = [1,2,_]
        System.out.println(solution26.removeDuplicates(new int[]{1,1,2}));
        // 5, nums = [0,1,2,3,4]
        System.out.println(solution26.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
}


// 1.快慢指针解
class Solution26 {
    public int removeDuplicates(int[] nums) {
        int ans = nums.length;
        int slow = 0, fast = 1;
        // 先给数组从小到大排序
        // Arrays.sort(nums);
        while (fast < nums.length) {
            if (nums[slow] == nums[fast]) {
                ans--;
                fast++;
            }else {
                slow++;
                nums[slow] = nums[fast];
                fast++;
            }
        }
        return ans;
    }
}
