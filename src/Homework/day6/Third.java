package Homework.day6;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check.");

        int number = sc.nextInt();
        int i = 1;

        while (i * i < number) {
            System.out.println(i*i);
            i++;
        }

        sc.close();
    }
}
