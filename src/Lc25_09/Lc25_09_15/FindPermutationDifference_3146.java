package Lc25_09.Lc25_09_15;

import java.util.HashMap;
import java.util.Map;

public class FindPermutationDifference_3146 {
    public static void main(String[] args) {
        Solution3146 solution3146 = new Solution3146();

        // 2
        System.out.println(solution3146.findPermutationDifference("abc","bac"));
        // 12
        System.out.println(solution3146.findPermutationDifference("abcde","edbac"));
    }
}


// 1ms  100%
class Solution3146 {
    public int findPermutationDifference(String s, String t) {
        int ans = 0;
        int[] arr = new int[123];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)] = i;
        }
        for (int j = 0; j < t.length(); j++) {
            ans += Math.abs(arr[t.charAt(j)]- j);
        }
        return ans;
    }
}


// 3ms  11%
// 放入Map的value中取绝对值然后相加
/*
class Solution3146 {
    public int findPermutationDifference(String s, String t) {
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),i);
        }
        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), Math.abs(i - map.get(t.charAt(i))));
        }
        for (Integer integer :map.values()) {
            ans += integer;
        }
        return ans;
    }
}*/
