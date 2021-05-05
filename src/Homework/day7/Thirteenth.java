package Homework.day7;

import java.util.Scanner;

public class Thirteenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number");

        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
