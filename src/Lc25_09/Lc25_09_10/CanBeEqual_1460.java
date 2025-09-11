package Lc25_09.Lc25_09_10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// [25.9.10] 通过反转子数组使两个数组相等
/**
 * <li>给你两个长度相同的整数数组 target 和 arr 。每一步中，你可以选择 arr 的任意 非空子数组 并将它翻转。你可以执行此过程任意次。
 * <li>如果你能让 arr 变得与 target 相同，返回 True；否则，返回 False 。
 */
public class CanBeEqual_1460 {
    public static void main(String[] args) {
        Solution1460 solution1460 = new Solution1460();
        // true
        System.out.println(solution1460.canBeEqual(new int[] {1,2,3,4}, new int[] {2,4,1,3}));
        // true
        System.out.println(solution1460.canBeEqual(new int[] {7}, new int[] {7}));
        // false
        System.out.println(solution1460.canBeEqual(new int[] {3,7,9}, new int[] {3,7,11}));
    }
}


// 11ms  12%
class Solution1460 {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int num1 : target) {
            map1.put(num1, map1.getOrDefault(num1,0)+1);
        }
        for (int num2 : arr) {
            map2.put(num2, map2.getOrDefault(num2,0)+1);
        }
        for (int count : map1.keySet()) {
            int value  = map1.get(count);
            if (!map2.containsKey(count) || map2.get(count) != value) {
                return false;
            }
        }
        return true;
    }
}


// 4ms  25%
// 3.先把两个数组排序，然后逐个比较
/*
class Solution1460 {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(arr);
        Arrays.sort(target);
        return Arrays.equals(arr,target);
    }
}*/


// 3ms  80%
// 2.先把两个数组排序，然后逐个比较
/*
class Solution1460 {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(arr);
        Arrays.sort(target);
        for (int i = 0; i < target.length; i++) {
            if (target[i] != arr[i]) {
                return false;
            }
        }
        return true;
    }
}*/


// 8ms  15%
// 1.将一个数组放入map中，然后遍历另一个检测
/*
class Solution1460 {
    public boolean canBeEqual(int[] target, int[] arr) {
        if (target.length != arr.length) {
            return false;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : target) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num,map.get(num)-1);
            }else return false;
        }
        for (int num : map.keySet()) {
            if (map.get(num) != 0)
                return false;
        }
        return true;
    }
}*/
