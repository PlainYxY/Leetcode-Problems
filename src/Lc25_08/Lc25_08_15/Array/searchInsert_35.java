package Lc25_08.Lc25_08_15.Array;

//  [25.8.11(数组)] 搜索插入位置
/**
 * <li>给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
 *     如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * <li>请必须使用时间复杂度为 O(log n) 的算法。
 */
public class searchInsert_35 {
    public static void main(String[] args) {
        Solution35 solution35 = new Solution35();

        // 2
        System.out.println(solution35.searchInsert(new int[]{1,3,5,6}, 5));
        // 1
        System.out.println(solution35.searchInsert(new int[]{1,3,5,6}, 2));
        // 4
        System.out.println(solution35.searchInsert(new int[]{1,3,5,6}, 7));
    }
}


// todo 未来用二分查找做一下
class Solution35 {
    public int searchInsert(int[] nums, int target) {
        return 0;
    }
}


// 0ms  100%    O(N)
// 简单题简单做
/*
class Solution35 {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
}
*/
