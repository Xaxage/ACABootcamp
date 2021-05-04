package Homework.day6;

import java.util.Scanner;

public class Ninth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");

        int counter = 0;
        int i = 1;
        int input = sc.nextInt();

        while (true) {
            if (i > input) break;
            i *= 2;
            counter++;
        }
        System.out.println(counter);
        sc.close();
    }
}
