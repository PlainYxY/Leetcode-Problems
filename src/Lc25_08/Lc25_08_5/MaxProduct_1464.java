package Lc25_08.Lc25_08_5;

// [25.8.5] 数组中两元素的最大乘积
/*
* 给你一个整数数组 nums，请你选择数组的两个不同下标 i 和 j，使 (nums[i]-1)*(nums[j]-1) 取得最大值。
* 请你计算并返回该式的最大值。
* */
public class MaxProduct_1464 {
    public static void main(String[] args) {
        Solution1464 solution1464 = new Solution1464();

        System.out.println(solution1464.maxProduct(new int[]{3,4,5,2}));    //12
        System.out.println(solution1464.maxProduct(new int[]{1,5,4,5}));    //16
        System.out.println(solution1464.maxProduct(new int[]{3,7}));        //12
    }
}

//大神题解，todo Arrays.sort()方法,快速给数组 由小到大 排序
/*
class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
    }
}*/


// 0ms  100%
// 2.定位两次最大值，第一次把值替换为0
class Solution1464 {
    public int maxProduct(int[] nums) {
        int max1 = 0, box1;
        int max2 = 0;
        //第一次定位最大数,并把 0 替换进去
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max1) {
                box1 = nums[i];
                nums[i] = max1;
                max1 = box1;
            }
        }
        //第二次定位最大数
        for (int num2 : nums) {
            if (num2 > max2) {
                max2 = num2;
            }
        }
        return (max1-1) * (max2-1);
    }
}


// 12ms  8%
// 1.先把数组排序，然后取最开始两位，各减 1 相乘（时间复杂度过高）
/*
class Solution1464 {
    public int maxProduct(int[] nums) {
        int box = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    box = nums[i];
                    nums[i] = nums[j];
                    nums[j] = box;
                }
            }
        }

        return (nums[0]-1) * (nums[1]-1);
    }
}*/
