package Homework.day4;

import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your floating number: ");
        float checkable = sc.nextFloat();

        if (checkable == 0.0f) System.out.print("It's 0");
        else if (checkable < 0.0f) System.out.print("It's negative.");
        else System.out.print("It's positive.");

        if (Math.abs(checkable) < 1.0f) System.out.println(" And small.");
        else if (Math.abs(checkable) > 1000000) System.out.println(" And Large.");

        sc.close();
    }
}
