package Homework.day6;

import java.util.Scanner;

public class Thirteenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the numbers . first miles and required mileage");

        int base = sc.nextInt();
        int required = sc.nextInt();
        int days = 1;

        double i = base;

        while (i < required) {
            i = i + (i * 10) / 100;
            days++;
        }
        System.out.println(days);
        sc.close();
    }
}
