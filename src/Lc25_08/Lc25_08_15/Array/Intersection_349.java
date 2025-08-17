package Lc25_08.Lc25_08_15.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// [25.8.15](数组) 两个数组的交集
/**
 * <li>给定两个数组 nums1 和 nums2 ，返回 它们的 交集 。输出结果中的每个元素一定是 唯一 的。我们可以 不考虑输出结果的顺序 。
 */
public class Intersection_349 {
    public static void main(String[] args) {
        Solution349 solution349 = new Solution349();

        // [2]
        System.out.println(Arrays.toString(solution349.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
        // [9,4] 或者 [4,9]
        System.out.println(Arrays.toString(solution349.intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4})));
        // [1,2]
        System.out.println(Arrays.toString(solution349.intersection(new int[]{1, 2, 2, 1}, new int[]{1, 2})));
    }
}


// 2.将第一个数组放入Set，然后再在第二个里检测,最后遍历进数组
class Solution349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> intSet1 = new HashSet<>();
        Set<Integer> intSet2 = new HashSet<>();
        for (int j : nums1) {
            intSet1.add(j);
        }
        for (int k : nums2) {
            if (intSet1.contains(k)) {
                intSet2.add(k);
            }
        }
        int[] res = new int[intSet2.size()];
        int index = 0;
        for (int num : intSet2) {
            res[index++] = num;
        }
        return  res;
    }
}


// 1.先来两层for循环尝尝味
/*
class Solution349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] ansArr = new int[nums1.length];
        int num = 0;
        for (int i : nums1) {
            for (int j : nums2) {
                if (i == j && num == 0) {
                    ansArr[num] = j;
                    num++;
                }else if (i == j && ansArr[num-1] != j) {
                    ansArr[num] = j;
                    num++;
                }
            }
        }
        // 去除数组后面的0
        int newLength = ansArr.length;
        for (int i = ansArr.length - 1; i >= 0 ; i--) {
            if (ansArr[i] == 0) {
                newLength--;
            }
        }
        // 复制非零部分到新数组
        // 方法1. todo 用 System.arraycopy([原数组],[原数组起始位置],[新数组],[新数组起始位置],[新数组长度])
        //           该方法更精细的复制数组
        // int[] newAnsArr = new int[newLength];
        // System.arraycopy(ansArr, 0, newAnsArr, 0, newAnsArr.length);

        // 方法2. todo 用Arrays.copyOf([原数组],[原数组长度])
        int[] newAnsArr = Arrays.copyOf(ansArr,newLength);

        return newAnsArr;
    }
}*/
