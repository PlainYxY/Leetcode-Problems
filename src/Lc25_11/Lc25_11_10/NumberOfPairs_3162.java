package Lc25_11.Lc25_11_10;

// [25.11.07] 优质对数的总数 |
public class NumberOfPairs_3162 {
    public static void main(String[] args) {
        Solution3162 solution3162 = new Solution3162();

        // 5
        System.out.println(solution3162.numberOfPairs(new int[]{1,3,4},new int[]{1,3,4},1));
        // 2
        System.out.println(solution3162.numberOfPairs(new int[]{1,2,4,12},new int[]{2,4},3));
    }
}


class Solution3162 {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int ans = 0;
        for (int i : nums1) {
            for (int j : nums2) {
                if (i % (j * k) == 0) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
