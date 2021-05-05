package Homework.day8;

import java.util.Arrays;

public class Sixteenth {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 9, 4, 5};
        int counter=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0) counter++;
            if(arr[i]!=0 && counter!=0){
                int temp=arr[i];
                arr[i]=0;
                arr[i-counter]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
