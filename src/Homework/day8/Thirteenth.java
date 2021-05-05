package Homework.day8;

import java.util.Arrays;

public class Thirteenth {
    public static void main(String[] args) {
        int[] arr = new int[]{1 ,-12, 3, 4, -135};
        int max = 0;
        int maxFlag = 0;
        int min = 0;
        int minFlag = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) maxFlag = i;

            if (arr[i] < min) minFlag = i;

        }
        int tmp = arr[minFlag];
        arr[minFlag] = arr[maxFlag];
        arr[maxFlag] = tmp;

        System.out.println(Arrays.toString(arr));
    }
}
