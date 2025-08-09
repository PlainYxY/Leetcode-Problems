package Lc25_08.Lc25_08_10;

import java.util.Arrays;

// [25.8.9] 移除元素
/**
 * <li> 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素。
 * <li> 元素的顺序可能发生改变。然后返回 nums 中与 val 不同的元素的数量。
 * <li> 假设 nums 中不等于 val 的元素数量为 k，要通过此题，您需要执行以下操作：
 * <li> 更改 nums 数组，使 nums 的前 k 个元素包含不等于 val 的元素。nums 的其余元素和 nums 的大小并不重要。
 * <li> 返回 k。
 */
public class RemoveElement_27 {
    public static void main(String[] args) {
        Solution27 solution27 = new Solution27();

        // 2, nums = [2,2,_,_]
        System.out.println(solution27.removeElement(new int[]{3,2,2,3}, 3));
        // 5, nums = [0,1,4,0,3,_,_,_]
        System.out.println(solution27.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
        // 1, nums = [5,_]
        System.out.println(solution27.removeElement(new int[]{4,5}, 4));
        // 1, nums = [2]
        System.out.println(solution27.removeElement(new int[]{2}, 3));
    }
}


// 0ms  100%
// 2.如何不等于目标数，就把值赋给慢指针，然后 慢指针++
class Solution27 {
    public int removeElement(int[] nums, int val) {
        // 给我想出来 快慢指针解法！！！
        int ans, slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        ans = slow;
        // System.out.println(Arrays.toString(nums));
        return ans;
    }
}


// 0ms  100%
// 1.自己一直debug想出来的shit代码，这么简单的都不会，太丢人了
/*
class Solution27 {
    public int removeElement(int[] nums, int val) {
        int slow = 0,fast = 0, ans;
        while (fast < nums.length) {
            if (fast >  slow && nums[fast] != val) {
                nums[slow] = nums[fast];
                nums[fast] = -1;
            }else if (fast > 1 && fast == nums.length-1 && nums[fast] == val) {
                nums[fast] = -1;
            }
            if (nums[slow] != val && nums[slow] != -1) {
                slow++;
            }
            fast++;
        }
        ans = slow;
        return ans;
    }
}
*/