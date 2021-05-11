package Homework.day12;

import java.util.Arrays;

public class Fourth {
    public static void main(String[] args) {
        double[] arr = new double[]{1.0,2,3,4,5};
        print(arr);
    }

    static void print (int[] arr){
        System.out.print("[");
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]);
            if(i!= arr.length-1) System.out.print(",");
        }
        System.out.print("]");
    }

    static void print (double[] arr){
        System.out.print("[");
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]);
            if(i!= arr.length-1) System.out.print(",");
        }
        System.out.print("]");
    }

    static void print (float[] arr){
        System.out.print("[");
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]);
            if(i!= arr.length-1) System.out.print(",");
        }
        System.out.print("]");
    }
}
