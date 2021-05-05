package Homework.day8;

import java.util.Arrays;

public class Eleventh {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5,6};
        if(arr.length%2==0){
            for (int i = 0; i < arr.length-1; i+=2) {
                int tmp =arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=tmp;
            }
        }else{
            for (int i = 0; i < arr.length-1; i+=2) {
                int tmp =arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=tmp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
