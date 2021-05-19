package BootcampClassWork;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 4, 3, 2, 1};

        //Selection sort
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {//Finding the minimum element to swap with the i-th element
                //Starting from i , so we don't compare already unraveled minimum index.We need to find the second minimum.
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }

        System.out.println(Arrays.toString(arr));
    }

    //swap method
    static void swap(int[] arr, int index1, int index2) {
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }
}
