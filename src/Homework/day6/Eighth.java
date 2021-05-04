package Homework.day6;

import java.util.Scanner;

public class Eighth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        while (true) {
            System.out.println("Please enter a number to check.");
            int input = sc.nextInt();

            if (Math.abs(input) == 2) {
                System.out.println("Your number is " + input + "\n" + "Count of inputs  is " + i);
                break;
            }
            i++;
        }
        sc.close();
    }
}
