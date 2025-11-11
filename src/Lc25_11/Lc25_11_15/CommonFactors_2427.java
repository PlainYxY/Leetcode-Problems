package Lc25_11.Lc25_11_15;

// [25.11.11] 公因子的数目
public class CommonFactors_2427 {
    public static void main(String[] args) {
        Solution2427 solution2427 = new Solution2427();

        // 4
        System.out.println(solution2427.commonFactors(12,6));
        // 2
        System.out.println(solution2427.commonFactors(25,30));
    }
}


class Solution2427 {
    public int commonFactors(int a, int b) {
        int ans = 0;
        int temp = Math.max(a, b);
        for (int i = 1; i <= temp; i++) {
            if (a % i == 0 && b % i == 0) {
                ans++;
            }
        }
        return ans;
    }
}