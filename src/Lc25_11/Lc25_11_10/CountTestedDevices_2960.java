package Lc25_11.Lc25_11_10;

// [25.11.07] 统计已测试设备
public class CountTestedDevices_2960 {
    public static void main(String[] args) {
        Solution2960 solution2960 = new Solution2960();

        // 3
        System.out.println(solution2960.countTestedDevices(new int[] {1,1,2,1,3}));
        // 2
        System.out.println(solution2960.countTestedDevices(new int[] {0,1,2}));
    }
}


// 1ms  100%
class Solution2960 {
    public int countTestedDevices(int[] batteryPercentages) {
        int ans = 0;
        for (int i = 0; i < batteryPercentages.length; i++) {
            if (batteryPercentages[i] > ans) {
                ans++;
            }
        }
        return ans;
    }
}


// 2ms  18%
/*
class Solution2960 {
    public int countTestedDevices(int[] batteryPercentages) {
        int ans = 0;
        for (int i = 0; i < batteryPercentages.length; i++) {
            if (batteryPercentages[i] != 0) {
                ans ++;
                for (int j = i + 1; j < batteryPercentages.length; j++) {
                    batteryPercentages[j] = Math.max(0,batteryPercentages[j]-1);
                }
            }
        }
        return ans;
    }
}*/
