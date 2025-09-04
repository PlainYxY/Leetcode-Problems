package Lc25_09.Lc25_09_05;

import java.util.Arrays;

// [25.9.4] 两个数对之间最大乘积差
/**
 * <li>两个数对 (a, b) 和 (c, d) 之间的 乘积差 定义为 (a * b) - (c * d) 。
 * <li>例如，(5, 6) 和 (2, 7) 之间的乘积差是 (5 * 6) - (2 * 7) = 16 。
 * <li>给你一个整数数组 nums ，选出四个 不同的 下标 w、x、y 和 z ，使数对 (nums[w], nums[x]) 和 (nums[y], nums[z]) 之间的 乘积差 取到 最大值 。
 * <li>返回以这种方式取得的乘积差中的 最大值 。
 */
public class MaxProductDifference_1913 {
    public static void main(String[] args) {
        Solution1913 solution1913 = new Solution1913();

        // 34
        System.out.println(solution1913.maxProductDifference(new int[]{5,6,2,7,4}));
        // 64
        System.out.println(solution1913.maxProductDifference(new int[]{4,2,5,9,7,4,8}));
    }
}


// 0ms  100%
// 循环第一次，把最大数和最小数拿出来，记录他们的下标，然后拿着下标赋值为-1，再第二次循环拿第二大和第二小的数
class Solution1913 {
    public int maxProductDifference(int[] nums) {
        int max1 = 0,max2 = 0,min1 = Integer.MAX_VALUE,min2 = Integer.MAX_VALUE;
        int MaxTemp = 0;
        int MinTemp = 0;
        // 先选出最大的和最小的
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                if (nums[i] > max1) {
                    max1 = nums[i];
                    MaxTemp = i;
                }
                if (nums[i] < min1) {
                    min1 = nums[i];
                    MinTemp = i;
                }
            }
        }
        // 把第一大和第一小的都变为-1
        nums[MaxTemp] = -1;
        nums[MinTemp] = -1;
        // 找到第二大和第二小的数
        for (int num : nums) {
            if (num > 0) {
                if (num > max2) {
                    max2 = num;
                }
                if (num < min2) {
                    min2 = num;
                }
            }
        }
        return max1*max2 - min1*min2;
    }
}


// 7ms  68%
// 排序然后筛选头尾各两个元素
/*
class Solution1913 {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length - 1] * nums[nums.length - 2] - nums[0] * nums[1];
    }
}*/
