package Lc25_11.Lc25_11_10;

import java.util.HashSet;
import java.util.Set;

// [25.11.10] 求出出现两次数字的 XOR 值
public class DuplicateNumbersXOR_3158 {
    public static void main(String[] args) {
        Solution3158 solution3158 = new Solution3158();

        // 1
        System.out.println(solution3158.duplicateNumbersXOR(new int[]{1,2,1,3}));
        // 0
        System.out.println(solution3158.duplicateNumbersXOR(new int[]{1,2,3}));
        // 3
        System.out.println(solution3158.duplicateNumbersXOR(new int[]{1,2,2,1}));
    }
}


class Solution3158 {
    public int duplicateNumbersXOR(int[] nums) {
        int ans = 0;
        int[] ints = new int[51];
        for (int num : nums) {
            ints[num]++;
        }
        for (int i = 0; i < 51; i++) {
            if(ints[i] == 2){
                ans ^= i;
            }
        }
        return ans;
    }
}


/*
class Solution3158 {
    public int duplicateNumbersXOR(int[] nums) {
        int ans = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num) && ans == 0) {
                ans = num;
            }else if (set.contains(num)) {
                ans ^= num;
            }
            set.add(num);
        }
        return ans;
    }
}*/
