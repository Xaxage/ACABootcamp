package Homework.day3;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");

        byte newByte = sc.nextByte();
        short newShort = newByte;
        System.out.println(newShort + "  " + newByte);
        int newInt = newShort;
        System.out.println(newInt + "  " + newShort);
        long newLong = newInt;
        System.out.println(newLong + "  " + newInt);
        float newFloat = newLong;
        System.out.println(newFloat + "  " + newLong);
        double newDouble = newFloat;
        System.out.println(newDouble + "  " + newFloat);

        sc.close();
    }
}
