package Lc25_09.Lc25_09_05;

/**
 * <li>给你一个 m * n 的矩阵 grid，矩阵中的元素无论是按行还是按列，都以非严格递减顺序排列。 请你统计并返回 grid 中 负数 的数目。
 */
// [25.9.1](数组) 统计有序矩阵中的负数
public class CountNegatives_1351 {
    public static void main(String[] args) {
        Solution1351 solution1351 = new Solution1351();

        // 8
        System.out.println(solution1351.countNegatives(new int[][]{{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}}));
        // 0
        System.out.println(solution1351.countNegatives(new int[][]{{3,2},{1,0}}));
    }
}


// 0ms  100%
/*
        0  1  2  3
     --------------
    0|  4, 3,-1,-1
    1|  3, 2,-1,-1
    2|  1, 1,-1,-2
    3| -1,-1,-2,-3

    假如遍历到[0][2]位置了，发现是负数，那么表示它后面和它下面的这个长方体内都是，那就ans+上这些个数，然后遍历行的个数变成该列的数（就是把负数的这个矩形给切掉了再遍历）
 */
class Solution1351 {
    public int countNegatives(int[][] grid) {
        int ans = 0;
        int shuLength = grid.length;
        int hengLength = grid[0].length;
        for (int i = 0; i < shuLength; i++) {
            for (int j = 0; j < hengLength; j++) {
                // 如果发现负数
                if (grid[i][j] < 0) {
                    // 答案个数加上下面整个负数数矩形
                    ans += (shuLength-i) *  (hengLength-j) ;
                    // 然后遍历行的个数做切割
                    hengLength = j;
                    break;
                }
            }
        }
        return ans;
    }
}