package Homework.day5;

import java.util.Scanner;

public class Eleventh {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number.");

        int number = sc.nextInt();

        switch (number % 2){
            case 0:
                System.out.println("It is even.");
            case 1:
                System.out.println("It is odd.");
        }
    }
}
