package Lc25_08.Lc25_08_10;

import java.util.Arrays;
import java.util.HashMap;

//  [25.8.7] 两数之和||-输入有序数组
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
// 2.双指针解法，（相加之和 与目标数的比较）（左右数和目标数的比较，设置左数小于等于目标数，右数大于目标数字）
class SolutionLCR6 {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        while (left < right) {
            //等于
            if (numbers[left] + numbers[right] == target) {
                return new int[]{left,right};
            }
            //相加大于目标数
            else if (numbers[left] + numbers[right] > target) {
                left++;
                if (numbers[left] + numbers[right] == target) {
                    return new int[]{left,right};
                }
                right--;
                if (numbers[left] + numbers[right] == target) {
                    return new int[]{left,right};
                }
            }
            //相加小于目标数
            else {
                right++;
                if (numbers[left] + numbers[right] == target) {
                    return new int[]{left+1,right+1};
                }
                left--;
                if (numbers[left] + numbers[right] == target) {
                    return new int[]{left+1,right+1};
                }
            }
        }
        return new int[]{};
    }
}


// 2ms  16%
// 1.这是力扣第一题-<两数之和>的解法，速度还是慢
/*
class SolutionLCR6 {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(numbers[i], i);
        }
        //如果没有匹配成功，则返回空数组
        return new int[]{};
    }
}*/
