package BootcampClassWork;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        int[] arr = createArray(5);
        opposite(arr);
    }

    public static int[] createArray(int size){
        int[] arr = new int[size];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + size + " numbers, please.");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        return arr;
    }

    public static void opposite (int[] arr){
        for (int i : arr){
            i*=-1;
            System.out.println(i);
        }
    }
}
