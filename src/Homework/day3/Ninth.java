package Homework.day3;

import java.util.Scanner;

public class Ninth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the ASCI code");

        int input= sc.nextInt();
        char result=(char) input;
        System.out.println(result);

        sc.close();
    }
}
