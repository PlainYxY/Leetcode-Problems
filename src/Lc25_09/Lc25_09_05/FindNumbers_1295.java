package Lc25_09.Lc25_09_05;

public class FindNumbers_1295 {
    public static void main(String[] args) {
        Solution1295 solution1295 = new Solution1295();

        // 2
        System.out.println(solution1295.findNumbers(new int[]{12,345,2,6,7896}));
        // 1
        System.out.println(solution1295.findNumbers(new int[]{555,901,482,1771}));
    }
}


// 0ms  100%
// TODO log函数可以统计数字的整数位个数
class Solution1295 {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            int v = (int)Math.log10(num);
            if ((v % 2) == 1) {
                ans++;
            }
        }
        return ans;
    }
}


// 2ms  40%
// 检验长度
/*
class Solution1295 {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            String numStr = String.valueOf(num);
            if (numStr.length() % 2 == 0) {
                ans++;
            }
        }
        return ans;
    }
}*/
