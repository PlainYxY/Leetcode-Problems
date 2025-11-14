package DS.Dui;

import java.util.Arrays;

// 大根堆
public class Max_Heap {
    public static void main(String[] args) {
        int[] Arr = {0,53,17,78,9,45,65,87,32};

        // 调用 大根堆
        buildMaxHeap(Arr);
        System.out.println(Arrays.toString(Arr));
        // 大根堆排序
        heapSort(Arr);
        System.out.println(Arrays.toString(Arr));
    }

    /// 整个堆排序的时间复杂度为  O(n) + O(nLog2n) = O(nLog2n) 【两个相加只保留更高阶的一项】

    // 建立 大根堆     建堆 的时间复杂度为 O(n)
    static void buildMaxHeap(int[] Arr){
        for (int i = (Arr.length-1)/2; i > 0; i--) {
            headAdjust(Arr,i, Arr.length-1);
        }
        Arr[0] = 0;
    }


    //大根堆排序完整逻辑    排序大根堆 的时间复杂度为  O(nLog2n)
    static void heapSort(int[] Arr){
        // 从大到小排序输出 大根堆（0位不算）
        for (int i = Arr.length-1; i > 0; i--) {
            Arr[0] = Arr[1];
            Arr[1] = Arr[i];
            Arr[i] = Arr[0];

            headAdjust(Arr,1,i-1);
        }
        Arr[0] = 0;
    }


    // 排列为大根堆方法
    public static void headAdjust(int[] nums, int k, int len) {
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