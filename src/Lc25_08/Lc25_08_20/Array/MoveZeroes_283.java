package Lc25_08.Lc25_08_20.Array;

import java.util.Arrays;

// [25.8.17](数组) 移动零
/**
 * <li>给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * <li>请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 */
public class MoveZeroes_283 {
    public static void main(String[] args) {
        Solution283 solution283 = new Solution283();

        // [1,3,12,0,0]
        int[] ints1 = new int[]{0,1,0,3,12};
        solution283.moveZeroes(ints1);
        System.out.println(Arrays.toString(ints1));
        // [0]
        int[] ints2 = new int[]{0};
        solution283.moveZeroes(ints1);
        System.out.println(Arrays.toString(ints1));
    }
}


// todo 无返回值
// 1.
class Solution283 {
    public void moveZeroes(int[] nums) {

    }
}
