package Homework.day11;

import java.util.Arrays;

public class Fourteenth {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = copyOf(arr1);
        System.out.println(Arrays.toString(arr2));
    }

    public static int[] copyOf(int[] array){
        int[] arr1 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arr1[i]=array[i];
        }
        return arr1;
    }
}
