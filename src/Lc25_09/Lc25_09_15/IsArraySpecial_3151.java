package Lc25_09.Lc25_09_15;

public class IsArraySpecial_3151 {
    public static void main(String[] args) {
        Solution3151 solution3151 = new Solution3151();

        // true
        System.out.println(solution3151.isArraySpecial(new int[]{1}));
        // true
        System.out.println(solution3151.isArraySpecial(new int[]{2,1,4}));
        // false
        System.out.println(solution3151.isArraySpecial(new int[]{4,3,1,6}));
    }
}


// 0ms  100%
class Solution3151 {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length == 1) return true;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] % 2 == nums[i-1] % 2)
                return false;
        }
        return true;
    }
}


// 1ms  7%
/*
class Solution3151 {
    public boolean isArraySpecial(int[] nums) {
        // 第一个为偶，则说明单数个数得是偶数
        if(nums[0] % 2 == 0){
            //  单数为偶，偶数为单
            for(int i = 1; i < nums.length; i++){
                // 单数
                if(i % 2 == 0 && nums[i] % 2 == 1){
                    return false;
                }
                // 偶数
                if(i % 2 == 1 && nums[i] % 2 == 0){
                    return false;
                }
            }
        // 第一个为单数，则说明单数个数得是单数
        }else {
            // 单数为单，偶数为偶
            for(int i = 1; i < nums.length; i++){
                // 单数
                if(i % 2 == 0 && nums[i] % 2 == 0){
                    return false;
                }
                // 偶数
                if(i % 2 == 1 && nums[i] % 2 == 1){
                    return false;
                }
            }
        }
        return true;
    }
}*/
