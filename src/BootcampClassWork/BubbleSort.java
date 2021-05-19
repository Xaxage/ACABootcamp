package BootcampClassWork;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 4, 3, 2, 5};

        //BubbleSort
        boolean isSorted = true;
        for (int i = 0; i < arr.length; i++) {
            isSorted = true;//If the array is already sorted, we dont want to iterate till the end.
            for (int j = 0; j < arr.length - 1 - i; j++) {// - i , cause after the first iteration the biggest number is at the end, so we dont waste time on checking the last element.
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    isSorted = false;//If we change something, it means that array isn't sorted yet
                }
                if (isSorted) break; //If the upper loop isn't executed , the array is already sorted
            }
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
