package Lc25_08.Lc25_08_10;

import java.util.Arrays;

//  [25.8.7] 反转字符串
/**
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 s 的形式给出。
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 */
public class ReverseString_344 {
    public static void main(String[] args) {
        Solution344 solution344 = new Solution344();

        char[] s1 = {'h','e','l','l','o'};
        solution344.reverseString(s1);
        System.out.println(Arrays.toString(s1));

        char[] s2 = {'H','a','n','n','a','h'};
        solution344.reverseString(s2);
        System.out.println(Arrays.toString(s2));
    }
}

// 0ms  100%
// 1.简单的双指针问题
class Solution344 {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        char temp;
        while(left < right) {
            //交换
            temp = s[right];
            s[right] = s[left];
            s[left] = temp;

            //自加
            left++;
            right--;
        }
    }
}
