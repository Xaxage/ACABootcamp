package BootcampClassWork;

import java.util.Scanner;

public class CompareTheMiddleNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the first number");
        String firstStr = sc.nextLine();
        System.out.println("Please enter the second number");
        String secondStr = sc.nextLine();

        System.out.println((firstStr.charAt((firstStr.length() - 1) / 2)) == (secondStr.charAt((secondStr.length() - 1) / 2)));
        sc.close();
    }

}