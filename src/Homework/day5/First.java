package Homework.day5;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first String value.");
        String string1 = sc.nextLine();
        System.out.println("Please enter the second String value.");
        String string2 = sc.nextLine();

        if (string1 == string2) System.out.println("==");
        if (string1.equals(string2)) System.out.println("equals");

        sc.close();
    }
}
