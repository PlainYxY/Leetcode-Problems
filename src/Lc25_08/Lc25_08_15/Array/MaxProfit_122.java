package Lc25_08.Lc25_08_15.Array;

//  [25.8.13(数组)] 买卖股票的最佳时机 II
/**
 * <li>给你一个整数数组 prices ，其中 prices[i] 表示某支股票第 i 天的价格。
 * <li>在每一天，你可以决定是否购买和/或出售股票。你在任何时候 最多 只能持有 一股 股票。你也可以先购买，然后在 同一天 出售。
 * <li>返回 你能获得的 最大 利润 。
 */
public class MaxProfit_122 {
    public static void main(String[] args) {
        Solution122 solution122 = new Solution122();

        // 7
        System.out.println(solution122.maxProfit(new int[]{7,1,5,3,6,4}));
        // 4
        System.out.println(solution122.maxProfit(new int[]{1,2,3,4,5}));
        // 0
        System.out.println(solution122.maxProfit(new int[]{7,6,4,3,1}));
    }
}


// 1.
class Solution122 {
    public int maxProfit(int[] prices) {
        int ans = 0;

        return ans;
    }
}
