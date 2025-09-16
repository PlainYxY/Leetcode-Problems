package Lc25_09.Lc25_09_20;

import java.util.Arrays;

// [25.9.16] 特殊元素平方和
/**
 *<li>给你一个数字数组 arr 。
 * <li>如果一个数列中，任意相邻两项的差总等于同一个常数，那么这个数列就称为 等差数列 。
 * <li>如果可以重新排列数组形成等差数列，请返回 true ；否则，返回 false 。
 */
public class CanMakeArithmeticProgression_1502 {
    public static void main(String[] args) {
        Solution1502 solution1502 = new Solution1502();

        // true
        System.out.println(solution1502.canMakeArithmeticProgression(new int[]{3,5,1}));
        // false
        System.out.println(solution1502.canMakeArithmeticProgression(new int[]{1,2,4}));
    }
}


// 1ms  95%
class Solution1502 {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i]-arr[i-1] != arr[i+1]-arr[i]) {
                return false;
            }
        }
        return true;
    }
}
