package Homework.day8;

import java.util.Arrays;

public class Twelfth {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int last = arr[arr.length-1];

            for (int i = arr.length-1; i>0; i--)  arr[i]=arr[i-1];

        arr[0]=last;
        System.out.println(Arrays.toString(arr));
    }

    public static void swap (int a, int b){
        int tmp=a;
        a=b;
        b=tmp;
    }
}
