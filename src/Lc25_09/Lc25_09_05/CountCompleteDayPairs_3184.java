package Lc25_09.Lc25_09_05;

import java.awt.image.ImageProducer;
import java.util.HashMap;

// [25.9.5] 构成整天的下标对数目 Ⅰ
/**
 * <li>给你一个整数数组 hours，表示以 小时 为单位的时间，返回一个整数，表示满足 i < j 且 hours[i] + hours[j] 构成 整天 的下标对 i, j 的数目。
 * <li>整天 定义为时间持续时间是 24 小时的 整数倍 。
 * <li>例如，1 天是 24 小时，2 天是 48 小时，3 天是 72 小时，以此类推。
 */
public class CountCompleteDayPairs_3184 {
    public static void main(String[] args) {
        Solution3184 solution3184 = new Solution3184();

        // 1
        System.out.println(solution3184.countCompleteDayPairs(new int[]{21,19,3}));
        // 3
        System.out.println(solution3184.countCompleteDayPairs(new int[]{72,48,24,3}));

    }
}


// 0ms 100%
class Solution3184 {
    public int countCompleteDayPairs(int[] hours) {
        int ans = 0;
        int[] arr = new int[24];
        for (int i = 0; i < hours.length; i++) {
            ans += arr[(24 - hours[i] % 24) % 24];
            arr[hours[i] % 24]++;
        }
        return ans;
    }
}


// 1ms  77%
// 两层for循环
/*
class Solution3184 {
    public int countCompleteDayPairs(int[] hours) {
        int ans = 0;
        for (int i = 0; i < hours.length; i++) {
            for (int j = i + 1; j < hours.length; j++) {
                if ((hours[i] + hours[j]) % 24 == 0) {
                    ans++;
                }
            }
        }
        return ans;
    }
}*/
