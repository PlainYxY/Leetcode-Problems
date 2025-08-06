package Lc25_08.Lc25_08_10;

// [25.8.6] 在既定时间做作业的学生人数
/*
* 给你两个整数数组 startTime（开始时间）和 endTime（结束时间），并指定一个整数 queryTime 作为查询时间。
* 已知，第 i 名学生在 startTime[i] 时开始写作业并于 endTime[i] 时完成作业。
* 请返回在查询时间 queryTime 时正在做作业的学生人数。
* 形式上，返回能够使 queryTime 处于区间 [startTime[i], endTime[i]]（含）的学生人数。
* */
public class BusyStudent_1450 {
    public static void main(String[] args) {
        Solution1450 solution1450 = new Solution1450();
        System.out.println(solution1450.busyStudent(new int[]{1,2,3},new int[]{3,2,7},4));
        System.out.println(solution1450.busyStudent(new int[]{4},new int[]{4},4));
        System.out.println(solution1450.busyStudent(new int[]{4},new int[]{4},5));
        System.out.println(solution1450.busyStudent(new int[]{1,1,1,1},new int[]{1,3,2,4},7));
        System.out.println(solution1450.busyStudent(new int[]{9,8,7,6,5,4,3,2,1},
                                                    new int[]{10,10,10,10,10,10,10,10,10},5));
    }
}


//
class Solution1450 {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {

        return 0;
    }
}
