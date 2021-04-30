package Homework.day4;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the number to check if it's prime or not.");

        int checkable=sc.nextInt();
        if(checkable%2==0) System.out.println("It's even, comrade.");
        else System.out.println("Rastrell ");
    }
}
