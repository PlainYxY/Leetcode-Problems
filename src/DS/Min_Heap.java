package DS;

import java.util.Arrays;

// 小根堆
public class Min_Heap {
    public static void main(String[] args) {
        int[] arr = {0,53,17,78,9,45,65,87,32};

        // 调用 小根堆
        BuildMinHeap(arr);
        System.out.println(Arrays.toString(arr));

        // 调用 堆排序
        HeapSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    // 建立小根堆
    public static void BuildMinHeap(int[] arr) {
        BuildHeap buildHeap = new BuildHeap();
        for (int i = (arr.length-1) / 2; i > 0; i--) {
            buildHeap.HeadAdjust(arr, i, arr.length-1);
        }
        arr[0] = 0;
    }


    // 小根堆排序逻辑
    public static void HeapSort(int[] nums) {
        for (int i = nums.length-1; i > 0; i--) {

            nums[0] = nums[i];
            nums[i] = nums[1];
            nums[1] = nums[0];

            BuildHeap buildHeap = new BuildHeap();
            buildHeap.HeadAdjust(nums, 1, i-1);
        }
        nums[0] = 0;
    }
}


class BuildHeap{
    public void HeadAdjust(int[] A,int k,int len) {
        A[0] = A[k];
        for (int i = 2*k; i <= len; i *= 2) {
            if (i < len && A[i] > A[i+1])
                i++;
            if (A[i] >= A[0])
                break;
            else  {
                A[k] = A[i];
                k = i;
            }
        }
        A[k] = A[0];
    }
}

