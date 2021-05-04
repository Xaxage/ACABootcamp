package Homework.day6;

import java.util.Scanner;

public class Twelfth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check.");

        int input = sc.nextInt();
        int first = 0;
        int second = 1;
        int third = 1;
        int i = 3;


        while (true) {
            int tmpFirst = first;
            first = second;
            second = tmpFirst + second;
            third = second + first;

            if (third == input) {
                System.out.println(i);
                break;
            } else if (third > input) {
                System.out.println(-1);
                break;
            }
            i++;
        }
        sc.close();
    }
}
