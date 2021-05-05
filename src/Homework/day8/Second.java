package Homework.day8;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input elements' number");
        int size = sc.nextInt();

        System.out.println("Input elements.");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (i % 2 == 0) System.out.println(arr[i]);
        }

        sc.close();
    }
}
