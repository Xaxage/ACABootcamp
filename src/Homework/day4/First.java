package Homework.day4;

import java.util.Calendar;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter year of birth");

        int year=sc.nextInt();
        if(Calendar.getInstance().get(Calendar.YEAR)-year>=18) System.out.println("Yes, you can vote");
        else System.out.println("It's time for Gulag");

        sc.close();
    }

}
