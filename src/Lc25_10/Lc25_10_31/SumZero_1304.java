package Lc25_10.Lc25_10_31;

import java.util.Arrays;

// [25.10.29] 和为零的 N 个不同整数
public class SumZero_1304 {
    public static void main(String[] args) {
        Solution1304 solution1304 = new Solution1304();

        // [-7,-1,1,3,4]
        System.out.println(Arrays.toString(solution1304.sumZero(5)));
        // [-1,0,1]
        System.out.println(Arrays.toString(solution1304.sumZero(3)));
        // [0]
        System.out.println(Arrays.toString(solution1304.sumZero(1)));
    }
}


// 0ms   100%
class Solution1304 {
    public int[] sumZero(int n) {
        int index = 0;
        int [] ansArr = new int[n];
        // 双数
        if (n % 2 == 0) {
            while (index < n) {
                ansArr[index] = index+1;
                ansArr[index+1] = -(index+1);
                index+=2;
            }
        // 单数
        }else {
            while (index < n-1) {
                ansArr[index] = (index+1);
                ansArr[index+1] = -(index+1);
                index+=2;
            }
            ansArr[n-1] = 0;
        }
        return ansArr;
    }
}
