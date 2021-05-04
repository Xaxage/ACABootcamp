package Homework.day6;

import java.util.Scanner;

public class Seventeenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");

        int number=sc.nextInt();
        while (number!=0){
            System.out.print(number%10);
            number/=10;
        }


        sc.close();
    }
}
