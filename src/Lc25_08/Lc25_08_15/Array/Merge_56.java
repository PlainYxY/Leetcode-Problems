package Lc25_08.Lc25_08_15.Array;

// [25.8.11(数组)] 合并区间

import java.util.Arrays;

/**
 * <li>以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi]。
 * <li>请你合并所有重叠的区间，并返回 一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间 。
 */
public class Merge_56 {
    public static void main(String[] args) {
        Solution56 solution56 = new Solution56();

        // [[1,6],[8,10],[15,18]]
        int [][] intervals1 = new int[][]{{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(solution56.merge(intervals1)));
        // [[1,5]]
        int [][] intervals2 = new int[][]{{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(solution56.merge(intervals2)));

    }
}


//
class Solution56 {
    public int[][] merge(int[][] intervals) {
        return intervals;
    }
}
