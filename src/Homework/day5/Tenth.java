package Homework.day5;

import java.io.IOException;
import java.util.Scanner;

public class Tenth {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character to check.");

        char check = Character.toLowerCase((char) System.in.read());

        switch (check) { //Enhanced switch :D
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("It's vowel.");
            case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> System.out.println("Those are numbers, you moron!!!");
            default -> System.out.println("It is consonant.");
        }

        sc.close();
    }
}
