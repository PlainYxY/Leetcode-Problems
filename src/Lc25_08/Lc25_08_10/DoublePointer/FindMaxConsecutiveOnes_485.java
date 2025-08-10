package Lc25_08.Lc25_08_10.DoublePointer;

// [25.8.9（快慢指针）] 最大连续1的个数
/**
 * 给定一个二进制数组 nums ， 计算其中最大连续 1 的个数。
 */
public class FindMaxConsecutiveOnes_485 {
    public static void main(String[] args) {
        Solution485 solution485 = new Solution485();

        // 3
        System.out.println(solution485.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
        // 2
        System.out.println(solution485.findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1}));
        // 2
        System.out.println(solution485.findMaxConsecutiveOnes(new int[]{1,1,0,1}));
    }
}


// 官方题解，把 数字比较 换成Math函数，选出最大的
class Solution485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0,count = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                ans = Math.max(ans, count);
                count = 0;
            }
        }
        ans = Math.max(ans, count);
        return ans;
    }
}


// 2ms  60%
// 2.用数字累加来代替长度表示
/*
class Solution485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0,count = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] == 1) {
                count++;
            }else
                count = 0;
            if (count > ans) {
                ans = count;
            }
        }
        return ans;
    }
}
*/


// 2ms  60%
// 1.快慢指针来统计连续1的最大值
/*
class Solution485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0, slow = -1;
        for (int fast = 0; fast < nums.length; fast++) {
            // 如果快指针值为0，则把慢指针定位到此
            if (nums[fast] == 0) {
                slow = fast;
            }else if (fast -  slow > ans)
                ans = fast -  slow;
        }
        return ans;
    }
}
*/
