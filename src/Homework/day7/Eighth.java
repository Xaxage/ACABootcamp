package Homework.day7;

import java.util.Scanner;

public class Eighth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        int num = sc.nextInt();
        int counter=0;

        for (int i = 1; i <= num; i++) if (num % i == 0) counter++ ;
        System.out.println(counter);

        sc.close();
    }
}
