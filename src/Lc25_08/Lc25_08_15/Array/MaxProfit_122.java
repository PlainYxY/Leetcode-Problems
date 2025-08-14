package Lc25_08.Lc25_08_15.Array;

// [25.8.14](数组 贪心) 买卖股票的最佳时机 II
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


// 0ms  100%
// 1.看了题解这句（炒股的我一眼看出只要算上涨的波段即可，不愧是老股民）
// NB,这道题我原来想复杂，一直想不出来，直到看到这句话，醍醐灌顶
// todo 思路对了，解题很快
class Solution122 {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int slow = 0;
        for (int fast = 1; fast < prices.length; fast++) {
            if (prices[fast] > prices[slow]) {
                ans += prices[fast] - prices[slow];
                slow++;
            }else slow++;
        }
        return ans;
    }
}
