package Lc25_09.Lc25_09_05;

// [25.9.4] 最小偶倍数
/**
 * <li>给你一个正整数 n ，返回 2 和 n 的最小公倍数（正整数）。
 */
public class SmallestEvenMultiple_2413 {
    public static void main(String[] args) {
        Solution2413 solution2413 = new Solution2413();

        // 10
        System.out.println(solution2413.smallestEvenMultiple(5));
        // 6
        System.out.println(solution2413.smallestEvenMultiple(6));
    }
}


// 整活题解
class Solution2413 {
    public int smallestEvenMultiple(int n) {
        return n+ n%2 * n;
    }
}


// 看题解优化
/*
class Solution2413 {
    public int smallestEvenMultiple(int n) {
        if (n % 2 == 0) return n;
        return 2*n;
    }
}*/


// 0ms  100%
/*
class Solution2413 {
    public int smallestEvenMultiple(int n) {
        if (n == 2) {
            return 2;
        }
        int temp = 2;
        while (temp <= n*2) {
            if (temp % n == 0 && temp % 2 == 0) {
                return temp;
            }
            temp++;
        }
        return -1;
    }
}*/
