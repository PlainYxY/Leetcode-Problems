package Lc25_08.Lc25_08_15.Array;

// [25.8.11(数组)] 合并区间

import java.util.Arrays;
/**
 * <li>以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [start i, end i]。
 * <li>请你合并所有重叠的区间，并返回 一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间 。
 */
public class Merge_56 {
    public static void main(String[] args) {
        Solution56 solution56 = new Solution56();

        // [[1,2],[3,6],[8,10],[15,18]]
        int [][] intervals3 = new int[][]{{1,2},{3,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(solution56.merge(intervals3)));
        // [[1,6],[8,10],[15,18]]
        int [][] intervals1 = new int[][]{{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(solution56.merge(intervals1)));
        // [[1,5]]
        int [][] intervals2 = new int[][]{{1,4},{4,5}};
        System.out.println(Arrays.deepToString(solution56.merge(intervals2)));
        // [[1,10],[15,18]]
        int [][] intervals4 = new int[][]{{1,3},{2,6},{5,10},{15,18}};
        System.out.println(Arrays.deepToString(solution56.merge(intervals4)));
    }
}


//
class Solution56 {
    public int[][] merge(int[][] intervals) {
        // 第一位第二位
        int one = 0,two = 1;
        // 左、右指针
        int left = 0,right = 1;
        // 答案数组右移指针
        int arrRowNum = 0;
        int [][] ansArr = new int [intervals.length][2];
        // 先把第一个数组赋值给答案数组
        ansArr[0] = intervals[0];
        while (right < intervals.length) {
            // 情况1，left的two比right的one要 大
            if (intervals[left][two] >= intervals[right][one]) {
                // 那就把右指针数组的two 赋值给 答案数组的two
                ansArr[arrRowNum][two] = intervals[right][two];
                // 左、右指针都右移
                left++;
                right++;
            // 情况2，left的two比right的one要 小
            }else if (intervals[left][two] < intervals[right][one]) {
                // 答案数组指针 右移
                arrRowNum++;
                // 左、右指针都右移
                left++;
                right++;
                // 答案数组 one = left的one
                ansArr[arrRowNum][one] = intervals[left][one];
                // 答案数组 two = left的two
                ansArr[arrRowNum][two] = intervals[left][two];
            }
        }
        // 以下这串代码是删除末尾 为0 的数组的
        int i = ansArr.length - 1;
        // 从后向前找到第一个非 [0, 0] 的子数组
        while (i >= 0 && ansArr[i][0] == 0 && ansArr[i][1] == 0) {
            i--;
        }
        // 截取从索引 0 到 i 的子数组（保留非零部分）
        return Arrays.copyOf(ansArr, i + 1);
    }
}
