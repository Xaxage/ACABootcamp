package Homework.day7;

import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        int num = sc.nextInt();

        for (int i = 2; true; i++) {
            if (num % i == 0) {
                System.out.println(i);
                break;
            }
        }

        sc.close();
    }
}
