package Homework.day7;

import java.util.Scanner;

public class Eleventh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you are going to input.");

        int numbers = sc.nextInt();
        int negCount = 0;
        int zeroCount = 0;
        int posCount = 0;

        while (numbers != 0) {
            int input = sc.nextInt();
            if (input < 0) negCount++;
            if (input == 0) zeroCount++;
            if (input > 0) posCount++;
            numbers--;
        }

        System.out.println(negCount + "\n" + zeroCount + "\n" + posCount);
        sc.close();
    }
}
