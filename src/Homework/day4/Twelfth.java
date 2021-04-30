package Homework.day4;

import java.util.Scanner;

public class Twelfth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println((a > b && a > 0 && b > 0) && (a % 7 == 0 || b % 7 == 0));

        sc.close();
    }
}
