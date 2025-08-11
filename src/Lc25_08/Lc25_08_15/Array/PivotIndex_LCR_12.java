package Lc25_08.Lc25_08_15.Array;

// [25.8.11(数组)] 寻找数组的中心索引
/**
 * <li> 给你一个整数数组 nums ，请计算数组的 中心下标 。
 * <li> 数组 中心下标 是数组的一个下标，其左侧所有元素相加的和等于右侧所有元素相加的和。
 * <li> 如果中心下标位于数组最左端，那么左侧数之和视为 0 ，因为在下标的左侧不存在元素。这一点对于中心下标位于数组最右端同样适用。
 * <li> 如果数组有多个中心下标，应该返回 最靠近左边 的那一个。如果数组不存在中心下标，返回 -1 。
 */
public class PivotIndex_LCR_12 {
    public static void main(String[] args) {
        SolutionLCR12 solutionLCR12 = new SolutionLCR12();

        // 3
        System.out.println(solutionLCR12.pivotIndex(new int[]{1,7,3,6,5,6}));
        // -1
        System.out.println(solutionLCR12.pivotIndex(new int[]{1,2,3}));
        // 0
        System.out.println(solutionLCR12.pivotIndex(new int[]{2,1,-1}));
        // -1
        System.out.println(solutionLCR12.pivotIndex(new int[]{-1,-1,-1,-1,-1,-1}));
    }
}


// 0ms 100%
// 把判断用减法，然后直接写if里面
class SolutionLCR12 {
    public int pivotIndex(int[] nums) {
        int ans = -1;
        int sum = 0;
        int leftSum = 0;
        for (int num : nums) {
            sum += num;
        }
        for (int i = 0; i < nums.length; i++) {
            if (sum - nums[i] - leftSum == leftSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return ans;
    }
}


// 1ms  67%（我靠，还有神人？）
// 有这样一个思路，先把所有元素遍历相加，然后再次遍历，
// 和 减去 遍历到的元素i，然后除以2，看是否等于i之前的所有的和。
/*
class SolutionLCR12 {
    public int pivotIndex(int[] nums) {
        int ans = -1;
        float sum = 0;
        int leftSum = 0;
        double count;
        for (int num : nums) {
            sum += num;
        }
        for (int i = 0; i < nums.length; i++) {
            count = (sum - nums[i]) / 2;
            if (count == leftSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return ans;
    }
}
*/


// 378ms    6%
// 1.题友的解法，嵌套循环，算左右和是否相等
/*
class SolutionLCR12 {
    public int pivotIndex(int[] nums) {
        int ans = -1;
        int leftSum = 0, rightSum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length-1; j > i; j--) {
                rightSum += nums[j];
            }
            if (leftSum == rightSum) {
                return i;
            }
            rightSum = 0;
            leftSum += nums[i];
        }
        return ans;
    }
}
*/
