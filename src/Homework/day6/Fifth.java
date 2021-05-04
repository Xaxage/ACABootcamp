package Homework.day6;

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the maximum number. ");

        int maxNum = sc.nextInt();
        int i = 1;

        while (i < maxNum) {
            System.out.println(i);
            i *= 2;
        }

        sc.close();
    }
}
