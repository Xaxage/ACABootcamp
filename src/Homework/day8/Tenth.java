package Homework.day8;

import java.util.Arrays;

public class Tenth {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5,6};
        int size=arr.length;

        for (int i = 0; i < size / 2; i++) {
            int tmp=arr[i];
            arr[i]=arr[size-i-1];
            arr[size-i-1]=tmp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
