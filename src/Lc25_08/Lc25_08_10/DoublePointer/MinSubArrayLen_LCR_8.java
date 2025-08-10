package Lc25_08.Lc25_08_10.DoublePointer;

// [ 25.8.10（快慢指针）] 长度最小的子数组
/**
 * <li> 给定一个含有 n 个正整数的数组和一个正整数 target 。
 * <li> 找出该数组中满足其和 ≥ target 的长度最小的 连续子数组 [numsl, numsl+1, ..., numsr-1, numsr]，
 * 并返回其长度。如果不存在符合条件的子数组，返回 0 。
 */
public class MinSubArrayLen_LCR_8 {
    public static void main(String[] args) {
        Solution8 solution8 = new Solution8();
        // 2
        System.out.println(solution8.minSubArrayLen(7,new int[]{2,3,1,2,4,3}));
        // 1
        System.out.println(solution8.minSubArrayLen(4,new int[]{1,4,4}));
        // 0
        System.out.println(solution8.minSubArrayLen(11,new int[]{1,1,1,1,1,1,1,1}));
        // 3
        System.out.println(solution8.minSubArrayLen(11,new int[]{1,2,3,4,5}));
    }
}

// 2.官方-滑动窗口解法
class Solution8 {
    public int minSubArrayLen(int target, int[] nums) {
        int ans = Integer.MAX_VALUE;
        int slow = 0;
        int sum = 0;
        int count;
        for (int fast = 0; fast < nums.length; fast++) {
            sum += nums[fast];
            while (sum >= target) {
                count = fast - slow + 1;
                ans = Math.min(ans,count);
                sum -= nums[slow];
                slow++;
            }
        }
        if (ans == Integer.MAX_VALUE) {
            return 0;
        }
        return ans;
    }
}


// 114ms    7%
// 1.自己想出来的，太复杂了
/*
class Solution8 {
    public int minSubArrayLen(int target, int[] nums) {
        int count, ans = Integer.MAX_VALUE, fast = 0;
        // 循环慢指针
        for (int slow = 0; slow < nums.length; slow++) {
            int temp = target;
            // 用快指针统计长度

            while (fast < nums.length) {
                temp -= nums[fast];
                if (temp <= 0) {
                    break;
                }
                fast++;
            }
            if (fast == nums.length && temp > 0 && ans == Integer.MAX_VALUE) {
                return 0;
            } else if (temp <= 0) {
                count = fast - slow + 1;
                ans = Math.min(ans, count);
            }
            //末位问题
            if (slow <= nums.length - 2)
                fast = slow + 1;
            else
                fast = slow;
        }
        return ans;
    }
}
*/
