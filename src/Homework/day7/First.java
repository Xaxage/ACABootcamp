package Homework.day7;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter the range");

        int start=sc.nextInt();
        int end=sc.nextInt();

        for (int i = start; i < end; i++)  if(i%2==0) System.out.println(i);

        sc.close();
    }
}
