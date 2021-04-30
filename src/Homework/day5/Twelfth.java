package Homework.day5;

import java.io.IOException;
import java.util.Scanner;

public class Twelfth {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the first number.");
        int num1 = sc.nextInt();
        System.out.println("Your first number = " + num1);

        System.out.println("Please enter the second number.");
        int num2 = sc.nextInt();
        System.out.println("Your second number = " + num2);

        System.out.println("Select the operation: + - * / ");
        char operation = (char) System.in.read();

        System.out.print("The solution: ");
        switch (operation) {
            case '+':
                System.out.println(num1 + num2);
            case '-':
                System.out.println(num1 - num2);
            case '*':
                System.out.println(num1 * num2);
            case '/':
                System.out.println(num1 / num2);
        }

        sc.close();
    }
}
