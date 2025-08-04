package Lc25_08.Lc25_08_5;

// [25.8.4] 边界上的蚂蚁
public class ReturnToBoundaryCount_3028 {
    public static void main(String[] args) {
        System.out.println(returnToBoundaryCount(new int[]{2, 3, -5}));          // 1
        System.out.println(returnToBoundaryCount(new int[]{3,2,-3,-4}));        // 0
        System.out.println(returnToBoundaryCount(new int[]{3,2,-3,-4,2}));      // 1
        System.out.println(returnToBoundaryCount(new int[]{3,2,-3,-4,2,2,-2})); // 2
    }
    public static int returnToBoundaryCount(int[] nums) {
        int sum = 0;
        int count = 0;
        for  (int num : nums) {
            sum += num;
            if (sum == 0)
                count++;
        }
        return count;
    }
}
