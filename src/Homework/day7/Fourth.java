package Homework.day7;

import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number and a digit.");

        int number = sc.nextInt();
        int digit= sc.nextInt();
        int counter = 0;

        while (number != 0) {
            if(number%10==digit) counter++;
            number /= 10;
        }

        System.out.println(counter);
        sc.close();
    }
}
