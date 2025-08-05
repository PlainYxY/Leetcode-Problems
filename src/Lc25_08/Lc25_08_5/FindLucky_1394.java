package Lc25_08.Lc25_08_5;

import java.util.HashMap;
import java.util.Map;

// [25.8.4] 找出数组中的幸运数
/*
在整数数组中，如果一个整数的出现频次和它的数值大小相等，我们就称这个整数为「幸运数」。
给你一个整数数组 arr，请你从中找出并返回一个幸运数。
    如果数组中存在多个幸运数，只需返回 最大 的那个。
    如果数组中不含幸运数，则返回 -1 。
*/
public class FindLucky_1394 {
    public static void main(String[] args) {
        System.out.println(findLucky(new int[]{4, 3, 2, 2, 4, 1, 3, 4, 3}));//3
        System.out.println(findLucky(new int[]{2, 2, 3, 4}));               //2
        System.out.println(findLucky(new int[]{1, 2, 2, 3, 3, 3}));         //3
        System.out.println(findLucky(new int[]{2, 2, 2, 3, 3}));            //-1
        System.out.println(findLucky(new int[]{5}));                        //-1
        System.out.println(findLucky(new int[]{7, 7, 7, 7, 7, 7, 7}));      //7
    }


    // 3.题友最速解法，（我没想出来）
    public static int findLucky(int[] arr) {
        int[] cnt = new int[501];

        for (int num : arr) {
            cnt[num]++;
        }

        for (int i = cnt.length - 1; i > 0; i--) {
            if (i == cnt[i]) {
                return i;
            }
        }
        return -1;
    }


    // 6ms  11%
    // 2.先把值放入 key，然后重复一次 Value 加 1 (都没两层嵌套for了，还TM这么慢)
    /*
    public static int findLucky(int[] arr) {
        int ans = -1;
        Map<Integer, Integer> integerHashMap = new HashMap<>();
        for (int num : arr) {
            if (integerHashMap.containsKey(num)) {
                integerHashMap.put(num, integerHashMap.get(num) + 1);
            } else
                integerHashMap.put(num, 1);
        }
        // 筛选 键\值相等的元素，并且要是最大的值
        for (Map.Entry<Integer, Integer> map : integerHashMap.entrySet()) {
            if (map.getKey().equals(map.getValue()) && map.getValue() > ans) {
                ans = map.getKey();
            }
            //这三行和上面效果一样
            //if (map.getKey().equals(map.getValue())) {
            //    ans = Math.max(ans, map.getValue());
            //}
        }
        return ans;
    }*/


    // 10ms  6%
    // 1.两层循环检测是否相同，相同则赋值为零,然后做if判断
    /*
    public static int findLucky(int[] arr) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            int num = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] - arr[i] == 0) {
                    num++;
                    arr[j] = 0;
                }
            }
            if (num > ans) {
                if (num == arr[i]) {
                    ans = num;
                }
            }
        }
        return ans;
    } */
}
