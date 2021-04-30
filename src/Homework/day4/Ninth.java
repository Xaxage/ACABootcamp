package Homework.day4;

import java.util.Scanner;

public class Ninth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a year to check.");

        int year = sc.nextInt();
        if (((year % 100) % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println("It's a leap year.");
        else System.out.println("It's not a leap one.");

        sc.close();
    }
}
