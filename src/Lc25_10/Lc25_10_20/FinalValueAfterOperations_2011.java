package Lc25_10.Lc25_10_20;

// [25.10.20] 执行操作后的变量值
/**
 *<li>存在一种仅支持 4 种操作和 1 个变量 X 的编程语言：
 * <li>++X 和 X++ 使变量 X 的值 加 1
 * <li>--X 和 X-- 使变量 X 的值 减 1
 * <li>最初，X 的值是 0
 */
public class FinalValueAfterOperations_2011 {
    public static void main(String[] args) {
        Solution2011 solution2011 = new Solution2011();

        // 1
        System.out.println(solution2011.finalValueAfterOperations(new String[]{"--X","X++","X++"}));
        // 3
        System.out.println(solution2011.finalValueAfterOperations(new String[]{"++X","++X","X++"}));
        // 0
        System.out.println(solution2011.finalValueAfterOperations(new String[]{"X++","++X","--X","X--"}));
    }
}


// 0ms  100%
class Solution2011 {
    public int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for (String operation : operations) {
            if (operation.charAt(1) == '+') {
                ans++;
            }else {
                ans--;
            }
        }
        return ans;
    }
}