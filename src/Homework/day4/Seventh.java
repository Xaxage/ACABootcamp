package Homework.day4;

import java.util.Scanner;

public class Seventh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number from 1 to 7. ");

        boolean flag = false;
        // for (int i = 0; !flag ; i++) {
        while (!flag) {
            try {
                int number = sc.nextInt();
                if (number > 7 || number < 1) throw new IllegalArgumentException();
                flag = true;
            } catch (IllegalArgumentException ex) {
                System.out.println("Please enter the valid number");
            }
        }
        sc.close();
    }
}
