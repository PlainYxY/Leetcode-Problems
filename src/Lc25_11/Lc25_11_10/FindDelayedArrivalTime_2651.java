package Lc25_11.Lc25_11_10;

// [25.11.06] 计算列车的到站时间
public class FindDelayedArrivalTime_2651 {
    public static void main(String[] args) {
        Solution2651 solution2651 = new Solution2651();

        // 20
        System.out.println(solution2651.findDelayedArrivalTime(15,5));
        // 0
        System.out.println(solution2651.findDelayedArrivalTime(13,11));
    }
}


class Solution2651 {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime + delayedTime)%24;
    }
}