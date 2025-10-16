package Lc25_10.Lc25_10_15;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// [25.10.16] 数字小镇中的捣蛋鬼
/**
 * <li>数字小镇 Digitville 中，存在一个数字列表 nums，其中包含从 0 到 n - 1 的整数。每个数字本应 只出现一次，然而，有 两个 顽皮的数字额外多出现了一次，使得列表变得比正常情况下更长。
 * <li>为了恢复 Digitville 的和平，作为小镇中的名侦探，请你找出这两个顽皮的数字。
 * <li>返回一个长度为 2 的数组，包含这两个数字（顺序任意）。
 */
public class GetSneakyNumbers_3289 {
    public static void main(String[] args) {
        Solution3289 solution3289 = new Solution3289();

        // [0,1]
        System.out.println(Arrays.toString(solution3289.getSneakyNumbers(new int[]{0,1,1,0})));
        // [2,3]
        System.out.println(Arrays.toString(solution3289.getSneakyNumbers(new int[]{0,3,2,1,3,2})));
        // [4,5]
        System.out.println(Arrays.toString(solution3289.getSneakyNumbers(new int[]{7,1,5,4,3,4,6,0,9,5,8,2})));
    }
}


// 1ms  93%
class Solution3289 {
    public int[] getSneakyNumbers(int[] nums) {
        int[] ints = new int[nums.length+2];
        int[] ansArr = new int[2];
        int count = 0;
        for (int i : nums) {
            if(++ints[i] == 2){
                ansArr[count++] = i;
            }
        }
        return ansArr;
    }
}


// 2ms  46%
// 放入Set中去重
/*
class Solution3289 {
    public int[] getSneakyNumbers(int[] nums) {
        Set<Integer> intSet = new HashSet<>();
        int count = 0;
        int[] ansArr = new int[2];
         for (int num : nums) {
             if (!intSet.add(num)){
                 ansArr[count] = num;
                 count++;
             }
             if (count == 2){
             return  ansArr;
             }
         }
        return  ansArr;
    }
}*/
