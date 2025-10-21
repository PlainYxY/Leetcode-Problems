package Lc25_10.Lc25_10_25;

import java.util.ArrayList;
import java.util.List;

//  [25.10.21] 找到稳定的山的下标
public class StableMountains_3285 {
    public static void main(String[] args) {
        Solution3285 solution3285 = new Solution3285();

        // [3,4]
        System.out.println(solution3285.stableMountains(new int[]{1,2,3,4,5},2));
        // [1,3]
        System.out.println(solution3285.stableMountains(new int[]{10,1,10,1,10},3));
        // []
        System.out.println(solution3285.stableMountains(new int[]{10,1,10,1,10},10));
    }
}


// 1ms  100%
class Solution3285 {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> ansList = new ArrayList<>();
        for (int i = 0; i < height.length-1; i++) {
            if (height[i] > threshold) {
                ansList.add(i+1);
            }
        }
        return  ansList;
    }
}