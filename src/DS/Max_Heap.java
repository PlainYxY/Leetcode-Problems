package DS;

import java.util.Arrays;

// 大根堆
public class Max_Heap {
    public static void main(String[] args) {
        int[] Arr = {0,53,17,78,9,45,65,87,32};

        // 排序为 大根堆
        for (int i = (Arr.length/2); i > 0; i--) {
            HeadAdjust(Arr,i, Arr.length-1);
        }
        Arr[0] = 0;
        System.out.println(Arrays.toString(Arr));

        // 从大到小排序输出 大根堆（0位不算）
        for (int i = Arr.length-1; i > 0; i--) {
            Arr[0] = Arr[1];
            Arr[1] = Arr[i];
            Arr[i] = Arr[0];

            HeadAdjust(Arr,1,i-1);
        }
        Arr[0] = 0;
        System.out.println(Arrays.toString(Arr));
    }

    // 排列为大根堆方法
    public static void HeadAdjust(int[] nums, int k, int len) {
        nums[0] = nums[k];
        for (int i = 2*k; i <= len; i *= 2) {
            if (i < len && nums[i] < nums[i+1]) {
                i++;
            }
            if (nums[0] >= nums[i])
                break;
            else  {
                nums[k] = nums[i];
                k = i;
            }
        }
        nums[k] = nums[0];
    }
}