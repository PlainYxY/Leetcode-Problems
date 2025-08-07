package Lc25_08.Lc25_08_10;

import java.util.Arrays;

//  [25.8.7] 有序数组的平方
/**
 *给定一个已按照 升序排列  的整数数组 numbers ，请你从数组中找出两个数满足相加之和等于目标数 target。
 * 函数应该以长度为 2 的整数数组的形式返回这两个数的下标值。numbers 的下标 从 0 开始计数，
 * 所以答案数组应当满足 0 <= answer[0] < answer[1] < numbers.length。
 * 假设数组中存在且只存在一对符合条件的数字，同时一个数字不能使用两次。
 */
public class twoSum_LCR_6 {
    public static void main(String[] args) {
        SolutionLCR6 solutionLCR6 = new SolutionLCR6();

        // 输出：[1,3]
        int[] ints1 = solutionLCR6.twoSum(new int[]{1,2,4,6,10}, 8);
        System.out.println(Arrays.toString(ints1));
        //输出：[0,2]
        int[] ints2 = solutionLCR6.twoSum(new int[]{2,3,4}, 6);
        System.out.println(Arrays.toString(ints2));
        //输出：[0,1]
        int[] ints3 = solutionLCR6.twoSum(new int[]{-1,0}, -1);
        System.out.println(Arrays.toString(ints3));
    }
}


//
// 1.
class SolutionLCR6 {
    public int[] twoSum(int[] numbers, int target) {
        return  null;
    }
}
