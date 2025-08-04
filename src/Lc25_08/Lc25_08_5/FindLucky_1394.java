package Lc25_08.Lc25_08_5;

// [25.8.4] 找出数组中的幸运数
public class FindLucky_1394 {
    public static void main(String[] args) {
        System.out.println(findLucky(new int[]{4,3,2,2,4,1,3,4,3}));
        System.out.println(findLucky(new int[]{2, 2, 3, 4}));
        System.out.println(findLucky(new int[]{1, 2, 2, 3, 3, 3}));
        System.out.println(findLucky(new int[]{2, 2, 2, 3, 3}));
        System.out.println(findLucky(new int[]{5}));
        System.out.println(findLucky(new int[]{7, 7, 7, 7, 7, 7, 7}));
    }

    //10ms  6%
    // 两层循环检测是否相同，相同则赋值为零,然后做if判断
    public static int findLucky(int[] arr) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            int num = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] - arr[i] == 0) {
                    num++;
                    arr[j] = 0;
                }
            }
            if (num > ans) {
                if (num == arr[i]) {
                    ans = num;
                }
            }
        }
        return ans;
    }
}
