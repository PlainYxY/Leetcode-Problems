package Lc25_10.Lc25_10_25;

// [25.10.25] 统计包含给定的前缀字符串
public class PrefixCount_2185 {
    public static void main(String[] args) {
        Solution2185 solution2185 = new Solution2185();

        // 2
        System.out.println(solution2185.prefixCount(new String[]{"pay","attention","practice","attend"},"at"));
        // 0
        System.out.println(solution2185.prefixCount(new String[]{"leetcode","win","loops","success"},"code"));
    }
}



// 0ms  100%
// todo  x.startsWith(y,z)    该方法是用来检验 x 字符串是否是以指定的 y 字符串为前缀的，z是偏移量
class Solution2185 {
    public int prefixCount(String[] words, String pref) {
        int ans = 0;
        for (String word : words) {
            if (word.startsWith(pref,2)) {
                ans++;
            }
        }
        return ans;
    }
}