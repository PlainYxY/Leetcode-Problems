package Lc25_08.Lc25_08_15.Array;

// [25.8.14](数组) 买卖股票的最佳时机
/**
 * <li>给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
 * <li>你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
 * <li>返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
 */
public class MaxProfit_121 {
    public static void main(String[] args) {
        Solution121 solution121 = new Solution121();

        // 5
        System.out.println(solution121.maxProfit(new int[]{7,1,5,3,6,4}));
        // 0
        System.out.println(solution121.maxProfit(new int[]{7,6,4,3,1}));
    }
}


// 1ms  100%
// 1.快慢指针，
class Solution121 {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int slow = 0;
        for (int fast = 0; fast < prices.length; fast++) {
            // 如果数小，就把慢指针移到这里
            if (prices[fast] < prices[slow]) {
                slow = fast;
            // 减数大于已存数，则替换
            }else if (prices[fast] - prices[slow] > ans) {
                ans = prices[fast] - prices[slow];
            }
        }
        return ans;
    }
}