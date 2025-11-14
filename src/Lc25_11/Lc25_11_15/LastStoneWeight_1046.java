package Lc25_11.Lc25_11_15;

import java.util.PriorityQueue;

// [25.11.14] 最后一块石头的重量
public class LastStoneWeight_1046 {
    public static void main(String[] args) {

        LastStoneWeight_1046 lastStoneWeight1046 = new LastStoneWeight_1046();

        // 1
        int ans = lastStoneWeight1046.lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1});
        System.out.println(ans);
    }


    // todo  java自带的堆方法（不太会）
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int stone : stones) {
            pq.offer(stone);
        }

        while (pq.size() > 1) {
            int a = pq.poll();
            int b = pq.poll();
            if (a > b) {
                pq.offer(a - b);
            }
        }
        return pq.isEmpty() ? 0 : pq.poll();
    }
}
