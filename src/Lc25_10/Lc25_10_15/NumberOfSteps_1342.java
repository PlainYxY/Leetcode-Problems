package Lc25_10.Lc25_10_15;

public class NumberOfSteps_1342 {
    public static void main(String[] args) {
        Solution1342 solution1342 = new Solution1342();

        // 6
        System.out.println(solution1342.numberOfSteps(14));
        // 4
        System.out.println(solution1342.numberOfSteps(8));
        // 12
        System.out.println(solution1342.numberOfSteps(123));
    }
}


// 0ms  100%
class Solution1342 {
    public int numberOfSteps(int num) {
        int ans = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
                ans++;
            }else {
                num--;
                ans++;
            }
        }
        return ans;
    }
}
