package Lc25_11.Lc25_11_10;

// [25.11.06] 值相等的最小索引
public class SmallestEqual_2057 {
    public static void main(String[] args) {
        Solution2057 solution2057 = new Solution2057();

        // 0
        System.out.println(solution2057.smallestEqual(new int[]{0, 1, 2}));
        // 2
        System.out.println(solution2057.smallestEqual(new int[]{4, 3, 2, 1}));
        // -1
        System.out.println(solution2057.smallestEqual(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
        // 1
        System.out.println(solution2057.smallestEqual(new int[]{2, 1, 3, 5, 2}));
    }
}


// 1ms  30%
class Solution2057 {
    public int smallestEqual(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i % 10 == nums[i]) {
                return i;
            }
        }
        return -1;
    }
}
