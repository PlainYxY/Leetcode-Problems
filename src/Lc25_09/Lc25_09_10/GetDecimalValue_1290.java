package Lc25_09.Lc25_09_10;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// [25.9.8] 可被三整数的偶数的平均值
/**
 * <li>给你一个单链表的引用结点 head。链表中每个结点的值不是 0 就是 1。已知此链表是一个整数数字的二进制表示形式。
 * <li>请你返回该链表所表示数字的 十进制值 。
 * <li>最高位 在链表的头部。
 */
public class GetDecimalValue_1290 {
    public static void main(String[] args) {
        Solution1290 solution1290 = new Solution1290();

        // 5
        //System.out.println(solution1290.getDecimalValue(new ListNode(1,new ListNode(0,new ListNode(1)))));
        // 0
        //System.out.println(solution1290.getDecimalValue(new ListNode(0)));
        // 18880
        System.out.println(solution1290.getDecimalValue(new ListNode(1,new ListNode(0,new ListNode(0,new ListNode(1,new ListNode(0,new ListNode(0,new ListNode(1,
                new ListNode(1,new ListNode(1,new ListNode(0,new ListNode(0,new ListNode(0,new ListNode(0,new ListNode(0,new ListNode(0)))))))))))))))));
    }
}


// 0ms  100%
class Solution1290 {
    public int getDecimalValue(ListNode head) {
        List<Integer> list = new ArrayList<>();
        int ans = 0;
        for (int i = 0; i < 30; i++) {
            if (head != null) {
                list.add(head.val);
                head = head.next;
            }
        }
        int num = 0;
        for (int i = list.size()-1; i >= 0; i--) {
            ans += (int) (list.get(num) * Math.pow(2, i));
            num++;
        }
        return ans;
    }
}
