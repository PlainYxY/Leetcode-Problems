package Lc25_08.Lc25_08_20.Array;

import java.util.Arrays;

//  [25.8.19](数组) 旋转图像
/**
 * <li>给定一个 n × n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度。
 * <li>你必须在 原地 旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要 使用另一个矩阵来旋转图像。
 */
public class Rotate_48 {
    public static void main(String[] args) {
        Solution48 solution48 = new Solution48();

        // [[7,4,1],[8,5,2],[9,6,3]]
        int[][] matrix1 = {{1,2,3},
                           {4,5,6},
                           {7,8,9}};
        solution48.rotate(matrix1);
        System.out.println(Arrays.toString(matrix1));
        // [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
        int[][] matrix2 = {{5, 1, 9, 11},
                           {2, 4, 8, 10},
                           {13,3, 6, 7 },
                           {15,14,12,16}};
        solution48.rotate(matrix2);
        System.out.println(Arrays.toString(matrix2));
    }
}


// 0ms  100%
// 看了题解，使用 上下翻转 和 \对角线翻转，就可以得到答案
class Solution48 {
    public void rotate(int[][] matrix) {
        // 上下翻转
        for (int i = 0; i < matrix.length/2; i++) {
            int[] tempArr = matrix[matrix.length-1-i];
            matrix[matrix.length-1-i] = matrix[i];
            matrix[i] = tempArr;
        }
        // todo Arrays.deepToString() 可以直接遍历二维数组
        // System.out.println(Arrays.deepToString(matrix));
        // 对角线翻转    \照这条线
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (j > i) {
                    int temp = matrix[j][i];
                    matrix[j][i] = matrix[i][j];
                    matrix[i][j] = temp;
                }
            }
        }
    }
}
