package Lc25_08.Lc25_08_5;

// [25.7.31] 重新排列数组
/*
 * 给你一个数组 nums ，数组中有 2n 个元素，按 [x1,x2,...,xn,y1,y2,...,yn] 的格式排列。
 * 请你将数组按 [x1,y1,x2,y2,...,xn,yn] 格式重新排列，返回重排后的数组。
 * */
public class Shuffle_1470 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] shuffle1 = solution.shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3);
        for (int i : shuffle1) {
            System.out.print(i + ",");
        }
        System.out.println();
        int[] shuffle2 = solution.shuffle(new int[]{1, 2, 3, 4, 4, 3, 2, 1}, 4);
        for (int i : shuffle2) {
            System.out.print(i + ",");
        }
        System.out.println();
        int[] shuffle3 = solution.shuffle(new int[]{1, 1, 2, 2}, 2);
        for (int i : shuffle3) {
            System.out.print(i + ",");
        }
        System.out.println();

    }
}

// 0ms  100%
// 2.官方题解，在一个循环内就可以完成筛选，写入新数组
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                ans[i] = nums[j];
            } else {
                ans[i] =nums[j + n];
                j++;
            }
        }
        return ans;
    }
}

// 1ms  5%
// 1.先把x,y两个数组分别写出来,然后重新读到原数组中
/*
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arrX = new int[n];
        int[] arrY = new int[n];
        int j = 0;
        //将大数组拆成两个小的X,Y
        for (int i = 0; i < nums.length; i++) {
            if (i < n) {
                arrX[i] = nums[i];
            } else {
                arrY[j] = nums[i];
                j++;
            }
        }
        //重新按规则写入原数组
        int x = 0, y = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = arrX[x];
                x++;
            } else {
                nums[i] = arrY[y];
                y++;
            }
        }
        return nums;
    }
}*/

