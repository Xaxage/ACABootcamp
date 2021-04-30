package Homework.day5;

import java.io.IOException;
import java.util.Scanner;

public class Ninth {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the correct way to declare a variable to store an integer value in Java?\n" +
                "   a. int 1x = 10;\n" +
                "   b. int x = 10;\n" +
                "   c. float x = 10.0f;\n" +
                "   d. string x =\"10\";\n" +
                "   Enter your choice:");

        char answer = (char) System.in.read();
        switch (answer) { //Enhanced switch, baby :D
            case 'a', 'c', 'd' -> System.out.println("You fucking imbecile.");
            case 'b' -> System.out.println("Welcome to the club, buddy.");
        }
        sc.close();
    }
}
