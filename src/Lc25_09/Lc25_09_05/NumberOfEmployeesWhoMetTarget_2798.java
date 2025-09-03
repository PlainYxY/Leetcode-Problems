package Lc25_09.Lc25_09_05;

// [25.9.1] 整数的各位积和之差
/**
 * <li>公司里共有 n 名员工，按从 0 到 n - 1 编号。每个员工 i 已经在公司工作了 hours[i] 小时。
 * <li>公司要求每位员工工作 至少 target 小时。
 * <li>给你一个下标从 0 开始、长度为 n 的非负整数数组 hours 和一个非负整数 target 。
 * <li>请你用整数表示并返回工作至少 target 小时的员工数。
 */
public class NumberOfEmployeesWhoMetTarget_2798 {
    public static void main(String[] args) {
        Solution2798 solution2798 = new Solution2798();

        // 3
        System.out.println(solution2798.numberOfEmployeesWhoMetTarget(new int[]{0,1,2,3,4},2));
        // 0
        System.out.println(solution2798.numberOfEmployeesWhoMetTarget(new int[]{5,1,4,2,2},6));
    }
}

//
class Solution2798 {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        return 0;
    }
}
