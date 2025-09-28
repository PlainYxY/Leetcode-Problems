package Lc25_09.Lc25_09_25;

// [25.9.28] 找出数组相加的整数 |
/**
 * <li>给你一个下标从 0 开始、长度为 n 的整数数组 nums ，以及整数 indexDifference 和整数 valueDifference 。
 * <li>你的任务是从范围 [0, n - 1] 内找出  2 个满足下述所有条件的下标 i 和 j ：
 * <li>abs(i - j) >= indexDifference 且
 * <li>abs(nums[i] - nums[j]) >= valueDifference
 * <li>返回整数数组 answer。如果存在满足题目要求的两个下标，则 answer = [i, j] ；否则，answer = [-1, -1] 。如果存在多组可供选择的下标对，只需要返回其中任意一组即可。
 * <li>注意：i 和 j 可能 相等 。
 */
public class FindIndices_3131 {
    public static void main(String[] args) {
        Solution3131 solution3131 = new Solution3131();

        // 3
        System.out.println(solution3131.addedInteger(new int[]{2,6,4},new int[]{9,7,5}));
        // -5
        System.out.println(solution3131.addedInteger(new int[]{10},new int[]{5}));
        // 0
        System.out.println(solution3131.addedInteger(new int[]{1,1,1,1},new int[]{1,1,1,1}));
    }
}


// 找出最大或者最小值，然后求差值
class Solution3131 {
    public int addedInteger(int[] nums1, int[] nums2) {
        return minDiff(nums2) - minDiff(nums1);
    }
    public int minDiff(int[] arr) {
        int value = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i < value) {
                value = i;
            }
        }
        return value;
    }
}


// 求和，然后求平均值
/*class Solution3131 {
    public int addedInteger(int[] nums1, int[] nums2) {
        int ans;
        int temp = 0;
        int sum = 0;
        while (temp < nums2.length) {
            sum += (nums2[temp]-nums1[temp]);
            temp++;
        }
        ans = sum/nums2.length;
        return ans;
    }
}
*/
