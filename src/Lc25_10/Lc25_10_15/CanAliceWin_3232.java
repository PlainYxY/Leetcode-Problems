package Lc25_10.Lc25_10_15;

public class CanAliceWin_3232 {
    public static void main(String[] args) {
        Solution3232 solution3232 = new Solution3232();

        // false
        System.out.println(solution3232.canAliceWin(new int[]{1,2,3,4,10}));
        // true
        System.out.println(solution3232.canAliceWin(new int[]{1,2,3,4,5,14}));
        // true
        System.out.println(solution3232.canAliceWin(new int[]{5,5,5,25}));
    }
}


// 0ms  100%
class Solution3232 {
    public boolean canAliceWin(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            if (num < 10) {
                sum += num;
            } else {
                sum -= num;
            }
        }
        return sum != 0;
    }
}