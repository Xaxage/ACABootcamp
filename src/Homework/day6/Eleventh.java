package Homework.day6;


import java.util.Scanner;

public class Eleventh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number to check.");

        int input = sc.nextInt();
        int i = 0;

        /*while (i != input) {
            if (i % 3 == 0) {
                continue;
            }

            System.out.println(i);
            i++;
        }*/

        while (i++ != input) {
            if (i % 3 == 0) {
                continue;
            }

            System.out.println(i);
        }
        sc.close();
    }
}
