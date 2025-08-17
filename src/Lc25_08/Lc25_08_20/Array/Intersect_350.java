package Lc25_08.Lc25_08_20.Array;

import java.util.*;

// [25.8.16](数组) 两个数组的交集 Ⅱ
/**
 * <li>给你两个整数数组 nums1 和 nums2 ，请你以数组形式返回两数组的交集。
 * <li>返回结果中每个元素出现的次数，应与元素在两个数组中都出现的次数一致（如果出现次数不一致，则考虑取较小值）。
 * <li>可以不考虑输出结果的顺序。
 */
public class Intersect_350 {
    public static void main(String[] args) {
        Solution350 solution350 = new Solution350();

        // [2,2]
        System.out.println(Arrays.toString(solution350.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
        // [4,9]
        System.out.println(Arrays.toString(solution350.intersect(new int[]{4,9,5}, new int[]{9,4,9,8,4})));
    }
}


// 3ms  71%
// 1.先放到map里，然后第二次筛选遍历到list中，最后写到新数组中
class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        // 先把num1放进map
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // 新建List后，遍历寻找num2里与num1相同的，并且记录次数
        List<Integer> list = new ArrayList<>();
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                list.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        // 新建数组，然后把List写进去
        int[] ansArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ansArr[i] = list.get(i);
        }
        return ansArr;
    }
}
