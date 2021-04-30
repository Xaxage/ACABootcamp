package Homework.day4;

import java.util.Arrays;
import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your 3 numbers");

        int[] array = new int[3];
        int max = 0;
        for (int i = 0; i < 3; i++) {
            array[i] = sc.nextInt();
            if (array[i] > max) max = array[i];
        }
        System.out.println(max);

        sc.close();
    }
}
