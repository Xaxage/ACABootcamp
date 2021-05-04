package Homework.day7;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the range, divisor and remainder. ");

        int start = sc.nextInt();
        int end = sc.nextInt();
        int divisor = sc.nextInt();
        int remainder = sc.nextInt();

        for (int i = start; i < end; i++) if (i % divisor == remainder) System.out.println(i);

        sc.close();
    }
}
