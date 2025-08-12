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
        int one = 0,two = 1;
        int left = 0,right = 1;
        int arrRowNum = 0;
        int [][] ansArr = new int [intervals.length][2];
        while (right < intervals.length) {


            // 情况1，left的two比right的one要 小
            if (intervals[left][two] < intervals[right][one]) {
                // 那就把第一个存进去，
                ansArr[arrRowNum] = intervals[left];
                // 如果到了数组最后一个，就把最后一个也存进去
                if (right == intervals.length - 1) {
                    ansArr[arrRowNum+1] = intervals[right];
                }
                // 目标数组位置 +1
                arrRowNum++;
                // 然后两个位置都++
                left++;
                right++;
            // 情况2，left的two比right的one要 大
            }else if (intervals[left][two] >= intervals[right][one]) {
                // 那就把第一个的第一位 存目标第一位
                ansArr[arrRowNum][0] = intervals[left][one];
                // 那就把第二个的第二位 存目标第二位
                ansArr[arrRowNum][1] = intervals[right][two];

                // [小难点] 如果两个重合，那么有必要让第二个的one等于第一个的one，方便做下次判断
                intervals[left][one] = intervals[right][one];

                // 目标数组位置 +1
                arrRowNum++;
                // 然后两个位置都++
                left++;
                right++;
            }
        }
        return ansArr;
    }
}
