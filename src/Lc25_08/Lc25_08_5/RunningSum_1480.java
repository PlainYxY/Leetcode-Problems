package Lc25_08.Lc25_08_5;

public class RunningSum_1480 {
    public static void main(String[] args) {
        int[] ints1 = runningSum(new int[]{1, 2, 3, 4});
        for(int num1 : ints1){
            System.out.print(num1 + ",");
        }
        System.out.println();
        int[] ints2 = runningSum(new int[]{1,1,1,1,1});
        for(int num2 : ints2){
            System.out.print(num2 + ",");
        }
        System.out.println();
        int[] ints3 = runningSum(new int[]{3,1,2,10,1});
        for(int num3 : ints3){
            System.out.print(num3 + ",");
        }
    }

    //官方题解
    public static int[] runningSum(int[] nums) {
        for(int i=1; i<nums.length; i++){
            nums[i] += nums[i-1];
        }
        return nums;
    }


    //0ms   100%
    //md,想复杂了，一层循环也可以
    /*public static int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
                num += nums[i];
                arr[i] = num;
        }
        return arr;
    }*/


    //3ms   3%
    //1.todo 小脑瓜直接就想到两层循环遍历，但是果不其然时间复杂度高
    /* public static int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j >= 0 ; j--) {
                arr[i] += nums[j];
            }
        }
        return arr;
    }*/
}
