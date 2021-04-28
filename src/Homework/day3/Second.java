package Homework.day3;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");

        double newDouble = sc.nextDouble();
        System.out.println(newDouble);
        float newFloat = (float) newDouble;
        System.out.println(newDouble + "  " + newFloat);
        long newLong = (long) newFloat;
        System.out.println(newFloat + "  " + newLong);
        int newInt = (int) newLong;
        System.out.println(newLong + "  " + newInt);
        short newShort = (short) newInt;
        System.out.println(newInt + "  " + newShort);
        byte newByte = (byte) newShort;
        System.out.println(newShort + "  " + newByte);

        sc.close();
    }
}
