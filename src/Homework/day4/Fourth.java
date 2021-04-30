package Homework.day4;

import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number to check whether it is multiple of a 5.");

        int toCheck = sc.nextInt();
        if (toCheck % 5 == 0) System.out.println("It is multiple of 5.");
        else System.out.println("Another time.");

        sc.close();
    }
}
