package Lc25_11.Lc25_11_10;

import java.util.ArrayList;
import java.util.List;

// [25.11.07] 矩阵中的蛇
public class FinalPositionOfSnake_3248 {
    public static void main(String[] args) {
        Solution3248 solution3248 = new Solution3248();

        // 3
        System.out.println(solution3248.finalPositionOfSnake(2,new ArrayList<>() {{add("RIGHT");add("DOWN");}}));
        // 1
        System.out.println(solution3248.finalPositionOfSnake(2,new ArrayList<>() {{add("DOWN");add("RIGHT");add("UP");}}));
    }
}


// 3ms  80%
class Solution3248 {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int ans = 0;
        for (String command : commands) {

            // todo 将调用trim()方法处理后的字符串重新设置回列表的同一位置
            // commands.set(i, commands.get(i).trim());
            switch (command) {
                case "DOWN":
                    ans += n;
                    break;
                case "UP":
                    ans -= n;
                    break;
                case "RIGHT":
                    ans++;
                    break;
                case "LEFT":
                    ans--;
                    break;
            }
        }
        return ans;
    }
}