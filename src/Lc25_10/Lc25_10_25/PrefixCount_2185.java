package Lc25_10.Lc25_10_25;

public class PrefixCount_2185 {
    public static void main(String[] args) {
        Solution2185 solution2185 = new Solution2185();

        // 2
        System.out.println(solution2185.prefixCount(new String[]{"pay","attention","practice","attend"},"at"));
        // 0
        System.out.println(solution2185.prefixCount(new String[]{"leetcode","win","loops","success"},"code"));
    }
}


//
class Solution2185 {
    public int prefixCount(String[] words, String pref) {
        for (String word : words) {
            if (word.startsWith(pref)) {

            }
        }
        return words.length;
    }
}