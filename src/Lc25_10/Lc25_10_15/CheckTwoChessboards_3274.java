package Lc25_10.Lc25_10_15;

// [25.10.14] 检查棋盘方格是否相同
/**
 * <li>给你两个字符串 coordinate1 和 coordinate2，代表 8 x 8 国际象棋棋盘上的两个方格的坐标。
 * <li>以下是棋盘的参考图。
 */
public class CheckTwoChessboards_3274 {
    public static void main(String[] args) {
        Solution3274 solution3274 = new Solution3274();

        // true
        System.out.println(solution3274.checkTwoChessboards("a1","c3"));
        // false
        System.out.println(solution3274.checkTwoChessboards("a1","h3"));
    }
}


// 官方题解
class Solution3274 {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        return (coordinate1.charAt(0) - coordinate2.charAt(0) + coordinate1.charAt(1) - coordinate2.charAt(1)) % 2 == 0;
    }
}


// 分割后，两数相加，偶数为黑，奇数为白
/*
class Solution3274 {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int i1 = coordinate1.charAt(0);
        int i2 = coordinate1.charAt(1);

        int j1 = coordinate2.charAt(0);
        int j2 = coordinate2.charAt(1);

        if ((i1 + i2)%2 == (j1 + j2)%2){
            return true;
        }else {
            return false;
        }
    }
}*/
