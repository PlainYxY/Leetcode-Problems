package Lc25_10.Lc25_10_20;

// [25.10.17] 生成每种字符都是奇数个的字符串
public class GenerateTheString_1374 {
    public static void main(String[] args) {
        Solution3289 solution3289 = new Solution3289();

        // "pppz"
        System.out.println(solution3289.generateTheString(4));
        // "xy"
        System.out.println(solution3289.generateTheString(2));
        // "holasss"
        System.out.println(solution3289.generateTheString(7));
    }
}


// todo 【sb.append("a".repeat(n))】的作用是 向StringBuilder对象中追加 n 个字符 'a'，然后返回最终的字符串

class Solution3289 {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        if (n % 2 == 0){
            return sb.append("a".repeat(n-1)).append("b").toString();
        }
        return sb.append("a".repeat(n)).toString();
    }
}