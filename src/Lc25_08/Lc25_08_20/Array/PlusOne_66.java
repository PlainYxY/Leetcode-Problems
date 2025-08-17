package Lc25_08.Lc25_08_20.Array;

import java.util.Arrays;

// [25.8.17](数组) 加一
/**
 * <li>给定一个表示 大整数 的整数数组 digits，其中 digits[i] 是整数的第 i 位数字。
 * 这些数字按从左到右，从最高位到最低位排列。这个大整数不包含任何前导 0。
 * <li>将大整数加 1，并返回结果的数字数组。
 */
public class PlusOne_66 {
    public static void main(String[] args) {
        Solution66 solution66 = new Solution66();

        // [1,2,4]
        System.out.println(Arrays.toString(solution66.plusOne(new int[]{1, 2, 3})));
        // [4,3,2,2]
        System.out.println(Arrays.toString(solution66.plusOne(new int[]{4,3,2,1})));
        // [1,0]
        System.out.println(Arrays.toString(solution66.plusOne(new int[]{9})));
        // [9,8,7,6,5,4,3,2,1,1]
        System.out.println(Arrays.toString(solution66.plusOne(new int[]{9,8,7,6,5,4,3,2,1,0})));
    }
}


// 2.从后往前判断，值为9则赋0，不为则是后一位的9加了1，进前一位，所以++
//      特殊情况是全为9，则数组加一位，然后首位为1，其余全为0
class Solution66 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            }else {
                digits[i]++;
                return digits;
            }
        }
        int[] ansArr = new int[digits.length+1];
        ansArr[0] = 1;
        return  ansArr;
    }
}


//1. 这方法行不通，会越界int
/*
class Solution66 {
    public int[] plusOne(int[] digits) {
        int num = 1;
        int index = digits.length-1;
        for (int i = 0;  i < digits.length; i++) {
            num += (int) (digits[i] * Math.pow(10, index));
            index--;
        }
        System.out.println(num);
        int digit = String.valueOf(Math.abs(num)).length();
        int[] ansArr = new int[digit];
        for (int i = digit - 1; i >= 0; i--) {
            ansArr[i] = num % 10;
            num /= 10;
        }
        return  ansArr;
    }
}*/
